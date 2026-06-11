# Release Project for Data Prepper

The projects in this directory include different mechanisms for releasing Data Prepper. Each subdirectory in here provides a different
mechanism for the release process. See the `README.md` in each sub-directory for specifics on what it does.

The [`release-notes`](release-notes) sub-directory is different from the other sub-directories.
It is not a project and instead holds release notes and change logs for Data Prepper releases.

## Performing a Release

See [RELEASING.md](../RELEASING.md) for instructions to follow for any release.

## Configuring the GitHub repo

The OpenSearch project does not permit this repository's workflows to push branches and open pull requests (PRs)
against itself. Instead, the release workflows push their PR branches to a fork and open the PR from that fork
back against this repository. This applies to both the
[Prepare Release Branch](../.github/workflows/release-prepare-branch.yml) workflow (the release preparation PR)
and the [Release Artifacts](../.github/workflows/release.yml) workflow (the changelog PR).

To run a release build, you must have a fork of Data Prepper used for staging these changes and PRs.
This must be an actual GitHub fork of the repository you are releasing, because GitHub only permits
cross-repository PRs between repositories in the same fork network.

Configure the following on the repository that runs the release workflows.

### Repository variable

Create a [repository variable](https://docs.github.com/en/actions/learn-github-actions/variables) named
`RELEASE_FORK_REPOSITORY`. Set it to the `owner/repo` of the fork that the PR branches are pushed to,
for example `opensearch-project-release/data-prepper`.

### Repository secret

Create a [repository secret](https://docs.github.com/en/actions/security-guides/encrypted-secrets) named
`RELEASE_FORK_TOKEN`. Set it to a **classic** personal access token (PAT) that the workflows use both to
push the branch to the fork and to open the PR against this repository.

The token must meet the following requirements.

* It is a classic PAT. A fine-grained token does not work because the single token must act on two
  repositories (the fork it pushes to and this repository it opens the PR against).
* Its owner has write access to the fork named in `RELEASE_FORK_REPOSITORY`.
* It has the `public_repo` scope (or `repo` if the repository is private).
* It has the `workflow` scope. This is required because the pushed branch may include changes to files
  under `.github/workflows`, and GitHub rejects such pushes from a token without it.

Because a classic PAT acts as its owner across all of their repositories, use a dedicated release or bot
account to own this token rather than a maintainer's personal account, and set a short expiration so the
token is rotated regularly.

## Testing release changes

You can test release changes by running the release workflows from your own fork of Data Prepper.
The release workflows always open their PRs against the repository that runs them, so when you run them
from your fork, the PRs target your fork.

To set this up:
* Run the workflows from your fork of Data Prepper (for example `your-user/data-prepper`).
* Create a second fork of your fork in an account or organization you control (for example
  `your-test-org/data-prepper`). This second fork is the head repository that the PR branches are pushed to.
  It is required because GitHub does not allow a PR where the head and base are the same repository.
  Note that GitHub permits only one fork per account, so the second fork must live in a different account
  or organization; both forks remain in the same fork network, which is what allows the cross-repository PR.
* Set `RELEASE_FORK_REPOSITORY` and `RELEASE_FORK_TOKEN` on your fork as described in
  [Configuring the GitHub repo](#configuring-the-github-repo), pointing `RELEASE_FORK_REPOSITORY` at the
  second fork.

To test, you must also make a few manual modifications that you will not check in.
* Update the `get_approvers` step with `minimum-approvals: 1`. Otherwise, you will be blocked in the promote step.
* Change your `CODEOWNERS` file to have only your user. Without this, the promote step will try to assign this to users who are not in your fork and then fail.
* You should consider updating the "Build Jar Files" step to only `assemble` instead of `build` to speed up your tests. `./gradlew --parallel --max-workers 2 assemble`
