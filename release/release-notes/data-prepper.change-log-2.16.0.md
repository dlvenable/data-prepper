
* __Remove approvers sections__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:05:43 -0500
    
    EAD -&gt; refs/heads/main, tag: refs/tags/2.16.0, refs/remotes/origin/main, refs/remotes/origin/HEAD
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Assemble only for speed__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:05:43 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __2.16 release__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:05:43 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Fix for credentials__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:05:43 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Correct the name__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 17:33:31 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Automate creation of the changelog after the release build.__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 17:15:04 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Data Prepper 2.15.0 changelog (#6736)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 14:53:13 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix MongoTasksRefresher to force executor restart on MongoSecurityException (#6716)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 6 Apr 2026 14:58:15 -0500
    
    
    * Fix MongoTasksRefresher to force executor restart on MongoSecurityException
    
    When DocumentDB revokes old credentials after secret rotation, the pipeline 
    enters a permanent auth failure state because basicAuthChanged() returns false
    (the secret value in Secrets Manager hasn&#39;t changed).
    
    Add forceRefresh() to MongoTasksRefresher with exponential backoff (30s, 60s, 
    120s, max 3 attempts) that restarts the executor with the current config.
    
    StreamScheduler now walks the exception cause chain for MongoSecurityException 
    and calls forceRefresh() when detected. If all 3 attempts fail, falls back to 
    the normal hourly scheduled credential refresh.
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Remove unused imports in mongodb plugin tests
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Adds prompts for creating Data Prepper release notes using AI tools. This allows us to use AI to create the release notes consistently between versions and across different maintainers. They are geared toward Claude but should work for tools like Kiro. (#6732)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 11:05:38 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Data Prepper 2.15.0 release notes. (#6731)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 11:02:50 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update the RELEASING.md file for the newest steps based on recent scripts and GitHub Actions. (#6730)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 10:40:21 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the next Data Prepper release to 2.16 now that the 2.15 branch has been made. (#6729)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 10:40:09 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Run older OpenSearch 2.x integration tests against Ubuntu 22 to fix cgroup failure causing test failures. (#6717)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 09:44:59 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __chore: Upgrade Jackson to 2.21.0 (#6709)__

    [Siqi Ding](mailto:dingdd@amazon.com) - Thu, 2 Apr 2026 16:03:07 -0700
    
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;

* __Upgrade aws-cdk-lib to 2.247.0 (CVE-2026-33750, CVE-2026-33532). Resolves #6689. (#6715)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 2 Apr 2026 13:04:25 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __fix: expand necessary OpenSearch permissions for data prepper (#6649)__

    [JongminChung](mailto:chungjm0711@gmail.com) - Thu, 2 Apr 2026 11:54:06 -0700
    
    
    Signed-off-by: Jongmin Chung &lt;chungjm0711@gmail.com&gt;

* __fix a typo in s3_enrich metrics (#6714)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Thu, 2 Apr 2026 11:38:05 -0700
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __fix: error syntax in log-standard-template  (#6647)__

    [JongminChung](mailto:chungjm0711@gmail.com) - Thu, 2 Apr 2026 10:10:12 -0700
    
    
    fix: error syntax in template (logs-otel-v1-index-standard-template)
    
    Signed-off-by: Jongmin Chung &lt;chungjm0711@gmail.com&gt;

* __Prometheus Remote Write v1 Source  (#6627)__

    [Srikanth Padakanti](mailto:srikanth29.9@gmail.com) - Thu, 2 Apr 2026 10:09:48 -0700
    
    
    Add Prometheus Remote Write v1 source plugin
    
    Signed-off-by: Srikanth Padakanti &lt;srikanth_padakanti@apple.com&gt;

* __Fix NPE in sanitizeMetricName when unit or aggregationTemporality is … (#6687)__

    [Srikanth Padakanti](mailto:srikanth29.9@gmail.com) - Thu, 2 Apr 2026 10:09:15 -0700
    
    
    Fix NPE in sanitizeMetricName when unit or aggregationTemporality is null
    
    Signed-off-by: Srikanth Padakanti &lt;srikanth_padakanti@apple.com&gt;

* __Use EventFactory instead of JacksonEvent.builder() in iceberg-source (#6641)__

    [Sotaro Hikita](mailto:70102274+lawofcycles@users.noreply.github.com) - Wed, 1 Apr 2026 06:40:49 -0700
    
    
    Signed-off-by: Sotaro Hikita &lt;bering1814@gmail.com&gt;

* __Add custom Jackson deserializer to handle empty plugin configs and reject empty strings (#6598)__

    [Siqi Ding](mailto:dingdd@amazon.com) - Tue, 31 Mar 2026 12:23:36 -0700
    
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;

* __Minor updates to the OpenSearch versions. Update to latest patches and focus on odd versions. (#6670)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 31 Mar 2026 09:17:04 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add insecure flag to Prometheus sink to require HTTPS by default (#6688)__

    [Shenoy Pratik](mailto:pshenoy36@gmail.com) - Tue, 31 Mar 2026 07:15:24 -0700
    
    
    Signed-off-by: ps48 &lt;pshenoy36@gmail.com&gt;

* __Bump minimatch and aws-cdk-lib in /testing/aws-testing-cdk (#6599)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:54:41 -0700
    
    
    Bumps [minimatch](https://github.com/isaacs/minimatch) to 3.1.5 and updates
    ancestor dependency
    [aws-cdk-lib](https://github.com/aws/aws-cdk/tree/HEAD/packages/aws-cdk-lib).
    These dependencies need to be updated together.
    
     Updates `minimatch` from 3.1.2 to 3.1.5
    - [Changelog](https://github.com/isaacs/minimatch/blob/main/changelog.md)
    - [Commits](https://github.com/isaacs/minimatch/compare/v3.1.2...v3.1.5)
    
    Updates `aws-cdk-lib` from 2.177.0 to 2.241.0
    - [Release notes](https://github.com/aws/aws-cdk/releases)
    - [Changelog](https://github.com/aws/aws-cdk/blob/main/CHANGELOG.v2.alpha.md)
    -
    [Commits](https://github.com/aws/aws-cdk/commits/v2.241.0/packages/aws-cdk-lib)
    
    --- updated-dependencies:
    - dependency-name: minimatch
     dependency-version: 3.1.5
     dependency-type: indirect
    - dependency-name: aws-cdk-lib
     dependency-version: 2.241.0
     dependency-type: direct:production
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump requests in /examples/trace-analytics-sample-app/sample-app (#6677)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:54:02 -0700
    
    
    Bumps [requests](https://github.com/psf/requests) from 2.32.4 to 2.33.0.
    - [Release notes](https://github.com/psf/requests/releases)
    - [Changelog](https://github.com/psf/requests/blob/main/HISTORY.md)
    - [Commits](https://github.com/psf/requests/compare/v2.32.4...v2.33.0)
    
    --- updated-dependencies:
    - dependency-name: requests
     dependency-version: 2.33.0
     dependency-type: direct:production
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump flatted from 3.3.3 to 3.4.2 in /release/staging-resources-cdk (#6660)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:53:37 -0700
    
    
    Bumps [flatted](https://github.com/WebReflection/flatted) from 3.3.3 to 3.4.2.
    - [Commits](https://github.com/WebReflection/flatted/compare/v3.3.3...v3.4.2)
    
    --- updated-dependencies:
    - dependency-name: flatted
     dependency-version: 3.4.2
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump flatted from 3.2.9 to 3.4.2 in /testing/aws-testing-cdk (#6658)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:53:11 -0700
    
    
    Bumps [flatted](https://github.com/WebReflection/flatted) from 3.2.9 to 3.4.2.
    - [Commits](https://github.com/WebReflection/flatted/compare/v3.2.9...v3.4.2)
    
    --- updated-dependencies:
    - dependency-name: flatted
     dependency-version: 3.4.2
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump brace-expansion in /release/staging-resources-cdk (#6681)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:52:42 -0700
    
    
    Bumps  and [brace-expansion](https://github.com/juliangruber/brace-expansion).
    These dependencies needed to be updated together.
    
    Updates `brace-expansion` from 1.1.12 to 1.1.13
    - [Release notes](https://github.com/juliangruber/brace-expansion/releases)
    -
    [Commits](https://github.com/juliangruber/brace-expansion/compare/v1.1.12...v1.1.13)
    
    Updates `brace-expansion` from 2.0.2 to 2.0.3
    - [Release notes](https://github.com/juliangruber/brace-expansion/releases)
    -
    [Commits](https://github.com/juliangruber/brace-expansion/compare/v1.1.12...v1.1.13)
    
    --- updated-dependencies:
    - dependency-name: brace-expansion
     dependency-version: 1.1.13
     dependency-type: indirect
    - dependency-name: brace-expansion
     dependency-version: 2.0.3
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump brace-expansion from 1.1.12 to 1.1.13 in /testing/aws-testing-cdk (#6679)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:52:15 -0700
    
    
    Bumps [brace-expansion](https://github.com/juliangruber/brace-expansion) from
    1.1.12 to 1.1.13.
    - [Release notes](https://github.com/juliangruber/brace-expansion/releases)
    -
    [Commits](https://github.com/juliangruber/brace-expansion/compare/v1.1.12...v1.1.13)
    
    --- updated-dependencies:
    - dependency-name: brace-expansion
     dependency-version: 1.1.13
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump picomatch from 2.3.1 to 2.3.2 in /testing/aws-testing-cdk (#6676)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 30 Mar 2026 06:51:43 -0700
    
    
    Bumps [picomatch](https://github.com/micromatch/picomatch) from 2.3.1 to 2.3.2.
    - [Release notes](https://github.com/micromatch/picomatch/releases)
    - [Changelog](https://github.com/micromatch/picomatch/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/micromatch/picomatch/compare/2.3.1...2.3.2)
    
    --- updated-dependencies:
    - dependency-name: picomatch
     dependency-version: 2.3.2
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump picomatch from 2.3.1 to 2.3.2 in /release/staging-resources-cdk (#6675)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 27 Mar 2026 09:38:13 -0700
    
    
    Bumps [picomatch](https://github.com/micromatch/picomatch) from 2.3.1 to 2.3.2.
    - [Release notes](https://github.com/micromatch/picomatch/releases)
    - [Changelog](https://github.com/micromatch/picomatch/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/micromatch/picomatch/compare/2.3.1...2.3.2)
    
    --- updated-dependencies:
    - dependency-name: picomatch
     dependency-version: 2.3.2
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Fix dlqPipeline functionality broken by PR 6349 (#6678)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 27 Mar 2026 09:37:43 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Fixes the typeof operator along with data types in expressions. (#6673)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 25 Mar 2026 12:31:01 -0700
    
    
    Fixes the typeof operator along with data types in expressions.
    
    The typeof operator was not working because FunctionName came before DataTypes
    it and it has a very broad matching rule. This means that ANTLR was resolving
    these as functions instead of the DataTypes that typeof needs.
    
    The fix here is to move FunctionName to the bottom. Additionally, I renamed
    FunctionName to Identifier to make this more generic for other future
    identifiers.
    
    Also there were no tests for the typeof operator. I have added some of these
    tests, first to verify the failure and fix, and second to ensure future changes
    do not break them.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __add S3 Enrich processor to merge ml batch job output with source inputs (#5992)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Tue, 24 Mar 2026 17:32:13 -0500
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Adding support for pipeline DLQ to SQS sink (#6593)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Tue, 24 Mar 2026 15:22:14 -0500
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Updated the plugin names for the OTLP sources for consistency. (#6530)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 24 Mar 2026 12:02:23 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates to the CDK stack to support the S3 sink integration tests. (#6662)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 24 Mar 2026 09:23:42 -0700
    
    
    Exports the resources and grants permissions so that the integration tests on
    GitHub can pull in the exports. Also grants read permissions to the S3 bucket
    since the tests need to read to verify the results.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add generateUuid() function (#6653)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Mon, 23 Mar 2026 14:28:02 -0700
    
    
    Add generateUuid() function for UUID creation
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Remove Experimental annotation from sqs sink (#6661)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 23 Mar 2026 10:18:59 -0700
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fixes a bug with expressions when functions are combined with and/or operations. (#6669)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Mar 2026 10:12:53 -0700
    
    
    The function composition change (#6628) converted function from a lexer rule to
    a parser rule, which meant function arguments became full parser
    sub-expressions (including conditionalExpression). The
    ParseTreeEvaluatorListener uses LPAREN/RPAREN tokens on the operatorSymbolStack
    as barriers to prevent operators from being evaluated inside nested scopes -
    this is how parenthesesExpression works correctly. However, the function
    composition code explicitly skipped LPAREN/RPAREN tokens inside functions,
    removing this barrier. When a multi-argument function appeared as the right
    operand of and/or, the AND operator sitting on the stack would fire prematurely
    when the walker exited the inner conditionalExpression of a function argument,
    consuming the function&#39;s arguments as boolean operands, silently pushing false,
    and leaving the function with only one argument instead of two.
    
    The fix simply stops skipping LPAREN/RPAREN inside functions, letting them flow
    through to the normal handling where they act as operator stack barriers.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add configurable AWS credential validation at bootstrap (#6629)__

    [Sumit Bhattacharya](mailto:41795508+BhattacharyaSumit@users.noreply.github.com) - Mon, 23 Mar 2026 09:55:49 -0700
    
    
    Add per-secret skip_validation_on_start flag for credential validation
    
    - Add skip_validation_on_start boolean field to AwsSecretManagerConfiguration
    - Default value is false (safe-by-default - validates credentials at bootstrap)
    - When set to false, secret retrieval is deferred until first access
    - Implement lazy-loading logic in AwsSecretsSupplier for deferred secrets
    - Add comprehensive unit and integration tests
    - Maintain backward compatibility (default behavior unchanged)
    
    This allows users to disable credential validation per-secret when credentials
    are not available at bootstrap time, while maintaining fail-fast behavior by
    default for production safety.
    
    Resolves issue where DataPrepper fails to start with invalid credentials by
    providing per-secret control over bootstrap validation.
    
    Make lazy-loading of secrets atomic and handle updateValue with unloaded
    secrets
    
    Use ConcurrentMap.compute() in loadSecretIfNeeded() to ensure the sentinel
    check and secret retrieval are performed atomically, avoiding race conditions
    with concurrent access.
    
    Add loadSecretIfNeeded() call at the beginning of updateValue() to ensure
    secrets are loaded before update logic runs, preventing the NOT_LOADED_SENTINEL
    from being treated as a plain value store.
    
    Signed-off-by: Sumit Bhattacharya &lt;sumit4739@gmail.com&gt;

* __S3 sink server-side encryption with KMS (#6655)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 20 Mar 2026 14:19:01 -0700
    
    
    S3 sink server-side encryption with KMS
    
    Adds new configuration for encryption options in the S3 sink. Allow configuring
    a custom KMS key for S3 server-side encryption. Support SSE-KMS and DSSE-KMS.
    Supports multi-part and locally buffered options.
    
    Resolves #6528.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix duplicate _seconds suffix in APM latency metric name (#6657)__

    [Vamsi Manohar](mailto:reddyvam@amazon.com) - Thu, 19 Mar 2026 20:21:17 -0500
    
    
    The Prometheus sink appends unit suffixes to metric names (e.g., unit &#34;s&#34; 
    becomes &#34;_seconds&#34;). The APM service map processor was naming the histogram 
    metric &#34;latency_seconds&#34; with unit &#34;s&#34;, resulting in &#34;latency_seconds_seconds&#34; 
    when exported to Prometheus. Rename the metric to &#34;latency&#34; so the final 
    Prometheus metric name is correctly &#34;latency_seconds&#34;.
    
    Signed-off-by: Vamsi Manohar &lt;reddyvam@amazon.com&gt;

* __Add HTTP basic auth and no-auth support for prometheus-sink (#6595)__

    [Shenoy Pratik](mailto:pshenoy36@gmail.com) - Thu, 19 Mar 2026 17:18:30 -0500
    
    
    Signed-off-by: ps48 &lt;pshenoy36@gmail.com&gt;

* __Revert &#34;Otel metrics source http service (#6604)&#34; (#6656)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 19 Mar 2026 14:44:51 -0500
    
    
    This reverts commit bb61dbe2c48cb098ce90e49a986b8d3dd585bcf4.
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix race condition between export partition creation and data file partition completion for ddb source (#6651)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 19 Mar 2026 13:03:45 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add S3 Scan processing condition evaluator to ensure object completeness (#6624)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Fri, 20 Mar 2026 01:57:24 +0800
    
    
    Add S3 Scan processing condition evaluator to ensure S3 object completeness
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Remove default codec and require codec for sqs sink (#6486)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 18 Mar 2026 16:38:02 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Allow group id for standard queues sqs sink (#6527)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 18 Mar 2026 16:37:29 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix invalid document version events still included in bulk requests (#6601) (#6645)__

    [Keyur Patel](mailto:keyurpatel.opensource@gmail.com) - Wed, 18 Mar 2026 13:00:09 -0500
    
    
    Events with invalid document_version values are correctly sent to the DLQ but
    were still being added to the OpenSearch bulk request. Added continue 
    statements after the NumberFormatException and RuntimeException catch blocks in
    doOutput() to skip the rest of the loop iteration for failed events.
    
    Added unit tests to verify events with invalid versions are not added to the
    bulk request.
    
    Signed-off-by: Keyur-S-Patel &lt;keyurpatel.opensource@gmail.com&gt;

* __Add substring expression functions (#6621)__

    [Nikhil Bagmar](mailto:40037072+bagmarnikhil@users.noreply.github.com) - Tue, 17 Mar 2026 16:29:37 -0500
    
    
    The expression language has no way to extract a portion of a string by
    delimiter. Existing string processors mutate fields in-place but cannot produce
    a value for assignment via value_expression.
    
    Add four new expression functions:
    
    - substringAfter(s, d): text after the first occurrence of d
    - substringBefore(s, d): text before the first occurrence of d
    - substringAfterLast(s, d): text after the last occurrence of d
    - substringBeforeLast(s, d): text before the last occurrence of d
    
    Both arguments accept JSON Pointers or string literals. If the delimiter is not
    found, the original string is returned. If the source resolves to null, null is
    returned.
    
    Resolve #6612
    
    Signed-off-by: Nikhil Bagmar &lt;nikhilbagmar73@gmail.com&gt;

* __Otel metrics source http service (#6604)__

    [Tomas](mailto:tlongo@sternad.de) - Tue, 17 Mar 2026 09:39:36 +0100
    
    
    * Add HTTP service to otel_metrics_source
    
    Integrates an HTTP (non-gRPC) service into the OTel metrics source plugin, 
    mirroring the existing pattern from otel_trace_source and otel_logs_source. 
    Both gRPC and HTTP services now run on the same Armeria server.
    
    Key changes:
    - Add ArmeriaHttpService for handling HTTP metric export requests
    - Add HttpExceptionHandler for HTTP-specific error handling
    - Support compression, authentication, throttling, and health checks for HTTP
    - Add configurable http_path option
    - Refactor OTelMetricsSource to directly configure the server
    - Remove ConvertConfiguration (inlined into source)
    - Split monolithic test into focused test classes (gRPC, HTTP, RetryInfo)
    - Add E2E tests for HTTP, gRPC, protobuf, and unframed requests
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt; Signed-off-by: Kai Sternad
    &lt;kai@sternad.de&gt;
    
    * Kepp constant handling consistent with other sources
    
    Signed-off-by: Kai Sternad &lt;kai@sternad.de&gt;
    
    * Add guard to httpPath, deduplicate health check
    
      1. createServer() — configureHttpService() is now guarded with if
    (getHttpPath() != null), preventing the NPE
     2. HTTP health check — moved from configureHttpService() into createServer(),
    so it registers when either httpPath or enableUnframedRequests is set (matching
    the OTelLogsSource pattern)
     3. configureHttpService() — removed the duplicate health check registration
    
    Signed-off-by: Kai Sternad &lt;kai@sternad.de&gt;
    
    * Move healthCheck back to configureHttpService
    
    Signed-off-by: Kai Sternad &lt;kai@sternad.de&gt;
    
    * Incorporate review findings
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Deduplicate output format, decompose createServer
    
    Signed-off-by: Kai Sternad &lt;kai@sternad.de&gt;
    
    ---------
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt; Signed-off-by: Kai Sternad
    &lt;kai@sternad.de&gt; Co-authored-by: Kai Sternad &lt;kai@sternad.de&gt;

* __Fix possible missing file count in data file loader (#6639)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 16 Mar 2026 17:11:47 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix requestsTooLarge metric reporting when decompression buffer overflows on armeria in otel logs source (#6633)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 16 Mar 2026 08:37:35 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add minute range support to Dimensional TimeSlice Source Crawler framework (#6368)__

    [Raju Enugula](mailto:enugraju@amazon.com) - Fri, 13 Mar 2026 15:39:39 -0500
    
    
    * Add minute range support to Dimensional TimeSlice crawler framework
    
    Signed-off-by: enugraju &lt;enugraju@amazon.com&gt;
    
    * Changed return type of getLookBackMinutes to Instant
    
    Signed-off-by: enugraju &lt;enugraju@amazon.com&gt;
    
    * Review comment fixes
    
    Signed-off-by: enugraju &lt;enugraju@amazon.com&gt;
    
    * Created a generic method to centralize the logic for wrapping
    adjustedStartTime
    
    Signed-off-by: enugraju &lt;enugraju@amazon.com&gt;
    
    ---------
    
    Signed-off-by: enugraju &lt;enugraju@amazon.com&gt;

* __fix: add BackoffCredentialsProvider to mitigate STS throttling across all plugins (#6637)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 13 Mar 2026 15:25:59 -0500
    
    
    Wrap StsAssumeRoleCredentialsProvider with BackoffCredentialsProvider in 
    CredentialsProviderFactory. When credential resolution fails (e.g. role deleted
    or trust policy misconfigured), the wrapper caches the failure and applies
    exponential backoff (10s to 10min) before retrying STS, preventing excessive
    AssumeRole calls that cause STS throttling.
    
    This protects all plugins that use CredentialsProviderFactory including S3,
    OpenSearch, Lambda, SQS, and most AWS-integrated sources and sinks.
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix where stream and leader scheduler could die from unexpected error for mongodb source (#6638)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 13 Mar 2026 14:25:35 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds the current release as a GitHub label on the README. It links to the releases tab in GitHub. (#6625)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Mar 2026 11:28:00 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes the cache for the KMS encryption plugin. (#6636)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Mar 2026 09:18:44 -0700
    
    
    The cache was using byte[] as the key. As an array it doesn&#39;t have
    equals/hashCode so the keys would never be found. To cache it correctly I use
    SdkBytes which implements both.
    
    I also added three metrics for the KMS plugin: 1. A gauge on decrypted keys in
    the cache; 2. KMS requests succeeded; 3. KMS requests failed.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __fix: mitigate STS assume role throttling in Kafka buffer (#6634)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 13 Mar 2026 11:00:46 -0500
    
    
    Prevent excessive STS AssumeRole calls when customers delete their IAM role or
    misconfigure the trust policy. Previously, one pipeline could generate 12,000
    STS calls in 4 minutes due to unbounded retries of non-retryable
    AccessDeniedException errors.
    
    Changes:
    - KafkaSecurityConfigurer: Fail fast on STS 403 (AccessDenied) in
    getBootStrapServersForMsk() instead of retrying 360 times
    - KafkaSecurityConfigurer: Replace fixed 10s retry sleep with exponential
    backoff (10s to 10min max) for retryable STS and Kafka errors
    - KafkaCustomConsumer: Replace fixed 10s retry with exponential backoff using
    Kafka&#39;s ExponentialBackoff (10s to 10min max) for AuthenticationException
    errors
    - KafkaCustomConsumer: Use Duration constants for backoff readability
    - KafkaCustomConsumer: Reset backoff counter on successful poll to handle
    transient errors gracefully Add exponential backoff to outer run() exception
    handler
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * chore: remove unused imports from KafkaSecurityConfigurerTest
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * refactor: address review comments - use Kafka ExponentialBackoff, Duration
    constants, remove silent shutdown
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Provides a mechanism to get the size of the JSON representation of an event. (#6635)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Mar 2026 08:46:31 -0700
    
    
    Provides a mechanism to get the size of the JSON representation of an event.
    
    This adds a new toJsonString() function to expressions. Updates length()
    function to accept a direct string as input, so that it can be composed with
    toJsonString().
    
    Includes a fix for add_entries to validate expressions, but not evaluate them
    in the constructor. The approach was brittle and failed for the new
    toJsonString function.
    
    Resolves #6278.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for invoking acknowledgmentSet callback on expiry (#6596)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 12 Mar 2026 15:05:52 -0700
    
    
    Add support for invoking acknowledgmentSet callback on expiry. Fixed expiry
    logic in DefaultAcknowledgementSet.
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Split the GitHub Action for license header checks into two workflows. One for checking the PR and the other for posting PR comments. (#6632)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 12 Mar 2026 12:13:06 -0700
    
    
    The current approach is resulting in permissions failures when trying to post
    comments. This approach should give the necessary permissions.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support function composition in expressions. (#6628)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 12 Mar 2026 11:02:31 -0700
    
    
    Support function composition in expressions.
    
    The grammar changed function from a lexer rule to a parser rule. The previous
    approach yielded on token that needed to be parsed manually. As a parser rule
    each argument is a full sub-expression. This includes conditionalExpression,
    arithmeticExpression, stringExpression, jsonPointer, or literal. This gives
    ANTLR structural visibility into function calls, enabling composable functions
    that were impossible when the whole call was a single unparsed string. The
    grammar change meant that the ParseTreeEvaluatorListener now parses functions
    instead of ParseTreeCoercionService.
    
    I also consolidated SET_DELIMITER and COMMA and DIVIDE and FORWARDSLASH. Having
    these as different tokens caused problems parsing grammars.
    
    Resolves #6322.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add Iceberg CDC source plugin (#6554)__

    [Sotaro Hikita](mailto:70102274+lawofcycles@users.noreply.github.com) - Wed, 11 Mar 2026 09:40:53 -0700
    
    
    Add Iceberg CDC source plugin (#6552)
    
    * Merge UPDATE pairs into single INDEX for CDC events
    
    When a CoW UPDATE produces a DELETE + INSERT pair with the same document_id
    after carryover removal, emit only the INSERT as INDEX. Since OpenSearch INDEX
    is an upsert, the DELETE is unnecessary.
    
    This also eliminates a potential issue where multiple ProcessWorker threads
    consuming from the buffer in parallel could reorder DELETE and INDEX operations
    for the same document, causing data loss.
    
    Signed-off-by: Sotaro Hikita &lt;bering1814@gmail.com&gt;

* __Fix flaky Router_ThreeRoutesDefaultIT by polling all assertions (#6620)__

    [Kai Sternad](mailto:kai@sternad.de) - Wed, 11 Mar 2026 09:28:54 +0100
    
    
    Move all assertions inside the await() block so they are polled until they
    pass, rather than checking sinks are non-empty and then immediately asserting
    exact counts outside the polling loop. Also increase the timeout from 2s to 10s
    to accommodate slow CI runners.
    
    Signed-off-by: Kai Sternad &lt;kai@sternad.de&gt;

* __feat: add Claude Code attribute mapping profile for GenAI normalization (#6623)__

    [Kyle Hounslow](mailto:7102778+kylehounslow@users.noreply.github.com) - Tue, 10 Mar 2026 11:45:09 -0700
    
    
    * feat: add Claude Code attribute mapping profile for GenAI normalization
    
    Adds claude_code profile to genai-attribute-mappings.yaml:
    - model → gen_ai.request.model
    - input_tokens → gen_ai.usage.input_tokens
    - output_tokens → gen_ai.usage.output_tokens
    
    Tested with real Claude Code v2.1.71 traces
    (CLAUDE_CODE_ENHANCED_TELEMETRY_BETA=1).
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * docs: add GenAI enrichment docs to otel_traces processor and output_format
    README
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;

* __Refactors how expression functions handle string literals and EventKeys. Now the ParseTreeCoercionService will provide either a String without quotes or an EventKey. This is important for function composition to work because the result of one function will be a string without the quotes. It also removes a lot of duplicated logic for checking the literal type. (#6626)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 10 Mar 2026 11:10:53 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Increase the Jenkins job timeout to 2 hours from 1. The 2.14.1 job is timing out. (#6618)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 5 Mar 2026 18:10:44 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release notes for 2.14.1. (#6616)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 5 Mar 2026 13:59:49 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support validating library compatibility on data-prepper-api. (#6607)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 5 Mar 2026 12:34:12 -0800
    
    
    Resolves #6605.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix AMP IntegrationTests (#6608)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 5 Mar 2026 09:56:36 -0800
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Updates RELEASING.md to remove the section to update DataPrepperVersion. This value is now dynamically determined so there is no manual step for releasing. (#6559)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Mar 2026 08:01:28 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __GitHub Action to verify the Gradle buildSrc. (#6597)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 3 Mar 2026 09:02:57 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Security procedures for creating or editing push-based sources (#6538)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 3 Mar 2026 07:30:15 -0800
    
    
    Creates security procedures for creating new push-based sources.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add change log for 2.14.0 (#6564)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Sat, 28 Feb 2026 13:59:44 -0600
    
    
    * Add release notes for 2.14.0
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update changelog with #6548
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __test(otel_logs_source): invert default httpPath in test config fixture (#6575)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 27 Feb 2026 14:42:19 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __fix(otel_logs_source): fix NPE and regressions introduced by HTTP service support (#6572)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 27 Feb 2026 10:57:25 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Release notes for Data Prepper 2.14.0. (#6571)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 27 Feb 2026 06:21:11 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __feat: Add GenAI agent trace enrichment to otel_traces processor (#6548)__

    [Kyle Hounslow](mailto:7102778+kylehounslow@users.noreply.github.com) - Tue, 24 Feb 2026 16:24:49 -0800
    
    
    * feat: add GenAI agent trace enrichment to otel_traces processor
    
    Always-on enrichment in otel_traces processor:
    - Normalizes vendor attributes (OpenInference, OpenLLMetry) to gen_ai.* semconv
    - Propagates select gen_ai attributes from child spans to root
    - Aggregates token counts across children to root
    - Strips conflicting flattened sub-keys
    
    No configuration required. No-op for non-GenAI traces.
    
    RFC: https://github.com/opensearch-project/data-prepper/issues/6542
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * fix: use OTelProtoOpensearchCodec storage key format in GenAI enrichment
    
    OTelProtoOpensearchCodec converts span attribute keys from dot-notation to a
    prefixed @ format before storing them in the JacksonSpan attributes map (e.g.
    gen_ai.system -&gt; span.attributes.gen_ai@system). The enrichment code was using
    dot-notation for lookups and writes, so it silently found nothing in production
    even though unit tests passed (tests bypass the codec).
    
    Fix: add toStorageKey()/toLogicalKey() helpers that convert between the two
    formats. All attribute reads and writes in enrichRootSpan, normalizeAttributes,
    and stripFlattenedSubkeys now use the storage format.
    
    Test fix: add convertToStorageFormat() helper that renames attribute keys to
    simulate the codec, and storageFormatRecords() that applies it before passing
    spans to the processor. JSON fixtures stay in dot-notation. All GenAI tests now
    exercise the real code path.
    
    E2E validated: LangGraph, Strands, CrewAI root spans now have gen_ai.* 
    attributes propagated correctly.
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * refactor: address PR review comments on GenAiAttributeMappings and tests
    
    - Make MappingTarget fields private with getKey()/isWrapSlice() getters
    - Make LOOKUP_TABLE/OPERATION_NAME_VALUES private with static getters
    - Add GenAiAttributeMappingsTest with direct coverage of getters and mappings
    - Assert result/attrs non-empty in testFlattenedSubkeysStripped to prevent
     silent pass when collections are empty
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * test: add integration test verifying GenAI enrichment runs in
    OTelTraceRawProcessor.doExecute
    
    Adds testGenAiEnrichmentRunsDuringDoExecute to OTelTraceRawProcessorTest. 
    Passes a span with OpenLLMetry vendor attributes through doExecute and asserts
    the normalized gen_ai.* attribute appears on the output span, verifying the
    enrichment call is wired into the processor pipeline.
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * refactor: load GenAI attribute mappings from YAML resource file
    
    Moves hardcoded attribute mappings from GenAiAttributeMappings.java into 
    genai-attribute-mappings.yaml in the jar resources. Loaded at class init via
    Jackson YAML. This separates data from code and makes it easier to add new
    instrumentation library mappings without modifying Java.
    
    Covers OpenInference (15 mappings) and OpenLLMetry (20 mappings) profiles plus
    operation_name_values. Adds testMappingsFileExists to verify the resource file
    is present and readable.
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * rename: wrapSlice -&gt; wrapAsArray for clarity in GenAI attribute mappings
    
    Renamed the flag that wraps a scalar string value into a single-element JSON
    array from wrapSlice to wrapAsArray (Java) and wrap_as_array (YAML). The new
    name makes the behavior immediately clear without needing context.
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * revert: remove storage-key format from GenAI enrichment
    
    Reverts the behavioral changes from 5ac188ad which converted attribute lookups
    and writes to use span.attributes.* prefix with @ separators
    (e.g. span.attributes.gen_ai@system). The enrichment code now uses plain
    dot-notation keys (e.g. gen_ai.system) matching the format in the JacksonSpan
    attributes map at processing time.
    
    Removed: toStorageKey(), toLogicalKey(), STORAGE_PREFIX, and the 
    convertToStorageFormat()/storageFormatRecords() test helpers.
    
    Preserves accessor refactors (getKey(), isWrapAsArray(), getLookupTable()) and
    test assertions from subsequent commits.
    
    Unit tests: 35/35 pass (full otel-trace-raw-processor module) E2E: Strands +
    LangGraph agents → local DP → OpenSearch verified
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    * fix: add license header to genai-attribute-mappings.yaml
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kyle Hounslow &lt;kylhouns@amazon.com&gt;

* __otel_apm_service_map: Added support for deriving remote service and remote operation (#6539)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 23 Feb 2026 20:52:51 -0800
    
    
    * otel_apm_service_map: Added support for deriving remote service and remote
    operation
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed license header check failures
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Increasing ack timeout to 4 hours for kds source (#6547)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Mon, 23 Feb 2026 12:46:55 -0600
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Bump the next version of Data Prepper to 2.15. (#6558)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Feb 2026 09:29:47 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Otel logs source http service (#6250)__

    [Tomas](mailto:tlongo@sternad.de) - Fri, 20 Feb 2026 09:45:57 +0100
    
    
    Introduce HTTP/protobuf and HTTP/JSON support for OTel Logs source. Adds
    endpoint to receive OTLP data over HTTP. Aligns with similar support for
    OTelTraceSource.
    
    * [WIP] Integrate http service and make sure it works properly
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Integrate grpc and http service into a single server
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Extract tests that assert grpc requests
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Fix return value of http service
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Re-introduce unframed request for the grpc service
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Add E2E test
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Add E2E test for gRPC
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Add test for unframed requests
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Add e2e test for unframed requests
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Add e2e test for protobuf requests
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Fix media type for protobuf payload
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Update license headers
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Adhere to config when it comes to chose a codec
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Inject OtelProtoCodec into ArmeriaHttpService
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    ---------
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;

* __Fix potential NPE in scroll worker (#6541)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 19 Feb 2026 13:34:33 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Unified Node/NodeOperationDetail model for APM service map processor (#6536)__

    [Vamsi Manohar](mailto:reddyvam@amazon.com) - Wed, 18 Feb 2026 18:59:08 -0800
    
    
    * Refactor to unified Node/NodeOperationDetail with SERVICE_MAP_V2 events
    
    - Replace Service/ServiceConnection/ServiceOperationDetail with unified
    Node/NodeOperationDetail model
    - Node adds type field for future entity types (database, queue, etc)
    - Operation simplified to name + attributes
    - NodeOperationDetail single entity with dual hash fields (nodeConnectionHash,
    operationConnectionHash)
    - CLIENT-span-primary emission: CLIENT spans emit full NodeOperationDetail,
    leaf SERVER spans for services with no outgoing calls
    - Update eventType to SERVICE_MAP_V2 for new index pattern
    otel-v2-apm-service-map
    
    Co-Authored-By: Claude Opus 4.6 &lt;noreply@anthropic.com&gt; Signed-off-by: Vamsi
    Manohar &lt;reddyvam@amazon.com&gt;
    
    * Refactor model to unified Node/NodeOperationDetail with CLIENT-primary
    emission
    
    Refactors the APM service map processor to use a unified model structure 
    replacing Service/ServiceConnection/ServiceOperationDetail with
    Node/NodeOperationDetail. Implements CLIENT-span-primary emission algorithm to
    eliminate duplicate events.
    
    Model Changes:
    - Node.java: Unified service entity with type field for future extensibility
    - NodeOperationDetail: Single entity for both topology and operation events
    - Operation: Simplified to name + attributes structure
    - CLIENT-primary algorithm: CLIENT spans emit complete events using decoration
    data
    
    OpenSearch Integration:
    - Added OTEL_APM_SERVICE_MAP index type following PR #6435 patterns
    - Index template with dynamic mappings for groupByAttributes and operation
    attributes
    - ISM policies for automated rollover (10gb/24h)
    - Updated IndexManagerFactory, IndexConstants, IndexConfiguration
    
    Configuration:
    - Changed eventType from SERVICE_MAP_V2 to SERVICE_MAP
    - Updated README with proper index_type: otel-v2-apm-service-map configuration
    - Coexists with legacy service_map processor using different index patterns
    
    Co-Authored-By: Claude Opus 4.6 &lt;noreply@anthropic.com&gt; Signed-off-by: Vamsi
    Manohar &lt;reddyvam@amazon.com&gt;
    
    * Update README with algorithm docs and remove standalone MD files
    
    - Merged NodeOperationDetail algorithm documentation into processor README
    - Updated output events section to reflect unified Node/NodeOperationDetail
    model
    - Added detailed metrics generation documentation
    - Removed standalone node-operation-detail-algorithm.md from tracking
    - Added algorithm design MD files to .gitignore
    
    Co-Authored-By: Claude Opus 4.6 &lt;noreply@anthropic.com&gt; Signed-off-by: Vamsi
    Manohar &lt;reddyvam@amazon.com&gt;
    
    * Fix index-template version to use composable template format
    
    The index-template/ copy needs the &#34;template&#34; wrapper for the modern OpenSearch
    composable index template API, while the root copy uses the V1 legacy format.
    Previously both were identical (V1 format).
    
    Co-Authored-By: Claude Opus 4.6 &lt;noreply@anthropic.com&gt; Signed-off-by: Vamsi
    Manohar &lt;reddyvam@amazon.com&gt;
    
    * Clean up .gitignore and optimize index templates
    
    - Remove local-only entries from .gitignore (algorithm MDs, claude.md)
    - Collapse 12 dynamic templates to 6 using wildcard path matching
    - Remove ignore_above restrictions from all keyword fields
    - Fix index-template/ copy to use composable template format
    
    Co-Authored-By: Claude Opus 4.6 &lt;noreply@anthropic.com&gt; Signed-off-by: Vamsi
    Manohar &lt;reddyvam@amazon.com&gt;
    
    * Remove eventType from index templates and fix test issues
    
    - Remove eventType field from both index templates (V1 and composable)
     eventType is pipeline routing metadata, not part of NodeOperationDetail model
    - Remove broken testWindowProcessingWithInterruptedException test
     Test doesn&#39;t work with @DataPrepperPluginTest annotation due to override
    restrictions
    
    Addresses review feedback from @kkondaka
    
    Co-Authored-By: Claude Opus 4.6 &lt;noreply@anthropic.com&gt; Signed-off-by: Vamsi
    Manohar &lt;reddyvam@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Vamsi Manohar &lt;reddyvam@amazon.com&gt; Co-authored-by: Claude Opus
    4.6 &lt;noreply@anthropic.com&gt;

* __Added support of newline in output codec (#6423)__

    [Subrahmanyam-Gollapalli](mailto:subrahmanyam.gollapalli@freshworks.com) - Wed, 18 Feb 2026 16:17:41 -0600
    
    
    * Added support of newline in the output codec
    
    Signed-off-by: Subrahmanyam-Gollapalli &lt;subrahmanyam.gollapalli@freshworks.com&gt;
    
    * config to write empty events
    
    Signed-off-by: Subrahmanyam-Gollapalli &lt;subrahmanyam.gollapalli@freshworks.com&gt;
    
    * updated licence header
    
    Signed-off-by: Subrahmanyam-Gollapalli &lt;subrahmanyam.gollapalli@freshworks.com&gt;
    
    ---------
    
    Signed-off-by: Subrahmanyam-Gollapalli &lt;subrahmanyam.gollapalli@freshworks.com&gt;

* __Reducing Dockerfile image size greatly by consolidating layers, running chown on copy to avoid duplicate data, running dnf clean, and removing dnf cache. (#6520)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 18 Feb 2026 07:18:52 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the license headers for various Gradle build files. (#6534)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 17 Feb 2026 14:01:53 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the license headers for the data-prepper-core project. (#6532)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 17 Feb 2026 12:29:12 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the license headers for the performance-test project. (#6531)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 17 Feb 2026 12:29:04 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add otel-apm-service-map processor (#6479)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 17 Feb 2026 08:01:54 -0800
    
    
    Add otel-apm-service-map processor
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt; Co-authored-by: Santhosh
    Gandhe &lt;1909520+san81@users.noreply.github.com&gt;, Neeraj Kumar
    &lt;kneeraj@amazon.com&gt;

* __Add additional metrics for otel logs source and kafka buffer producer (#6512)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 16 Feb 2026 18:13:54 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds release notes and change log for Data Prepper 2.13.1. (#6525)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 16 Feb 2026 13:51:46 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __fix: change eventbridge notification file size from int to long (#6497)__

    [Leila Moussa](mailto:leila.farah.moussa@gmail.com) - Mon, 16 Feb 2026 13:11:45 -0800
    
    
    Signed-off-by: LeilaMoussa &lt;leila.farah.moussa@gmail.com&gt;

* __Use a Timer for the sinkRequestLatency metric so that Micrometer reports it with correct units. Adds a new method to record with time units and retains the existing method for double. Update usage of this as well. (#6510)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 16 Feb 2026 11:14:18 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates Rhino to 1.7.15.1. Fixes CVE-2025-66453. (#6519)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 16 Feb 2026 10:46:48 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update Netty to 4.1.131. Resolves CVE-2025-67735, CVE-2025-59419. (#6518)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 16 Feb 2026 10:46:39 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Use a Timer for the sqsSinkRequestLatency metric so that Micrometer reports it with correct units. (#6513)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 16 Feb 2026 10:45:23 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Corrects Kafka buffer metrics related to write timeouts and write time elapsed. This is solved by implementing writeBytes in AbstractBuffer and adding a doWriteBytes method that throws by default. This keeps the default behavior of throwing, but with correct metric reporting. (#6506)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Feb 2026 10:27:23 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __When running smoke tests verify the correct architecture. Update GitHub Actions to run for Docker smoke tests. (#6504)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Feb 2026 09:24:11 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates license headers for core build files. (#6500)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Feb 2026 09:05:56 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Additional documentation for browsing Data Prepper snapshots online. (#6495)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Feb 2026 09:05:32 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.wiremock:wiremock in /data-prepper-plugins/s3-source (#6302)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:12:58 -0800
    
    
    Bumps [org.wiremock:wiremock](https://github.com/wiremock/wiremock) from 3.13.1
    to 3.13.2.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.13.1...3.13.2)
    
    --- updated-dependencies:
    - dependency-name: org.wiremock:wiremock
     dependency-version: 3.13.2
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.projectlombok:lombok in /data-prepper-plugins/opensearch (#6107)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:11:51 -0800
    
    
    Bumps [org.projectlombok:lombok](https://github.com/projectlombok/lombok) from
    1.18.38 to 1.18.42.
    -
    [Changelog](https://github.com/projectlombok/lombok/blob/master/doc/changelog.markdown)
    -
    [Commits](https://github.com/projectlombok/lombok/compare/v1.18.38...v1.18.42)
    
    --- updated-dependencies:
    - dependency-name: org.projectlombok:lombok
     dependency-version: 1.18.42
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.zendesk:mysql-binlog-connector-java from 0.29.2 to 0.30.1 (#6036)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:10:41 -0800
    
    
    Bumps
    [com.zendesk:mysql-binlog-connector-java](https://github.com/osheroff/mysql-binlog-connector-java)
    from 0.29.2 to 0.30.1.
    -
    [Changelog](https://github.com/osheroff/mysql-binlog-connector-java/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/osheroff/mysql-binlog-connector-java/commits)
    
    --- updated-dependencies:
    - dependency-name: com.zendesk:mysql-binlog-connector-java
     dependency-version: 0.30.1
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.github.luben:zstd-jni in /data-prepper-plugins/common (#6215)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:09:16 -0800
    
    
    Bumps [com.github.luben:zstd-jni](https://github.com/luben/zstd-jni) from
    1.5.7-4 to 1.5.7-6.
    - [Commits](https://github.com/luben/zstd-jni/compare/v1.5.7-4...v1.5.7-6)
    
    --- updated-dependencies:
    - dependency-name: com.github.luben:zstd-jni
     dependency-version: 1.5.7-6
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.jayway.jsonpath:json-path-assert (#6218)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:08:59 -0800
    
    
    Bumps
    [com.jayway.jsonpath:json-path-assert](https://github.com/jayway/JsonPath) from
    2.6.0 to 2.10.0.
    - [Release notes](https://github.com/jayway/JsonPath/releases)
    - [Changelog](https://github.com/json-path/JsonPath/blob/master/changelog.md)
    -
    [Commits](https://github.com/jayway/JsonPath/compare/json-path-2.6.0...json-path-2.10.0)
    
    --- updated-dependencies:
    - dependency-name: com.jayway.jsonpath:json-path-assert
     dependency-version: 2.10.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump js-yaml from 3.14.1 to 3.14.2 in /release/staging-resources-cdk (#6276)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:08:10 -0800
    
    
    Bumps [js-yaml](https://github.com/nodeca/js-yaml) from 3.14.1 to 3.14.2.
    - [Changelog](https://github.com/nodeca/js-yaml/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/nodeca/js-yaml/compare/3.14.1...3.14.2)
    
    --- updated-dependencies:
    - dependency-name: js-yaml
     dependency-version: 3.14.2
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-trace-source (#6454)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:07:15 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#6456)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:06:44 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.18.3 to 1.18.4.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.18.3...byte-buddy-1.18.4)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-version: 1.18.4
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#6455)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:06:25 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/http-source (#6459)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:06:12 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.httpcomponents.client5:httpclient5 (#6461)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:05:56 -0800
    
    
    Bumps
    [org.apache.httpcomponents.client5:httpclient5](https://github.com/apache/httpcomponents-client)
    from 5.5 to 5.6.
    -
    [Changelog](https://github.com/apache/httpcomponents-client/blob/master/RELEASE_NOTES.txt)
    -
    [Commits](https://github.com/apache/httpcomponents-client/compare/rel/v5.5...rel/v5.6)
    
    --- updated-dependencies:
    - dependency-name: org.apache.httpcomponents.client5:httpclient5
     dependency-version: &#39;5.6&#39;
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.maven:maven-artifact in /data-prepper-plugins/opensearch (#6457)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:05:42 -0800
    
    
    Bumps org.apache.maven:maven-artifact from 3.9.11 to 3.9.12.
    
    --- updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-version: 3.9.12
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#6463)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:04:36 -0800
    
    
    Bumps software.amazon.awssdk:auth from 2.39.5 to 2.41.19.
    
    --- updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-version: 2.41.19
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.json:json in /data-prepper-plugins/avro-codecs (#6465)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:03:31 -0800
    
    
    Bumps [org.json:json](https://github.com/douglascrockford/JSON-java) from
    20250517 to 20251224.
    - [Release notes](https://github.com/douglascrockford/JSON-java/releases)
    -
    [Changelog](https://github.com/stleary/JSON-java/blob/master/docs/RELEASES.md)
    - [Commits](https://github.com/douglascrockford/JSON-java/commits)
    
    --- updated-dependencies:
    - dependency-name: org.json:json
     dependency-version: &#39;20251224&#39;
     dependency-type: direct:production
     update-type: version-update:semver-major
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-logs-source (#6469)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:02:59 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.apptasticsoftware:rssreader in /data-prepper-plugins/rss-source (#6468)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:02:37 -0800
    
    
    Bumps [com.apptasticsoftware:rssreader](https://github.com/w3stling/rssreader)
    from 3.7.0 to 3.12.0.
    - [Release notes](https://github.com/w3stling/rssreader/releases)
    - [Commits](https://github.com/w3stling/rssreader/compare/v3.7.0...v3.12.0)
    
    --- updated-dependencies:
    - dependency-name: com.apptasticsoftware:rssreader
     dependency-version: 3.12.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-proto-common (#6467)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 13 Feb 2026 07:02:22 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __fix: Dedup failure metrics (#6501)__

    [chrisale000](mailto:alchrisk@amazon.com) - Wed, 11 Feb 2026 15:49:50 -0600
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Add derived server-side attributes to OTel trace raw processor (#6481)__

    [Vamsi Manohar](mailto:g.vamsimanoharreddy@gmail.com) - Tue, 10 Feb 2026 10:03:14 -0800
    
    
    This commit adds functionality to automatically derive server-side attributes 
    for OpenTelemetry traces based on span characteristics:
    
    - Created OTelSpanDerivationUtil utility class to handle attribute derivation
    logic
    - Added support for deriving error, fault, throttle, and generic name
    attributes
    - Integrated derivation logic into OTelTraceRawProcessor with configurable
    enable/disable
    - Added comprehensive test coverage including unit tests and test resources
    - Updated .gitignore and other configuration files
    
    Key features:
    - Automatic error detection from span status and HTTP status codes
    - Fault detection for 5xx HTTP responses and error status codes
    - Throttle detection for 429 HTTP status codes
    - Generic name flagging for spans with generic operation names
    - Environment and operation attribute handling
    
    Signed-off-by: Vamsi Manohar &lt;reddyvam@amazon.com&gt;

* __fix: Add atomic counter for reliable partition count tracking in DimensionalTimeSliceCrawler (#6449)__

    [chrisale000](mailto:alchrisk@amazon.com) - Mon, 9 Feb 2026 16:00:47 -0600
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __refactor(source-crawler): enable direct injection of VendorAPIMetricsRecorder (#6444)__

    [chrisale000](mailto:alchrisk@amazon.com) - Mon, 9 Feb 2026 15:44:58 -0600
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Distribute ARM archives. This copies the ARM archives during the promote archives step of the Jenkins job for promotion. (#6498)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 9 Feb 2026 12:33:25 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release ARM artifacts and run smoke tests for them (#6499)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 9 Feb 2026 11:56:00 -0800
    
    
    Run smoke tests for ARM artifacts, both the Docker image and the archives.
    Includes Java 21 smoke tests both for ARM and x86. Corrects the release build
    to push the Docker image. Some modernization to GHA plugins.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix OTEL trace source broken by PR 5322 (#6494)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Sun, 8 Feb 2026 09:27:49 -0800
    
    
    * Fix OTEL trace source broken by PR 5322
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified HttpService to use appropriate Decoder base on output_format
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Test the opensearch sink against OpenSearch 3. (#6491)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 6 Feb 2026 07:19:47 -0800
    
    
    Use complicated password for OpenSearch 3.x and beyond.
    
    Addresses some issues found during testing where test would fail or get stuck
    by closing resources better and adding test timeouts. Move waiting on the
    OpenSearch cluster into the OpenSearchIT class.
    
    Updated the test names for the GitHub Actions. Clarified the steps with a wait
    period. Updated some actions versions.
    
    Resolves #6485.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __refactor: make s3 sqs shutdown configurable (#6489)__

    [Leila Moussa](mailto:leila.farah.moussa@gmail.com) - Thu, 5 Feb 2026 13:48:00 -0800
    
    
    Signed-off-by: LeilaMoussa &lt;leila.farah.moussa@gmail.com&gt;

* __Flush remaining data to S3 during shutdown (#6424)__

    [Subrahmanyam-Gollapalli](mailto:subrahmanyam.gollapalli@freshworks.com) - Thu, 5 Feb 2026 11:18:42 -0800
    
    
    flush remaining data to S3 during shutdown
    
    Signed-off-by: Subrahmanyam-Gollapalli &lt;subrahmanyam.gollapalli@freshworks.com&gt;

* __GitHub Action to prepare a branch for the next release. (#6487)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 5 Feb 2026 08:56:21 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Remove SingleThread annotation from Drop Events Processor (#6417)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 4 Feb 2026 13:51:58 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Update werkzeug and protobuf versions for sample-app (CVE-2026-21860 and CVE-2025-66221) (#6476)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 3 Feb 2026 15:07:52 -0800
    
    
    * Update werkzeug and protobuf versions for sample-app (CVE-2026-21860 and
    CVE-2025-66221)
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build failure by replacing dash with flask
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build failure by updating opentelemetry versions
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Bump org.assertj:assertj-core (#6460)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 2 Feb 2026 06:55:12 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#6458)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 2 Feb 2026 06:55:00 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.3 to 3.27.7.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.3...assertj-build-3.27.7)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-version: 3.27.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.awaitility:awaitility (#6466)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 2 Feb 2026 06:54:17 -0800
    
    
    Bumps [org.awaitility:awaitility](https://github.com/awaitility/awaitility)
    from 4.2.0 to 4.3.0.
    -
    [Changelog](https://github.com/awaitility/awaitility/blob/master/changelog.txt)
    -
    [Commits](https://github.com/awaitility/awaitility/compare/awaitility-4.2.0...awaitility-4.3.0)
    
    --- updated-dependencies:
    - dependency-name: org.awaitility:awaitility
     dependency-version: 4.3.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Enable Mend Renovate in Whitesource settings (#6445)__

    [Craig Perkins](mailto:cwperx@amazon.com) - Fri, 30 Jan 2026 14:50:28 -0800
    
    
    Signed-off-by: Craig Perkins &lt;cwperx@amazon.com&gt;

* __add unit test for jackson dependency edge case (#6421)__

    [Kennedy Onyia](mailto:145404406+kennedy-onyia@users.noreply.github.com) - Fri, 30 Jan 2026 11:57:59 -0600
    
    
    Signed-off-by: Kennedy Onyia &lt;kennedy.onyia@gmail.com&gt;

* __Adding streaming support for lambda pluggin (#6273)__

    [Manan Rajotia](mailto:31757918+mananrajotia@users.noreply.github.com) - Thu, 29 Jan 2026 11:24:35 -0800
    
    
    Streaming response support for lambda plugin
    
    Signed-off-by: Manan Rajotia &lt;rajotia@amazon.com&gt;

* __Runs peer-forward and log analytics end-to-end tests on both ARM and x86 architectures. Updates these projects to use the current architecture Linux distribution when running. Include the ARM runner in the GitHub Actions matrix strategy. Combines the two GitHub Actions for peer-forwarder into a single GitHub Action. (#6414)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 28 Jan 2026 15:39:39 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Give the license header check GitHub Action permissions to write to issues and pull requests. The check is running fine, but the comments are failing to actually post. (#6438)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 28 Jan 2026 15:39:12 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add optional timeout configurations for AWS Lambda plugin (#6413)__

    [ashrao94](mailto:55301835+ashrao94@users.noreply.github.com) - Wed, 28 Jan 2026 14:04:56 -0600
    
    
    * Add optional timeout configurations for AWS Lambda plugin
    
    - Add api_call_attempt_timeout configuration for per-attempt timeouts
    - Make read_timeout optional (only applied when specified)
    - Add comprehensive unit tests for timeout configurations
    - Maintain backward compatibility with existing configurations
    - Follow AWS SDK timeout hierarchy best practices
    
    Both timeout parameters are now optional and only configured when explicitly
    set, allowing users to fine-tune timeout behavior for their Lambda functions.
    
    Signed-off-by: Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt;
    
    * Add license header to ClientOptionsTest.java
    
    - Add required OpenSearch Contributors license header
    - Fixes license header violation in new test file
    
    Signed-off-by: Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt;
    
    * Remove unused Duration import from ClientOptionsTest
    
    Signed-off-by: Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt; Co-authored-by:
    Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt;

* __Adds additional thread synchronization in the AggregateProcessor to prevent duplicate or orphaned aggregate groups. (#6439)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 28 Jan 2026 11:46:03 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Minor Spotless fix (#6440)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 28 Jan 2026 11:04:59 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __maint: remove myself from maintainers (#6434)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 28 Jan 2026 11:00:39 -0800
    
    
    maint: remove myself from maintainers maint: add Qi Chen into Emeritus
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add parameter to acknowledge group events on conclude immediately, and a parameter to disable group acknowledgments in aggregate processor (#6430)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 27 Jan 2026 11:48:55 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __feat: Add configurable lease interval for crawler source (#6432)__

    [chrisale000](mailto:alchrisk@amazon.com) - Mon, 26 Jan 2026 18:14:09 -0600
    
    
    This change adds support for configurable lease interval in the crawler source
    plugin, allowing users to customize the leader scheduler&#39;s lease interval
    instead of using a hardcoded value.
    
    Changes:
    - Added getLeaseInterval() method to CrawlerSourceConfig interface with
     default value of 1 minute
    - Modified CrawlerSourcePlugin to use the configurable lease interval
     from the source configuration
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __refactor(metrics): migrate buffer/retry metrics to unified VendorAPIMetricsRecorder (#6428)__

    [chrisale000](mailto:alchrisk@amazon.com) - Mon, 26 Jan 2026 17:56:41 -0600
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Synchronization fix for aggregate processor and aggregate event handles when attaching events to the aggregate group. (#6431)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 26 Jan 2026 16:48:45 -0600
    
    
    There is a possible synchronization issue in the aggregate processor. It
    currently calls attachToEventAcknowledgementSet on the aggregate group outside
    of any locks. It is possible that one thread gets this group. Then thread two
    gets the closes the group. If thread 1 then attaches the event to that group,
    thread 2 may still reset it. The solution is to move
    attachToEventAcknowledgementSet into the locks.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Data Prepper developer documentation for debugging and using Maven artifacts. (#6427)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 26 Jan 2026 14:10:07 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __feat: Add intelligent subscription management and gated metrics for M365 (#6401)__

    [chrisale000](mailto:alchrisk@amazon.com) - Fri, 23 Jan 2026 15:54:14 -0600
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Add thread-safe synchronization to startUpdatingOwnershipForShard (#6426)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Fri, 23 Jan 2026 15:52:38 -0600
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Fixes a false reporting bug for the invalidEventHandles counter (#6420)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 22 Jan 2026 15:29:07 -0800
    
    
    Fixes a bug with the invalidEventHandles counter in the PipelineRunner. This
    metric was being counted for any event that is not a default event (ie. for
    aggregate events). This would happen even if there is no need to discard the
    event. This change should count this when aggregate events should be released
    but are not. We probably need some deeper investigation into how we can
    properly release aggregate events. But, for now this metric will be more
    accurate.
    
    Also improves some code to reduce unnecessary variables, use final modifiers,
    and better legibility.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __remove json creator annotation from no-arg constructor in SinkForwardConfig (#6419)__

    [Kennedy Onyia](mailto:145404406+kennedy-onyia@users.noreply.github.com) - Thu, 22 Jan 2026 15:58:16 -0600
    
    
    Signed-off-by: Kennedy Onyia &lt;kennedy.onyia@gmail.com&gt;

* __Adding functionality to read from specific timestamps for KDS source (#6415)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Tue, 20 Jan 2026 12:14:35 -0800
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Add metadata for document version to OpenSearch source (#6416)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 20 Jan 2026 11:32:15 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Some clean up on the PrometheusSink class. There were several unused code paths. (#6412)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 16 Jan 2026 07:54:15 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support building and releasing Docker multi-architecture images (#6411)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 16 Jan 2026 05:53:44 -0800
    
    
    Support building Docker multi-architecture images and releasing these in the
    GitHub Actions release project. Continues to build the local architecture with
    the existing docker release task. Resolves #6405, #6410.
    
    Also stops using the Palatir Docker plugin and uses Docker buildx directly.
    Resolves #5313.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add kafka buffer backward compatibility test (#6406)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 15 Jan 2026 16:57:12 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Handling mysql decimal data types with precision 19 or higher (#6369)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Thu, 15 Jan 2026 14:20:23 -0800
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Add read timeout configuration for AWS Lambda plugin (#6408)__

    [ashrao94](mailto:55301835+ashrao94@users.noreply.github.com) - Thu, 15 Jan 2026 12:03:37 -0800
    
    
    - Add read_timeout field to ClientOptions with default 60s
    - Configure NettyNioAsyncHttpClient with read timeout
    - Update README with client configuration examples
    - Enables configurable read timeout for Lambda function calls
    
    Signed-off-by: Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt; Co-authored-by:
    Aiswarya Sadananda Rao &lt;aiswarao@amazon.com&gt;

* __Implement handling strategy for retryable vs non-retryable exceptons in workerPartition (#6270)__

    [Vecheka](mailto:cvecheka07@gmail.com) - Thu, 15 Jan 2026 10:35:50 -0800
    
    
    Signed-off-by: Vecheka Chhourn &lt;vecheka@amazon.com&gt;

* __create s3 common module (#6404)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Wed, 14 Jan 2026 08:27:28 -0800
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Rename out_of_order_window to out_of_order_time_window (#6398)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 13 Jan 2026 14:41:32 -0800
    
    
    * Rename out_of_order_window to out_of_order_time_window
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix PrometheusSinkServiceTest
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Support building ARM archive files locally using the Gradle build. Resolves #2571. (#6403)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 13 Jan 2026 14:10:49 -0800
    
    
    This adds new scripts for running on ARM and includes the ARM architecture in
    the Gradle release build for linux. Additionally, it updates the smoke tests
    script to be able to run against different architectures in order to test the
    changes. Updates the README.md files as well.
    
    Also updates the license headers for files in the related projects.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Disabling a DDB source coordination integration test (#6328)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 13 Jan 2026 10:55:44 -0800
    
    
    One of our new DDB source coordination integration tests is failing on GitHub.
    This change attempts to fix that by 1) including a sleep between writing events
    to ensure that they have different timestamps; and 2) waiting for the GSI to
    reach eventual consistency. In the end I disabled it.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __add partition timing metrics to LeaderOnlyTokenCrawler (#6299)__

    [Nathan Wand](mailto:wandna@amazon.com) - Fri, 9 Jan 2026 13:34:02 -0800
    
    
    add partition timing metrics to LeaderOnlyTokenCrawler 

* __Update sample app urlib3 from 2.6.0 to 2.6.3 to fix CVE-2026-21441 (#6399)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 8 Jan 2026 15:22:56 -0800
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Optimized RestClient Tests using customized Retry Handler (#6359)__

    [eatulban](mailto:eatulban@amazon.com) - Thu, 8 Jan 2026 11:19:08 -0800
    
    
    Signed-off-by: eatulban &lt;eatulban@amazon.com&gt;

* __Onboarding new maven snapshots publishing to s3 (data-prepper) (#6246)__

    [Peter Zhu](mailto:zhujiaxi@amazon.com) - Thu, 8 Jan 2026 06:55:43 -0800
    
    
    Signed-off-by: Peter Zhu &lt;zhujiaxi@amazon.com&gt;

* __Expand necessary OpenSearch permissions for data prepper (#6024)__

    [Stehlík Lukáš](mailto:28645591+stelucz@users.noreply.github.com) - Wed, 7 Jan 2026 15:22:50 -0800
    
    
    Signed-off-by: Lukas Stehlik &lt;stehlik.lukas@gmail.com&gt;

* __Update simple_pipelines.md (#6274)__

    [Sabarinathan Subramanian](mailto:22836306+sabarinathan590@users.noreply.github.com) - Wed, 7 Jan 2026 14:53:20 -0800
    
    
    reponse message updated
    
    Signed-off-by: Sabarinathan Subramanian
    &lt;22836306+sabarinathan590@users.noreply.github.com&gt;

* __Added logging for No indices matched (#6342)__

    [Utkarsh Agarwal](mailto:126544832+Utkarsh-Aga@users.noreply.github.com) - Wed, 7 Jan 2026 14:50:26 -0800
    
    
    Signed-off-by: Utkarsh Agarwal &lt;126544832+Utkarsh-Aga@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy-agent in /data-prepper-plugins/opensearch (#6378)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 7 Jan 2026 14:48:41 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy-agent](https://github.com/raphw/byte-buddy)
    from 1.17.8 to 1.18.3.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.17.8...byte-buddy-1.18.3)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy-agent
     dependency-version: 1.18.3
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#6377)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 7 Jan 2026 14:48:32 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.17.8 to 1.18.3.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.17.8...byte-buddy-1.18.3)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-version: 1.18.3
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.commons:commons-text (#6382)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 7 Jan 2026 14:47:34 -0800
    
    
    Bumps [org.apache.commons:commons-text](https://github.com/apache/commons-text)
    from 1.14.0 to 1.15.0.
    -
    [Changelog](https://github.com/apache/commons-text/blob/master/RELEASE-NOTES.txt)
    -
    [Commits](https://github.com/apache/commons-text/compare/rel/commons-text-1.14.0...rel/commons-text-1.15.0)
    
    --- updated-dependencies:
    - dependency-name: org.apache.commons:commons-text
     dependency-version: 1.15.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Fix multiple javadoc warnings to reduce build log clutter (#6364)__

    [chrisale000](mailto:alchrisk@amazon.com) - Wed, 7 Jan 2026 14:42:35 -0800
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Adding Subscription Metrics to Metric Recorder and Onboarding M365 to Auth Metrics from Metrics Recorder (#6363)__

    [chrisale000](mailto:alchrisk@amazon.com) - Wed, 7 Jan 2026 14:42:20 -0800
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Adding Partition Execution Logging for DimensionalTimeSliceCrawler (#6362)__

    [chrisale000](mailto:alchrisk@amazon.com) - Wed, 7 Jan 2026 14:41:54 -0800
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Prefer org.lgz4 artifact over at.yawk.lz4 (#6395)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 7 Jan 2026 12:33:31 -0800
    
    
    Undo a version change caused by dependabot
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __Bump org.lz4:lz4-java in /data-prepper-plugins/mapdb-processor-state (#6312)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 7 Jan 2026 08:15:18 -0800
    
    
    Bumps org.lz4:lz4-java from 1.8.0 to 1.8.1.
    
    --- updated-dependencies:
    - dependency-name: org.lz4:lz4-java
     dependency-version: 1.8.1
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#6376)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 7 Jan 2026 08:12:58 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.25.1 to 2.25.3.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.25.1...rel/2.25.3)
    
    --- updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-version: 2.25.3
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#6379)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 7 Jan 2026 08:12:49 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.25.1 to 2.25.3.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.25.1...rel/2.25.3)
    
    --- updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-version: 2.25.3
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Fixes the license headers in all files in data-prepper-api. (#6393)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 6 Jan 2026 14:03:24 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __GitHub Action to verify that newly added files have the license header. (#6392)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 6 Jan 2026 14:03:13 -0800
    
    
    This includes Python scripts for validation as well as a GitHub Action that
    runs them and comments on PRs if license headers are missing.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updating the copyright headers on a batch of plugins. (#6390)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 6 Jan 2026 14:03:01 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Prometheus Sink: Fix setting DLQ pipeline, add NOISY marker for logs (#6388)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 5 Jan 2026 10:27:33 -0800
    
    
    

* __Support otel metrics source with partition keys when persistent buffer is used (#6373)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 2 Jan 2026 16:56:08 -0800
    
    
    * Support otel metrics source with partition keys when persistent buffer is
    used
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Optimized  splitExportMetricsServiceRequestByKeys
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add support for passing sts headers in kafka source (#6375)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Fri, 2 Jan 2026 13:02:47 -0800
    
    
    * Add support for passing sts headers in kafka source
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Add test to cover valid header use case
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Minor code change for passing override config
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Add validation for tests
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Increase the test coverage.
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt; Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Add metric tracking time between poll calls for kafka consumer (#6372)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 31 Dec 2025 13:51:26 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Address comments from PR6370 (#6371)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 30 Dec 2025 14:00:09 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Fix Data Prepper router to send records through routing strategy before sending to the sinks (#6370)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 30 Dec 2025 00:04:23 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Rebased to latest to resolve conflicts (#6365)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 22 Dec 2025 17:03:41 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Metric Centralization through Dependency Injection (#6354)__

    [chrisale000](mailto:alexchristensen11131997@gmail.com) - Thu, 18 Dec 2025 14:55:11 -0800
    
    
    This change centralizes metrics creation and management by implementing 
    dependency injection for metrics in the Office365 source plugin and other
    remaining components. This ensures consistent metrics handling across the
    codebase.
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt; Co-authored-by:
    Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __Make CWL retry indefinitely for retryable errors when no DLQ configured (#6355)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 17 Dec 2025 15:14:21 -0800
    
    
    * Make CWL retry indefinitely for retryable errors when no DLQ configured
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Fixed PrometheusSinkBufferWriter getBuffer() to return non-duplicate and sorted time series (#6358)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 17 Dec 2025 14:31:54 -0800
    
    
    * Fixed PrometheusSinkBufferWriter getBuffer() to return non-duplicate and
    sorted timeseries
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed CheckStyle error
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add forward_to support to opensearch sink (#6349)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 16 Dec 2025 14:42:17 -0800
    
    
    * Add forward_to support to opensearch sink
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added integration test
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Remove usage of buffer accumulator from Kafka custom consumer (#6357)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 16 Dec 2025 06:49:29 -0800
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Refactor Retry Handler To Move Into Source Crawler Package (#6275)__

    [eatulban](mailto:eatulban@amazon.com) - Mon, 15 Dec 2025 17:13:36 -0600
    
    
    Signed-off-by: eatulban &lt;eatulban@amazon.com&gt;

* __Remove experimental lable for M365 (#6351)__

    [Vecheka](mailto:vecheka@amazon.com) - Mon, 15 Dec 2025 13:17:46 -0600
    
    
    Signed-off-by: Vecheka Chhourn &lt;vecheka@amazon.com&gt;

* __Do not clear offsets after failure to commit offsets due to rebalance exception (#6346)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 15 Dec 2025 08:44:05 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds Kiro and Visual Studio Code directories to the .gitignore file. Some reorganization of this file. (#6353)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 12 Dec 2025 12:14:39 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update dependency urllib3 to v2.6.0 (#6345)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Thu, 11 Dec 2025 16:59:59 -0800
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __Fixes the trace-analytics-sample-app project and updates it. (#6350)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Dec 2025 10:00:19 -0800
    
    
    Use Gradle 9.2.1, the current latest. Update to Spring Boot 4.0.0. Updated to
    Java 21. Use a more fixed Docker image when building to avoid future build
    failures - always Gradle 9 and JDK 21.
    
    Also, updates or adds copyright headers.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Confluence and CloudWatch and multiple other failing tests fix (#6348)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 10 Dec 2025 11:16:33 -0800
    
    
    Making the tests less flaky. More reliable. Avoiding possible Out of memory
    issue with large pay load generation.

* __Enable cross-region writes in the S3 sink. (#6323)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 10 Dec 2025 11:11:44 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Use Eclipse Temurin by default in the tarball smoke test. Updates to the documentation for running smoke tests to reference Eclipse Temurin. (#6296)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 10 Dec 2025 08:24:12 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Centralize Metrics, Create MetricHelper Unit Tests, and Add M365 Logging (#6338)__

    [chrisale000](mailto:alexchristensen11131997@gmail.com) - Tue, 9 Dec 2025 14:30:04 -0600
    
    
    Signed-off-by: Alexander Christensen &lt;alchrisk@amazon.com&gt; Co-authored-by:
    Alexander Christensen &lt;alchrisk@amazon.com&gt;

* __set retry time interval configurable, increase the http client read timeout (#6320)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Thu, 4 Dec 2025 15:25:45 -0600
    
    
    * set retry time interval configurable and increase the http client read
    timeout
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    * address comments
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Bump org.wiremock:wiremock in /data-prepper-plugins/opensearch (#6308)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 4 Dec 2025 06:49:10 -0800
    
    
    Bumps [org.wiremock:wiremock](https://github.com/wiremock/wiremock) from 3.10.0
    to 3.13.2.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.10.0...3.13.2)
    
    --- updated-dependencies:
    - dependency-name: org.wiremock:wiremock
     dependency-version: 3.13.2
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump commons-validator:commons-validator in /data-prepper-core (#6310)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 4 Dec 2025 06:46:07 -0800
    
    
    Bumps
    [commons-validator:commons-validator](https://github.com/apache/commons-validator)
    from 1.10.0 to 1.10.1.
    -
    [Changelog](https://github.com/apache/commons-validator/blob/master/RELEASE-NOTES.txt)
    -
    [Commits](https://github.com/apache/commons-validator/compare/rel/commons-validator-1.10.0...rel/commons-validator-1.10.1)
    
    --- updated-dependencies:
    - dependency-name: commons-validator:commons-validator
     dependency-version: 1.10.1
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#6315)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 4 Dec 2025 06:44:35 -0800
    
    
    Bumps software.amazon.awssdk:auth from 2.32.13 to 2.39.5.
    
    --- updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-version: 2.39.5
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __PrometheusTimeSeries performance fixes (#6316)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 3 Dec 2025 22:18:59 -0800
    
    
    * PrometheusTimeSeries performance fixes
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkStyle error
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Increase acknowledgment set timeout for opensearch source (#6291)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 3 Dec 2025 14:07:59 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Filesource compression support (#5255)__

    [Joël Marty](mailto:134835+joelmarty@users.noreply.github.com) - Wed, 3 Dec 2025 06:37:11 -0800
    
    
    Add support for compressed files in FileSource
    
    Signed-off-by: Joël Marty &lt;jmarty@twilio.com&gt; Signed-off-by: Joël Marty
    &lt;134835+joelmarty@users.noreply.github.com&gt;

* __Increase SAAS WorkerScheduler WorkerPartition AcknowledgementSet timeout to 2 hours (#6298)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Wed, 26 Nov 2025 11:05:06 -0800
    
    
    *What?**
    
    This commit incerases SAAS worker partition AcknowledgementSet timeout from 20
    seconds to 2 hours.
    
    **Why?**
    
    20 seconds is not enough for finish processing each worker partition. Increase
    it to infinite high to ensure each worker partition has enough time for
    processing.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __Run the release build against Eclipse Temurin instead of the old OpenJDK Docker images. (#6293)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 24 Nov 2025 15:37:19 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump js-yaml in /testing/aws-testing-cdk (#6280)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 21 Nov 2025 07:57:18 -0800
    
    
    Bumps  and [js-yaml](https://github.com/nodeca/js-yaml). These dependencies
    needed to be updated together.
    
    Updates `js-yaml` from 4.1.0 to 4.1.1
    - [Changelog](https://github.com/nodeca/js-yaml/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/nodeca/js-yaml/compare/4.1.0...4.1.1)
    
    Updates `js-yaml` from 3.14.1 to 3.14.2
    - [Changelog](https://github.com/nodeca/js-yaml/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/nodeca/js-yaml/compare/4.1.0...4.1.1)
    
    --- updated-dependencies:
    - dependency-name: js-yaml
     dependency-version: 4.1.1
     dependency-type: indirect
    - dependency-name: js-yaml
     dependency-version: 3.14.2
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Various improvements to the 2.13 release notes. (#6289)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 20 Nov 2025 10:18:13 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __DataPrepper 2.13.0 Changelog (#6287)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 20 Nov 2025 08:44:57 -0800
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Release notes for version 2.13.0 (#6286)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 20 Nov 2025 08:44:01 -0800
    
    
    Release notes for version 2.13.0
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Bump net.bytebuddy:byte-buddy-agent in /data-prepper-plugins/opensearch (#6217)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 19 Nov 2025 13:58:05 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy-agent](https://github.com/raphw/byte-buddy)
    from 1.17.6 to 1.17.8.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.17.6...byte-buddy-1.17.8)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy-agent
     dependency-version: 1.17.8
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#6219)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 19 Nov 2025 13:57:33 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.17.6 to 1.17.8.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.17.6...byte-buddy-1.17.8)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-version: 1.17.8
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __main branch to Data Prepper 2.14 (#6283)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 19 Nov 2025 13:19:57 -0800
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add sanitization to metric names and labels (#6277)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 19 Nov 2025 11:15:49 -0800
    
    
    * Add sanitization to metric names and labels
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review  comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build issues
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed unnecessary debug statement
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Introduce support for Opensearch data streams (#6249)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Mon, 17 Nov 2025 18:01:34 -0800
    
    
    Add OpenSearch Data Stream support with automatic action selection
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    

* __Do not wait for export to exit ShardConsumer for shards that have no records to write to buffer (#6265)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 14 Nov 2025 10:51:34 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add lookback time adjustment for Office 365 source plugin partition execution (#6266)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Thu, 13 Nov 2025 16:47:20 -0600
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt; Co-authored-by: Alekhya
    Parisha &lt;aparisha@amazon.com&gt;

* __Standardize Exception handling in souce plugins (#6255)__

    [Vecheka](mailto:vecheka@amazon.com) - Thu, 13 Nov 2025 13:06:39 -0800
    
    
    Signed-off-by: Vecheka Chhourn &lt;vecheka@amazon.com&gt;

* __Remove unnecessary dependencies in Prometheus sink build (#6267)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 13 Nov 2025 13:04:10 -0800
    
    
    * Remove unnecessary dependencies
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed version for snappy
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Fix SQS exception counter mock setup in tests (#6256)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Thu, 13 Nov 2025 07:51:36 -0800
    
    
    - Add lenient mocks for SQS counter metrics initialized in SqsWorker
    constructor
    - Fix test methods to use processSqsMessages() instead of run() to avoid
    infinite loops
    - Ensure all SQS exception tests properly verify counter increments
    - All 333 tests now pass
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Add Prometheus Sink (#6229)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 12 Nov 2025 20:38:40 -0800
    
    
    * Add Prometheus Sink
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Remove debug statements
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Make Prometheus sink Experimental
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add sanitize_names config option to sanitize metric/label names
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Cleaned up HTTP sender and Sigv4Signer
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added check for https in valid config
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Delay 5 minutes in DimensionalTimeSliceCrawler for partition creation on live event (#6104)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Wed, 12 Nov 2025 20:31:34 -0600
    
    
    This commit add 5 minutes delay to partition creation on live event in 
    DimensionalTimeSliceCrawler.
    
    In general, newly generated events become queryable after 30 ~ 120 second. 
    Delay 5 minutes give enough time for the newly generated events to become
    queryable to largely reduce the possibility of losing events due to eventual
    consistency in vender API side.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __Add metric tracking total number of open shards, do not skip shards just because there is no record at the ending sequence number of that shard (#6260)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 12 Nov 2025 19:16:57 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add configurable range parameter to Office 365 source plugin (#6261)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Wed, 12 Nov 2025 14:48:57 -0600
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;
    
    Co-authored-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;

* __Add read failure metric to S3 source (#6258)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Wed, 12 Nov 2025 14:44:01 -0600
    
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Add EMF config that enables adding extra properties to the EMF record (#6259)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Wed, 12 Nov 2025 11:57:55 -0800
    
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Handle DynamoDB source leader exceptions correctly by attempting to reacquire partition (#6195)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 11 Nov 2025 23:00:34 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Get shard iterator at sequence number for last shard iterators on ending sequence numbers (#6251)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 11 Nov 2025 12:55:50 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add metrics in SecretsRefreshJob for SecretsManager exceptions (#6252)__

    [bninishi](mailto:bninishi@amazon.com) - Tue, 11 Nov 2025 06:39:32 -0800
    
    
    * Add metrics for SecretsManager ResourceNotFound and LimitExceeded exception
    

* __Add Retryable/Non-Retryable Exception + API Calls Metrics for O365 (#6238)__

    [Brett Zeligson](mailto:85852739+zeligsonbrett@users.noreply.github.com) - Mon, 10 Nov 2025 17:35:54 -0800
    
    
    Add Retryable/Non-Retryable Exception + API Calls Metrics for O365
    
    Signed-off-by: Brett Zeligson &lt;brettzel@amazon.com&gt; Signed-off-by: Vecheka
    &lt;vecheka@amazon.com&gt; Signed-off-by: Brett Zeligson
    &lt;85852739+zeligsonbrett@users.noreply.github.com&gt; Co-authored-by: Brett
    Zeligson &lt;brettzel@amazon.com&gt; Co-authored-by: Vecheka &lt;vecheka@amazon.com&gt;

* __Added API metrics to SQS common worker (#6248)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Mon, 10 Nov 2025 16:41:06 -0800
    
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Address typo and improve publishErrorTypeMetricCounter function (#6253)__

    [Vecheka](mailto:vecheka@amazon.com) - Fri, 7 Nov 2025 18:36:33 -0600
    
    
    Signed-off-by: Vecheka Chhourn &lt;vecheka@amazon.com&gt;

* __Added throttle metric to S3 input stream (#6245)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Fri, 7 Nov 2025 06:13:52 -0800
    
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Add worker retry mechanism for failed batch processing in LeaderOnlyTokenCrawler (#6244)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Thu, 6 Nov 2025 17:13:08 -0600
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt; Co-authored-by: Alekhya
    Parisha &lt;aparisha@amazon.com&gt;

* __fix validation bug in delete entries config (#6243)__

    [Kennedy Onyia](mailto:145404406+kennedy-onyia@users.noreply.github.com) - Thu, 6 Nov 2025 10:19:55 -0600
    
    
    Signed-off-by: Kennedy Onyia &lt;kennedy.onyia@gmail.com&gt;

* __Adjust CWL Sink Threshold to allow minimal 10 second flush interval (#6242)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Wed, 5 Nov 2025 16:01:05 -0600
    
    
    **What?**
    
    This commit updates CWL sink minimal allowed flush interval from 60s to 10s.
    
    **Why?**
    
    CWL is a high TPS dataplane service with small batch of events. It is 
    reasonable to allow shorter flush interval to improve the ingestion latency
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __allow custom name pattern prefix for S3 sink (#6193)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Wed, 5 Nov 2025 12:49:33 -0600
    
    
    * allow custom name pattern for S3 sink
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    * update to allow name pattern prefix
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Increase m365 worker thread count from 2 to 4 (#6197)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Tue, 4 Nov 2025 18:26:49 -0600
    
    
    This commit increases the m365 connector worker thread count from 2 to 4. This
    is because the worker thread is per host and we need to ensure there are not
    too many threads in total to avoid api throttling.
    
    We had alignment between different teams that 3pE connector will be fixed at 2
    OCU. The performance test confirms a total of 8 threads cross all fleet.
    Changing to 4 would fit 2 OCU.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __Increase test coverage and bug fix in JacksonEvent (#6181)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 3 Nov 2025 16:12:09 -0800
    
    
    Increase test coverage in JacksonEvent and fix a bug with trying to modify
    input maps which may be immutable.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Use the STS region for the default AWS configuration when it is provided. Resolves #6068. (#6234)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 3 Nov 2025 16:08:51 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Integration tests for the DynamoDbSourceCoordinationStore (#6190)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 3 Nov 2025 15:20:18 -0800
    
    
    Adds integration tests for the DynamoDbSourceCoordinationStore that use an
    embedded DynamoDB database to test.
    
    To support better testing and cleaner code, this also updates the plugin to use
    the Spring DI capabilities that Data Prepper now offers to plugin authors.
    
    Exclude the plugin-test-framework project from the DynamoDB source coordination
    store project because it creates an ANTLR conflict with DynamoDBLocal.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Move MetricsHelper to common utils class (#6235)__

    [Vecheka](mailto:cvecheka07@gmail.com) - Mon, 3 Nov 2025 14:19:48 -0800
    
    
    Signed-off-by: Vecheka Chhourn &lt;vecheka@amazon.com&gt;

* __Fix unsatisfied dependency issue in leaderOnlyTokenCrawler (#6230)__

    [Brendan B.](mailto:32278900+bbenner7635@users.noreply.github.com) - Mon, 3 Nov 2025 11:37:20 -0800
    
    
    Signed-off-by: Brendan Benner &lt;bbenner@amazon.com&gt; Co-authored-by: Brendan
    Benner &lt;bbenner@amazon.com&gt;

* __M365 error type metric names (#6214)__

    [Vecheka](mailto:cvecheka07@gmail.com) - Fri, 31 Oct 2025 15:27:52 -0700
    
    
    * Adding specific metric names on exception/error for m365 plugins
    

* __Implement LeaderOnlyTokenCrawler (#6160)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Fri, 31 Oct 2025 11:47:21 -0500
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt; Co-authored-by: Alekhya
    Parisha &lt;aparisha@amazon.com&gt;

* __Fixing the crawler framework to handle ddb outage scenario (#6207)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 30 Oct 2025 12:38:08 -0700
    
    
    * Fixing the crawler framework to handle ddb outage scenario
    

* __Migrate Bitnami Zookeeper and Kafka Docker Images (#6210)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Thu, 30 Oct 2025 15:10:16 +0100
    
    
    Broadcom discontinued support of non-secured Docker images used in the
    integration tests. They were moved to the bitnamilegacy repository. This PR
    changes the images accordingly.
    
    Eventually the images should be replaced by supported images as there is no
    further updates on the images. The images were not changed to avoid conflicts
    that might arise using other images.
    
    Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;

* __Introduce otlp/http support in OTelTraceSource (#5322)__

    [Tomas](mailto:tlongo@sternad.de) - Thu, 30 Oct 2025 06:14:12 +0100
    
    
    * Update OpenTelemetryProto to 1.3.2-alpha and refactor scope usage
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Process ExportTraceServiceRequest in http service
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Move gRPC request tests to own class
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Cleanup
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Separate concerns when it comes to configuring the server/services
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Use retry calculator to provide backoff info
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Add metrics to http exception handler
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Revert accidental changes
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Infer protocol from config. Isolate tests regarding unframed requests
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Add basic auth to http service
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Move configuration of http service into own class
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Add pr description
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Remove pr description
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Fix checkstyle findings
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * [WIP] Fix issue with http service being enabled, while grpc service accepts
    unframed requests
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Refactor EndToEndRawSpanTest
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Create ArmeriaAuthenticationProvider via PluginFactory
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Rename GrpcRetryInfoCalculator
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Create test for invalid payload
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Add test for healthcheck
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Add test for http exception handler
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Remove tests
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Fix missing imports
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Remove unused imports
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Fix imports
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Remove/edit todos
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Remove accidentally added default password
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Declare assertJ as test lib and reference it from e2e test
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Fix merge error
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    * Use insecure ssl connection in test
    
    Signed-off-by: Tomas Longo &lt;tlongo@sternad.de&gt;
    
    ---------
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt; Signed-off-by: Tomas Longo
    &lt;tlongo@sternad.de&gt; Co-authored-by: Tomas Longo &lt;tomas.longo@sap.com&gt;

* __M365 Crawler Metric, Buffer, and Unit Test Updates (#6142)__

    [chrisale000](mailto:alexchristensen11131997@gmail.com) - Wed, 29 Oct 2025 18:21:48 -0500
    
    
    Signed-off-by: Alex Christensen &lt;alchrisk@amazon.com&gt; Co-authored-by: Alex
    Christensen &lt;alchrisk@amazon.com&gt;

* __Add metrics for partitions created and completed to enhanced source coordination store (#6203)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 29 Oct 2025 14:43:41 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add common sink framework for DataPrepper sinks (#6183)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 28 Oct 2025 15:57:25 -0700
    
    
    * Add common sink framework for DataPrepper sinks
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed unnecessary file
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Increment Office365 request failure metrics on retry (#6204)__

    [Brendan B.](mailto:32278900+bbenner7635@users.noreply.github.com) - Tue, 28 Oct 2025 15:09:09 -0500
    
    
    Signed-off-by: Brendan Benner &lt;bbenner@amazon.com&gt; Co-authored-by: Brendan
    Benner &lt;bbenner@amazon.com&gt;

* __Fix consecutive hyphens in export id (#6194)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 23 Oct 2025 12:14:24 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fixes a subtle bug with DataPrepperVersion. A recent commit to parse the version from the Gradle project updated the public parse() method to support a full version string. However, this is not an allowable version to parse for the purposes of pipeline configurations. This change fixes that by bringing back the restriction on the public parse() method to support only major or major.minor patterns. Only when reading from the version string from the VersionProvider, do we now allow reading the full version string. (#6199)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 23 Oct 2025 09:35:49 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Some refactoring to how we determine the Data Prepper version to allow other builds to modify the Data Prepper version. Log the current Data Prepper version on start up. (#6196)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 23 Oct 2025 00:26:49 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add negative tests to sqs and cloudwatch logs sink (#6189)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 22 Oct 2025 16:18:19 -0700
    
    
    * Add negative tests to sqs and cloudwatch logs sink
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix checkstyle error
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Fix how failures are handled for shard partitions in DDB source (#6184)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 22 Oct 2025 14:26:07 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fixes the AWS Secrets end-to-end test by setting permissions for the .aws directory. (#6192)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 21 Oct 2025 11:53:45 -0700
    
    
    Removes getting the STS caller. Updates the configure-aws-credentials GHA
    action to v5. Use a String for the binds map rather than a GString.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Automatically generate the Data Prepper version from the gradle.properties version. (#6182)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 20 Oct 2025 12:31:57 -0700
    
    
    Updates the approach for getting the current version of Data Prepper to
    generate a dynamic class in data-prepper-core with the current version of the
    build. Use Java SPI to load this from DataPrepperVersion in data-prepper-api.
    With this change we no longer need to update a class file on each version
    update.
    
    Additionally, because this method is static and used in many other classes,
    there is now a test library to facilitate getting a version. This one is
    hard-coded for version 2.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Create a data_prepper_test user in the end-to-end tests for Java. This way the .aws volume mapping will be able to load for both the release Docker image and the end-to-end test custom image. (#6188)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 20 Oct 2025 06:46:39 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __CloudWatchLogs Sink: Update max event size and drop error events if DLQ is not configured (#6154)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 17 Oct 2025 16:13:11 -0700
    
    
    * CloudWatchLogs Sink: Update max event size and drop error events if DLQ is
    not configured
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added distribution summary metrics for log size and request size
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Provide AWS credentials in the /.aws directory instead of the /root/.aws directory for the end-to-end tests. (#6177)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 17 Oct 2025 10:29:41 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Integration test the OpenSearch sink against 2.12.0 and 2.19.3. (#6173)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 17 Oct 2025 10:29:32 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __add jsonl as a supported extension for S3 sink (#6159)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Thu, 16 Oct 2025 14:10:34 -0500
    
    
    * add jsonl as a supported extension for S3 sink
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    * make ExtensionOption an enum
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    * address more comments
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Data Prepper 2.12.2 release notes. (#6178)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 16 Oct 2025 09:59:22 -0700
    
    
    Data Prepper 2.12.2 release notes.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Data Prepper 2.12.2 change log (#6179)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Oct 2025 12:08:50 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Minor update to the release notes for 2.11.0 for a breaking change. (#6176)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Oct 2025 10:49:18 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the JDK version to 17.0.16 from 17.0.10. This is the latest Temurin binary for JDK 17. (#6170)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Oct 2025 14:09:29 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Require full TLS trust in OpenSearch plugins by default unless insecure is configured (#6165)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Oct 2025 13:39:29 -0700
    
    
    Require full TLS trust in OpenSearch plugins by default unless insecure is
    configured. Update the integration tests and end-to-end tests to set the
    insecure flag.
    
    Co-authored-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt; Signed-off-by: Jeremy Michael
    &lt;jsusanto@amazon.com&gt;

* __Use standard TLS when downloading the database from an HTTP URL. (#6163)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Oct 2025 12:56:19 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Change &#34;SSL&#34; to &#34;TLS&#34; (#6164)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Oct 2025 12:06:10 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support ByteCount min/max constraints. Constrain on max_message_size in SQS sink. (#6158)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 13 Oct 2025 13:42:53 -0700
    
    
    Jakarta constraints for ByteCount: ByteCountMin and ByteCountMax.
    
    Restrict the max_message_size in the SQS sink to 1 byte to 1 MB. Validate the
    threshold section of the configuration.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Test framework support for loading plugin instances (#6138)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 13 Oct 2025 11:46:30 -0700
    
    
    Support for loading plugin instances in the plugin framework.
    
    Also, added integration tests for drop_events and parse_json processors.
    
    Updates the GrokProcessorIT to use the new plugin framework support for loading
    plugin instances. Not all features are supported, so some tests are still using
    the classic approach.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix delete_entries incorrect validation (#6161)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 13 Oct 2025 10:46:11 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Makes ByteCount Comparable to make it easier to write validations. (#6156)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 10 Oct 2025 14:10:25 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add regex-based key selection for delete_entries processor (#6146)__

    [Kennedy Onyia](mailto:145404406+kennedy-onyia@users.noreply.github.com) - Fri, 10 Oct 2025 10:14:06 -0700
    
    
    Add regex-based key selection for delete_entries processor
    
    Signed-off-by: Kennedy Onyia &lt;kennedy.onyia@gmail.com&gt;

* __Add support for including keys based on regex patterns for select entries processor (#6094)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 9 Oct 2025 13:48:37 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix aggregate processor actions concludeGroup (#6147)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 9 Oct 2025 11:42:05 -0700
    
    
    * Fix aggregate processor actions concludeGroup
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added integration test
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add support for pipeline DLQ to opensearch sink (#6137)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 9 Oct 2025 09:04:27 -0700
    
    
    * Add support for pipeline DLQ to opensearch sink
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added _failure_metadata field to event before sending pipeline DLQ
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix failing tests
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix failing tests
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified to reuse event
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix checkstyle errors
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Added data_selection support to S3 SQS source (#6148)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Wed, 8 Oct 2025 12:15:07 -0700
    
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Update the aggregate processor to log errors at the error level. (#6145)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 8 Oct 2025 07:28:56 -0700
    
    
    Update the aggregate processor to log errors at the error level.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Log the error message from SQS when failing to send a message to the SQS queue. (#6143)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 8 Oct 2025 07:28:38 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Automatically refresh secrets values in Office365 Source plugin (#6105)__

    [Brendan B.](mailto:32278900+bbenner7635@users.noreply.github.com) - Tue, 7 Oct 2025 07:33:01 -0700
    
    
    Refresh Office365 secrets from secrets plugin. Move secretValue assignemnet to
    refresh()
    
    Signed-off-by: Brendan Benner &lt;bbenner@amazon.com&gt;

* __Updates plugin framework test to use @DataPrepperPluginTest instead of extension (#6135)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 3 Oct 2025 06:52:34 -0700
    
    
    Updated the approach to the plugin framework test to use only the
    DataPrepperPluginTest annotation.
    
    Split the ParameterResolver classes into multiple to make it easier to continue
    to extend this. Deprecate the DataPrepperPluginTestFrameworkExtension. Adds an
    integration test that runs the test framework for a test plugin.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for forwarding successful records from sinks using SinkContext (#5994)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 2 Oct 2025 20:37:13 -0700
    
    
    * Add support for forwarding successful records from sinks using SinkContext
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified to addressed modified forward_to config
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build failures
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build failures
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixing code to address failing tests
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments and fixed acknowledgements issue
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Fixes the unit tests for enabling point-in-time on AOS Serverless which was added in #6050. (#6136)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 2 Oct 2025 09:29:46 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds a unit test to see the behavior of empty the ndjson output codec with empty Event objects. (#6099)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 1 Oct 2025 12:37:45 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds sts_header_overrides to the AWS plugin extension configuration. Resolves #6078. (#6080)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 1 Oct 2025 08:59:51 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add check for event handle releases in integration tests (#6089)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 25 Sep 2025 03:41:07 -0700
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __enable pit 4 serverless (#6050)__

    [Yui Numazawa](mailto:65603267+yuinumaz@users.noreply.github.com) - Wed, 24 Sep 2025 14:44:46 -0500
    
    
    Signed-off-by: Yui Numazawa &lt;yuinuma@amazon.com&gt;

* __Add metric for sqs receive message failures for s3-sqs source (#6102)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 24 Sep 2025 14:43:47 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Reduce m365 worker thread count from 7 to 2 (#6103)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Wed, 24 Sep 2025 11:29:55 -0700
    
    
    This commit reduces the m365 worker thread count from 7 to 2. This is because
    the worker thread is per host and we need to ensure there are not too many
    threads in total to avoid api throttling.
    
    The suggestion is to estimate based on 2 ~ 4 OCU. Original 7 is the estimated
    based on total threads. Changing to 2 would fit for 4 OCU.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __Null path prefix handling (#6101)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 24 Sep 2025 10:56:13 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Look up logical type for decimal values and use correct scale parquet codec (#5990)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 23 Sep 2025 16:16:00 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Translate processor performance improvements (#6093)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 23 Sep 2025 11:06:14 -0700
    
    
    As part of Performance improvement, Using EventKey in the place of String based
    keys in TranslateProcessor

* __Change m365 lookback days to 0 and number of worker threads to 7 (#6095)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Mon, 22 Sep 2025 14:41:28 -0700
    
    
    This commit makes two changes.
    
    1. Change m365 connector default lookback days to 0 per requested. There will
    be next change to make it configureable soon.
    
    2. Change number of worker threads based on performance test. During 
    performance test we observe the avg m365 api latency is 235ms. With 7 threads,
    assuming all threads are busy the TPM would be around 1800 request per minute.
    It would optimize the throughput while not breach 2000TPM API limit.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __(fixes #3434) Add Data Prepper function to format a date-time (#5982)__

    [Mikhail Stepura](mailto:mikhail.stepura@outlook.com) - Fri, 19 Sep 2025 16:03:41 -0700
    
    
    Add Data Prepper function to format a date-time. Fixes #3434
    
    Signed-off-by: Mikhail Stepura &lt;mstepura@apple.com&gt;

* __Emit DimensionalTimeSliceCrawler worker partition process latency metrics (#6091)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Fri, 19 Sep 2025 10:59:35 -0700
    
    
    **What?**
    
    This commit emits two additional metrics for DimensionalTimeSliceCrawler
    
    metric WorkerPartitionWaitTime measures the wait time before a worker partition 
    starts being processed after creation.
    
    metric WorkerPartitionProcessLatency measures the duration between pulling data 
    from source to writing to buffer in a worker partition.
    
    **Why?**
    
    These two metrics will provide visibility how long it takes to process a 
    partition after being created.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __fix: Update System.env syntax for Gradle 9 compatibility (#6004)__

    [Daniel Widdis](mailto:widdis@gmail.com) - Thu, 18 Sep 2025 07:44:00 -0700
    
    
    Signed-off-by: Daniel Widdis &lt;widdis@gmail.com&gt;

* __Move queryExecutor submission to the end of the initialization of opensearch sink (#5922)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 17 Sep 2025 16:01:40 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support cross-region reads from S3 using the S3 client&#39;s built-in support for cross-region access. Resolves #4470. Resolves #4811. (#6083)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 15 Sep 2025 15:02:15 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __allow retry sagemaker batch job creation for longer time window (#6082)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Mon, 15 Sep 2025 16:30:24 -0500
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Keeping the backward compatibility when empty array added  (#6084)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 15 Sep 2025 13:39:47 -0700
    
    
    * Keeping the backward compatibility when empty array added to a key using
    AddEntryProcessor.
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __Require the smoke tests to pass before attempting to promote now that they work well. Update the RELEASING.md documentation on this. (#5997)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 15 Sep 2025 12:30:09 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Resolves CVEs by updating Netty to 4.1.125 and commons-lang to 3.18.0. Fixes CVE-2025-58057, CVE-2025-58056, and CVE-2025-48924. (#6081)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 15 Sep 2025 12:29:52 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Using EventKey in Expression Parsing flow (#6064)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 15 Sep 2025 10:43:48 -0700
    
    
    Using `EventKey` in `ParseTreeCoercionService` and corresponding test
    configuration fixes. It also includes change the data-prepper-event module
    classes to be moved from `org.opensearch.dataprepper.core.expression` to
    `org.opensearch.dataprepper.expression`  and corresponding change in the Spring
    context initialization order.

* __Fix issue where event handles are not released for cloudwatch logs sink, add more tests (#6074)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 15 Sep 2025 07:47:26 -0700
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Added support for flatten key with add_entries with iterate_on (#6022)__

    [Abhijoy Mandal](mailto:56208545+Abhijoy-Mandal@users.noreply.github.com) - Fri, 12 Sep 2025 11:35:54 -0500
    
    
    Signed-off-by: Abhijoy Mandal &lt;abhijoym@amazon.com&gt;

* __Fix class cast exception for lambda processor (#6067)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Fri, 12 Sep 2025 08:11:04 -0700
    
    
    

* __Add read before saving global state item (#6075)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 11 Sep 2025 16:30:39 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fixed sorting of `includeKeys` and `excludeKeys` in `SinkModel` (#5889)__

    [Mikhail Stepura](mailto:mikhail.stepura@outlook.com) - Thu, 11 Sep 2025 12:12:29 -0700
    
    
    data-prepper-5695 [BUG] The sink&#39;s include_keys feature won&#39;t work unless
    inputs are alphabetical.
    
    Signed-off-by: Mikhail Stepura &lt;mstepura@apple.com&gt;

* __add uuid in the batch job name (#6071)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Thu, 11 Sep 2025 11:47:25 -0700
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Add change to s3 scan source to create partitions after each page of … (#6006)__

    [Siqi Ding](mailto:dingdd@amazon.com) - Wed, 10 Sep 2025 15:07:46 -0500
    
    
    * Add change to s3 scan source to create partitions after each page of objects
    listed
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    (cherry picked from commit bf74cb7677cd952a1db712797b56ed04d0e0ec2d)
    
    * Renew the unit test to handle the two scans and seperate buckets
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;
    
    * Add global state ownership renewal during partition creation
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;
    
    * Add ownership renewal during S3 partition creation
    
    Prevents timeout during long-running operations by renewing global state
    ownership every 3 minutes
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;
    
    * Remove the each time update in ScanObjectWorker; Add the
    lastGlobalOwnershipRenewal related renewGlobalOwnershipIfNeeded to ensures
    ownership is maintained both before starting and throughout the entire
    partition creation process
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;
    
    * Make renewGlobalStateOwnershipForPartitionCreation private
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt; Signed-off-by: Siqi Ding
    &lt;dingdd@amazon.com&gt; Co-authored-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Skip second completePartition when WorkerScheduler is processing partition (#6066)__

    [Brendan B.](mailto:32278900+bbenner7635@users.noreply.github.com) - Tue, 9 Sep 2025 09:05:24 -0700
    
    
    Signed-off-by: Brendan Benner &lt;bbenner@amazon.com&gt; Co-authored-by: Brendan
    Benner &lt;bbenner@amazon.com&gt;

* __Add metrics prefix to OTLP source (#6053)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 9 Sep 2025 07:38:31 -0700
    
    
    Add metrics prefix parameter to constructor to differentiate between OTLP
    source metrics
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Enhance DLQ handling for ML processor and retry logic for Bedrock throttled requests (#6060)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Fri, 5 Sep 2025 18:36:49 -0500
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    

* __Allow flush interval to be 0 for immediate flush (#6061)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 4 Sep 2025 22:08:01 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Using more stable version (#6059)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 4 Sep 2025 10:14:40 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Introducing additional flag to control the content formatting behavior in the final output (#6056)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 4 Sep 2025 09:53:19 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Updates to Gatling 3.13 in the performance-test project. This changes how to run simulations, so this includes an update to the README.md for that project. (#6055)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 3 Sep 2025 15:02:12 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Performance improvement by avoiding repeated parsing of the same expr… (#6021)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 3 Sep 2025 13:30:47 -0700
    
    
    * Performance improvement by avoiding repeated parsing of the same expression
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __AddEntry processor making use of EventKey (#6019)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 2 Sep 2025 09:25:23 -0700
    
    
    * repeated operations are now performed once and reused
    

* __Add caching support to AWS lambda processor (#6023)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 29 Aug 2025 15:42:46 -0700
    
    
    * Add caching support to AWS lambda processor
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __add multithread locker in the SageMaker batchjob creater (#5987)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Wed, 27 Aug 2025 18:13:54 -0500
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Adds a JMH measurement for Data Prepper Expressions. Created a Gradle conventional plugin for JMH to keep the JMH version consistent as well as any other configurations we wish to use. (#6018)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 27 Aug 2025 14:54:08 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improve extension loading by prioritizing dependencies, collect extension plugin errors on apply (#6017)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 27 Aug 2025 08:37:59 -0700
    
    
    Prioritize dependencies when loading extension plugins, collect errors on apply
    of extensions
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Implement dimensional time slice crawler (#6011)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Tue, 26 Aug 2025 17:34:46 -0700
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;
    
    Co-authored-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;

* __Add logging for when secret is unable to be retrieved (#6014)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 26 Aug 2025 17:16:54 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add json serialization for DefaultTraceGroupFields (#5991)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 26 Aug 2025 13:36:35 -0700
    
    
    * Add json serialization for DefaultTraceGroupFields
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed code coverage by adding more tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add TokenPaginationCrawler for SAAS plugins (#6008)__

    [Brendan B.](mailto:32278900+bbenner7635@users.noreply.github.com) - Mon, 25 Aug 2025 04:32:19 -0700
    
    
    Add TokenPaginationCrawler for SAAS plugins
    
    Signed-off-by: Brendan Benner &lt;bbenner@amazon.com&gt; Co-authored-by: Brendan
    Benner &lt;bbenner@amazon.com&gt;

* __Add support for extensions to depend upon other extensions (#6012)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sat, 23 Aug 2025 06:29:12 -0700
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Update microsoft office365 plugin name to follow OSI naming convention (#6005)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Thu, 21 Aug 2025 16:35:20 -0700
    
    
    Following the OSI naming convention to use underscore. microsoft office365
    plugin name from microsoft-office365 to microsoft_office365.

* __Add acknowledgment checkpointing with fixes to previous issues (#6002)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 19 Aug 2025 14:06:57 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updates BouncyCastle to 1.81, fixing CVE-2025-8916. (#6000)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 18 Aug 2025 09:33:56 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update Netty to 4.1.124 to fix CVE-2025-55163. (#5996)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Aug 2025 12:34:37 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for spaces and dollar signs in JacksonEventKey (#5989)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Thu, 14 Aug 2025 13:13:44 -0700
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;
    
    Co-authored-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;

* __Remove redundant concatOperator bean for Plus(+) symbol(Fix#5984) (#5988)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Thu, 14 Aug 2025 09:14:38 -0700
    
    
    **Description**
    
    This commit removes redundant concatOperator bean for Plus(+) symbol.
    
    Both concatOperator and addOperator bean configured in OperatorConfiguration 
    are using Plus symbol but the each symbol should have one corresponding 
    operator. It is because OperatorProvider creates HashMap with symbol as key and
    operator as value. Currently addOperator overwrites concatOpeator, but in some
    rare scenario concatOperator could overwrite addOperator and cause NPE.
    
    Note that both addOperator and concatOperator use AddBinaryOperator class as
    implementation, which means addOperator covers concatOperator functionality. It
    is safe to remove concatOperator bean.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __Initial implementation of Pipeline DLQ (#5277)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 11 Aug 2025 21:05:02 -0700
    
    
    * Modified to set failure pipeline in all pipeline components
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix failing test case
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified tests
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * fixed spotless check errors
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed comments. Added more tests for 100% code coverage
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed javadoc error
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed unnecessary change to AwsSecretsPluginConfigValueTranslator.java
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Convert null message to empty string in DLQ to avoid NPE (#5975)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Mon, 11 Aug 2025 10:23:09 -0700
    
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Update microsoft-365 source pagination logic to not skip time range (#5979)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Mon, 11 Aug 2025 08:55:02 -0700
    
    
    **Description**
    
    This commit updates microsoft-365 source pagination to not skip events in
    certain cases.
    
    PaginationCrawler saves Item lastModifiedAt as next poll attempt&#39;s startTime in
    the coordinator table. Currently m365 source sets Instant.now as
    lastModifiedAt(nextPollAttemptTime), which could skip new arrived events
    between current last event&#39;s contentCreated time and current timestamp.
    
    The lastModifiedAt is updated to be contentCreated time(original 
    implementation) when there is next page, and eventTime+1ms when there is no new
    page. This can ensure no missing event in any scenario as well as no duplicate
    event in common scenario.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __feat(sink/opensearch): Retry DELETE operations on 404 status (#5674)__

    [Saketh Pallempati](mailto:pallempati.saketh@fmr.com) - Mon, 11 Aug 2025 08:05:50 -0700
    
    
    * feat(sink/opensearch): Retry DELETE operations on 404 status
    
                      Makes the BulkRetryStrategy retry DELETE operations that
    initially fail with a 404 (Not Found) status. This handles race conditions
    where a delete might be processed before its corresponding create in the same
    bulk request due to eventual consistency.
    
                      - Modified canRetry and createBulkRequestForRetry to identify
    and allow retries specifically for DELETE + 404.
                     - Added unit tests verifying the new retry behavior for DELETE
    + 404 and ensuring other 404s are retried.
    
    Signed-off-by: Pallempati Saketh &lt;pallempati.saketh@fmr.com&gt;
    
    * Implement DELETE+404 retry limit and comprehensive refactoring
    
    - Add DELETE_404_MAX_RETRIES constant (3 attempts max) to prevent infinite
    retry loops
    - Refactor canRetryItem into focused methods:
    isDeleteOperationWithNotFoundError, canRetryDeleteNotFoundOperation,
    isGenerallyRetryableOperation
    - Add comprehensive test coverage for DELETE+404 edge cases and mixed
    operations
    
    This prevents infinite retries when DELETE operations encounter 404 errors due
    to race conditions in bulk operations, while maintaining backward compatibility
    and not affecting other operation types.
    
    Signed-off-by: Pallempati Saketh &lt;pallempati.saketh@fmr.com&gt;
    
    ---------
    
    Signed-off-by: Pallempati Saketh &lt;pallempati.saketh@fmr.com&gt;

* __Add disable_checkpointing flag for ddb source stream (#5981)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 8 Aug 2025 12:25:54 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Revert &#34;Revert &#34;Revert DDB checkpoint acknowledgment changes temporarily (#5967)&#34; (#5976)&#34; (#5980)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 8 Aug 2025 10:44:20 -0500
    
    
    This reverts commit 986a246c31b8ef877e3933b1a107361e537f2b6e.
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __fix TranslateProcessorConfig to load target.type property correct (Fix#5961) (#5969)__

    [wjyao0316](mailto:88009805+wjyao0316@users.noreply.github.com) - Thu, 7 Aug 2025 13:40:39 -0500
    
    
    **What?**
    
    This commit update TranslateProcessorConfig to load the target.type property 
    from pipeline config with Jackson&#39;s support. The cause is that converter
    parameter is not updated while Jackson parsing the target.type properly. The
    fix removes the unncessary private field converter and instead return
    targetType.
    
    It also make secondar contstructor protected for unit test only.
    
    **Why?**
    
    Make target.type property in translate processor to take effect.
    
    Signed-off-by: Wenjie Yao &lt;wjyao@amazon.com&gt; Co-authored-by: Wenjie Yao
    &lt;wjyao@amazon.com&gt;

* __Revert &#34;Revert DDB checkpoint acknowledgment changes temporarily (#5967)&#34; (#5976)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 6 Aug 2025 16:32:30 -0500
    
    
    This reverts commit d04018185a593d88d6acc2b6adf498a1164813db.
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add endpoint override support to CloudWatch Logs sink (#5960)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Wed, 6 Aug 2025 10:59:18 -0700
    
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __Revert DDB checkpoint acknowledgment changes temporarily (#5967)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 5 Aug 2025 18:37:46 -0500
    
    
    * Revert &#34;Ensure shards are completed when last getRecords call has no records
    and no shardIterator (#5958)&#34;
    
    This reverts commit 13049d30888b2b91f8412efd886de29bfe5922ca.
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    
    * Revert &#34;Introduce checkpointing per shard to DDB source, via
    ShardAcknowledgementManager class (#5818)&#34;
    
    This reverts commit dfc3c702dd981b392676ebf511a80c42ac3816d2.
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updates the Jenkins library to 10.2.2 to fix Maven publication. (#5968)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 5 Aug 2025 15:47:46 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release notes for Data Prepper 2.12.1 (#5955)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 5 Aug 2025 12:35:58 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Changelog for Data Prepper 2.12.1 (#5957)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 5 Aug 2025 12:35:15 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Ensure shards are completed when last getRecords call has no records and no shardIterator (#5958)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Mon, 4 Aug 2025 17:44:48 -0500
    
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Fixes OTLP sink metric names to use dot notation instead of underscores (#5929)__

    [Heli](mailto:desaiheli17@gmail.com) - Fri, 1 Aug 2025 18:48:26 -0500
    
    
    Signed-off-by: Heli Desai &lt;desaihel@amazon.com&gt; Co-authored-by: Heli Desai
    &lt;desaihel@amazon.com&gt;

* __Support isolation.level config for Kafka consumer (#5894)__

    [Lahrach Mohamed Houssam](mailto:lahrach.houssam@gmail.com) - Fri, 1 Aug 2025 14:14:13 -0700
    
    
    Signed-off-by: Mohamed Houssam LAHRACH &lt;lahrach.houssam@gmail.com&gt;

* __Bump com.azure:azure-identity from 1.11.1 to 1.16.3 (#5942)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 08:38:32 -0700
    
    
    Bumps [com.azure:azure-identity](https://github.com/Azure/azure-sdk-for-java)
    from 1.11.1 to 1.16.3.
    - [Release notes](https://github.com/Azure/azure-sdk-for-java/releases)
    -
    [Commits](https://github.com/Azure/azure-sdk-for-java/compare/azure-identity_1.11.1...azure-identity_1.16.3)
    
    --- updated-dependencies:
    - dependency-name: com.azure:azure-identity
     dependency-version: 1.16.3
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#5939)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 08:11:27 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.25.0 to 2.25.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.25.0...rel/2.25.1)
    
    --- updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-version: 2.25.1
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#5948)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:47:58 -0700
    
    
    Bumps software.amazon.awssdk:auth from 2.31.74 to 2.32.13.
    
    --- updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-version: 2.32.13
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.eclipse.jetty:jetty-bom in /data-prepper-plugins/s3-source (#5940)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:47:04 -0700
    
    
    Bumps [org.eclipse.jetty:jetty-bom](https://github.com/jetty/jetty.project)
    from 11.0.20 to 11.0.25.
    - [Release notes](https://github.com/jetty/jetty.project/releases)
    -
    [Commits](https://github.com/jetty/jetty.project/compare/jetty-11.0.20...jetty-11.0.25)
    
    --- updated-dependencies:
    - dependency-name: org.eclipse.jetty:jetty-bom
     dependency-version: 11.0.25
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.gradleup.shadow from 8.3.6 to 8.3.8 in /performance-test (#5947)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:44:13 -0700
    
    
    Bumps [com.gradleup.shadow](https://github.com/GradleUp/shadow) from 8.3.6 to
    8.3.8.
    - [Release notes](https://github.com/GradleUp/shadow/releases)
    - [Commits](https://github.com/GradleUp/shadow/compare/8.3.6...8.3.8)
    
    --- updated-dependencies:
    - dependency-name: com.gradleup.shadow
     dependency-version: 8.3.8
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.github.luben:zstd-jni in /data-prepper-plugins/kafka-plugins (#5946)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:43:38 -0700
    
    
    Bumps [com.github.luben:zstd-jni](https://github.com/luben/zstd-jni) from
    1.5.7-3 to 1.5.7-4.
    - [Commits](https://github.com/luben/zstd-jni/compare/v1.5.7-3...v1.5.7-4)
    
    --- updated-dependencies:
    - dependency-name: com.github.luben:zstd-jni
     dependency-version: 1.5.7-4
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.opencsv:opencsv in /data-prepper-plugins/csv-processor (#5944)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:43:08 -0700
    
    
    Bumps com.opencsv:opencsv from 5.11.2 to 5.12.0.
    
    --- updated-dependencies:
    - dependency-name: com.opencsv:opencsv
     dependency-version: 5.12.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.maxmind.geoip2:geoip2 from 4.2.0 to 4.3.1 (#5943)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:42:17 -0700
    
    
    Bumps [com.maxmind.geoip2:geoip2](https://github.com/maxmind/GeoIP2-java) from
    4.2.0 to 4.3.1.
    - [Release notes](https://github.com/maxmind/GeoIP2-java/releases)
    - [Changelog](https://github.com/maxmind/GeoIP2-java/blob/main/CHANGELOG.md)
    - [Commits](https://github.com/maxmind/GeoIP2-java/compare/v4.2.0...v4.3.1)
    
    --- updated-dependencies:
    - dependency-name: com.maxmind.geoip2:geoip2
     dependency-version: 4.3.1
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/s3-source (#5941)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:42:03 -0700
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.7 to 1.1.10.8.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.7...v1.1.10.8)
    
    --- updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-version: 1.1.10.8
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.maven:maven-artifact in /data-prepper-plugins/opensearch (#5938)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:41:08 -0700
    
    
    Bumps org.apache.maven:maven-artifact from 3.9.10 to 3.9.11.
    
    --- updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-version: 3.9.11
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#5949)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:40:39 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.25.0 to 2.25.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.25.0...rel/2.25.1)
    
    --- updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-version: 2.25.1
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.github.luben:zstd-jni in /data-prepper-plugins/common (#5950)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:40:30 -0700
    
    
    Bumps [com.github.luben:zstd-jni](https://github.com/luben/zstd-jni) from
    1.5.7-3 to 1.5.7-4.
    - [Commits](https://github.com/luben/zstd-jni/compare/v1.5.7-3...v1.5.7-4)
    
    --- updated-dependencies:
    - dependency-name: com.github.luben:zstd-jni
     dependency-version: 1.5.7-4
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/common (#5951)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Aug 2025 07:40:19 -0700
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.7 to 1.1.10.8.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.7...v1.1.10.8)
    
    --- updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-version: 1.1.10.8
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates the Postgresql JDBC driver to 42.7.1 to fix CVE-2025-49146. (#5935)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 31 Jul 2025 17:09:59 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds a null check when reading an S3EventNotification for records. Some recent change resulted in ObjectMapper::treeToValue return null for an empty string. (#5933)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 31 Jul 2025 13:21:52 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix S3DBService and LocalDBService file overwrite handling during downloads (#5911)__

    [Kirtan Kakadiya](mailto:35823164+KirtanKakadiya@users.noreply.github.com) - Thu, 31 Jul 2025 12:40:19 -0700
    
    
    Fix S3DBService/LocalDBService file overwrite handling during downloads
    
    Signed-off-by: kirtanhk &lt;kirtanhk@amazon.com&gt; Co-authored-by: kirtanhk
    &lt;kirtanhk@amazon.com&gt;

* __Update dependency aws-cdk-lib to v2.191.0 (#5931)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 10:56:39 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __Introduces the Data Prepper plugin test framework. This includes annotations and a base class for plugin testing along with a couple of initial tests. Resolves #5908 (#5909)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 31 Jul 2025 09:51:54 -0700
    
    
    Also, adds these tests to the grok processor as an initial processor to start
    using it.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump software.amazon.glue:schema-registry-serde (#5855)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:56:23 -0700
    
    
    Bumps
    [software.amazon.glue:schema-registry-serde](https://github.com/awslabs/aws-glue-schema-registry)
    from 1.1.18 to 1.1.24.
    - [Release notes](https://github.com/awslabs/aws-glue-schema-registry/releases)
    -
    [Changelog](https://github.com/awslabs/aws-glue-schema-registry/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/awslabs/aws-glue-schema-registry/commits)
    
    --- updated-dependencies:
    - dependency-name: software.amazon.glue:schema-registry-serde
     dependency-version: 1.1.24
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump io.spring.dependency-management from 1.1.0 to 1.1.7 (#5577)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:50:51 -0700
    
    
    Bumps
    [io.spring.dependency-management](https://github.com/spring-gradle-plugins/dependency-management-plugin)
    from 1.1.0 to 1.1.7.
    - [Release
    notes](https://github.com/spring-gradle-plugins/dependency-management-plugin/releases)
    -
    [Commits](https://github.com/spring-gradle-plugins/dependency-management-plugin/compare/v1.1.0...v1.1.7)
    
    --- updated-dependencies:
    - dependency-name: io.spring.dependency-management
     dependency-version: 1.1.7
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.github.seancfoley:ipaddress in /data-prepper-expression (#4909)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:35:07 -0700
    
    
    Bumps
    [com.github.seancfoley:ipaddress](https://github.com/seancfoley/IPAddress) from
    5.4.2 to 5.5.1.
    - [Release notes](https://github.com/seancfoley/IPAddress/releases)
    - [Commits](https://github.com/seancfoley/IPAddress/compare/v5.4.2...v5.5.1)
    
    --- updated-dependencies:
    - dependency-name: com.github.seancfoley:ipaddress
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.wiremock:wiremock in /data-prepper-plugins/s3-source (#5849)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:33:55 -0700
    
    
    Bumps [org.wiremock:wiremock](https://github.com/wiremock/wiremock) from 3.10.0
    to 3.13.1.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.10.0...3.13.1)
    
    --- updated-dependencies:
    - dependency-name: org.wiremock:wiremock
     dependency-version: 3.13.1
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#5862)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:33:32 -0700
    
    
    Bumps software.amazon.awssdk:auth from 2.26.12 to 2.31.74.
    
    --- updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-version: 2.31.74
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.opencsv:opencsv in /data-prepper-plugins/csv-processor (#5860)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:27:24 -0700
    
    
    Bumps com.opencsv:opencsv from 5.9 to 5.11.2.
    
    --- updated-dependencies:
    - dependency-name: com.opencsv:opencsv
     dependency-version: 5.11.2
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.httpcomponents.client5:httpclient5 (#5756)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:23:25 -0700
    
    
    Bumps
    [org.apache.httpcomponents.client5:httpclient5](https://github.com/apache/httpcomponents-client)
    from 5.3.1 to 5.5.
    -
    [Changelog](https://github.com/apache/httpcomponents-client/blob/master/RELEASE_NOTES.txt)
    -
    [Commits](https://github.com/apache/httpcomponents-client/compare/rel/v5.3.1...rel/v5.5)
    
    --- updated-dependencies:
    - dependency-name: org.apache.httpcomponents.client5:httpclient5
     dependency-version: &#39;5.5&#39;
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-sink (#5575)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:22:52 -0700
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.13.0
    to 2.14.0.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.13.0...v2.14.0)
    
    --- updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-version: 2.14.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump jakarta.validation:jakarta.validation-api in /data-prepper-api (#5489)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:22:10 -0700
    
    
    Bumps
    [jakarta.validation:jakarta.validation-api](https://github.com/jakartaee/validation)
    from 3.0.2 to 3.1.1.
    - [Release notes](https://github.com/jakartaee/validation/releases)
    - [Commits](https://github.com/jakartaee/validation/compare/3.0.2...3.1.1)
    
    --- updated-dependencies:
    - dependency-name: jakarta.validation:jakarta.validation-api
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump me.champeau.jmh in /data-prepper-plugins/http-source (#5391)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:21:40 -0700
    
    
    Bumps me.champeau.jmh from 0.7.2 to 0.7.3.
    
    --- updated-dependencies:
    - dependency-name: me.champeau.jmh
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/rss-source (#5556)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:21:07 -0700
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.7
    to 2.14.0.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.7...v2.14.0)
    
    --- updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-version: 2.14.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-source (#5568)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:20:40 -0700
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.13.0
    to 2.14.0.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.13.0...v2.14.0)
    
    --- updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-version: 2.14.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.projectlombok:lombok in /data-prepper-plugins/opensearch (#5565)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:20:28 -0700
    
    
    Bumps [org.projectlombok:lombok](https://github.com/projectlombok/lombok) from
    1.18.30 to 1.18.38.
    -
    [Changelog](https://github.com/projectlombok/lombok/blob/master/doc/changelog.markdown)
    -
    [Commits](https://github.com/projectlombok/lombok/compare/v1.18.30...v1.18.38)
    
    --- updated-dependencies:
    - dependency-name: org.projectlombok:lombok
     dependency-version: 1.18.38
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump commons-validator:commons-validator in /data-prepper-core (#4589)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:19:35 -0700
    
    
    Bumps commons-validator:commons-validator from 1.8.0 to 1.9.0.
    
    --- updated-dependencies:
    - dependency-name: commons-validator:commons-validator
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#5393)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:18:55 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.0 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.0...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#5401)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:18:47 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-trace-source (#5395)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:18:30 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.0 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.0...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#5385)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:17:53 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.0 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.0...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-proto-common (#5389)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:17:36 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.0 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.0...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-logs-source (#5392)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:17:24 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.0 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.0...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/http-source (#5390)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:16:42 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.27.0 to 3.27.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.27.0...assertj-build-3.27.3)
    
    --- updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.commons:commons-text (#5672)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 08:15:47 -0700
    
    
    Bumps org.apache.commons:commons-text from 1.13.0 to 1.14.0.
    
    --- updated-dependencies:
    - dependency-name: org.apache.commons:commons-text
     dependency-version: 1.14.0
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#5852)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 07:26:27 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.24.3 to 2.25.0.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.24.3...rel/2.25.0)
    
    --- updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-version: 2.25.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.json:json in /data-prepper-plugins/avro-codecs (#5745)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Jul 2025 07:25:25 -0700
    
    
    Bumps [org.json:json](https://github.com/douglascrockford/JSON-java) from
    20240205 to 20250517.
    - [Release notes](https://github.com/douglascrockford/JSON-java/releases)
    -
    [Changelog](https://github.com/stleary/JSON-java/blob/master/docs/RELEASES.md)
    - [Commits](https://github.com/douglascrockford/JSON-java/commits)
    
    --- updated-dependencies:
    - dependency-name: org.json:json
     dependency-version: &#39;20250517&#39;
     dependency-type: direct:production
     update-type: version-update:semver-major
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Introduce checkpointing per shard to DDB source, via ShardAcknowledgementManager class (#5818)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Wed, 30 Jul 2025 12:55:53 -0500
    
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __chore(deps): update dependency setuptools to v78 (#5727)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 30 Jul 2025 10:32:17 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __Update dependency aws-cdk-lib (#5886)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 30 Jul 2025 10:31:16 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __Bump armeria + grpc + protobuf to fix CVE-2024-7254 (#5891)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Wed, 30 Jul 2025 10:28:10 -0700
    
    
    Bump armeria + grpc + protobuf to fix CVE-2024-7254
    
    Upgrades protobuf dependencies with versions that fix Fixes CVE-2024-7254.
    
    Use inline mocks in DnsPeerListProviderCreationTest to support mocking final
    classes. Updates to the GrpcRequestExceptionHandlerTest required by the update
    to the Armeria test library. Enforce a consistent JUnit version across the
    project to avoid JUnit consistency issues.
    
    Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt; Signed-off-by: David
    Venable &lt;dlv@amazon.com&gt; Co-authored-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates several dependencies to address CVEs (#5914)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 30 Jul 2025 08:31:45 -0700
    
    
    Updates several dependencies to address CVEs
    
    * CVE-2025-46762 - Parquet 1.15.2
    * CVE-2025-48734 - commons-beanutils 1.11.0 and Checkstyle 10.26.1
    * CVE-2024-57699 - json-smart 2.5.2
    * CVE-2025-24970 - Netty 4.1.123
    * CVE-2025-27817 - Apache Kafka 3.9.1 and Confluent Kafka 7.9.1
    
    Also, removes some broken code related to the kafka-client in unused Kafka
    tests.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Cleans up old Docker files and configurations for the old approach to smoke tests. Now that they use end-to-end tests these are no longer necessary. (#5916)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 29 Jul 2025 15:34:29 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Added custom headers to cloudwatch logs sink (#5906)__

    [mzurita-amz](mailto:mzurita@amazon.com) - Tue, 29 Jul 2025 14:45:37 -0700
    
    
    Added header_overrides to cloudwatch logs sink
    
    Signed-off-by: Manuel Mangas Zurita &lt;mzurita@amazon.com&gt;

* __S3 scheduled scan should consider start time on subsequent scans (#5920)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 29 Jul 2025 15:44:05 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updated the smoke tests scripts to use the end-to-end tests (#5903)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 28 Jul 2025 16:43:52 -0700
    
    
    Updated the smoke tests scripts to use the end-to-end tests to get them running
    as part of the release again. Support validating tar files by skipping the
    Docker pull if the image is local. Skip the Docker validations in the
    run-smoke-tests.sh script altogether to rely on the e2e-tests. Increase
    validation time to 30 minutes.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes a regression in core where @SingleThread annotated processors are only running the last instance. (#5902)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Jul 2025 14:48:44 -0700
    
    
    Fixes a regression in core where @SingleThread annotated processors are only
    running the last instance. Also, disable the ProcessorSwapPipelineIT test since
    this feature is not yet completed.
    
    Fixes #5901
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Several of the documentation pages have been moved to the OpenSearch documentation project. This commit updates the existing documentation in this project to point to the official documentation for those. (#5703)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Jul 2025 09:15:53 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds some additional instructions for checking Maven artifacts (#5838)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Jul 2025 09:15:32 -0700
    
    
    Adds some additional instructions for checking Maven artifacts and moves the
    further details section to the bottom.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.apache.maven:maven-artifact in /data-prepper-plugins/opensearch (#5869)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 18 Jul 2025 07:39:05 -0700
    
    
    Bumps org.apache.maven:maven-artifact from 3.9.9 to 3.9.10.
    
    --- updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-version: 3.9.10
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#5848)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 18 Jul 2025 07:38:32 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.15.11 to 1.17.6.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.15.11...byte-buddy-1.17.6)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-version: 1.17.6
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy-agent in /data-prepper-plugins/opensearch (#5850)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 18 Jul 2025 07:37:57 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy-agent](https://github.com/raphw/byte-buddy)
    from 1.15.11 to 1.17.6.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.15.11...byte-buddy-1.17.6)
    
    --- updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy-agent
     dependency-version: 1.17.6
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#5861)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 18 Jul 2025 07:37:18 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.23.0 to 2.25.0.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.23.0...rel/2.25.0)
    
    --- updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-version: 2.25.0
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Support triple quote strings to disambiguate between String and EscapedJsonPointer (#5655)__

    [Craig Perkins](mailto:craig5008@gmail.com) - Wed, 16 Jul 2025 14:57:51 -0700
    
    
    * Introduce RawString type to allow strings that begin with forward slash
    
    Signed-off-by: Craig Perkins &lt;cwperx@amazon.com&gt;
    
    * Add tests in GenericExpressionEvaluator_ConditionalIT
    
    Signed-off-by: Craig Perkins &lt;cwperx@amazon.com&gt;
    
    * Address comments
    
    Signed-off-by: Craig Perkins &lt;cwperx@amazon.com&gt;
    
    * Improve coverage
    
    Signed-off-by: Craig Perkins &lt;cwperx@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Craig Perkins &lt;cwperx@amazon.com&gt; Signed-off-by: Craig Perkins
    &lt;craig5008@gmail.com&gt;

* __Added array support for ndjson inputcodec (#5875)__

    [Siva](mailto:sivagnanam.arumugam@freshworks.com) - Wed, 16 Jul 2025 09:01:12 -0700
    
    
    Added array support for ndjson inputcodec with multiple array support
    
    Signed-off-by: sivagnanam-arumugam &lt;sivagnanam.arumugam@freshworks.com&gt;

* __Make createStsClient protected (#5885)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 15 Jul 2025 09:12:14 -0700
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Finish updating the newline codec to use the EventBuilder. It appears that part of the work was done, but it wasn&#39;t quite finished until now. Also, renamed the unit test to match the class name. (#5795)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 14 Jul 2025 08:45:02 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update maven publishing workflow to accommodate nexus EOL (#5871)__

    [Sayali Gaikawad](mailto:gaiksaya@amazon.com) - Mon, 14 Jul 2025 08:30:34 -0700
    
    
    Update maven publishing workflow to accommodate nexus EOL Fix auto-publishing
    to maven central
    
    Signed-off-by: Sayali Gaikawad &lt;gaiksaya@amazon.com&gt;

* __added delete_source functionality to the dissect processor (#5662)__

    [Zeeshan Alam](mailto:zeeshan.alam@fmr.com) - Fri, 11 Jul 2025 13:55:59 -0700
    
    
    * completed feature request
    
    Signed-off-by: Zeeshan Alam &lt;Zeeshan.Alam+fidelity@fmr.com&gt;
    
    * added missing import statement
    
    Signed-off-by: Zeeshan Alam &lt;Zeeshan.Alam+fidelity@fmr.com&gt;
    
    ---------
    
    Signed-off-by: Zeeshan Alam &lt;Zeeshan.Alam+fidelity@fmr.com&gt; Co-authored-by:
    Zeeshan Alam &lt;Zeeshan.Alam+fidelity@fmr.com&gt;

* __Revert &#34;Refactor common code in aws-plugin to aws-common (#5877)&#34; (#5884)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 11 Jul 2025 11:24:26 -0700
    
    
    This reverts commit be0ee9849986db3821142f392eec3c7d8a2568b9.

* __Adds a nightly build to produce Maven SNAPSHOT artifacts (#5805)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 11 Jul 2025 10:05:00 -0700
    
    
    Adds a nightly build to produce Maven SNAPSHOT artifacts to the Maven Central
    snapshots repo.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Refactor common code in aws-plugin to aws-common (#5877)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 8 Jul 2025 10:11:34 -0700
    
    
    * Refactor common code in aws-plugin to aws-common
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added more tests for 100% code coverage
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Fix unecessary logging for query manager with 0 terms (#5879)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 8 Jul 2025 10:58:00 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix failing Encryption KMS KafkaIT tests (#5873)__

    [Jeffrey Aaron Jeyasingh](mailto:jeffreyaaron06@gmail.com) - Mon, 7 Jul 2025 14:53:26 -0700
    
    
    * Fix failing KMS test by fixing test config
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    

* __Add tests to check KafkaBuffer compression (#5813)__

    [Jeffrey Aaron Jeyasingh](mailto:jeffreyaaron06@gmail.com) - Wed, 2 Jul 2025 17:06:04 -0700
    
    
    * Add tests to check compression
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;

* __Add ZSTD compression engine for Kafka Buffer (#5844)__

    [Jeffrey Aaron Jeyasingh](mailto:jeffreyaaron06@gmail.com) - Wed, 2 Jul 2025 17:05:41 -0700
    
    
    * Add ZSTD compression engine
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;

* __Chunk queries for duplicate documents, add metrics, track duplicate documents found in queries (#5847)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 2 Jul 2025 14:06:57 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add support for replacing invalid characters in parsing processors (#5823)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 1 Jul 2025 10:02:48 -0700
    
    
    * Add support for replacing invalid characters in parsing processors
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed javadoc error
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle errors
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __[Fix] Add sleep in zero buffer read when no data is flowing (#5846)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 30 Jun 2025 14:45:14 -0500
    
    
    * Add sleep in zero buffer read when no data is flowing
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit test
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Catch InterruptedException and not throw
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address one more comment
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Support alternative extension implementations (#5816)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 30 Jun 2025 11:48:50 -0700
    
    
    * Support alternative extension implementations
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments and added tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments and added tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Remove unused import (#5843)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 27 Jun 2025 15:12:48 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add check for null compression option (#5842)__

    [Jeffrey Aaron Jeyasingh](mailto:jeffreyaaron06@gmail.com) - Fri, 27 Jun 2025 14:37:11 -0500
    
    
    * Add check for null compression option
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    
    * Add unit tests for KafkaBuffer
    
    - Test null compression type handling
    - Test null producer properties handling
    - Test zstd compression type support
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    
    * Add comments to KafkaBuffer.java
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    
    * Add another test for KafkaBuffer
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    
    * Rename manualCompressionConfig
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    
    * Add tests to check the customCompressionOption
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;
    
    ---------
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;

* __remove experimental tag for ml processor (#5839)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Thu, 26 Jun 2025 16:35:05 -0700
    
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Changelog for 2.12. (#5836)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 26 Jun 2025 09:45:46 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the format release note script to skip bot users. (#5834)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 26 Jun 2025 09:28:22 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds the release notes for Data Prepper 2.12. (#5829)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 26 Jun 2025 09:01:06 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix downloading path from S3 and to maven lib (#5831)__

    [Sayali Gaikawad](mailto:gaiksaya@amazon.com) - Thu, 26 Jun 2025 08:06:28 -0700
    
    
    Signed-off-by: Sayali Gaikawad &lt;gaiksaya@amazon.com&gt;

* __OTLP Source unified endpoint for logs, traces and metrics (#5677)__

    [Shenoy Pratik](mailto:sgguruda@amazon.com) - Wed, 25 Jun 2025 17:04:51 -0700
    
    
    * init single endpoint
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * add reflection service
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update getmetadata expression to support eventType
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * format files
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update config and add health check
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * add http support and update config options
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * reset Otel trace source
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * add tests for healthcheck, auth, requests and config
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * add tests for grpc
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update retry tests
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update plugin name from otel-telemetry-source to otlp
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update readme with usage details
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * reset Otel trace source changes
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * revert GetMetadataExpressionFunction and OTelTraceSource changes
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * remove example
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update source to use http-common server
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * added back retry tests, use http-common health check
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update readme with authentication details
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * fix checkstyle issues
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * add support for OpenSearch formats &amp; update readme
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * remove dupe in settings
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * remove junit and mockito
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update config fields and move certs
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update tests with new config options
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * use data prepper duration and add generic output_format
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update timeouts to duration
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update the output format defaults to null
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;

* __Updates the staging stack to allow multiple accounts to access the read permissions. This will allow us to grant access to the OpenSearch CI test accounts. Contributes toward #5796. (#5830)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 25 Jun 2025 14:31:47 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Refactor maven downloading logic to be dynamic (#5826)__

    [Sayali Gaikawad](mailto:gaiksaya@amazon.com) - Wed, 25 Jun 2025 12:53:30 -0700
    
    
    Refactor maven downloading logic to be dynamic
    
    Signed-off-by: Sayali Gaikawad &lt;gaiksaya@amazon.com&gt;

* __Update main branch to Data Prepper 2.13. (#5828)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 25 Jun 2025 12:53:04 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump aws-cdk-lib in /release/staging-resources-cdk (#5819)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 09:17:26 -0700
    
    
    Bumps
    [aws-cdk-lib](https://github.com/aws/aws-cdk/tree/HEAD/packages/aws-cdk-lib)
    from 2.88.0 to 2.189.1.
    - [Release notes](https://github.com/aws/aws-cdk/releases)
    - [Changelog](https://github.com/aws/aws-cdk/blob/main/CHANGELOG.v2.alpha.md)
    -
    [Commits](https://github.com/aws/aws-cdk/commits/v2.189.1/packages/aws-cdk-lib)
    
    --- updated-dependencies:
    - dependency-name: aws-cdk-lib
     dependency-version: 2.189.1
     dependency-type: direct:production
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __chore(deps): update dependency urllib3 to v2 (#5821)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 09:16:15 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __chore(deps): update dependency requests to v2.32.4 (#5824)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 09:15:05 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __Bump protobuf in /examples/trace-analytics-sample-app/sample-app (#5786)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 09:13:26 -0700
    
    
    Bumps [protobuf](https://github.com/protocolbuffers/protobuf) from 3.20.3 to
    4.25.8.
    - [Release notes](https://github.com/protocolbuffers/protobuf/releases)
    -
    [Changelog](https://github.com/protocolbuffers/protobuf/blob/main/protobuf_release.bzl)
    -
    [Commits](https://github.com/protocolbuffers/protobuf/compare/v3.20.3...v4.25.8)
    
    --- updated-dependencies:
    - dependency-name: protobuf
     dependency-version: 4.25.8
     dependency-type: direct:production
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Update s3 scan ack timeout and scan interval in rds template (#5820)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 25 Jun 2025 11:08:06 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __chore(deps): update dependency requests to v2.32.4 (#5781)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 08:51:02 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __chore(deps): update dependency protobuf to v4 (#5814)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 08:43:47 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __chore(deps): update dependency urllib3 to v2.5.0 (#5803)__

    [mend-for-github-com[bot]](mailto:50673670+mend-for-github-com[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 08:41:16 -0700
    
    
    Co-authored-by: mend-for-github-com[bot]
    &lt;50673670+mend-for-github-com[bot]@users.noreply.github.com&gt;

* __Bump brace-expansion from 1.1.11 to 1.1.12 in /testing/aws-testing-cdk (#5817)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 25 Jun 2025 08:39:51 -0700
    
    
    Bumps [brace-expansion](https://github.com/juliangruber/brace-expansion) from
    1.1.11 to 1.1.12.
    - [Release notes](https://github.com/juliangruber/brace-expansion/releases)
    -
    [Commits](https://github.com/juliangruber/brace-expansion/compare/1.1.11...v1.1.12)
    
    --- updated-dependencies:
    - dependency-name: brace-expansion
     dependency-version: 1.1.12
     dependency-type: indirect
    ...
    
    Signed-off-by: dependabot[bot] &lt;support@github.com&gt; Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Creates an IAM role granting the OpenSearch CI access to the S3 artifacts (#5815)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 24 Jun 2025 15:58:22 -0700
    
    
    Creates an IAM role that the OpenSearch CI build server can assume to gain
    access to the S3 bucket for archives. Contributes toward #5796 by allowing the
    server to perform a full S3 download of the Maven artifacts.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for convering keys to lowercase/uppercase in RenameKeyProcessor (#5810)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 24 Jun 2025 10:32:28 -0700
    
    
    * Add support for convering keys to lowercase/uppercase in RenameKeyProcessor
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add traceId to documentId used for spans (#5684)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Tue, 24 Jun 2025 09:44:09 +0200
    
    
    * Add traceId to documentId used for spans
    
    adresses #5370
    
    OpenTelemetry spans are currently indexed using the spanId as documentId. This
    can lead to collisions where spans are not indexed or overwrite each other.
    
    This change adds the traceId to the documentId. OpenTelemetry assumes the 
    combination of traceId and spanId to be unique. If there is still a collision
    it is safe to assume, that it occurs because of a resending of a previously
    indexed span.
    
    Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    * Add integration test forcing the change
    
    Adds an integration tests, that indexes two spans with the same span id but
    different trace ids. With the old implementation the two spans would overwrite
    each other. This tests checks, that two spans are returned by the query. This
    test is only green with the new document id implementation and fails with the
    earlier.
    
    Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    ---------
    
    Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;

* __Decoupling PipelineDataFlowModel dependency from PipelineTransformer (#5809)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 23 Jun 2025 15:12:38 -0700
    
    
    * decoupled PipelineDataModel dependency from PipelineTransformer. It will now
    get the pipeline data model as an argument instead of constructor argument
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Fix style and build errors from #5778 (#5811)__

    [Jeffrey Aaron Jeyasingh](mailto:jeffreyaaron06@gmail.com) - Mon, 23 Jun 2025 14:19:15 -0700
    
    
    * Fix import style and integration test fixes
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;

* __Enable zSTD Compression for Kafka Buffer - Json type (#5778)__

    [Jeffrey Aaron Jeyasingh](mailto:jeffreyaaron06@gmail.com) - Fri, 20 Jun 2025 16:53:00 -0700
    
    
    * Implement Kafka buffering compression
    
    Signed-off-by: Jeffrey Aaron Jeyasingh &lt;jeffreyaaron06@gmail.com&gt;

* __Adding Processor Registry to provision Atomic swapping of Processor instances (#5794)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 20 Jun 2025 12:57:00 -0700
    
    
    * Processor Registry class added to provision Atomic swapping of processor list
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __Fix query size for query_lookup to return more than 10 documents (#5807)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 20 Jun 2025 10:16:43 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fixes two new projects which were added after the PR to re-organize the tests projects. (#5798)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 19 Jun 2025 14:26:11 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Moves the Data Prepper test projects into a single project and updates the project naming to follow the pattern used in data-prepper-plugins. (#5726)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 19 Jun 2025 13:53:05 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Gradle build support for publishing Maven snapshots. Updates the release.yml to publish only the Maven release artifacts. (#5797)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 19 Jun 2025 13:52:35 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add auto conversion option to convert_type processor (#5782)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 17 Jun 2025 14:20:26 -0700
    
    
    * Add auto conversion option to convert_type processor
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified to coerse floats to double
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add multi-line csv support (#5784)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 16 Jun 2025 15:44:27 -0700
    
    
    * Add multi-line csv support
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __add internal batching of the records for Sagemaker job creator (#5734)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Fri, 13 Jun 2025 13:24:45 -0700
    
    
    * add internal batching of the records for sagemaker job creator
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    * remove schduler in lieu of worker pulling schedule
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Add detect format processor (#5774)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 13 Jun 2025 12:54:23 -0700
    
    
    * Add detect format processor
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add iterate_on support for convert_type processors to iterate over array of objects and convert within each element (#5775)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 13 Jun 2025 14:53:14 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Better error handling and printing exception stack trace (#5776)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 13 Jun 2025 12:24:09 -0700
    
    
    * Better error handling and printing exception stack trace to make sure that
    every failure is captured and logged
    

* __Iterate on support for add_entries and delete_entries processors (#5773)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 12 Jun 2025 20:33:01 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt; Signed-off-by: Taylor Gray
    &lt;tylgry@amazon.com&gt; Co-authored-by: George Chen &lt;qchea@amazon.com&gt;

* __Add support for updating JacksonEvent array elements (#5772)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 12 Jun 2025 11:46:45 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Modify cloudwatch sink to use FixedThreadPool (#5770)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 11 Jun 2025 16:41:34 -0700
    
    
    * Modify cloudwatch sink to use FixedThreadPool
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __feat: Allow plugins to access default pipeline role via AwsCredentialsSupplier (#5604)__

    [Saketh Pallempati](mailto:pallempati.saketh@fmr.com) - Tue, 10 Jun 2025 10:19:13 -0500
    
    
    This change enables plugins to access the default STS role ARN configured in
                     data-prepper-config.yaml via the AwsCredentialsSupplier
    interface.
    
                      Changes:
                     - Added getDefaultStsRoleArn() method to
    AwsCredentialsSupplier interface
                     - Implemented the method in DefaultAwsCredentialsSupplier
                     - Added corresponding method to CredentialsProviderFactory
                     - Added unit tests for the new functionality
    
                      This maintains a consistent pattern with how the default
    region is already
                     accessible to plugins through the same interface.
    
    Signed-off-by: Pallempati Saketh &lt;pallempati.saketh@fmr.com&gt;

* __Move token refresh inside retry operations for Office 365 connector (#5766)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Mon, 9 Jun 2025 12:40:28 -0500
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt; Co-authored-by: Alekhya
    Parisha &lt;aparisha@amazon.com&gt;

* __fix: lastPollTime updating for O365 (#5764)__

    [Savit Aluri](mailto:savit.aluri@gmail.com) - Mon, 9 Jun 2025 12:33:35 -0500
    
    
    Signed-off-by: Savit Aluri &lt;savaluri@amazon.com&gt; Co-authored-by: Savit Aluri
    &lt;savaluri@amazon.com&gt;

* __Fix kafka source with glue registry (#5765)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 6 Jun 2025 17:56:30 -0700
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Support running the end-to-end tests against defined Docker images. Resolves #3567. (#5711)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Jun 2025 15:08:29 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improvements to artifacts to support Maven artifacts for plugins. Add data-prepper prefix to jar names, though they aren&#39;t used in the Maven coordinates. Move some projects into plugins or core groupIds. (#5722)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Jun 2025 15:08:09 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add OTLP sink plugin for exporting spans to AWS X-Ray (#5664)__

    [huyPham](mailto:huypham612@gmail.com) - Tue, 3 Jun 2025 11:29:44 -0700
    
    
    Add OTLP sink plugin for exporting spans to AWS X-Ray (#5664)
    
    Feature/xray init
    
    feat(xray-otlp-sink): Add X-Ray OTLP Sink plugin skeleton
    - Added test resources and support for Span records
    - Added sample pipeline config and OTLP test span JSON under
    `src/test/resources`
    - Verified local pipeline ingest and logging using `grpcurl`
    - Added README with developer instructions for running and testing locally
    
    These changes establish the foundation for local testing and future X-Ray e2e
    testing.
    
    Signed-off-by: huy pham &lt;huyp@amazon.com&gt; Signed-off-by: Heli
    &lt;desaiheli17@gmail.com&gt; Co-authored-by: Heli &lt;desaiheli17@gmail.com&gt;

* __FEAT: encryption extension integration with kafka (#5625)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 30 May 2025 16:21:04 -0500
    
    
    * FEAT: encryption extension integration with kafka buffer
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add mod operator to Data Prepper (#5729)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Fri, 30 May 2025 15:46:07 -0500
    
    
    * mod operator implementation
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Feature/office365 source v2 (#5721)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Thu, 29 May 2025 22:41:20 -0700
    
    
     Office365 SAAS Source Plugin
    

* __ENH: encryption extension (#5581)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 29 May 2025 15:58:16 -0500
    
    
    ADD: encryption extension
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Set server id for mysql binlog client (#5725)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 28 May 2025 16:37:57 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Rename Atlassian state classes to PaginationCrawler (#5718)__

    [alparish](mailto:152813728+alparish@users.noreply.github.com) - Fri, 23 May 2025 15:36:40 -0500
    
    
    Signed-off-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;
    
    Co-authored-by: Alekhya Parisha &lt;aparisha@amazon.com&gt;

* __Fix CloudwatchLogs and Sqs sink config to use correct Jakarta annotations (#5714)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 22 May 2025 09:54:07 -0700
    
    
    * Fix CloudwatchLogs sink config to use correct Jakarta annotations
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Also, fixed SQS sink Jakarta annotation issue
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Re-enable ZeroBuffer (#5661)__

    [Mohammed Aghil Puthiyottil](mailto:57040494+MohammedAghil@users.noreply.github.com) - Wed, 21 May 2025 19:35:10 -0500
    
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;

* __Increase default scroll time per batch from 1m to 10m (#5704)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 21 May 2025 13:13:29 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add codec to http source (#5694)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 21 May 2025 10:27:15 -0500
    
    
    * Add codec to http source
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add a test with sample data
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add aggregate metrics for rds source (#5697)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 19 May 2025 16:55:35 -0500
    
    
    * Add aggregated metrics for rds source
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add more granular error metrics
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add more tests
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Change slot naming (#5699)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 19 May 2025 13:42:16 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Serialization fix when the expected type is PluginConfigVariable (#5698)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 16 May 2025 17:50:00 -0700
    
    
    * Serialization fix when the expected type is PluginConfigVariable
    

* __Increase Sqs sink test coverage. Add more metrics (#5693)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 16 May 2025 15:30:44 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Added integration tests for validating that events are processed exactly once (#5691)__

    [Mohammed Aghil Puthiyottil](mailto:57040494+MohammedAghil@users.noreply.github.com) - Thu, 15 May 2025 16:48:09 -0700
    
    
    * Added integration tests for validating that events are processed exactly once
    by any processor
    
    - Added additional validation for BasicEndToEndTests
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Moved getEventsMap() and getName() methods to base class
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Addressed comments on PIPELINE_TO_PROCESSORS_MAP
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;

* __Add `getEventType()` expression function (#5686)__

    [Shenoy Pratik](mailto:sgguruda@amazon.com) - Wed, 14 May 2025 14:25:23 -0500
    
    
    * add geteventType expresion
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update antlr grammar, parser and add expression tests
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * update expression syntax documentation
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * move expression parse exception check to evaluation exceptions
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    * resolve comments, update getEventTypet test to become parameterized
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;

* __Kds cross account stream (#5687)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 13 May 2025 08:19:40 -0700
    
    
    Implementation for cross account stream support in KDS
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    

* __fix log warnings for HTTP server instanced source names (#5689)__

    [Shenoy Pratik](mailto:sgguruda@amazon.com) - Mon, 12 May 2025 09:04:11 -0700
    
    
    Signed-off-by: Shenoy Pratik &lt;sgguruda@amazon.com&gt;

* __Avro 1.11.4 (#5680)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 8 May 2025 13:44:28 -0700
    
    
    Fixes CVE-2024-47561
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes an uncommon test failure in TruncateProcessorConfigTests by not using negative zero. Refactors the tests by splitting a single test into two and sharing common code. (#5683)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 7 May 2025 12:28:26 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Enabling experimental plugins specifically by plugin type and name (#5676)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 7 May 2025 11:58:02 -0700
    
    
    Support enabling experimental plugins specifically by plugin type and name.
    This also includes a change to the core plugin classes to allow them to define
    themselves as a plugin component type along with a name that is used to create
    the mapping in the YAML file.
    
    Resolves #5675
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __CrowdStrike client and coordinator implementation (#5678)__

    [Neha Gupta](mailto:35155714+nsgupta1@users.noreply.github.com) - Tue, 6 May 2025 13:29:54 -0700
    
    
    * CrowdStrike client and coordinator implementation
    
    Signed-off-by: nsgupta1 &lt;nsgupta1@users.noreply.github.com&gt;

* __Add support for api token in config (#5544)__

    [Derek Ho](mailto:dxho@amazon.com) - Tue, 6 May 2025 13:05:18 -0700
    
    
    Add api token
    
    Signed-off-by: Derek Ho &lt;dxho@amazon.com&gt;

* __Add OTel Metrics String Attributes to Index Template (#5589)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Tue, 6 May 2025 21:03:44 +0200
    
    
    Introduces keyword mappings for string fields. This was the default before the
    latest change for all fields.
    
    Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;

* __Fix validation for default route (#5682)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 6 May 2025 13:14:43 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Allow disabling metrics with data-prepper-config.yaml (#5627)__

    [Siqi Ding](mailto:dingdd@amazon.com) - Thu, 1 May 2025 03:04:13 -0700
    
    
    Add support for disabling metrics via data-prepper-config.yaml
    
    Signed-off-by: Siqi Ding &lt;dingdd@amazon.com&gt; Signed-off-by: Siqi Ding
    &lt;109874435+Davidding4718@users.noreply.github.com&gt;

* __Add SQS sink (#5628)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 29 Apr 2025 14:59:35 -0700
    
    
    * Addressed review comments and updated to use latest codec changes
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed failing testcase and added other tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix checkstyle error
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __CrowdStrike API call and retry mechanism (#5654)__

    [Neha Gupta](mailto:35155714+nsgupta1@users.noreply.github.com) - Mon, 28 Apr 2025 11:46:54 -0700
    
    
    * CrowdStrike API call and retry mechanism
    
    Signed-off-by: nsgupta1 &lt;nsgupta1@users.noreply.github.com&gt; Signed-off-by:
    ngsupta1 &lt;guptaneha.e@gmail.com&gt; Co-authored-by: nsgupta1
    &lt;nsgupta1@users.noreply.github.com&gt;

* __Merging common auth to main and fixing the conflicts (#5653)__

    [Siqi Ding](mailto:dingdd@amazon.com) - Mon, 28 Apr 2025 09:46:23 -0700
    
    
    Common server builder and auth module for push based plugins (#5423)
    
    Add Custom Auth Provider with support for gRPC, plus tests and exception
    handling
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt; Signed-off-by: Siqi Ding
    &lt;109874435+Davidding4718@users.noreply.github.com&gt; Co-authored-by: Maxwell
    Brown &lt;55033421+Galactus22625@users.noreply.github.com&gt;

* __Initial commit to refactor the OutputCodec to support a Writer per OutputStream (#5606)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 28 Apr 2025 05:03:14 -0700
    
    
    Initial commit to refactor the OutputCodec to support a Writer that is bound to
    a specific OutputStream. This supports backward compatibility with the existing
    APIs and an update to the JsonOutputCodec and NdjsonOutputCodec to start the
    migration. Adds missing unit tests for NdjsonOutputCodec.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release notes for Data Prepper 2.11 (#5633)__

    [David Venable](mailto:dlv@amazon.com) - Sun, 27 Apr 2025 08:40:19 -0700
    
    
    * Release notes for Data Prepper 2.11
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    
    * Adds missing issue/PR as pointed out in PR for release notes.
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    
    ---------
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __FIX: NPE in JsonCodec with keyName (#5659)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 25 Apr 2025 20:02:11 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Adds some information about the OpenSearch CI build along with useful links. (#5615)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 24 Apr 2025 12:18:28 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release notes for Data Prepper 2.11 (#5633)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 24 Apr 2025 07:23:02 -0700
    
    
    Release notes for Data Prepper 2.11
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __changelog-2.11.0 (#5648)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 23 Apr 2025 15:34:56 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt; (#5621)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Wed, 23 Apr 2025 15:46:04 -0500
    
    
    Adding retries and backoff to handle delayed sync between GSI and primary table
    when DDB is used Source Coordination Store

* __FIX: opensearch serverless parameter constraint (#5641)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 22 Apr 2025 17:14:49 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Explicit enforcing of order (#5640)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 22 Apr 2025 10:57:49 -0700
    
    
    * mentioning explicit ordering
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __Change main branch version to 2.12.0-SNAPSHOT (#5637)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 22 Apr 2025 09:03:57 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Change version in DataPrepper Version class to 2.12 (#5638)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 22 Apr 2025 09:03:27 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add missing OTEL standard fields (#5635)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 21 Apr 2025 17:57:13 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Marking CrowdStrike as Experimental (#5630)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 21 Apr 2025 08:44:51 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add support for multiple entries of &#39;with_keys&#39; with &#39;delete_when&#39; co… (#5356)__

    [Niketan Chandarana](mailto:42366580+niketan16@users.noreply.github.com) - Mon, 21 Apr 2025 08:31:25 -0700
    
    
    Add support for multiple entries of &#39;with_keys&#39; with &#39;delete_when&#39; condition in
    delete_entries processor
    
    Signed-off-by: Niketan Chandarana &lt;niketanc@amazon.com&gt;

* __Confluence polling check changing to greater than or equals (#5629)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 18 Apr 2025 17:38:50 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Initial commit for CrowdStrike source crawler (#5619)__

    [Neha Gupta](mailto:35155714+nsgupta1@users.noreply.github.com) - Fri, 18 Apr 2025 16:27:29 -0700
    
    
    * Initial commit for CrowdStrike source crawler
    
    Signed-off-by: nsgupta1 &lt;nsgupta1@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: ngsupta1 &lt;guptaneha.e@gmail.com&gt; Signed-off-by: nsgupta1
    &lt;nsgupta1@users.noreply.github.com&gt; Co-authored-by: nsgupta1
    &lt;nsgupta1@users.noreply.github.com&gt;

* __Fix shutdown and failover handling in RDS source plugin (#5624)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 18 Apr 2025 14:55:39 -0500
    
    
    * Fix MySQL shutdown sequence
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix failover handling
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix cloudwatch logs config (#5623)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 17 Apr 2025 16:05:38 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Fix issue 5106 (#5501)__

    [Saketh Pallempati](mailto:pallempati.saketh@fmr.com) - Thu, 17 Apr 2025 12:13:32 -0700
    
    
    Fix validation of pipeline&#39;s sink routes #5106
    
    * Added validation for sink routes in PipelineConfigurationValidator
    * Added unit tests in PipelineConfigurationValidatorTest
    * Added integration tests in PipelineConfigurationValidatorIT
    * Routes now properly validate against defined conditional routes
    
    Signed-off-by: Pallempati Saketh &lt;pallempati.saketh@fmr.com&gt;

* __Removing batch_size attribute and made the Crawler extensible (#5617)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 17 Apr 2025 11:38:53 -0700
    
    
    * Removing batch_size attribute and made the Crawler extensible
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add test for date patterned index (#5585)__

    [Tomas](mailto:longo.tomas@googlemail.com) - Wed, 16 Apr 2025 13:17:05 -0700
    
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt; Co-authored-by: Tomas Longo
    &lt;tomas.longo@sap.com&gt;

* __Change log for 2.10.3 (#5609)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 16 Apr 2025 11:46:12 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release notes for 2.10.3 (#5610)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 16 Apr 2025 11:45:52 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Atlassian Jira Gameday fixes (#5603)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 16 Apr 2025 09:42:20 -0700
    
    
    * regex fix for having multiple values in the cql filter
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * validations fixes for the page type and space key
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Adding event metadata so that it can be used in dynamic index name
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Few updates to RDS source plugin (#5602)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 16 Apr 2025 10:43:40 -0500
    
    
    * Remove step to clean up replication slot
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update table filter config
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix query for mysql 8.4
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix EventType and a few other things (#5598)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 14 Apr 2025 11:05:46 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Updates Apache Parquet to 1.15.1 to resolve CVE-2025-30065. (#5597)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 11 Apr 2025 14:46:07 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rename OTEL standard template mappings index-types (#5587)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 11 Apr 2025 12:59:07 -0700
    
    
    Rename OTEL standard template mappings index-types to plain
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add getEstimatedSize API to OutputCodec (#5593)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Thu, 10 Apr 2025 15:38:54 -0700
    
    
    * Add getEstimatedSize API to OutputCodec
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build failure
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Fix a bug in converting Jira ticket updated time to milliseconds (#5595)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 10 Apr 2025 14:46:01 -0700
    
    
    * fix for converting to millis
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * test case fix
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Removing flaky TimzoneHelper utility and corresponding test case  (#5591)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 9 Apr 2025 22:40:10 -0700
    
    
    * Removing TimezoneHelper class and its corresponding test cases that are
    flaky. Changed the logic to make use of the ZonedDateTime conversion.
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * javadoc fixes
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Making it on demand initialization
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Test case to validate CQL construction with ZonedDateTime conversion
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __feat: Add configurable stream read constraints for JSON input codec (#5541)__

    [Saketh Pallempati](mailto:saketh.pallempati@gmail.com) - Tue, 8 Apr 2025 18:13:07 -0700
    
    
    feat: Add configurable stream read constraints for JSON input codec
    
    - Introduced a configurable option for setting the maximum event length in the
    JSON input codec.
    - Updated JsonDecoder to accept max_event_length parameter and apply it to
    StreamReadConstraints.
    - Added validation to ensure the maximum event length is within acceptable
    limits. Fixes #5466
    
    * Set maxEventLength default to null for safer usage.
    * Set min value of maxEventLength to Jackson&#39;s default
    
    Signed-off-by: Pallempati Saketh &lt;pallempati.saketh@fmr.com&gt;

* __Support trace groups in standard otel proto codec (#5539)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 7 Apr 2025 15:06:14 -0700
    
    
    * Support trace groups in standard otel proto codec
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments. Verified the functionality for standard
    logs/traces/metrics
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added string mappings for resource and scope
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __add ml_inference processor for offline batch inference (#5507)__

    [Xun Zhang](mailto:xunzh@amazon.com) - Thu, 3 Apr 2025 15:24:10 -0700
    
    
    Add ml processor for offline batch inference
    
    Signed-off-by: Xun Zhang &lt;xunzh@amazon.com&gt;

* __Add DLQ support to CloudWatchLogs sink (#5542)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 2 Apr 2025 15:27:21 -0700
    
    
    * Add DLQ support to CloudWatchLogs sink
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __comparing an hour difference range for all the timezones (#5553)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 31 Mar 2025 15:44:32 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Implement querying for existing documents to handle duplicates on condition or bulk request/operation failures (#5525)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 31 Mar 2025 10:07:54 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add null check for writer (#5550)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 27 Mar 2025 14:06:58 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Build an uber-jar for the Data Prepper performance-test project that can be deployed with all the necessary Gatling dependencies and run stand-alone. (#5552)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 27 Mar 2025 11:04:26 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes a few dependency versions. Several new projects have redeclared their dependencies which may lead to inconsistent dependencies in testing than runtime. This updates these to use the dependencies as used by the project-at-large. (#5518)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 26 Mar 2025 10:24:31 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improves the AWS Lambda processor&#39;s memory usage by creating fewer byte arrays when handling the response from the Lambda function. This uses the existing InputStream from SdkBytes. It also converts the &#34;null&#34; string to UTF-8 once to perform byte[] comparison on the response. (#5548)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 26 Mar 2025 09:31:39 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improves the AWS Lambda processor&#39;s memory usage by creating fewer byte arrays when creating the request for the Lambda function. This uses the &#34;unsafe&#34; methods on SdkBytes. However, these are fine here because the byte[] is not accessible anywhere else for modification. This additionally adds some new unit tests to verify the actual behavior of the InMemoryBuffer as well. (#5547)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 26 Mar 2025 09:31:20 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes an issue where @SingleThread-annotated processors are called multiple times. The recent addition of the PipelineRunner was getting the full list of processors from the Pipeline. This includes multiple instances of processors which caused them to be invoked multiple times. The solution is to use the list of Processors provided to any given PipelineRunnerImpl instance. For now, this also disables the support for SupportsPipelineRunner buffers in order to get the fix out now. Additionally, this improves the timing of the Connected_SingleExtraSinkIT test since this appears to be flaky locally for me. (#5545)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 25 Mar 2025 11:11:36 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add circuit breaker support for lambda processor (#5540)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 25 Mar 2025 10:47:51 -0700
    
    
    * Add circuit breaker support for lambda processor
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __ENH: use default credentials for aws glue registry in kafka source (#5537)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 24 Mar 2025 12:51:55 -0500
    
    
    * ENH: use default credentials for aws glue
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix for Issue 5531 (#5532)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 21 Mar 2025 09:53:28 -0700
    
    
    * Fix for Issue 5531
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added unit test
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add support for generating Standard(OTEL) conformant events in DataPrepper (#5524)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 19 Mar 2025 17:24:51 -0700
    
    
    * Add support for generating Standard(OTEL) conformant events in DataPrepper
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __FIX: data type of type in actions (#5533)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 19 Mar 2025 11:10:02 -0500
    
    
    * FIX: data type of type in actions
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Allow setting non-standard AWS Glue Registry endpoints for testing (#5502)__

    [Shane Schisler](mailto:seschis@users.noreply.github.com) - Tue, 18 Mar 2025 12:49:29 -0700
    
    
    Change set allows using the kafka.schema.registry_url setting to set 
    non-standard endpoints when using a mock or fake AWS glue registry
    (#5377).
    
    Signed-off-by: Shane Schisler &lt;shane@schisler.net&gt; Co-authored-by: Shane
    Schisler &lt;shane@schisler.net&gt;

* __Add bucket_owner option to S3 DLQ (#5519)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 18 Mar 2025 12:56:34 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __FIX: invalid Jakarta annotation on enum type in ActionConfiguration (#5528)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 18 Mar 2025 11:07:46 -0500
    
    
    * FIX: invalid Jakarta annotation on enum type
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    

* __FIX: invalid Jakarta annotation on enum type in ActionConfiguration (#5528)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 18 Mar 2025 11:06:19 -0500
    
    
    * FIX: invalid Jakarta annotation on enum type
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix lambda plugin threshold and flaky test (#5523)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Fri, 14 Mar 2025 20:32:01 -0700
    
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Add option to process only metadata of objects in S3 scan mode (#5470)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 14 Mar 2025 11:58:23 -0700
    
    
    Add option to process only metadata of objects in S3 scan mode
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __one more additional metric added (#5520)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 12 Mar 2025 14:43:34 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add OTEL standard classes for Logs, Traces and Metrics (#5508)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 12 Mar 2025 11:41:16 -0700
    
    
    * Jackson Log/Metric/Span classes for OTEL standard specification compliant
    implementation
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added tests
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed failing tests. Addressed comments
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Enh/support default credentials in dynamic transformation (#5516)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 12 Mar 2025 11:31:28 -0500
    
    
    * ENH: support default credentials in dynamic transformation
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fixes for metrics in Rds Source (#5514)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 11 Mar 2025 20:23:18 -0500
    
    
    * Fix metrics
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add NOISY marker to event processing error messages
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Jira metrics fix (#5513)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 11 Mar 2025 10:46:09 -0700
    
    
    * additional metrics added for failure cases
    
    ---------
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __typo fix to correct the timezone issue (#5511)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 10 Mar 2025 07:25:15 -0700
    
    
    

* __Pipeline Runner Implementation and Tests (#5435)__

    [Mohammed Aghil Puthiyottil](mailto:57040494+MohammedAghil@users.noreply.github.com) - Sun, 9 Mar 2025 14:09:12 -0700
    
    
    * Pipeline Runner Implementation, ProcessWorker Refactoring and tests
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Modified ProcessWorker constructor to use pipeline runner and fixed tests
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Modified AggregateProcessorITWithAcks tests to use pipeline runner
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Increased test timeout for AggregateProcessorITWithAcks
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Added copyright header to PipelineRunner
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;

* __Adding array data types for rds (#5497)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Fri, 7 Mar 2025 16:31:40 -0600
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Adding array data types for rds

* __Confluece Search API timezone fix (#5500)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 6 Mar 2025 11:10:41 -0800
    
    
    * Adding crawler logic to apply pollingTimezoneOffset in seconds
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __FIX: sts headers override in AWS secret extension (#5506)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 5 Mar 2025 18:15:36 -0600
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Give up partition when there is no Ack (#5499)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 4 Mar 2025 18:36:39 -0600
    
    
    * Give up partition when there is no Ack
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update No Ack parition timeout to 15 mins
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add table filters in Rds source configuration (#5494)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 4 Mar 2025 15:14:23 -0600
    
    
    * Add table filters and refactor schema manager methods
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update tests
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Check included tables during stream processing
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix a few issues from tests
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add @SingleThread annotation to dissect processor (#5463)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 4 Mar 2025 12:15:40 -0800
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix/opensearch action validation (#5496)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 4 Mar 2025 12:56:57 -0600
    
    
    * FIX: opensearch action validation
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix lambda processor batching (#5474)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Mon, 3 Mar 2025 12:03:48 -0800
    
    
    * Fix lambda plugin batching
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Remove timebased threshold check
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Fix secrets rotation handling in Rds source (#5465)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 28 Feb 2025 15:55:13 -0600
    
    
    * Fix secrets rotation handling
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update message types
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add support for Scope metrics (#5471)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 28 Feb 2025 11:33:29 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Handle Mongo Binary data type when subtype is UUID_STANDARD (value 4). (#5472)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 28 Feb 2025 12:13:33 -0600
    
    
    * Handle Mongo Binary data type when subtype is UUID_STANDARD (value 4).
    
    Current Behavior:
    - UUID values are not properly encoded when constructing queries
    - Results in incorrect query conditions for UUID_STANDARD binary types
    - Affects document retrieval when querying by UUID fields
    
    Root Cause:
    - Binary type 4 (UUID_STANDARD) requires special handling
    - Current code doesn&#39;t convert UUID to proper 16-byte format
    - Missing base64 encoding step for UUID binary values
    
    Fix:
    - Add proper UUID to binary conversion
    - Implement base64 encoding for UUID values
    - Update query construction logic
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add unit test for non UUID case
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * use constant for UUID_STANDARD
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Only add s3 object to be deleted if optional is present for sqs message (#5469)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 27 Feb 2025 15:15:49 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __S3-Source Bug Fix: Handle null object size for non S3-Create Events (#5449)__

    [Jeremy Michael](mailto:60355474+jmsusanto@users.noreply.github.com) - Wed, 26 Feb 2025 14:42:11 -0600
    
    
    Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;

* __Update otel proto buf specification (#5434)__

    [Tomas](mailto:longo.tomas@googlemail.com) - Wed, 26 Feb 2025 12:14:49 -0800
    
    
    * Update otel proto buf specification
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Remove todos
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * remove last remnants of instrumentation library
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    * Just test the new otel proto buf spec in the e2e raw span test
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt;
    
    ---------
    
    Signed-off-by: Tomas Longo &lt;tomas.longo@sap.com&gt; Co-authored-by: Tomas Longo
    &lt;tomas.longo@sap.com&gt;

* __Extracting Confluence page history (#5456)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 26 Feb 2025 12:08:02 -0800
    
    
    * Extracting page history
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __ENH: improve regex validaiton message (#5447)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 26 Feb 2025 12:57:05 -0600
    
    
    * ENH: improve regex validaiton message
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Adding enum and range datatype support for postgres (#5458)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Wed, 26 Feb 2025 11:26:16 -0600
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Adding enum and range datatype support for postgres
    
    Adding enum and range datatype support for postgres
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Adding enum and range datatype support for postgres
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Adding enum and range datatype support for postgres
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Adding enum and range datatype support for postgres
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Adding enum and range datatype support for postgres

* __ENH: error message in pipeline and plugin deserialization (#5459)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 25 Feb 2025 11:45:06 -0600
    
    
    * INIT: better error handling
    * FIX: DefaultPluginFactoryIT
    * FIX: PipelineTransformerTests
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Few improvements to Rds Source (#5453)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 24 Feb 2025 21:14:20 -0600
    
    
    * Fix update message parsing
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update rds source config
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix a check on reader instance
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Clean up during shutdown
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit tests
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Refactor replication slot cleanup code
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Modify the exception handling to be more descriptive when stream is not available. (#5457)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Mon, 24 Feb 2025 17:34:02 -0800
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt; Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Migrate OpenSearchSink off of plugin Settings (#5273)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Mon, 24 Feb 2025 09:48:23 -0800
    
    
    * restruction OpenSearchSinkConfiguration to use openSearchSinkConfig instead
    of PluginSettings.  Rebuild readConnectionConfiguration
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * rebuild readIndexConfig and associated changes
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * rebuild readRetryConfig.  Remove most instances of PluginSetting from
    OpenSearchSink.  Remove commented out code
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * save point
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Rework OpenSearchSinkConfigurationTests.java
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Rework RetryConfigurationTests.java
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * small changes
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * small changes
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * condense many test yaml files into one
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Rework ConnectionConfigurationTests.java
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Rework IndexConfigurationTests.java.java
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * copy files over from source
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * adjust all unit tests
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * spotless check
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Integration tests to OpenSearchSinkConfig from PluginSetting
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * build.gradle change?
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove hosts in integration test metadata
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * changing enforcement for required and non required fields
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * reset awsauthconfig to normal
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * replace authentication field from unit tests
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * document_id_field to document_id since deprecated
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * replace pluginSetting dependent parts of integration tests
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * pipeline name missing from integration tests
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * find what is null
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * initialize pipelineDescription Mock
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * initialize pluginSetting Mock
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * add pluginSetting name mock
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * me when I see stack trace
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * revert bulk retry strat
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * revert reversion
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * pipelineValue has to be null for documents to write.  Originally pipeline is
    always null because indexconfiguration pipelien value was always null
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * unit test update
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Integration test changes
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * integration test adjustments
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove Routing Field since its not in documentation
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove routing field integration test
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * integration test adjustment :/
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * fix invalidactions integration test
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * addressing various pr comments
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * action type as enum
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * indexconfiguration constants to opensearchsinkconfig
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * readd deprecated fields
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * fix integration tests to reuse deprecatd routing field and document id field
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * action to enum integratin test fixes
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * string should be fine for integration test
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * enum string check
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * fix enum string check
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * document id field should have testIdField as value in Integration Tests
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * integraton tests should pass now
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Connection configuration switched back to using metadata
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * yaml lines not needed conncection configuraion tests switched back to
    metadata approach
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * style fix
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * assert True issue
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * put routing field test back
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * add license header to new files
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * move build.gradle changes to data-prepper-plugins/opensearch/build.gradle
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * update actions artifacts version for integration tests
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * fixed new test
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * FailedbulkOperationConveter takes the same input twice
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * readd a routing field test
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove refernces to invalid authentication configuration
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * we want to support authentication: username: password: config
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * use itnerface instead of implementation
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt; Signed-off-by: Maxwell Brown
    &lt;55033421+Galactus22625@users.noreply.github.com&gt;

* __additional validations based on the validation service checks instead of plugin service check (#5454)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 21 Feb 2025 12:42:00 -0800
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Confluence oauth2 pagination fix (#5451)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 20 Feb 2025 21:06:28 -0800
    
    
    * while paginating in OAuth2 mode, we should continue to use OAuth2 specific
    host name
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __Update aws sdk to latest version (#5450)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 20 Feb 2025 14:05:23 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Thread.sleep replaced with await() (#5445)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 20 Feb 2025 08:44:03 -0800
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Jira reuse atlassian commons module (#5441)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Wed, 19 Feb 2025 13:20:59 -0800
    
    
    * jira making use of atlassian commons
    
    * Making OAuth2 flow work for both Confluence and Jira
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    

* __Data type mapping for postgres export (#5438)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Wed, 19 Feb 2025 10:02:43 -0600
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Data type mapping for postgres export
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    Data type mapping for postgres export
    
    Data type mapping for postgres export

* __Confluence pagination handling (#5440)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 18 Feb 2025 16:21:29 -0800
    
    
    * pagination handling
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * adding option to pass batch size for the source coordinator partition
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * renaming the constant
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * review comments
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Upgrade opensearch-java client to latest 2.20.0 version. (#5426)__

    [Rishikesh](mailto:62345295+Rishikesh1159@users.noreply.github.com) - Tue, 18 Feb 2025 14:50:37 -0600
    
    
    Signed-off-by: Rishikesh1159 &lt;rishireddy1159@gmail.com&gt;

* __Deal with Control Characters in DynamoDB (#5437)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Tue, 18 Feb 2025 10:08:57 -0800
    
    
    * Deal with Control Characters in DynamoDB
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    

* __Postgres schema name fix (#5432)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 14 Feb 2025 10:35:14 -0600
    
    
    * Handle postgres schema name
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove an empty file
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix missing column types
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add NOISY marker to opensearch sink failure logs (#5436)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Thu, 13 Feb 2025 14:53:28 -0800
    
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Add support to increase acknowledgment expiry and use in progress check for Dynamo source (#5428)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 13 Feb 2025 14:34:31 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __migrate Blocking Buffer and StdInSource configurations off of plugin setting (#5317)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Thu, 13 Feb 2025 10:55:31 -0800
    
    
    migrate Blocking Buffer configuration off of plugin setting
    Migrate
    StdInSource configuration off of pluginSetting
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __Postgres data type mapping in stream processing (#5410)__

    [Divyansh Bokadia](mailto:dbokadia@amazon.com) - Wed, 12 Feb 2025 15:07:15 -0600
    
    
    * Add more tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Data type mapping for postgres stream
     Data type mapping for postgres
     Data type mapping for postgres stream
     Data type mapping for postgres stream
     Data type mapping for postgres stream
     Data type mapping for postgres stream
     Data type mapping for postgres stream
     Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    * Data type mapping for postgres stream
     Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    Signed-off-by: Divyansh Bokadia
    &lt;dbokadia@amazon.com&gt;
    Co-authored-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add  OTEL protobuf decoder (#5421)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 12 Feb 2025 11:25:47 -0800
    
    
    * Add  OTEL protobuf decoder
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Confluence as source plugin (#5404)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 11 Feb 2025 12:18:26 -0800
    
    
    * confluence source
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * matching config structure to be more inline for Confluence
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Functional confluence version
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Saving page content as text
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * injectable plugin metrics
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Introduced atlassian common module
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * functional with making use of Atlassian Commons package
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * test cases in a running state
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * atlassian commons gradle file
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * moved the test to the atlassian commons
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional code coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better names
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better naming
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * making a default implementation
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * validating page type filter
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * fixed failing tests
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * using InvalidPluginConfigurationException instead of BadRequestException
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add stateful buffer for lambda sink (#5354)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Mon, 10 Feb 2025 17:45:22 -0800
    
    
    * Fix merge conflict
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address concurrency/synchronization comment
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Fix InMemoryBufferSynchronized and Add IT
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address timeout threshold comment
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Add IT for timeout threshold
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Fix checkstyle
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Zero Buffer Implementation and Tests (#5416)__

    [Mohammed Aghil Puthiyottil](mailto:57040494+MohammedAghil@users.noreply.github.com) - Fri, 7 Feb 2025 17:16:27 -0800
    
    
    * Zero Buffer Implementation and Tests
     Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Moved ZeroBuffer Implementation into data-prepper-core and addressed comments
    
     Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    * Modified ZeroBufferTests to use MockitoExtension and addressed comments
     Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Mohammed Aghil Puthiyottil
    &lt;57040494+MohammedAghil@users.noreply.github.com&gt;

* __Set the JVM file encoding to UTF-8. Resolves #5238. (#5420)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 7 Feb 2025 12:23:15 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add max_receive_count configuration option in S3-SQS source to delete messages that have been received many times (#5408)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 7 Feb 2025 10:47:12 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support export from postgres (#5414)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 7 Feb 2025 10:41:42 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __SQS Source: Add on_error Config, Multi-Region Support, and sqsMessageDelayTimer Metric for Auto-Scaling (#5409)__

    [Jeremy Michael](mailto:60355474+jmsusanto@users.noreply.github.com) - Thu, 6 Feb 2025 12:42:34 -0600
    
    
    Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;

* __Moves asifsmohammed to the Emeritus section. We previously removed him from the CODEOWNERS, so this keeps these in sync. (#5419)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 6 Feb 2025 06:43:35 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the Dockerfile to use non-legacy syntax for environment variables. (#5417)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 5 Feb 2025 15:33:01 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add cloudwatch logs sink (#5406)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 5 Feb 2025 15:28:47 -0800
    
    
    * Add cloudwatch logs sink
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add e2e ack, checkpointing and metrics to Postgres stream processing (#5375)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 4 Feb 2025 11:58:01 -0600
    
    
    * Initial commit
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add more metrics
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add more tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __schema revisions, add json aliases (#5349)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 3 Feb 2025 14:22:23 -0600
    
    
    * schema revisions, add json aliases
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Implementation of sqs-common plugin and refactored sqs and s3 source (#5361)__

    [Jeremy Michael](mailto:60355474+jmsusanto@users.noreply.github.com) - Fri, 31 Jan 2025 16:20:04 -0800
    
    
    * initial refactoring
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * refactored sqs-source to use sqs-common
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * refactored SqsWorker to use the common library
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * minor changes
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * another small fix
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * added unit tests for sqs-common
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * updated tests
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    ---------
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    Co-authored-by: Jeremy
    Michael &lt;jsusanto@amazon.com&gt;

* __Fixed javadoc errors (#5379)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 31 Jan 2025 13:25:13 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Plugin metrics injection (#5372)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 31 Jan 2025 12:15:40 -0800
    
    
    * injectable plugin metrics
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * removed an unused parameter
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * fixing a flaky test
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Improve Jira logging (#5351)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Thu, 30 Jan 2025 11:44:34 -0800
    
    
    Improve Jira logging
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __Change Kafka Buffer defaults for fetch.max.wait.ms, fetch.min.bytes, partition.assignment.strategy, close consumer on shutdown (#5373)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 30 Jan 2025 12:33:22 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix postgres stream (#5367)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 29 Jan 2025 11:12:05 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __lambda processor should retry for certain class of exceptions (#5320)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 28 Jan 2025 21:16:41 -0800
    
    
    * lambda processor should retry for certain class of exceptions
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address Comment on complete codec
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Add retryCondidition to lambda Client
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments and add UT and IT
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comment on completeCodec
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Add debug logs for Kafka consumer (#5369)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 28 Jan 2025 18:05:57 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Disable flaky tests fow now (#5366)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 28 Jan 2025 12:20:36 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __disabling caffine cache instead of setting the max to 1 (#5362)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 27 Jan 2025 19:07:51 -0800
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Fixing a flaky test (#5365)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 27 Jan 2025 17:44:50 -0800
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Check pointing Leader Scheduler State (#5352)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 27 Jan 2025 16:34:53 -0800
    
    
    * Handling end to end acknowledgement
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * checking pointing leader state for every one minute
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * corresponding test cases fix
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Initial PR for stream support for Postgres in Rds source (#5310)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 27 Jan 2025 17:03:45 -0600
    
    
    * First working version
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * More progress and update existing unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove and rename classes
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove test code
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address minor issues
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Group MySQL and Postgres stream states
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address more comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix Java21 build
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Implement delete_s3_objects_on_read for S3-SQS source (#5358)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 27 Jan 2025 13:23:12 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __add batch size field for jira source (#5348)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Thu, 23 Jan 2025 13:53:19 -0800
    
    
    * add batch size field for jira source
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove unused config fields
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * add interface function to simplify batchSize code
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * default batch size comments
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    ---------
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    Signed-off-by: Maxwell
    Brown &lt;55033421+Galactus22625@users.noreply.github.com&gt;

* __Handling end to end acknowledgement in Jira Source (#5344)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 23 Jan 2025 10:54:46 -0800
    
    
    * Handling end to end acknowledgement
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * introduced boolean to control end to end Acknowledgment
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    
    * acknowledgments on case
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Fixed kinesis retrieval config argument passing to KCL scheduler (#5272)__

    [Rashmi](mailto:rashmi.ramanathan@freshworks.com) - Tue, 21 Jan 2025 13:00:58 -0800
    
    
    Signed-off-by: RashmiRam &lt;ras.xena@gmail.com&gt;

* __Refreshing AWS Secret values on demand (#5347)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 21 Jan 2025 12:48:50 -0800
    
    
    * refreshing the values on demand
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * refreshing only for the forbidden or unauthorized error casea and additional
    test cases to cover those scenarios
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Welcoming Srikanth Govindarajan (srikanthjg) to the Data Prepper maintainers. (#5337)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 21 Jan 2025 12:10:30 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update renewed Jira refresh token back to the secrets store (#5324)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 17 Jan 2025 11:00:54 -0800
    
    
    * Introduced PluginConfigVariable interaface to provide ability for the plugins
    to get access to their underlying aws secrets store member to be able to update
    if needed
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * renewed access token and refresh tokens are now updated back in the secrets
    store
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better naming
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * fixing the test cases based on the new PluginConfigVariable attribute used
    for refreshToken
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * improving the coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Keeping the existing values in the secret. Just updating an existing key
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Allowing secrets manager update without a key and also some additional test
    coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * isUpdatable boolean is introduced and its corresponding tests
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * implementing newly added method
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * switching PluginConfigVariable from refreshToken to accessToken
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Only the master node is responsible for Token refresh
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Added addition parameter in the API to accept the secrets version to set that
    helps with enforcing idempotency while updating the secret store multiple times
    
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better naming
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * removing setting a versionId for idempotency
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * removed constructor argument to PluginConfigVariable
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Support null values (#5342)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 16 Jan 2025 22:07:41 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __github actions/ artifacts v3 to v4 (#5339)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Thu, 16 Jan 2025 13:55:32 -0600
    
    
    * github actions/ artifacts v3 to v4
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * update artifacts for opensearch sink tests and gradle.yml
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    ---------
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __Welcoming Santhosh Gandhe (san81) to the Data Prepper maintainers. (#5329)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Jan 2025 17:01:02 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Report SQS message delay immediately after message is received, and as 0 when there are no messages found in queue (#5333)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 15 Jan 2025 17:17:05 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Minor fix to the formatting of the license header. (#5334)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Jan 2025 15:14:27 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __sqs source: json codec support to split sqs message into multiple events (#5330)__

    [Jeremy Michael](mailto:60355474+jmsusanto@users.noreply.github.com) - Wed, 15 Jan 2025 13:06:21 -0800
    
    
    * added json codec support and functionality to split message into multiple
    events
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * Added message strategy and improved metadata handler efficiency
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * updated license
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * minor changes
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    ---------
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    Co-authored-by: Jeremy
    Michael &lt;jsusanto@amazon.com&gt;

* __Introduces the experimental plugin feature (#5318)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Jan 2025 09:27:35 -0800
    
    
    Introduces the experimental plugin feature, allowing plugin developers to mark
    plugins as experimental.
     This PR adds a new annotation @Experimental which can be applied to plugin
    types. When loading plugins, the plugin framework will now check whether the
    plugin is experimental or not. If the plugin is experimental, Data Prepper will
    fail if experimental plugins are not enabled. This PR also adds a new
    configuration in data-prepper-config.yaml to enable all experimental plugins if
    they are desired.
     Additionally, I refactored the code that logs deprecated plugin names into a
    consumer to help the overall code structure and fit the code design I took for
    checking for experimental plugins.
     Resolves #2695
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Do not filter out objects based on last modified timestamp when delete_objects_on_read is enabled (#5319)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 15 Jan 2025 10:18:11 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds a merge function on the Event interface. This will merge in all the fields from another Event into the current event. Contributes toward #5312. (#5316)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Jan 2025 07:31:20 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add sleep time before checking (#5323)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 14 Jan 2025 23:33:34 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __FIX: include route validation error into collector (#5332)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 14 Jan 2025 14:51:57 -0600
    
    
    * MAINT: include route validation error into collector
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Support cross account DynamoDB tables for streams. (#4776)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Jan 2025 10:35:50 -0800
    
    
    Update requests to DynamoDB to provide the table ARN instead of the table name.
    This allows Data Prepper to use the new cross-account and resource policy
    changes available in DynamoDB.
     Resolves #4424
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __[Docker] Do not run container as root (#5314)__

    [Jan Høydahl](mailto:jh@cominvent.com) - Tue, 14 Jan 2025 08:26:37 -0800
    
    
    [Docker] Do not run container as root
     Fixes #5311
     Signed-off-by: Jan Høydahl &lt;janhoy@users.noreply.github.com&gt;

* __Setting &#39;insecure&#39; overrides &#39;certPath&#39; (#5268)__

    [Jan Høydahl](mailto:jh@cominvent.com) - Fri, 10 Jan 2025 06:32:27 -0800
    
    
    Signed-off-by: Jan Høydahl &lt;janhoy@users.noreply.github.com&gt;

* __Remove NOISY log from Mongo StreamAcknowledgementManager (#5321)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 9 Jan 2025 17:03:29 -0800
    
    
    Remove NOISY log from Mongo StreamAcknowledgementManager. We have metric to
    capture when this condition occurs, so removing logs as they are noisy
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __SQS source plugin implementation (#5274)__

    [Jeremy Michael](mailto:60355474+jmsusanto@users.noreply.github.com) - Thu, 9 Jan 2025 14:21:30 -0800
    
    
    * initial poc of new sqs-source plugin
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * modified README
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * Changed parser to format described in issue
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * Renamed sqs-source-new to sqs-source and removed deprecated sqs-source
    implementation
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * Update README.md
     Signed-off-by: Jeremy Michael &lt;60355474+jmsusanto@users.noreply.github.com&gt;
    
    * Update README.md
     Signed-off-by: Jeremy Michael &lt;60355474+jmsusanto@users.noreply.github.com&gt;
    
    * Add queueUrl and sentTimestamp metadata to SQS events
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * Assign individual BufferAccumulators to each SQS worker
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * added unit tests and addressed comments in design doc
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * added additional unit tests
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * Fix region loading check
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * addressed PR comments
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * addressed PR comments - modified Buffer and parser implementation
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * added copyright headers to tests and updated metadata naming
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    * some cleanup and converted all metadata to lowerCamelCase
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    
    ---------
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;
    Signed-off-by: Jeremy
    Michael &lt;60355474+jmsusanto@users.noreply.github.com&gt;
    Co-authored-by: Jeremy
    Michael &lt;jsusanto@amazon.com&gt;

* __Bump org.apache.maven:maven-artifact in /data-prepper-plugins/opensearch (#4894)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 13:35:07 -0800
    
    
    Bumps [org.apache.maven:maven-artifact](https://github.com/apache/maven) from
    3.9.8 to 3.9.9.
    - [Release notes](https://github.com/apache/maven/releases)
    - [Commits](https://github.com/apache/maven/compare/maven-3.9.8...maven-3.9.9)
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#5285)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 11:36:33 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.0.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-trace-source (#5287)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 11:36:17 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.0.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-logs-source (#5289)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 11:35:42 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.0.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#5294)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 11:34:35 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.23.1 to 2.24.3.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.23.1...rel/2.24.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.wiremock:wiremock in /data-prepper-plugins/s3-source (#5236)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:54:30 -0800
    
    
    Bumps [org.wiremock:wiremock](https://github.com/wiremock/wiremock) from 3.8.0
    to 3.10.0.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.8.0...3.10.0)
    
    ---
    updated-dependencies:
    - dependency-name: org.wiremock:wiremock
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-proto-common (#5286)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:53:51 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.0.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#5295)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:51:57 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.17 to 1.15.11.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.17...byte-buddy-1.15.11)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.curator:curator-test (#5163)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:47:11 -0800
    
    
    Bumps [org.apache.curator:curator-test](https://github.com/apache/curator) from
    5.5.0 to 5.7.1.
    -
    [Commits](https://github.com/apache/curator/compare/apache-curator-5.5.0...apache-curator-5.7.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.curator:curator-test
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-sink (#5001)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:45:42 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.7
    to 2.13.0.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.7...v2.13.0)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-source (#5006)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:45:29 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.7
    to 2.13.0.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.7...v2.13.0)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump werkzeug in /examples/trace-analytics-sample-app/sample-app (#5115)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:44:59 -0800
    
    
    Bumps [werkzeug](https://github.com/pallets/werkzeug) from 3.0.3 to 3.0.6.
    - [Release notes](https://github.com/pallets/werkzeug/releases)
    - [Changelog](https://github.com/pallets/werkzeug/blob/main/CHANGES.rst)
    - [Commits](https://github.com/pallets/werkzeug/compare/3.0.3...3.0.6)
    
    ---
    updated-dependencies:
    - dependency-name: werkzeug
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/http-source (#5298)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:31:10 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.0.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.hibernate.validator:hibernate-validator (#5300)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:29:10 -0800
    
    
    Bumps
    [org.hibernate.validator:hibernate-validator](https://github.com/hibernate/hibernate-validator)
    from 8.0.1.Final to 8.0.2.Final.
    -
    [Changelog](https://github.com/hibernate/hibernate-validator/blob/8.0.2.Final/changelog.txt)
    
    -
    [Commits](https://github.com/hibernate/hibernate-validator/compare/8.0.1.Final...8.0.2.Final)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.hibernate.validator:hibernate-validator
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.hibernate.validator:hibernate-validator (#5301)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:28:47 -0800
    
    
    Bumps
    [org.hibernate.validator:hibernate-validator](https://github.com/hibernate/hibernate-validator)
    from 8.0.1.Final to 8.0.2.Final.
    -
    [Changelog](https://github.com/hibernate/hibernate-validator/blob/8.0.2.Final/changelog.txt)
    
    -
    [Commits](https://github.com/hibernate/hibernate-validator/compare/8.0.1.Final...8.0.2.Final)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.hibernate.validator:hibernate-validator
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#5302)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:28:18 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.3 to 3.27.0.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.3...assertj-build-3.27.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.commons:commons-text (#5303)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 9 Jan 2025 10:27:39 -0800
    
    
    Bumps org.apache.commons:commons-text from 1.11.0 to 1.13.0.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.commons:commons-text
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Jira Source Configuration and Filter Changes and add license headers (#5306)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Wed, 8 Jan 2025 16:38:23 -0800
    
    
    * jira yaml changes and tests, authentication and hosts
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * filter config file changes
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * jira filter config changes and implementation
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * filter change test corrections
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * project name -&gt; key for now
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * removed unfishished function
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * address pr comments
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Add license headers to all jira source files
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    ---------
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __Remove code tags from processor names, fill in default values (#5278)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 7 Jan 2025 10:22:21 -0600
    
    
    * remove code tags from processor names in descriptions, add missing default
    values
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Add new metrics for tracking bytes received and processed by KDS (#5237)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Mon, 6 Jan 2025 10:10:12 -0800
    
    
    * Add new metrics for tracking bytes received and processed by KDS
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address review comments.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Modify the code as per comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Add acknowledgement support to aggregate processor (#5139)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 20 Dec 2024 09:17:53 -0800
    
    efs/remotes/origin/neptune-work-in-progress
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments and added tests
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle errors
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed test errors by adding await
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed unnecessary API
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle error
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Update expiration time based on ttl on the source coordinator item. (#5262)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 17 Dec 2024 10:10:05 -0800
    
    
    * Update expiration time based on ttl on the source coordinator item.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Fix the tests for supporting expiration time
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Fix failing data-prepper-expression code coverage verfication (#5265)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 13 Dec 2024 16:13:25 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Add metrics to stream acknowledgement manager (#5256)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Fri, 13 Dec 2024 11:40:41 -0800
    
    
    * Add metrics to stream acknowledgement manager
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Fix the unit test failure
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Fix checkstyle
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Schema revisions (#5260)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Fri, 13 Dec 2024 11:47:18 -0600
    
    
    * fix schemas
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Fix null pointer exception during exception evaluation (#5217)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Fri, 13 Dec 2024 06:56:01 -0800
    
    
    Fix null pointer exception during exception evaluation
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Updates the Data Prepper 2.10.2 release notes. (#5257)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 12 Dec 2024 09:50:13 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __otel trace source and otel metrics source test coverage (#5242)__

    [Jeremy Michael](mailto:60355474+jmsusanto@users.noreply.github.com) - Wed, 11 Dec 2024 14:21:56 -0800
    
    
    Added security/authentication tests for OtelTraceSource and OTelMetricsSource
    authentication
     Signed-off-by: Jeremy Michael &lt;jsusanto@amazon.com&gt;

* __Http source otel logs source test coverage (#5241)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Wed, 11 Dec 2024 12:46:53 -0800
    
    
    http source additional tests
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __Add a github workflow action for running Kinesis integration tests (#5020)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 10 Dec 2024 13:19:06 -0800
    
    
    Co-authored-by: Souvik Bose &lt;souvbose@amazon.com&gt;

* __Kds stream api changes (#5239)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 10 Dec 2024 12:40:22 -0800
    
    
    * Change API to use DescribeStreamSummary
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Code changes
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Rename the class.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __MAINT: resolve CVEs by bumping up jest (#5250)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 10 Dec 2024 14:13:48 -0600
    
    
    * MAINT: resolve CVEs by bumping up jest
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Release notes for 2.10.2 (#5252)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 10 Dec 2024 09:55:16 -0800
    
    
    * Release notes for 2.10.2
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Release notes for 2.10.2 (#5251)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 9 Dec 2024 14:55:03 -0800
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Set tinyInt1isBit to false (#5214)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 5 Dec 2024 18:53:23 -0600
    
    
    

* __Fix CVE vurnerability (#5244)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Thu, 5 Dec 2024 13:48:12 -0800
    
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __some fixes to jira source (#5203)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Wed, 4 Dec 2024 14:19:48 -0800
    
    
    * prevent polling when there is already a leader scheduler
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * verify internet address everytime we invoke restapi
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * reparralelize crawler call
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Test fixes and remove unused code
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove unneccessary stubbing
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * jirarestclient test
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Jira Iterator future list tests
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    ---------
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __Add examples and reorder some processor configurations in schemas (#5216)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Wed, 27 Nov 2024 10:30:26 -0800
    
    
    * update schemas according to review
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;
    
    * fix build
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Fix to better handle lambda responses when they are empty or null or not a valid json (#5211)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 21 Nov 2024 18:33:36 -0800
    
    
    * Fix to better handle lambda responses when they are empty or null or not a
    valid json
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * UTs for strict mode response comparison
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Additional UTs for strict mode and aggregate mode
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * removed unused method and better method naming
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * doExecute method testing
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better exception message
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Add IT for aggregate mode cases
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Testing with presence of tags
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Add IT to test behaviour for different lambda responses
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * removed unused imports
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * fix checkstyle
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * fix checkstyle
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    Co-authored-by:
    Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Fix the otel_logs_source server in how it configures authentication to also support the getHttpAuthenticationService() alternative approach. (#5212)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 21 Nov 2024 14:13:15 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix Lambda sink DLQ support (#5207)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Wed, 20 Nov 2024 10:39:16 -0800
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add log for exceptions when processing DynamoDB shards (#5205)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 20 Nov 2024 10:09:34 -0800
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Exception flow clean up and Test cases clean up (#5204)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 19 Nov 2024 19:46:29 -0800
    
    
    * Addressed review comments.
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * logic clean up and additional Test cases. Tests shouldn&#39;t be flaky anymore
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional exception handling
    metrics renaming
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better assertions
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * aligned else blocks to fall into one catch
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * removing concurrency
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * making the mock object local
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    Signed-off-by: Santhosh Gandhe
    &lt;1909520+san81@users.noreply.github.com&gt;
    Co-authored-by: Kondaka
    &lt;krishkdk@amazon.com&gt;

* __Fix lambda metrics (#5201)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Tue, 19 Nov 2024 12:41:20 -0800
    
    
    * Addressed review comments.
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed test cases
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed code coverage error
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __refactored to remove handlers passing (#5202)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 18 Nov 2024 15:48:59 -0800
    
    
    * refactored to remove handlers passing
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * spacing adjusted
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Refactor lambda code to share code between processor and sink (#5196)__

    [Krishna Kondaka](mailto:krishkdk@amazon.com) - Mon, 18 Nov 2024 09:09:44 -0800
    
    
    * Refactor lambda code to share code between processor and sink
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * remove debug statements
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle errors, add new test file
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added copyright headers
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Indentation changes
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * introducing buffer batch
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Code cleanup
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * applied my major refactoring
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Checkstyle cleanup
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * InMemoryBuffer related test
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add multi-threading to integration tests
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    Signed-off-by:
    Kondaka &lt;krishkdk@amazon.com&gt;
    
    * SinkTest fixes
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added metrics support
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * added concurrency limit
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add integ test env option
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    Signed-off-by:
    Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add UT for LambdaClientFactory
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    Signed-off-by:
    Kondaka &lt;krishkdk@amazon.com&gt;
    
    * making use of output codec context
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * null pointer issue fix
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix dlq return value in lambda sink
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * making the event type default
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix failing SinkConfigTest
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add backoff retry and ClientOptions
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed All UTs
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    Signed-off-by:
    Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fix lambda common handler to handle futures correctly
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added new IT to test both lambda and sink
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed unit tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * applied my major refactoring
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * InMemoryBuffer related test
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * SinkTest fixes
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add UT for LambdaClientFactory
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    Signed-off-by:
    Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle errors
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed build error
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed IT build failure
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed IT build failure
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed IT failure
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    Signed-off-by: Santhosh Gandhe
    &lt;1909520+san81@users.noreply.github.com&gt;
    Signed-off-by: Srikanth Govindarajan
    &lt;srigovs@amazon.com&gt;
    Co-authored-by: Santhosh Gandhe &lt;gandheaz@amazon.com&gt;
    
    Co-authored-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Co-authored-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Process resync partitions in RDS source (#5171)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 15 Nov 2024 17:08:19 -0600
    
    
    * Process resync partition
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Cleanup
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix tests after rebase
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Handle MySQL Year data type with value &lt;=1900 and &gt;2155 (#5193)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 15 Nov 2024 14:52:56 -0600
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Handle microseconds in datetime/timestamp and time MySQL data type (#5192)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 15 Nov 2024 11:03:10 -0600
    
    
    * Handle microseconds in datetime/timestamp and time MySQL data type
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * update test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * update test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * update test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add support for MySQL Date/Time/TimeStamp/DateTime date type transformation (#5190)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 15 Nov 2024 07:48:19 -0600
    
    
    * Add support for MySQL Date/Time/TimeStamp/DateTime date type transformation
    to OpenSearch
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Configure BinlogClient to deserialize data and time as long
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add documentation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update documentation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update documentation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update unit test and documentation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update documentation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Handle primary key change events in RDS source (#5186)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 14 Nov 2024 21:10:01 -0600
    
    
    * Handle primary key change events
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Preserve delete and index event order
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix parquet decimal bytes values (#5189)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 14 Nov 2024 16:12:13 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds example annotations to a handful of processors (#5140)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 14 Nov 2024 11:34:33 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add MySQL to OpenSearch Geometry data type transformation (#5187)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 13 Nov 2024 16:54:30 -0600
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Send RetryInfo on OTel Timeouts (#4294)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Wed, 13 Nov 2024 16:11:13 +0100
    
    
    DataPrepper is sending `RESOURCE_EXHAUSTED` gRPC responses
    whenever a buffer
    is full or a circuit breaker is active. These statuses do
    not contain a retry
    info. In the OpenTelemetry protocol, this implies a
    non-retryable error, that
    will lead to message drops, e.g. in the OTel
    collector. To apply proper back
    pressure in these scenarios a retry info is
    added to the status.
     Implementation uses exponential backoff. Idea is to start with a minimum
    
    delay on the first time-out or circuit breaker activation. If the next such
    
    event happens within twice the last delay after the previous event, double
    the
    delay until a maximum delay is reached. Use the maximum delay from
    then on,
    until a sufficiently long period (maximum delay) without an event
    happens.
    Then the delay is reset to minimum.
    
    ---------
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    Signed-off-by: Tomas
    Longo &lt;tomas.longo@sap.com&gt;
    Co-authored-by: David Venable &lt;dlv@amazon.com&gt;

* __Address thread safety for lambda processor and lambda sink (#5181)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 12 Nov 2024 22:25:51 -0800
    
    
    * Address thread safety for lambda processor and additional fixes
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Replace deprecated archivePath (#4979)__

    [Jürgen Walter](mailto:juergen.walter@sap.com) - Tue, 12 Nov 2024 13:04:24 -0800
    
    
    Fix deprecation warning
    
    ```
    The AbstractArchiveTask.archivePath property has been deprecated. This is
    
    scheduled to be removed in Gradle 9.0. Please use the archiveFile property
    
    instead. For more information, please refer to
    
    https://docs.gradle.org/8.8/dsl/org.gradle.api.tasks.bundling.AbstractArchiveTask.html#org.gradle.api.tasks.bundling.AbstractArchiveTask:archivePath
     in the Gradle documentation.
    ```
    
    `.archivePath` has been deprecated and will be removed in Gradle 9.0.
    Use
    `.archiveFile.get().asFile` instead.
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;

* __Updated the readme for opensearch plugin to use date processor in combination with Opensearch sink (#4864)__

    [Akshay Pawar](mailto:akshay070993@gmail.com) - Tue, 12 Nov 2024 12:58:25 -0800
    
    
    * updated the readme for opensearch plugin to use date processor in combination
    with openaearch indices to ingest into indices based on the timestamp from a
    field of the incoming record
     Signed-off-by: Akshay Pawar &lt;akshay070993@gmail.com&gt;
    
    * Signing the DCO for the project. Signed-off-by: Akshay Pawar
    &lt;akshay070993@gmail.com&gt;
     Signed-off-by: Akshay Pawar &lt;akshay070993@gmail.com&gt;
    
    ---------
     Signed-off-by: Akshay Pawar &lt;akshay070993@gmail.com&gt;

* __Support Data type transformation for MySQL export and stream processing (#5179)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 12 Nov 2024 13:20:25 -0600
    
    
    Support Data type transformation for MySQL export and stream processing
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    

* __ENH: introduce primary fields in plugin schemas (#5184)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 12 Nov 2024 10:56:36 -0600
    
    
    * ENH: introduce primary fields into plugin schemas
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __[BUG] The date-processor doesn&#39;t parse times in AM/PM format (#4564)__

    [FedericoBrignola](mailto:160846842+FedericoBrignola@users.noreply.github.com) - Tue, 12 Nov 2024 09:40:08 -0600
    
    
    * Fixed parsing of times in AM/PM format
     Signed-off-by: Federico Brignola
    &lt;160846842+federicobrignola@users.noreply.github.com&gt;
    
    * Fix parsing of time with hours in the format (clock-time-of-day 1-24)
     Signed-off-by: Federico Brignola
    &lt;160846842+FedericoBrignola@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Federico Brignola
    &lt;160846842+federicobrignola@users.noreply.github.com&gt;
    Signed-off-by: Federico
    Brignola &lt;160846842+FedericoBrignola@users.noreply.github.com&gt;

* __Change name of Kinesis source plugin (#5183)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 12 Nov 2024 06:46:23 -0800
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Jira source fixes (#5175)__

    [Maxwell Brown](mailto:55033421+Galactus22625@users.noreply.github.com) - Mon, 11 Nov 2024 20:47:41 -0800
    
    
    * switch logs to trace
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * remove Jira Project Cache (null pointer bug)
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * fix accountUrl with no ending / issue
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * better slash changes handling
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * better logic
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * fix tests
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * Jira Iterator HasNext test
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    ---------
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;

* __replace underscores in plugin names with dashes for correct doc link generation (#5182)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 11 Nov 2024 22:34:37 -0600
    
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Detect cascading actions in RDS source (#5168)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 11 Nov 2024 10:23:19 -0600
    
    
    * Detect cascades
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Dynamic renaming of keys bug fix (#5180)__

    [Divyansh Bokadia](mailto:dbokadia@gmail.com) - Sat, 9 Nov 2024 09:34:15 -0600
    
    
    Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
     Dynamic renaming of keys bug fix
     Co-authored-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Fix PeerForwardingProcessorDecorator to process records locally when exclude identification keys is set (#5178)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 8 Nov 2024 12:44:26 -0800
    
    
    * Fix PeerForwardingProcessorDecorator to process records locally when exclude
    identification keys is set
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Catch all exception during binlog client connect/disconnect (#5176)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 7 Nov 2024 21:16:27 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Pass the pipeline identifier as part of the data prepper config. (#5131)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Wed, 6 Nov 2024 16:58:33 -0800
    
    
    * Pass the pipeline identifier as part of the data prepper config.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address review comments and modify the tests
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __add example annotations (#5170)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 5 Nov 2024 16:58:49 -0600
    
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Example values for rename_keys, split_string, substitute_string, truncate (#5130)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 5 Nov 2024 10:37:07 -0800
    
    
    Adds example values to rename_keys, split_string, substitute_string, and
    truncate processors.
     Co-authored-by: Hai Yan &lt;8153134+oeyh@users.noreply.github.com&gt;
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add examples into processor configs (#5133)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 5 Nov 2024 09:14:07 -0800
    
    
    add examples
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Add MySQL DataType handler to transform datatype value (#5165)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 4 Nov 2024 17:04:54 -0600
    
    
    * Add MySQL data type handler for transformation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add unit test for MySQL DataType handler
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add Set String values and Enum String values to TableMetadata
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update interface
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update TableMetadata constructor
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Use Number datatype for NumericTypeHandler to retain Numeric type
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix Kafka source to override areAcknowlegementsEnabled (#5169)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 4 Nov 2024 12:45:34 -0800
    
    
    Fix Kafka source to override areAcknowlegementsEnabled
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Jira source plugin (#5125)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 4 Nov 2024 07:14:36 -0800
    
    
    Jira source plugin (#5125)
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    Signed-off-by: Maxwell
    Brown &lt;55033421+Galactus22625@users.noreply.github.com&gt;
    Co-authored-by:
    Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    Co-authored-by: Maxwell Brown
    &lt;55033421+Galactus22625@users.noreply.github.com&gt;

* __Addressed review comments (#5108)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 31 Oct 2024 14:32:15 -0700
    
    
    Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Rename the KDS source plugin name to &#34;kinesis-data-streams&#34; (#5138)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 31 Oct 2024 14:26:21 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Add model for table column metadata for Global state (#5136)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 31 Oct 2024 15:27:02 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add getColumnDataTypes method to SchemaManager to get datatype for table columns (#5135)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 31 Oct 2024 14:21:39 -0500
    
    
    Add getColumnDataTypes method to SchemaManager
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    

* __Add external origination time for events created from S3 Object (#5104)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 31 Oct 2024 09:15:00 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Change response_cardinality config for lambda processor to response_events_match (#5132)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Wed, 30 Oct 2024 15:16:22 -0700
    
    
    * Change response_cardinality config for lambda processor to
    response_events_match
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Renames the project to OpenSearch Data Prepper. (#5128)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 30 Oct 2024 10:49:18 -0700
    
    
    This PR updates a few key files to call the project OpenSearch Data Prepper
    over Data Prepper.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support to skip remote peer forwarding based on configuration (#5127)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 30 Oct 2024 10:35:34 -0700
    
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-b72a134e.us-west-2.amazon.com&gt;
    Signed-off-by:
    Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Moved exclude_identification_keys to under peer_forwarder config
     Signed-off-by: Krishna Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-b72a134e.us-west-2.amazon.com&gt;
    Signed-off-by:
    Krishna Kondaka &lt;krishkdk@amazon.com&gt;

* __Support for dynamic renaming of keys (#5074)__

    [Divyansh Bokadia](mailto:dbokadia@gmail.com) - Wed, 30 Oct 2024 07:48:32 -0700
    
    
    Dynamic renaming of keys
     Signed-off-by: Divyansh Bokadia &lt;dbokadia@amazon.com&gt;
    Co-authored-by:
    Divyansh Bokadia &lt;dbokadia@amazon.com&gt;

* __Add index_types for OTEL logs and metrics #3148 (#3929)__

    [Jürgen Walter](mailto:juergen.walter@sap.com) - Wed, 30 Oct 2024 14:00:52 +0100
    
    
    * Add ISM policies for logs and metrics
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Add index templates for logs
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Add index templates for metrics
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Add index_types for OTEL logs and metrics
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Test OpenSearch sink
     works with log-analytics and metric-analytics
    and index type
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Test log and metric index types
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Document log and metrics index_type usage
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Minor: Remove incorrect html tag
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Fix test by adding date_detection false
     Fixes testInstantiateSinkMetricsDefaultMetricSink
     Alertnative would have been to adjust the test
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Rename test
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Fix metric ism file constants
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Rename index template file for metrics
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Add assertions to tests
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Fix index patterns for logs and metrics
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Update to plugins ISM API
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Add assertion
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Revert &#34;Update to plugins ISM API&#34;
     This reverts commit 3fd61af58662bbdd978f05531219880079690c1c.
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Add fields data prepper writes
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Use field type data prepper writes
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    ---------
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;

* __Allow ~ in keys for escaped json pointer characters (#5111)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 29 Oct 2024 17:25:31 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __adding Time module to jackson mapper (#5129)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 29 Oct 2024 14:07:17 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Address Scale Items for lambda plugin (#5032)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Mon, 28 Oct 2024 17:52:27 -0700
    
    
    * Add support for lambda async client in lambda processor
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
     Refactor aws lambda plugin to have a class for common methods between
    processor and sink
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
     Add support for lambda async client in lambda sink
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Changes to Lambda Plugin Integration Test
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Add JsonPropertyDescription to all Config, add debug logs and add ITs
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address Acknowledgements for processor and sink; Add request and response
    codec
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Add response processing mode to processor configuration
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Add Response Handling Strategy; Make InvocationType and ResponseCardinality
    enums; Change reponse_processing_mode option to response_cardinality
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address Enum
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address Enum2
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Fix checkstyle
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Removed the name saas in the file names and package names (#5124)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 28 Oct 2024 15:17:13 -0700
    
    
    * removed the name saas in the file names and package names
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * moved these two classes
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __ENH: conditional required annotation for schema (#5109)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 28 Oct 2024 15:13:45 -0500
    
    
    * MAINT: conditional required schema
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __REF: otel trace group processor config (#5099)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 28 Oct 2024 13:47:27 -0500
    
    
    * REF: new model config
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __SaaS Crawler Module (#5095)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 28 Oct 2024 10:36:49 -0700
    
    
    * Introducing SaaS sources gradle module and SaaS crawler as a common module
    for all of the gradle sources
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * test classes
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Plain empty Jira Source plugin
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Parition Factory Tests
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional tests
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional tests
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * full test coverage for base folder, spotless fixes
     Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    
    * additional tests
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional test coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * addressing review comments and also package name refactoring based on the
    review input
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * more review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * adjusted the log level and removed unwanted log messages
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * small clean ups
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * test case assertion fix
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * step down the log level based on the review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * taking the coverage to 100%
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * module name renamed to source-crawler
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     converting last_poll_time to java Instant type
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     we are now capturing Crawling times
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     ItemInfo long timestamp is now using Instant type
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     Instant conversion
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     code formatting
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     removed long polling by enabling setter on the leader scheduler timer
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     reducing wait times
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Signed-off-by: Maxwell Brown &lt;mxwelwbr@amazon.com&gt;
    Co-authored-by: Maxwell
    Brown &lt;mxwelwbr@amazon.com&gt;

* __Default target types to empty map to avoid NPE (#5120)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 28 Oct 2024 10:34:25 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix enum deserialization for geoip and dissect processors (#5114)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 28 Oct 2024 08:48:08 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add jsonValue check on Enum deserializer, default to checking name() function of enum (#5103)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 25 Oct 2024 11:33:03 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Catch KCL known exceptions to reduce noisy log statements (#5102)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Fri, 25 Oct 2024 09:00:48 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Event with handle (#4952)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 24 Oct 2024 22:53:52 -0700
    
    
    * Add withEventHandle API to Jackson Event builder
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed failing checkstyle tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __FIX: missed exception in plugin error (#4945)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 24 Oct 2024 14:48:26 -0500
    
    
    * FIX: missed exception in plugin error building
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add custom enum deserializer to improve error messaging, improve byte count error mesages (#5076)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 23 Oct 2024 11:33:19 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __ExampleValues annotation for schema generation along with date examples (#5088)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 23 Oct 2024 08:57:26 -0700
    
    
    Introduces ExampleValues annotation for schema and documentation generation.
     Adds a new annotation ExampleValues. Updates the schema generation with an
    InstanceAttributeOverride to add the examples to the schemas. Adds
    ExampleValues to the date processor.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Include Souvik Bose (sb2k16) in the CODEOWNERS file. (#5098)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Oct 2024 14:23:57 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix the lease coordination table permissions (#5097)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 22 Oct 2024 14:23:35 -0700
    
    
    * Fix the lease coordination table permissions
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Add OCSF rule and template for paloalto network traffic logs (#5087)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 22 Oct 2024 08:43:07 -0700
    
    
    * Add OCSF rule and template for paloalto network traffic logs
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add release notes for 2.10 patch release (#5089)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Mon, 21 Oct 2024 15:15:39 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Welcomes Souvik Bose (sb2k16) as a maintainer on the project. (#5092)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 21 Oct 2024 11:45:01 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Modify AcknowledgementSet add API to accept EventHandle instead of Event (#4948)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 21 Oct 2024 11:44:14 -0700
    
    
    * Addressed review comments. Rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed javadoc error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed jacoco coverage failure
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing build
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing build
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Make plugin config injectable (#5078)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 21 Oct 2024 09:29:04 -0700
    
    
    * making plugin config injectable
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * End to End test case for plugin config injectable
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * two additional test cases
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * reorganized test classes to separate out different test plugins
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * better assertions when no injected bean expected in the bean factory
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __ENH: backfill @AlsoRequired annotation to processor attributes (#5086)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 21 Oct 2024 10:03:35 -0500
    
    
    * ENH: backfill alsorequired annotation to processors
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Modify descriptions of processor schemas (#5083)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Fri, 18 Oct 2024 14:39:31 -0500
    
    
    * modify descriptions
    * change copy values description to align with pending documentation update
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Fix AWS Sdk dependency conflict (#5082)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 17 Oct 2024 16:01:03 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Clean up expression error messages (#5079)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 17 Oct 2024 14:47:36 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adding defaultValue to the @JsonProperty for processors. (#5080)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 17 Oct 2024 12:09:52 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __fix build break (#5075)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Wed, 16 Oct 2024 09:30:04 -0700
    
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __fix embed links (#5072)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 15 Oct 2024 22:18:41 -0500
    
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Introducing core package in the data-prepper-core module  (#5056)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 15 Oct 2024 14:48:01 -0700
    
    
    core package introduced in the data-prepper-core module
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add release notes for data prepper release v2.10 (#5061)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 15 Oct 2024 12:23:41 -0700
    
    
    Add release notes for v2.10
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;

* __Schema edits and enhancements (#5062)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 15 Oct 2024 12:37:42 -0500
    
    
    * schema changes according to team review
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Generated THIRD-PARTY file for 8a49dc7 (#5069)__

    [opensearch-trigger-bot[bot]](mailto:98922864+opensearch-trigger-bot[bot]@users.noreply.github.com) - Tue, 15 Oct 2024 09:22:50 -0700
    
    
    Signed-off-by: GitHub &lt;noreply@github.com&gt;
    Co-authored-by: dlvenable
    &lt;dlvenable@users.noreply.github.com&gt;

* __Setting up version number for future releases (#5058)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 15 Oct 2024 08:33:35 -0700
    
    
    Setting up version number for future releases
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add validations on route expressions, clean up assertTrue validation messages (#5060)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 15 Oct 2024 10:09:55 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Improvements to the schema for the key_value processor. (#5051)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 15 Oct 2024 10:09:21 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Json codec changes with specific json input codec config (#5054)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Mon, 14 Oct 2024 20:46:35 -0700
    
    
    * Json codec changes with specific json input codec config
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Modify the tests and address comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Fixed s3 sink config validation (#5063)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 14 Oct 2024 17:12:21 -0700
    
    
    * Fixed s3 sink config validation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added test cases
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add change log for Data prepper 2.10 (#5064)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Mon, 14 Oct 2024 17:08:53 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Rename s3 sink object metadata config options (#5041)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 14 Oct 2024 12:54:49 -0700
    
    
    * Addressed review comments. Introduced a new config, will deprecate the old
    config
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments. Introduced a new config for metadata
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments. Created a separate class for object metadata
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments.
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed indentation
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Improve validation error messages for unknown property and json mapping exceptions (#5044)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 14 Oct 2024 11:06:26 -0700
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __ENH: introduce conditional annotation for schema generation (#4934)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 11 Oct 2024 16:46:58 -0500
    
    
    * ENH: introduce conditional annotation for schema generation
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix the CVE vulnerabilities (#5052)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Fri, 11 Oct 2024 14:20:57 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Bump software.amazon.awssdk:securitylake (#5053)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 11 Oct 2024 14:20:37 -0700
    
    
    Bumps software.amazon.awssdk:securitylake from 2.26.18 to 2.28.20.
    
    ---
    updated-dependencies:
    - dependency-name: software.amazon.awssdk:securitylake
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/s3-source (#5008)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 11 Oct 2024 11:12:45 -0700
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.5 to 1.1.10.7.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.5...v1.1.10.7)
    
    ---
    updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Support otel_logs codec in S3 source (#5028) (#5030)__

    [Daniel Li](mailto:68623003+danhli@users.noreply.github.com) - Fri, 11 Oct 2024 11:07:51 -0700
    
    
    Support otel_logs codec in S3 source (#5028)
     Signed-off-by: Daniel Li &lt;lhouqua@amazon.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/common (#4993)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 11 Oct 2024 10:57:04 -0700
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.5 to 1.1.10.7.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.5...v1.1.10.7)
    
    ---
    updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __add missing spaces in descriptions, reorder fields (#5049)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Fri, 11 Oct 2024 10:50:29 -0700
    
    
    Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Fixes and improvements for AbstractSinkTest (#5021)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 11 Oct 2024 10:14:16 -0700
    
    
    Fixes and improvements for AbstractSinkTest
     Reworked the tests to be somewhat faster. Reworked one flaky test such that it
    appears to be passing consistently now by using finer-grained control on the
    timing. Finished one test by making it actually verify the metrics, which is
    what it was apparently intended to do in the first place.
     Be more lenient on the retry thread state. It may be in the sleep() which is
    ok for the purpose of this test.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __FIX: annotation and documentation gap in processors (#5050)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 11 Oct 2024 10:12:59 -0700
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add support to parse upto certain depth in parse_json processor  (#5040)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 11 Oct 2024 08:54:26 -0700
    
    
    * Add support to parse upto certain depth in parse_json processor (Issue #4695)
    
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add retry to make sure source is not shutdown when exceptions are thrown on the main thread (#5029)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 10 Oct 2024 19:47:40 -0700
    
    
    * Add retry to make sure source is not shutdown when exceptions are thrown on
    the main thread
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __New OpenSearch API source implementation (#5024)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 10 Oct 2024 19:45:54 -0700
    
    
    * Create kinesis-source-integration-tests.yml
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    Signed-off-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;
    
    * Update kinesis-source-integration-tests.yml
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    Signed-off-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;
    
    * OpenSearch API source implementation
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    Signed-off-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;
    
    * Refactoring http source functionality and address comments
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    Signed-off-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;
    
    * Fix the build break
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    Signed-off-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;
    
    * Revert &#34;Create kinesis-source-integration-tests.yml&#34;
     This reverts commit c52f584b61d100935e970ccfd345f6c7d2ddd117.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Fix the code.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Disable the health check endpoint.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Fix checkstyle imports.
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    Signed-off-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose &lt;souvbose@amazon.com&gt;

* __Adding support for compression config per stream. (#5046)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 10 Oct 2024 19:20:41 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Rename convert_entry_type to convert_type and keep the original name as a deprecated name. (#5047)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 10 Oct 2024 21:08:33 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adding Kinesis README (#5048)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 10 Oct 2024 21:08:17 -0500
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Adding ttl_delete parameter to metadata for DynamoDB (#4982)__

    [Lee](mailto:leeroyhannigan@yahoo.ie) - Thu, 10 Oct 2024 15:11:27 -0500
    
    
    Signed-off-by: Lee Hannigan &lt;lhnng@amazon.com&gt;

* __Fix service map tests (#5043)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 10 Oct 2024 12:28:07 -0500
    
    
    

* __Support secret rotation in RDS source (#5016)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 10 Oct 2024 12:04:07 -0500
    
    
    * Add stream worker refresher
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __FIX: mutate string processor configs (#5042)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 10 Oct 2024 09:37:26 -0700
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add NotEmpty annotation to grok match parameter (#5033)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 9 Oct 2024 15:03:34 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __ENH: expose dbPath to be configurable (#5037)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 9 Oct 2024 13:54:25 -0500
    
    
    * ENH: expose dbPath to be configurable
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Adding a metadata attribute for sequence number of record (#5036)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Wed, 9 Oct 2024 11:26:30 -0700
    
    
    * Adding a metadata attribute for sequence number of record
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Add test to check for the metadata
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Documentation improvements for the aggregate processor. (#5035)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 9 Oct 2024 09:28:54 -0700
    
    
    Adds property and class description to configurations. Corrects property order.
    Adds configuration classes with documentation for put_all and remove_duplicates
    which now allows for including these. Corrects use of enums and using
    @JsonValue to have usable documentation on these enums.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix the build break for kinesis source (#5034)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 8 Oct 2024 14:18:12 -0700
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Documentation improvements for a number of Data Prepper processors: Re-ordering properties; adding missing documentation; missed enums. (#5026)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 8 Oct 2024 11:22:50 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Documentation improvements for a number of Data Prepper processors. (#5023)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 7 Oct 2024 13:22:45 -0700
    
    
    Documentation improvements for a number of Data Prepper processors.
     Updates some enumerations used in processors to support the @JsonValue.
    Corrects @JsonClassDescription to use HTML rather than Markdown.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Documentation improvements for a number of Data Prepper processors. (#5025)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 7 Oct 2024 13:17:55 -0700
    
    
    Adds missing enumerations in the key-value processor to support better
    documentation. Corrects @JsonClassDescription to use HTML rather than Markdown.
    This set of changes is for key_value, flatten, translate, parse_json,
    parse_xml, parse_ion, and csv. Also, this adds documentation to the csv input
    codec.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add integration test for Json codec in S3 sink (#4411)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 7 Oct 2024 11:19:00 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Make acknowledgment_timeout configurable for s3 scan source, configure timeout to 10 minutes for MongoDB L2 transform (#4988)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 7 Oct 2024 11:18:13 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Caching implementation of EventKeyFactory (#4843)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 7 Oct 2024 09:01:54 -0700
    
    
    Create a caching implementation of EventKeyFactory that will cache a
    configurable number of EventKeys.
     Refactored the approach to loading the EventKeyFactory in the application
    context for a couple of reasons: 1. Allow for skipping the
    CachingEventKeyFactory if not needed; 2. Help it run better in the
    data-prepper-test-event project.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update the test logging to include the failed assertion to help investigations, especially during CI builds on GitHub Actions. (#4987)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 7 Oct 2024 07:24:46 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Providing an option for the plugins to use Spring DI (#5012)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Fri, 4 Oct 2024 11:40:57 -0700
    
    
    providing an option for the plugins to use Spring DI
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
     Update
    data-prepper-api/src/main/java/org/opensearch/dataprepper/model/annotations/DataPrepperPlugin.java
    
     modified the comment line based on the suggession
     Co-authored-by: David Venable &lt;dlv@amazon.com&gt;
    Signed-off-by: Santhosh Gandhe
    &lt;1909520+san81@users.noreply.github.com&gt;
     Integration test to validate the DI context enabling in plugins
    
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    Co-authored-by: David Venable &lt;dlv@amazon.com&gt;

* __Remove references to deprecated processor names `otel_trace_raw` and `service_map_stateful` (#5017)__

    [Ling Hengqian](mailto:linghengqian@outlook.com) - Thu, 3 Oct 2024 13:32:21 -0700
    
    
    Signed-off-by: linghengqian &lt;linghengqian@outlook.com&gt;

* __Updates to JSON schema and Data Prepper documentation. (#5019)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 3 Oct 2024 11:00:32 -0700
    
    
    Support @JsonValue for determining enumeration values in the JSON Schema.
    Provide a JSON schema type of string for EventKey objects. Documentation
    wording improvements to the mutate event and mutate string processors.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add OpenTelemetry Metrics example (#5014)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Thu, 3 Oct 2024 19:24:09 +0200
    
    
    Add OpenTelemetry Metrics example
     Provides a small Docker Compose setup to show metrics ingestion
    with Data
    Prepper. This example is similar to the traces and logs
    examples. It also
    shows the metrics Data Prepper emits on its metrics
    endpoint.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    

* __ENH: support plugin loading in conifg (#4974)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 2 Oct 2024 16:00:58 -0500
    
    
    ---------
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Updates JsonPropertyDescription annotations to use HTML rather than Markdown. (#4985)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 2 Oct 2024 09:52:26 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adding a new API to get the current transformed pipelines as a JSON (#4980)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 1 Oct 2024 11:34:43 -0700
    
    
    * Adding a new API to get the current transformed pipelines as a JSON
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    * Rename the api and address comments
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Add: trace peerforwarder config (#4992)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 1 Oct 2024 10:12:09 -0500
    
    
    * ADD: trace peerforwarder config
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    ---------
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __FIX: missing required fields annotation (#4990)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 1 Oct 2024 09:55:58 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: update required properties and property descriptions in some processors (#4989)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 30 Sep 2024 14:58:12 -0500
    
    
    * update rename key config with missing descriptions
    
    * update convert entry type required fields
    
    * update delay property description
    
    * putting convert entry type processor on hold due to the mutually exclusive
    properties
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Additional logging when shutting down the pipeline. (#4986)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 30 Sep 2024 08:59:14 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support convert entry type on arrays (#4925)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 27 Sep 2024 12:12:43 -0700
    
    
    * Support convert entry type on arrays
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Support BigDecimal data type in expressions (#4930)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 27 Sep 2024 09:04:09 -0700
    
    
    * Support BigDecimal data type in expressions
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Removed unused import
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __OpenSearchSink - Enhance logs to include index name and last exception information (#4841)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 27 Sep 2024 09:03:47 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * OpenSearchSink - Enhance logs to include index name and last exception
    information
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Rebased to latest and cleanup messages
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed test errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add origination time to buffer event and populate the partition key (#4971)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 26 Sep 2024 12:32:09 -0500
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;
    Co-authored-by: Souvik Bose
    &lt;souvbose@amazon.com&gt;

* __Add integration test for Kinesis source (#4967)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 24 Sep 2024 16:25:02 -0500
    
    
    Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;

* __Add Lambda Synchronous processor support (#4700)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 24 Sep 2024 11:01:45 -0700
    
    
    Add Lambda Processor Synchronous Mode support
    Make LambdaClientFactory common
    to sink and processor
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Variable drain timeouts when shutting down over HTTP shutdown. (#4970)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Sep 2024 16:03:21 -0700
    
    
    Variable drain timeouts when shutting down over HTTP shutdown.
     Adds two new parameters to the shutdown API. The first is bufferReadTimeout
    which controls the amount of time to wait for the buffer to be empty. The
    second is bufferDrainTimeout which controls the overall wait time for the
    process worker threads to complete.
     To support Data Prepper durations in HTTP query parameters, I extracted the
    parsing logic for durations out of DataPrepperDurationDeserializer and into a
    new DataPrepperDurationParser class.
     Resolves #4966.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add mongodb as alternate source name for documentdb source (#4969)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Sun, 22 Sep 2024 13:39:13 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add alternate name for Plugin (#4968)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Sat, 21 Sep 2024 16:24:34 -0700
    
    
    Add alternate name for Plugin
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Refactoring chunking in the HTTP source to improve the performance. (#4950)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 20 Sep 2024 14:00:50 -0700
    
    
    The HTTP source was parsing the entire message and then serializing from
    strings. This created a bit of memory churn and probably duplicate processing.
    The new approach is to chunk the message from the start which allows us to
    stream the reading and perform copies of data. This also has a JMH benchmark
    added which shows that this new approach doubles the number of operations per
    second.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update rds template with new s3 sink client options (#4963)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 20 Sep 2024 12:39:15 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix a bug with event listener in RDS source (#4962)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 20 Sep 2024 09:41:45 -0700
    
    
    Unregister eventListener on stop
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add s3 sink client options (#4959)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 19 Sep 2024 22:28:03 -0500
    
    
    * Add s3 sink client options
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add upper bounds for new options
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Support AWS Kinesis Data Streams as a Source (#4836)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 19 Sep 2024 15:23:02 -0700
    
    
    Support AWS Kinesis Data Streams as a Source
     Signed-off-by: Souvik Bose &lt;souvbose@amazon.com&gt;

* __Add acknowledgment progress check for s3 source with folder partitions (#4957)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 19 Sep 2024 10:06:46 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Shorten S3 prefix to meet the requirement of RDS export API (#4955)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 18 Sep 2024 14:22:37 -0500
    
    
    * Shorten prefix
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Improve logging for exceptions (#4942)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Wed, 18 Sep 2024 09:31:49 -0700
    
    
    Improve logging for exceptions
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Add ReplaceStringProcessor for simple string substitution that doesn&#39;t involve regex (#4954)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 18 Sep 2024 10:18:08 -0500
    
    
    * Add ReplaceStringProcessor for simple string substitution that doesn&#39;t
    involve regex
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Remove unused imports
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update when condition parameter name
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Kafka Plugin: support for SASL/SCRAM mechanisms (#4912)__

    [franky-m](mailto:franky.meier.1@gmx.de) - Tue, 17 Sep 2024 12:44:09 -0700
    
    
    Kafka Plugin SCRAM Support
     Signed-off-by: Franky Meier &lt;franky.meier.1@gmx.de&gt;
     Signed-off-by: Franky Meier &lt;franky.meier.1@gmx.de&gt;
    Signed-off-by: George
    Chen &lt;qchea@amazon.com&gt;
    Co-authored-by: Qi Chen &lt;qchea@amazon.com&gt;

* __Adds config transformation template for RDS source (#4946)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 17 Sep 2024 14:26:40 -0500
    
    
    * Add rules and templates for rds source
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update rds config to prep for template
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Refactor record converters
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add template
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove unused import
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Revert changes on prefix
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Decrease the sleep when pausing the Kafka consumer to 1 second when the circuit breaker is in use. (#4947)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 13 Sep 2024 13:30:13 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release events for Noop Sink (#4944)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Thu, 12 Sep 2024 16:31:16 -0500
    
    
    Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Move CsvMapper and Schema creation to constructor (#4941)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 12 Sep 2024 10:10:10 -0700
    
    
    Move CsvMapper and Schema creation to constructor
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fixes Jaeger Hotrod demo failure on OpenSearch 2.16.0 (#4921)__

    [Ling Hengqian](mailto:linghengqian@outlook.com) - Wed, 11 Sep 2024 19:21:59 -0700
    
    
    Signed-off-by: linghengqian &lt;linghengqian@outlook.com&gt;

* __Updating the WhiteSource/Mend configuration to match the version found in opensearch-system-templates. (#4933)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 11 Sep 2024 13:48:12 -0700
    
    
    https://github.com/opensearch-project/opensearch-system-templates/blob/e3b4fc6/.whitesource
    
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __adding registry to image value in docker-compose.yaml (#2980)__

    [qhung](mailto:quanghung.b@gmail.com) - Tue, 10 Sep 2024 13:06:24 -0700
    
    
    Podman requires the registry url in order to pull out the image
     Signed-off-by: qhung &lt;11665161+quanghungb@users.noreply.github.com&gt;

* __Support start_time or range options for the first scan of scheduled s3 scan (#4929)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 10 Sep 2024 13:53:16 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add progress check callback to update partition ownership in S3 scan source (#4918)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 10 Sep 2024 11:14:00 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __ENH: add shutdown into extension plugin (#4924)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 10 Sep 2024 10:35:51 -0500
    
    
    * ENH: add shutdown into extension plugin
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Updated README.md according to previous changes of docker files. (#4845)__

    [Jayesh Parmar](mailto:89792517+jayeshjeh@users.noreply.github.com) - Mon, 9 Sep 2024 22:07:40 +0200
    
    
    * Updated README.md for updated /examples/log-ingestion files
     Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;
    
    * Updated README.md for updated /examples/log-ingestion files
     Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;
    
    * correction
     Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;
    
    ---------
     Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;

* __Updates to the code for HTTP chunking. (#4919)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 9 Sep 2024 09:27:44 -0700
    
    
    This refactors the code by placing all logic for serializing the data into the
    Codec itself. In so doing, it allows for improved testing such as symmetric
    testing. It also decouples the serialization format from the HTTP server. This
    also uses the Jackson library for the serialization which yields more accurate
    JSON.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: add data prepper plugin schema module into build resource (#4920)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 6 Sep 2024 13:24:03 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Move event processing to separate threads and add event processing timer in RDS source (#4914)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 5 Sep 2024 10:58:59 -0500
    
    
    * Move event processing to separate threads and add event processing timer
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Corrects the S3SinkStack for AWS testing (#4913)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Sep 2024 14:30:28 -0700
    
    
    Corrects the S3SinkStack for AWS testing.
     The S3SinkStack was not in use and didn&#39;t quite work. This corrects it so that
    we can use it to automate the tests for the S3 sink in GitHub.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Use awaitility to read data in Kafka buffer tests to fix flakiness (#4703)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Sep 2024 14:18:09 -0700
    
    
    Use awaitility to read data in KafkaBufferIT to promote stability and speed of
    execution. Contributes toward #4168
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds a .gitignore for Python virtual environments. (#4881)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Sep 2024 12:24:52 -0700
    
    
    Some projects such as the trace-analytics-sample-app and the current smoke
    tests use Python. Using Python virtual environments lets developers use these
    without affecting their local Python environment. Ignore .venv directories
    which Python virtual environments use.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updating the instructions for releasing a new version of Data Prepper. (#4878)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 4 Sep 2024 12:24:25 -0700
    
    
    This adds instructions for the release setup so that maintainers can have a
    consistent set of instructions to follow. Specifically, it adds steps for
    setting up the branch, updating version numbers, creating the release notes and
    change log.
     Additionally, this fixes a broken fragment link to the Backporting section of
    the Developer Guide.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __ENH: respect JsonProperty defaultValue in JsonSchemaConverter (#4889)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 3 Sep 2024 10:38:08 -0500
    
    
    * ENH: respect JsonProperty defaultValue in JsonSchemaConverter
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Minor updates and bug fixes for RDS source (#4887)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 29 Aug 2024 13:20:47 -0500
    
    
    * Minor updates and bug fixes to prepare for performance testing
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Adds a script to help generate the Thank You text for the release blogs. (#4884)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 29 Aug 2024 08:44:17 -0700
    
    
    Adds a script to help generate the Thank You text for the release blogs. Use en
    dashes in the Thank You text to meet the standards of the project-website. When
    there is no name for a GitHub user, don&#39;t include a None.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    Co-authored-by: Hai Yan
    &lt;oeyh@amazon.com&gt;

* __Creates the release notes for Data Prepper 2.9.0 (#4879)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 28 Aug 2024 08:20:02 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __ENH: Plugin errors consolidator (#4863)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 27 Aug 2024 11:16:55 -0500
    
    
    * ENH: Plugin errors consolidator
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __REF: data prepper plugin schema (#4872)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 27 Aug 2024 09:57:53 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add e2e acknowledgment and checkpointing to RDS source (#4819)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 26 Aug 2024 17:37:22 -0500
    
    
    * Add acknowledgment and checkpoint for stream
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add unit tests for stream checkpoint
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add acknowledgment to export
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Simplify the stream checkpointing workflow
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * A few fixes and cleanups
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Extend lease while waiting for ack
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address more review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Update Spring to 5.3.39 to fix CVE-2024-38808. Require commons-configuration2 2.11.0 to fix CVE-2024-29131 and CVE-2024-29133. Hadoop pulls this dependency in. (#4874)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 26 Aug 2024 10:34:06 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates Bouncy Castle to 1.78.1. Update any projects that attempt to use Bouncy Castle jdk15on dependencies with the jdk18on dependency instead. This will prevent any of the older jdk15on dependencies from getting into our classpath. In particular, this was coming from hadoop-common. (#4871)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 26 Aug 2024 08:30:35 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Require dnsjava 3.6.1 to resolve CVE-2024-25638. This is a transitive dependency from Hadoop. (#4868)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 23 Aug 2024 14:49:17 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Removes the trace-analytics-sample-app from the examples that are provided in the release. (#4867)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 23 Aug 2024 14:49:10 -0700
    
    
    The motivation for removing this is that the samples pull in dependencies which
    often trigger CVE reports. It is not likely customers are trying to run this
    example from a Data Prepper deployment, especially since the example is not
    made to run from the installed version, but runs from Docker and runs using the
    latest 2.x version.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix visibility timeout errors (#4812) (#4831)__

    [Daniel Li](mailto:68623003+danhli@users.noreply.github.com) - Fri, 23 Aug 2024 11:59:12 -0700
    
    
    Fix visibility timeout errors (#4812)
     Signed-off-by: Daniel Li &lt;lhouqua@amazon.com&gt;

* __Change version in DataPrepper Version class to 2.10 (#4852)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 23 Aug 2024 11:35:50 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Change Data Prepper Version to 2.10
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Adds integration tests for pipeline connectors. (#4834)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 23 Aug 2024 07:58:01 -0700
    
    
    This commit adds integration testing for the pipeline connector sink/source
    which connects two pipelines. There are two tests. The first tests against a
    single connection with a single sink. The second test also includes a second
    sink to verify that pipeline connections work with additional sinks.
     This commit also includes fixes for CoreHttpServerIT. When running the new
    pipeline connector tests, the CoreHttpServerIT tests started failing. I found
    some places where shutdowns were not occurring and fixed those. And I added
    some additional logging to help debug. The root problem turned out to be that
    the ExecutorService used in the DataPrepperServer was a static field. The
    CoreHttpServerIT was working because it was the first test that JUnit chose.
    With the new tests, it is being chosen later and by that point, the static
    ExecutorService was shutdown. The fix is simply to avoid using a static
    ExecutorService.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Mask s3 object key in logs (#4861)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 22 Aug 2024 17:12:30 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Changelog for release 2.9 (#4855)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 22 Aug 2024 12:58:22 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __ENH: collect plugin config and loading errors during data prepper launch (#4816)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 21 Aug 2024 17:41:09 -0500
    
    
    * ENH: collect plugin errors within core application context
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __ENH: respect json order and class description on processors (#4857)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 21 Aug 2024 14:32:05 -0500
    
    
    * ENH: json order and class description on processors
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Address missing processor JsonPropertyDescriptions and validations (#4837)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 21 Aug 2024 10:03:27 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Catch error that could cause LeaderScheduler thread to crash (#4850)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 20 Aug 2024 19:43:10 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Change main branch version to 2.10-SNAPSHOT (#4851)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 20 Aug 2024 13:46:09 -0700
    
    
    Change main branch version to 2.10-SNAPSHOT
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add support for AWS security lake sink as a bucket selector mode in S3 sink (#4846)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 20 Aug 2024 13:19:42 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Add support for AWS security lake sink as a bucket selector mode in S3 sink
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added javadoc for S3BucketSelector
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added new  tests for KeyGenerator
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added new  tests and fixed style errors
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed test build failure
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add handle failed events option to parse json processors (#4844)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 19 Aug 2024 17:12:29 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix bug where race condition on ack callback could cause S3 folder partition to not be given up (#4835)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 19 Aug 2024 16:15:05 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Update the parse JSON/XML/ION processors to use EventKey. (#4842)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 19 Aug 2024 11:12:27 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for dynamic rule detection for pipeline config transformation (#4601)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Fri, 16 Aug 2024 18:10:52 -0700
    
    
    * Add support for dynamic rule detection for pipeline config transformation
     Signed-off-by: Srikanth Govindarajan &lt;srikanthjg123@gmail.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Move rules and templates to plugin level
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Add dummy plugin for testing dynamic rule detection
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srikanthjg123@gmail.com&gt;
    Signed-off-by:
    Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Add startsWith expression function (#4840)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 16 Aug 2024 16:37:44 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Logging improvements when failing to parse JSON/XML/ION. Do not include the stack trace since it doesn&#39;t provide any value with these exceptions which are expected when the JSON is invalid. Log the input string rather than the Event which was not readable. (#4839)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 16 Aug 2024 05:52:46 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Translate proc optimizations (#4824)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 15 Aug 2024 10:25:43 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Optimize translateSource in translate processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Data Prepper expressions - Set operator fix (#4818)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 14 Aug 2024 14:05:26 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed check style errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Http chunking fixes (#4823)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 14 Aug 2024 11:49:12 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fix http message chunking bug
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified tests to test for chunks correctly
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed offline review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed  review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __FIX: include schema cli into release (#4833)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 14 Aug 2024 09:38:44 -0700
    
    
    MAINT: include schema cli into release
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __PersonalizeSink: add client and configuration classes (#4803)__

    [Ivan Tse](mailto:115105835+ivan-tse@users.noreply.github.com) - Wed, 14 Aug 2024 09:36:12 -0700
    
    
    PersonalizeSink: add client and configuration classes
     Signed-off-by: Ivan Tse &lt;tseiva@amazon.com&gt;

* __Config description changes for aggregate and anomaly detector processors. (#4829)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 13 Aug 2024 13:41:22 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Add json property description for aggregate processor and anomaly detector
    processors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed build failure
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add delete_source parameter to the csv processor (#4828)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 12 Aug 2024 16:21:05 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __FIX: build service map relationship even when trace group is missing (#4822)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 12 Aug 2024 13:24:50 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __ENH: add folder path as output for schema generation (#4820)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 12 Aug 2024 11:51:51 -0500
    
    
    * ENH: add folder path as output
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    

* __Release notes for Data Prepper 2.8.1 (#4807)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 12 Aug 2024 09:25:22 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Create docker-compose-dataprepper.yaml (#4756)__

    [Jayesh Parmar](mailto:89792517+jayeshjeh@users.noreply.github.com) - Mon, 12 Aug 2024 08:56:55 -0700
    
    
    * Create docker-compose-dataprepper.yaml
     Signed-off-by: Jayesh Parmar &lt;89792517+jayeshjeh@users.noreply.github.com&gt;
    
    Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;
    
    * Necessary chnages made
     Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;
    
    ---------
     Signed-off-by: Jayesh Parmar &lt;89792517+jayeshjeh@users.noreply.github.com&gt;
    
    Signed-off-by: jayeshjeh &lt;jay.parmar.11169@gmail.com&gt;

* __Fixes a regex expression bug. When the left-hand side of the operation is null, always return false rather than throwing an exception. Resolves #4763. (#4798)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 12 Aug 2024 08:20:48 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix null document in DLQ object (#4814)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Sat, 10 Aug 2024 12:04:18 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Delete .github/workflows/static.yml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fix null document in DLQ object
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Several improvements to RDS source (#4810)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 8 Aug 2024 16:51:12 -0500
    
    
    * Add schema manager to query database
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Get real primary keys for export
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Get binlog start position for stream
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Refactor SnapshotStrategy to RdsApiStrategy
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add retry to database queries
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Handle describe exceptions
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address more comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __ADD: data prepper plugin schema generation (#4777)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 2 Aug 2024 14:44:32 -0500
    
    
    * ADD: data-prepper-plugin-schema
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Using Awaitility and mocks in the LogGeneratorSourceTest to attempt to improve reliability. (#4746)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 2 Aug 2024 09:28:55 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Removes @asifsmohammed from the CODEOWNERS to allow the release to proceed. (#4800)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 1 Aug 2024 14:11:53 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Increase timeout in Acknowledgement IT tests  (#4774)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 31 Jul 2024 18:45:39 -0700
    
    
    Increase timeout for acknowledgement IT tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Signed-off-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    Co-authored-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Cleanup resources properly when Opensearch sink fails to initialize (#4758)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 30 Jul 2024 13:33:51 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * removed unnecessary file
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add rds source metrics (#4769)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 30 Jul 2024 12:09:20 -0500
    
    
    * Add rds source metrics
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove unused imports
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add exportS3ObjectsErrors metric
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Reapply &#34;Run tests on the current JVM for Java 17 &amp; 21 / Gradle 8.8 (#4730)&#34; (#4762) (#4771)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 30 Jul 2024 09:35:12 -0700
    
    
    This reverts commit 5c7d58c03059c7a753d882f5b74fa6ed32f45641.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __4602 one way hash (#4750)__

    [mishavay-aws](mailto:140549901+mishavay-aws@users.noreply.github.com) - Mon, 29 Jul 2024 18:41:20 -0700
    
    
    added capabilities for working with OneWay Hash
     Signed-off-by: mishavay-aws &lt;140549901+mishavay-aws@users.noreply.github.com&gt;

* __Corrects the TRIAGING.md with a video meeting since we currently use Chime. (#4743)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 29 Jul 2024 16:34:34 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add json property description for list-to-map, map-to-list and user-agent processor (#4759)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 29 Jul 2024 11:32:31 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add json property descriptions to dissect, flatten, copy_value and translate processor (#4760)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 29 Jul 2024 11:32:25 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Lambda sink refactor (#4766)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Fri, 26 Jul 2024 22:56:36 -0500
    
    
    * Lambda sink refactor
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __A few improvements to rds source (#4765)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 26 Jul 2024 13:31:54 -0500
    
    
    * Add error logging to event handlers
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add tls config and enable tls by default
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add original event name to metadata
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update metadata for export and stream events
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add some fixes
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove config alias ssl
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fixes a bug with HistogramAggregateAction where the startTime may be incorrect. This was discovered by a flaky test. (#4749)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 24 Jul 2024 23:01:21 -0700
    
    
    The HistogramAggregateAction was incorrectly using the current time as the
    start time for the aggregation when creating the group. The very first event&#39;s
    time was overridden by the current system time. If this event had the earliest
    time, then the overall histogram would never get the correct start time. This
    is fixed by removing an errant line. I also added a unit test to directly test
    this failure scenario.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for taking snapshots on RDS/Aurora Clusters (#4761)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 24 Jul 2024 22:52:38 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Revert &#34;Run tests on the current JVM for Java 17 &amp; 21 / Gradle 8.8 (#4730)&#34; (#4762)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 23 Jul 2024 17:03:57 -0500
    
    
    This reverts commit 67f3595805f07442d8f05823c9959b50358aa4d9.
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add stream processing for rds source (#4757)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 23 Jul 2024 16:30:35 -0500
    
    
    * Add stream processing
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Change s3 partition count default value
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add json description to AddEntry processor (#4752)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 23 Jul 2024 14:34:05 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __doc strings for enhanced UI view auto-generation (#4755)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Mon, 22 Jul 2024 14:40:18 -0700
    
    
    Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __MAINT: Add json property descriptions for csv processor (#4751)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 22 Jul 2024 15:06:13 -0500
    
    
    * add json property descriptions
    Signed-off-by: Katherine Shen
    &lt;katshen@amazon.com&gt;

* __Improve the SQS shutdown process such that it does not prevent the pipeline from shutting down and no longer results in failures. Resolves #4575 (#4748)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 19 Jul 2024 11:40:57 -0700
    
    
    The previous approach to shutting down the SQS thread closed the SqsClient.
    However, with acknowledgments enabled, asynchronous callbacks would result in
    further attempts to either ChangeVisibilityTimeout or DeleteMessages. These
    were failing because the client was closed. Also, the threads would remain and
    prevent Data Prepper from correctly shutting down. With this change, we
    correctly stop each processing thread. Then we close the client. Additionally,
    the SqsWorker now checks that it is not stopped before attempting to change the
    message visibility or delete messages.
     Additionally, I found some missing test cases. Also, modifying this code and
    especially unit testing it is becoming more difficult, so I performed some
    refactoring to move message parsing out of the SqsWorker.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: add json property descriptions for kv configs (#4747)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Fri, 19 Jul 2024 10:04:50 -0700
    
    
    add json property descriptions for kv configs
     Signed-off-by: Katherine Shen &lt;katshen@amazon.com&gt;

* __Updates Jackson to 2.17.2. Related to #4729. (#4744)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 17 Jul 2024 15:49:55 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updating the Python dependencies to resolve CVEs. Resolves #4715, #4713, 4714. (#4733)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 15 Jul 2024 11:55:11 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __REF: service-map processor with the latest config model (#4734)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 15 Jul 2024 11:02:40 -0500
    
    
    * REF: service-map processor with the latest config model
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: add documentation in json property description for date processor (#4719)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 15 Jul 2024 10:30:14 -0500
    
    
    * MAINT: add documentation in json property description for date processor
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __REF: grok processor with the latest config model (#4731)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 15 Jul 2024 10:05:10 -0500
    
    
    * REF: grok processor with the latest config model
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Load exported S3 files in RDS source (#4718)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 15 Jul 2024 09:57:24 -0500
    
    
    * Add s3 file loader
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Make checkExportStatus a callable
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add load status and record converter
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Restore changes for test
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __MAINT: backfill doc into json property for trim_string (#4728)__

    [Qi Chen](mailto:qchea@amazon.com) - Sat, 13 Jul 2024 00:31:45 -0500
    
    
    * MAINT: backfill doc into json property for trim_string
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: backfill documentation in JsonPropertyDescription for split_string (#4720)__

    [Qi Chen](mailto:qchea@amazon.com) - Sat, 13 Jul 2024 00:31:23 -0500
    
    
    * MAINT: add documentation in JsonPropertyDescription for split_string
    processor
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: backfill doc in json property description for otel_metrics (#4722)__

    [Qi Chen](mailto:qchea@amazon.com) - Sat, 13 Jul 2024 00:30:56 -0500
    
    
    * MAINT: backfill doc in json property description for otel_metrics
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: add json property description into obfuscate processor (#4706)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 12 Jul 2024 22:28:10 -0500
    
    
    * MAINT: add json property description
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Run tests on the current JVM for Java 17 &amp; 21 / Gradle 8.8 (#4730)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 12 Jul 2024 15:35:02 -0700
    
    
    Run tests on the current JVM rather than always using Java 11 for the tests.
    This fixes a problem with our current GitHub tests where we are running against
    only Java 11 even though we want to run against different Java versions (11,
    17, 21). Updates the Gradle version to 8.8.
     Fix Java 21 support in the AbstractSink by removing usage of Thread::stop
    which now always throws an UnsupportedOperationException.
     Use only microsecond precision time when comparing the times in the event_json
    codec. These tests are failing now on Java 17 and 21 with precision errors.
     Fixed a randomly failing test in BlockingBufferTests where a value 0 caused an
    IllegalArgumentException.
     Logging changes to avoid noise in the Gradle builds in GitHub.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: backfill documentation into json description for truncate processor (#4726)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 12 Jul 2024 13:30:05 -0500
    
    
    * MAINT: backfill documentation into json description for truncate processor
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: backfill documentation into json property for substitute_string (#4727)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 12 Jul 2024 13:29:41 -0500
    
    
    * MAINT: backfill documentation into json property for substitute_string
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: backfill documentation into json description for delete_entries (#4721)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 12 Jul 2024 13:29:16 -0500
    
    
    * MAINT: backfill documentation into json description for delete_entries
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: backfill documentation in json description for otel_traces (#4724)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 12 Jul 2024 12:40:52 -0500
    
    
    * MAINT: backfill documentation in json property description for otel_traces
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: backfill documentation into json description for string_converter (#4725)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 12 Jul 2024 12:40:24 -0500
    
    
    * MAINT: backfill documentation into json description for string_converter
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Mockito 5 (#4712)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Jul 2024 11:17:14 -0700
    
    
    Mockito 5
    
    * Synchronize the MetricsTestUtil methods to avoid test failures.
    * Create a copy of the collections to remove in MetricsTestUtil.
    * Updated two tests to JUnit 5 and to use mocks instead of actual metrics.
    Updates to MetricsTestUtil to provide clarity on NPEs.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates to the AWS Lambda Sink tests to fix a flaky test. Also adds SLF4J logging for these tests. (#4723)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Jul 2024 08:07:32 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update the rename_keys and delete_entries processors to use the EventKey. (#4636)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 10 Jul 2024 08:50:39 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update the mutate string processors to use the EventKey. #4646 (#4649)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 10 Jul 2024 08:50:21 -0700
    
    
    Change the source and keys properties for mutate string processors to use
    EventKey such that they are parsed by Data Prepper core. Also, use the
    TestEventFactory in the tests to avoid use of JacksonEvent directly. Removes an
    unused class.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Removes Zookeeper from Data Prepper. This was a transitive dependency from Hadoop. (#4707)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 10 Jul 2024 08:49:20 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the user_agent processor to use the EventKey. (#4628)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 9 Jul 2024 13:57:19 -0700
    
    
    Updates the user_agent processor to use the EventKey.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    Co-authored-by: Karsten
    Schnitter &lt;k.schnitter@sap.com&gt;

* __Introducing delete input configuration option for some parsers (#4702)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Thu, 4 Jul 2024 11:11:27 -0700
    
    
    * Introduced delete_source configuration option to give flexibility for the
    user to drop the raw source record if they don&#39;t want to propagate it
    downstream
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * added delete_source option to other similar parser classes
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#4593)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 3 Jul 2024 13:49:02 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.12 to 1.14.17.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.12...byte-buddy-1.14.17)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy-agent in /data-prepper-plugins/opensearch (#4592)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 3 Jul 2024 12:56:23 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy-agent](https://github.com/raphw/byte-buddy)
    from 1.14.12 to 1.14.17.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.12...byte-buddy-1.14.17)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy-agent
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Key Value processor value grouping optimization (#4704)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 3 Jul 2024 12:43:46 -0700
    
    
    * dplive1.yaml
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Optimize findInStartGroup in KV processor
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Rebased to latest
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Cleanup
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Minor improvements to code
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Updates to the CODE_OF_CONDUCT.md from the opensearch-project&#39;s official CODE_OF_CONDUCT.md. (#4665)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 3 Jul 2024 10:51:37 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates Parquet to 1.14.1 and Hadoop to 3.4.0. Make use of Gradle&#39;s version catalogue for Parquet. (#4705)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 3 Jul 2024 09:41:10 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Export to S3 in RDS source (#4664)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 3 Jul 2024 09:51:34 -0500
    
    
    * Trigger RDS export to S3
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove unused imports
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address further comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Make checkSnapshotStatus a runnable
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Revert &#34;Make checkSnapshotStatus a runnable&#34;
     This reverts commit 5caed6ffb218d64180b10285c5c9115f21d6f3a2.
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Parquet codec tests fix (#4698)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 2 Jul 2024 09:26:16 -0700
    
    
    Parquet codec tests fix
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Bump org.skyscreamer:jsonassert from 1.5.1 to 1.5.3 in /data-prepper-api (#4678)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 2 Jul 2024 07:18:48 -0700
    
    
    Bumps [org.skyscreamer:jsonassert](https://github.com/skyscreamer/JSONassert)
    from 1.5.1 to 1.5.3.
    - [Release notes](https://github.com/skyscreamer/JSONassert/releases)
    -
    [Changelog](https://github.com/skyscreamer/JSONassert/blob/master/CHANGELOG.md)
    
    -
    [Commits](https://github.com/skyscreamer/JSONassert/compare/jsonassert-1.5.1...jsonassert-1.5.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.skyscreamer:jsonassert
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.maven:maven-artifact in /data-prepper-plugins/opensearch (#4692)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Jul 2024 14:46:28 -0700
    
    
    Bumps [org.apache.maven:maven-artifact](https://github.com/apache/maven) from
    3.9.6 to 3.9.8.
    - [Release notes](https://github.com/apache/maven/releases)
    - [Commits](https://github.com/apache/maven/compare/maven-3.9.6...maven-3.9.8)
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#4685)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Jul 2024 14:45:24 -0700
    
    
    Bumps software.amazon.awssdk:auth from 2.25.21 to 2.26.12.
    
    ---
    updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump braces from 3.0.2 to 3.0.3 in /testing/aws-testing-cdk (#4638)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Jul 2024 14:44:18 -0700
    
    
    Bumps [braces](https://github.com/micromatch/braces) from 3.0.2 to 3.0.3.
    - [Changelog](https://github.com/micromatch/braces/blob/master/CHANGELOG.md)
    - [Commits](https://github.com/micromatch/braces/compare/3.0.2...3.0.3)
    
    ---
    updated-dependencies:
    - dependency-name: braces
     dependency-type: indirect
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump ws from 7.5.9 to 7.5.10 in /release/staging-resources-cdk (#4639)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Jul 2024 14:43:47 -0700
    
    
    Bumps [ws](https://github.com/websockets/ws) from 7.5.9 to 7.5.10.
    - [Release notes](https://github.com/websockets/ws/releases)
    - [Commits](https://github.com/websockets/ws/compare/7.5.9...7.5.10)
    
    ---
    updated-dependencies:
    - dependency-name: ws
     dependency-type: indirect
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.wiremock:wiremock in /data-prepper-plugins/s3-source (#4683)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Jul 2024 14:43:01 -0700
    
    
    Bumps [org.wiremock:wiremock](https://github.com/wiremock/wiremock) from 3.4.2
    to 3.8.0.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.4.2...3.8.0)
    
    ---
    updated-dependencies:
    - dependency-name: org.wiremock:wiremock
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.apptasticsoftware:rssreader in /data-prepper-plugins/rss-source (#4672)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Jul 2024 14:42:31 -0700
    
    
    Bumps [com.apptasticsoftware:rssreader](https://github.com/w3stling/rssreader)
    from 3.6.0 to 3.7.0.
    - [Release notes](https://github.com/w3stling/rssreader/releases)
    - [Commits](https://github.com/w3stling/rssreader/compare/v3.6.0...v3.7.0)
    
    ---
    updated-dependencies:
    - dependency-name: com.apptasticsoftware:rssreader
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates our usage of the Apache Parquet project to use their new interfaces over the old Hadoop ones. This allows use to be ready to extract Hadoop as other changes are made to the Parquet project. Remove some Hadoop transitive dependencies and make Hadoop runtime only where possible. Added a test for INT96, clean up some test files.  Contributes toward #4612. (#4623)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 1 Jul 2024 13:54:53 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds the TRIAGING.md file to outline our triaging process (#4630)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 27 Jun 2024 17:47:18 -0700
    
    
    Adds the TRIAGING.md file, which outlines for the community the Data Prepper
    triaging process.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Enhanced Kafka source logging through the use of MDC and better thread names for Kafka source threads. Resolves #4126. (#4663)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 26 Jun 2024 12:25:57 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support default route option for Events that match no other route (#4662)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 26 Jun 2024 07:15:04 -0700
    
    
    Support default route option for Events that match no other route
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Updates the chunking algorithm for http source&#39;s JsonCodec to account for actual byte size. Test using Unicode characters to prove this was incorrectly chunking and verify against future changes. (#4656)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 25 Jun 2024 15:09:27 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Refactor lambda plugin (#4643)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 25 Jun 2024 09:51:28 -0700
    
    
    * Refactor lambda plugin
     Signed-off-by: Srikanth Govindarajan &lt;srikanthjg123@gmail.com&gt;
    
    * Address comments
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    * Address comments 2
     Signed-off-by: Srikanth Govindarajan &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: Srikanth Govindarajan &lt;srikanthjg123@gmail.com&gt;
    Signed-off-by:
    Srikanth Govindarajan &lt;srigovs@amazon.com&gt;

* __Fixes the loading of peer-forwarders when using multiple workers. This fixes a bug where the service_map processor would not load in a pipeline with multiple workers. Resolves #4660. (#4661)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 25 Jun 2024 08:07:40 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __FIX: remove logging that includes credential info on kafka (#4659)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 25 Jun 2024 09:11:40 -0500
    
    
    * FIX: use sensitive marker
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add an option to count unique values of specified key(s) to CountAggregateAction (#4652)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 24 Jun 2024 15:46:42 -0700
    
    
    Add an option to count unique values of specified key(s) to
    CountAggregateAction
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __MAINT: change log level for consumer properties in kafka source (#4658)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 24 Jun 2024 16:56:23 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fixes performance regression with JacksonEvent put/delete operations. (#4650)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 21 Jun 2024 08:37:03 -0700
    
    
    With the addition of the EventKey, JacksonEvent always creates a
    JacksonEventKey in order to use the same code for all paths. However, when
    put/delete calls are made with a String key, JacksonEvent does not need the
    JSON Pointer. But, it is created anyway. This adds more work to the put/delete
    calls that have not yet migrated to the String version. This fixes regression
    by adding a lazy initialization option when used in JacksonEvent. We should not
    be lazy when used with the EventKeyFactory since we may lose some up-front
    validations.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __add remove_brackets option to flatten-processor (#4616) (#4653)__

    [timo-mue](mailto:timo.mueller@tower.telekom-cloudcenter.de) - Fri, 21 Jun 2024 10:04:04 -0500
    
    
    Signed-off-by: Timo Mueller &lt;timo.mueller@tower.telekom-cloudcenter.de&gt;

* __Add support to configure metric name for count and histogram actions (#4642)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 20 Jun 2024 11:05:40 -0700
    
    
    * rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * renamed name to metric_name
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Support plugins defining the EventKey in the plugin configuration classes. Data Prepper will deserialize the EventKey from the pipeline configuration and validate @NotEmpty validations. Builds on the #1916. (#4635)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 19 Jun 2024 15:08:12 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __DocumentDB Source improvements (#4645)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 19 Jun 2024 16:09:54 -0500
    
    
    * Extend the export partition ownership during query partition creation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add support to shutdown task refresher that starts export and stream
    scheduler/worker on data prepper shutdown
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add AcknowledgmentStatus enum and code refactor to fail negative ack right
    away
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Track last scan time from before scan starts instead of based on last Modified of objects (#4493)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 19 Jun 2024 14:55:10 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Bump urllib3 in /release/smoke-tests/otel-span-exporter (#4640)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 19 Jun 2024 07:23:44 -0700
    
    
    Bumps [urllib3](https://github.com/urllib3/urllib3) from 1.26.18 to 1.26.19.
    - [Release notes](https://github.com/urllib3/urllib3/releases)
    - [Changelog](https://github.com/urllib3/urllib3/blob/1.26.19/CHANGES.rst)
    - [Commits](https://github.com/urllib3/urllib3/compare/1.26.18...1.26.19)
    
    ---
    updated-dependencies:
    - dependency-name: urllib3
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump urllib3 in /examples/trace-analytics-sample-app/sample-app (#4631)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 18 Jun 2024 16:50:42 -0700
    
    
    Bumps [urllib3](https://github.com/urllib3/urllib3) from 2.0.7 to 2.2.2.
    - [Release notes](https://github.com/urllib3/urllib3/releases)
    - [Changelog](https://github.com/urllib3/urllib3/blob/main/CHANGES.rst)
    - [Commits](https://github.com/urllib3/urllib3/compare/2.0.7...2.2.2)
    
    ---
    updated-dependencies:
    - dependency-name: urllib3
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Implements equals, hashCode, and toString for JacksonEventKey. (#4633)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 18 Jun 2024 16:49:34 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Deprecates PluginSetting which should not be used for plugins anymore. (#4624)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 17 Jun 2024 12:55:38 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add Aggregate event handle (#4625)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 17 Jun 2024 12:34:33 -0700
    
    
    Aggregate event handle
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
     Co-authored-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Adds the EventKey and EventKeyFactory.  (#4627)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 17 Jun 2024 08:40:28 -0700
    
    
    Adds the EventKey and EventKeyFactory. Resolves #1916.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates to Armeria 1.29.0 which fixes a bug that may help with #4080. (#4629)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 17 Jun 2024 07:26:05 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: bump io.confluent:* packages to match org.apache.kafka.* (#4626)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 14 Jun 2024 11:55:28 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Support multiple aggregate processors in local mode (#4574)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 14 Jun 2024 09:27:17 -0700
    
    
    * Rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Tools to generate User Agent strings in the performance-test project (#4620)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 14 Jun 2024 09:00:52 -0700
    
    
    Changes to the performance-test project to generate User Agent strings. Used to
    help reproduce and test #4618.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rebased to latest (#4614)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 14 Jun 2024 08:37:55 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __OpenSearch Sink add support for sending pipeline parameter in BulkRequest (#4609)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Thu, 13 Jun 2024 23:36:00 -0700
    
    
    * Add support in OpenSearch sink to pass pipeline parameter in the index and
    create action operation for bulk api requests
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    
    * Add more unit tests to increase code coverage
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    
    * Update README
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    
    * Fix the OpenSearch Integration tests
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;
    
    ---------
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;

* __Caffeine-based caching parser for the user_agent processor (#4619)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 13 Jun 2024 08:22:15 -0700
    
    
    Adds and uses a Caffeine-based caching parser for the user_agent processor.
    Resolves #4618
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __FIX: decouple msk auth from glue auth in KafkaSource (#4613)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 12 Jun 2024 14:46:08 -0500
    
    
    * FIX: decouple msk from aws block
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix missing closing parenthesis in CLOUDFRONT_ACCESS_LOG pattern (#4607)__

    [Joël Marty](mailto:134835+joelmarty@users.noreply.github.com) - Wed, 12 Jun 2024 10:45:37 -0700
    
    
    Signed-off-by: Joël Marty &lt;134835+joelmarty@users.noreply.github.com&gt;

* __Aggrerate processor : add option to allow raw events (#4598)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 10 Jun 2024 14:55:09 -0700
    
    
    * Aggregate Processor: Add support to allow raw events
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modify test to check for aggregated tag
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Updates Python requests to 2.32.3 in the smoke tests project to address CVE-2024-35195. (#4610)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 7 Jun 2024 14:07:03 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for lambda sink (#4292)__

    [Srikanth Govindarajan](mailto:srikanthjg123@gmail.com) - Thu, 6 Jun 2024 20:17:27 +0000
    
    
    * Add support for lambda sink
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Address event handle comment
     Signed-off-by: Srikanth Govindarajan &lt;srikanthjg123@gmail.com&gt;
    
    ---------
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    Signed-off-by: Srikanth
    Govindarajan &lt;srikanthjg123@gmail.com&gt;

* __Fix KeyValue Processor value grouping bug (#4606)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 6 Jun 2024 12:25:36 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Refactor http source functionality for supporting a new OpenSearch API source in DataPrepper (#4570)__

    [Souvik Bose](mailto:souvik04in@gmail.com) - Tue, 4 Jun 2024 16:49:07 -0700
    
    
    Refactor http source configuration to a separate http source common package.
     Signed-off-by: Souvik Bose &lt;souvik04in@gmail.com&gt;

* __Modify Key Value processor to support string literal grouping (#4599)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 4 Jun 2024 14:19:48 -0700
    
    
    * Key Value Processor fixes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * New options to KV processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Add string literal support
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Remove unnecessary changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Remove unnecessary changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Introduced BigDecimalConverter  (#4557)__

    [Santhosh Gandhe](mailto:1909520+san81@users.noreply.github.com) - Tue, 4 Jun 2024 13:40:46 -0700
    
    
    * Introduced BigDecimalConverter that users can use as part of
    convert_entry_type processor that currently exists. Optionally, users can also
    specify required scaling needed on the converted
     Signed-off-by: Santhosh Gandhe &lt;gandheaz@amazon.com&gt;
    
    * Added Test case for the newly introduced class. Removed * imports as per the
    review comment
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Avoiding using a deprecated method. Added additional test cases
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Additional tests to increase the coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * removed &#34;scale&#34; being the state of BigDecimal converter. We are now passing
    the scale while converting the instance only when the instance is
    BigDecimalConverter
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * test case fix to be inline with the previous commit
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * test case fix to be inline with the previous commit
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * addressing review comments
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * renaming bigdecimal to big_decimal
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Introduced ConverterArguments as a way to pass additional arguments to the
    converter and avoided conditional statement for calling converter methods
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * Added additional override convert method to reduce the changes across the
    code
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * additional Test cases to increase the coverage
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    * added additional tests for converter cases
     Signed-off-by: Santhosh Gandhe &lt;1909520+san81@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Santhosh Gandhe &lt;gandheaz@amazon.com&gt;
    Signed-off-by: Santhosh
    Gandhe &lt;1909520+san81@users.noreply.github.com&gt;

* __Add Rds source config (#4573)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 4 Jun 2024 15:19:35 -0500
    
    
    * Add rds source config and some skeleton code
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add cluster and aurora options
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Track the source of request for Kafka server (#4572)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 31 May 2024 09:46:28 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add support for Kafka headers and timestamp in the Kafka Source (#4566)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 30 May 2024 09:31:47 -0700
    
    
    * Add support for Kafka headers and timestamp in the Kafka Source
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fix the typo
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * fixed checkstyle error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add default role and region configuration to the data-prepper-config.yaml via extensions (#4559)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 22 May 2024 12:50:07 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Corrected the release date for 2.8.0. (#4555)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 20 May 2024 13:30:25 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Release Notes for version 2.8 (#4538)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 20 May 2024 12:46:53 -0700
    
    
    * Release Notes for version 2.8
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Addressed review comments (#4552)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 20 May 2024 11:48:31 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Fix DocDB export and stream processing self recovery with invalid database or collection name (#4553)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 20 May 2024 13:15:55 -0500
    
    
    * Fix DocDB export and stream processing self recovery with invalid database or
    collection name
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Fix unit test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Change log for version 2.8 (#4539)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 16 May 2024 10:03:13 -0700
    
    
    * Change log for version 2.8
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Change log - updated to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Change log - updated to latest in 2.8 branch
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Adding &#39;single_word_only&#39; option to obfuscate processor (#4476)__

    [Utkarsh Agarwal](mailto:126544832+Utkarsh-Aga@users.noreply.github.com) - Wed, 15 May 2024 15:38:36 -0700
    
    
    Adding &#39;single_word_only&#39; option to obfuscate processor
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;

* __Updates werkzeug to 3.0.3 in examples to fix CVE-2024-34069. Resolves #4515 (#4546)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 May 2024 15:04:53 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Logging update and config validation (#4541)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 14 May 2024 17:57:24 -0500
    
    
    * Logging improvements for export and stream processing for DocumentDB source
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add validation for DocumentDB Collection Config
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add aggregate metrics (#4531)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 14 May 2024 16:30:13 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Updates the next Data Prepper version to 2.9 (#4532)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 14 May 2024 14:19:56 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Adds an ndjson input codec. This reads JSON objects for ND-JSON and more lenient formats that do not have the newline. (#4533)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 May 2024 12:10:01 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Address route and subpipeline for pipeline tranformation (#4528)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Mon, 13 May 2024 15:58:11 -0700
    
    
    Address route and subpipeline for pipeline tranformation
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __Fix an issue that exception messages are masked (#4416)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 13 May 2024 16:25:42 -0500
    
    
    * Show exception stacktrace
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Tweak log messages
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix aggregate processor local mode (#4529)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 13 May 2024 12:30:19 -0700
    
    
    * Fix aggregate processor local mode
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added comments and removed commented out code in test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed code for failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Key value processor enhancements (#4521)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 13 May 2024 08:53:15 -0700
    
    
    * Added auto mode
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Testing changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Testing changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added new config and tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Checkpoint records at an interval for TPS case when AckSet is enabled  (#4526)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Sat, 11 May 2024 08:27:29 -0500
    
    
    * Checkpoint records at an interval for TPS case when AckSet is enabled
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Fix regular checkpoint internal with ack received
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix write json basic test (#4527)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 10 May 2024 14:13:33 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Complete AcknowledgementSet for checkpoint thread &amp; fix BsonTimeStamp field conversion (#4525)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 10 May 2024 10:10:45 -0500
    
    
    * Complete AcknowledgementSet for checkpoint thread when Ack is enabled
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Use time in seconds for BsonTimeStamp field when converting to record
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Write stream events that timeout to write to internal buffer in separate thread (#4524)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 9 May 2024 19:51:23 -0500
    
    
    * Write stream events that timeout to write to internal buffer in separate
    thread
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Fix Log message level and minor PR comments
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Handle exception in Stream Acknowledgement Manager.
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Extend the lease by default time
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Modify typeof operator grammar and add support for ArrayList (#4523)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 9 May 2024 13:54:36 -0700
    
    
    * Modify typeof operator grammar and add support for ArrayList
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added test case for more code coverage
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Clear system property to disable s3 scan when stream worker exits (#4522)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 9 May 2024 14:38:58 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add logging change to documentdb source and s3 source with folder partitions (#4519)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 9 May 2024 10:22:38 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Bump parquet version to 1.14.0. (#4520)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Thu, 9 May 2024 09:50:48 -0500
    
    
    1.14.0 has critical bug fixes for parquet files written in OCSF 1.1
    schema.
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Write json processor (#4514)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 8 May 2024 20:48:47 -0700
    
    
    * Write Json processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Write Json processor - added tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed the DataPrepperMarker
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add bytesProcessed metric for stream (#4518)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 8 May 2024 21:37:23 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add bucket owner validation support to s3 sink (#4504)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 8 May 2024 13:28:35 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Exclude updateDescription field from Mongo/DocDB change stream (#4516)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 8 May 2024 10:42:38 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix document version for DocDB/Mongo Stream events (#4513)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 7 May 2024 13:55:37 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __MAINT: inject external origination timestamp (#4507)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 7 May 2024 13:46:05 -0500
    
    
    * MAINT: inject external origination timestamp
    
    * MAINT: set External origination time in event handle
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    

* __Add metadata for primary key and primary key type and validations for Mongo/DocDb source (#4512)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 7 May 2024 12:03:33 -0500
    
    
    * Add metadata for primary key and primary key type and validations for
    Mongo/DocDb source
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Update docdb metrics (#4508)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 7 May 2024 10:30:40 -0500
    
    
    * Update docdb metrics
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix depth field in template (#4509)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 7 May 2024 06:53:51 -0500
    
    
    Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __Add BsonType of primary key to metadata (#4506)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 6 May 2024 18:19:11 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add support to export/full load MongoDB/DocumentDB collection with `_id` field of different data type (#4503)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 6 May 2024 17:24:20 -0500
    
    
    * Add support to export/full load MongoDB/DocumentDB collection with _id field
    of different data type
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add internal type for sorting
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Fix &#39;static&#39; modifier out of order
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add &#39;typeof&#39; operator to DataPrepper expressions (#4500)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 6 May 2024 15:12:44 -0700
    
    
    * Rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed unrelated changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added new tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkStyle errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkStyle errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add new S3 source option and modify docdb template (#4492)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Mon, 6 May 2024 11:18:21 -0500
    
    
    Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __Move stopping of s3 scan from docdb leader scheduler to stream scheduler (#4498)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 6 May 2024 11:01:52 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Initial work to support core data types in Data Prepper (#4496)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 3 May 2024 12:59:49 -0700
    
    
    Adds an enum to represent core data types in Data Prepper. This is initially
    created to help connect the convert_entry_type processor with upcoming work for
    evaluating type information as part of #4478.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support default mapping for Mongo/DocumentDB data types  (#4499)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 3 May 2024 13:55:00 -0500
    
    
    * Support default mapping for Mongo/DocumentDB data types
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Fix test indentation
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Use ParameterizedTest for Mongo/DocDB dataType mapping
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Support Mongo/DocDB stream Delete and other Operation types (#4497)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 2 May 2024 17:35:04 -0500
    
    
    * Support Mongo/DocDB stream Delete and other Operation types
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add reset checkpoint method to mongo/docdb partition checkpoint class
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __HTTP data chunking support for kafka buffer (#4475)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 2 May 2024 14:51:46 -0700
    
    
    * HTTP data chunking support for kafka buffer
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed comments and added tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle errors
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed checkstyle error
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add system property to allow pausing and resuming s3 scan worker thread processing, optionally set this property to pause on documentdb leader (#4495)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 2 May 2024 14:36:51 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __FIX: null certificate value should be valid in opensearch connection (#4494)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 2 May 2024 10:22:24 -0500
    
    
    * FIX: null certificate value should be valid
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix JacksonEvent to propagate ExternalOriginalTime if its set at the time of construction (#4489)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 1 May 2024 17:06:53 -0700
    
    
    * Fix JacksonEvent to propagate ExternalOriginalTime if its set at the time of
    construction
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed code coverage failure by adding more tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Move MongoDB/DocDB stream checkpoint to separate thread (#4477)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 30 Apr 2024 19:16:55 -0500
    
    
    * Move MongoDB/DocDB stream checkpoint to separate thread
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Checkpoint DocDB/MongoDB stream processing periodically
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix transient test failure for subpipelines (#4479)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Tue, 30 Apr 2024 13:37:53 -0700
    
    
    Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __Fix for S3PartitionCreatorScheduler ConcurrentModification Exception (#4473)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 29 Apr 2024 12:41:24 -0500
    
    
    * Fix for S3PartitionCreatorScheduler ConcurrentModification Exception
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Remove warn log message
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Publish data-prepper-expression and data-prepper-logstash-configuration to Maven. (#4474)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 29 Apr 2024 10:37:28 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix DocumentDB source S3PathPrefix null or empty (#4472)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 29 Apr 2024 11:26:40 -0500
    
    
    * Fix DocumentDB source S3PathPrefix null or empty
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Modify documentdb template (#4469)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Fri, 26 Apr 2024 13:19:50 -0500
    
    
    Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __Changing logging level for config transformation and fixing rule (#4466)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Fri, 26 Apr 2024 12:50:08 -0500
    
    
    * Changing logging level for config transformation and fixing rule
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Adding absolute path for template and rule
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Fix template indentation
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Fix template indentation
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Adding event json to codec in template
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Handled PipelinesDataFlow mapping and addressed array type when replacing
    Node
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add relative path as file stream
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Fix environment variable
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __Let data-prepper-core know if docdb has acknowledgments enabled (#4467)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 26 Apr 2024 10:39:09 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add folder-based partitioning for s3 scan source (#4455)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 25 Apr 2024 23:45:55 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Pipeline Configuration Transformation (#4446)__

    [Srikanth Govindarajan](mailto:srigovs@amazon.com) - Wed, 24 Apr 2024 20:13:36 -0700
    
    
    * Adding templates
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added Dynamic yaml transformer
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added Rule evaluator
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added rule evaluator
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added json walk
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add transformation logic
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add dynamic rule
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Almost working
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Adding multiple pipelines part1
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Adding multiple pipelines part2-incomplete
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Works e2e for 1 pipeline
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added multi pipeline template and pipelinemodel support, works for docDB with
    big template
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * added tests for models and fixed beans, one more fix needed for bean
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Fixed IT and beans
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Update bean to have only pipelineDataModel and not parser
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add banner
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Code cleanup and add comments
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Support user pipeline configuration dynamic transformation based on
    
    templates and rules
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Address comments
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added Function Call support in templates
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Added Function Call support in templates
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Modify documentDB template.
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Code clean up
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Code clean up
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;

* __MAINT: use authentication-for-basic-credentials (#4435)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 24 Apr 2024 14:39:25 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Adding Support for &#39;BigDecimal&#39; for integer, long, double, string type. (#4395)__

    [Utkarsh-Aga](mailto:126544832+Utkarsh-Aga@users.noreply.github.com) - Wed, 24 Apr 2024 11:00:27 -0700
    
    
    Adding Support for &#39;BigDecimal&#39; for the following &#39;Target type&#39; - integer,
    long, double, string
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;
    Co-authored-by:
    Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;

* __MAINT: use authentication block to replace username and password in opensearch sink (#4438)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 24 Apr 2024 12:35:26 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Revert DocumentDB Source String array host to String host (#4457)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 24 Apr 2024 12:02:01 -0500
    
    
    * Revert DocumentDB Source String array host to String host
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    

* __MAINT: allow latest schema version if not specified in confluent schema (#4453)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 24 Apr 2024 11:13:54 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Update DocumentDB source pipeline config parameters  (#4451)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 24 Apr 2024 11:11:46 -0500
    
    
    * Update DocumentDB source pipeline config parameters
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Added support for multiple workers in S3 Scan Source (#4439)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 23 Apr 2024 13:56:14 -0700
    
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing integration tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing check style
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __MAINT: deprecate certificate_content with certificate_key (#4434)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 23 Apr 2024 10:11:55 -0500
    
    
    * MAINT: deprecate certificate_content with certificate_key
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Support for Event Json input and output codecs (#4436)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 22 Apr 2024 16:22:17 -0700
    
    
    * Event Json input and output codecs
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified test case to check for event metadata attributes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified the coverage to 0.9
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixes for failing coverage tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed test coverage
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added more tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added more tests for coverage
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed code coverage failure
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __ENH: docdb credential auto refreshment (#4399)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 22 Apr 2024 16:22:29 -0500
    
    
    * ENH: docdb credential refreshment
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Use positive numbers in S3DlqWriterTest for consistent test success. (#4443)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 22 Apr 2024 08:27:15 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Maint/renaming kafka source plugin setting (#4429)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 19 Apr 2024 09:29:17 -0500
    
    
    * MAINT: schema registry setting renaming
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: allow either plain or plaintext under SASL (#4433)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 19 Apr 2024 09:28:20 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: deprecate pipeline_configurations with extension (#4428)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 19 Apr 2024 09:27:16 -0500
    
    
    * MAINT: deprecate-pipeline_configurations with extension
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Updates Ameria to 1.28.2. To support this change, also updates gRPC to 1.63.0, and Netty to 4.1.108. Fixes unit tests that were expecting a failure. Armeria fixed a bug so the old expectation was no longer valid. (#4440)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 18 Apr 2024 16:32:28 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Make s3 partition size configurable and add unit test for S3 partition creator classes (#4437)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 18 Apr 2024 13:19:44 -0500
    
    
    * Make s3 partition size configurable and add unit test for S3 partition
    creator classes
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Rename export partition size to export batch size
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Change s3 sink client to async client (#4425)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 18 Apr 2024 11:09:26 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Remove creating S3 prefix path partition upfront (#4432)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 17 Apr 2024 14:59:30 -0500
    
    
    This will be done when S3 sink writes data with path prefix.
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Gradle 8.7 (#4417)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 17 Apr 2024 11:02:05 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rename DocDB/MongoDB config parameters (#4426)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 16 Apr 2024 18:15:34 -0500
    
    
    * Rename DocDB/MongoDB config parameters
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update hostname to host in DocDB/MongDb config parameter
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Encode MongoDB/DocumentDB username and password while constructing connection string (#4423)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 16 Apr 2024 13:30:35 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Moves the Maven publish Gradle configuration into a Gradle convention plugin. This splits the build logic for publication and allows different projects to determine whether they publish to Maven rather than having to track this with conditionals in the root Gradle project. (#4421)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 16 Apr 2024 10:57:25 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix acknowledgements in DynamoDB (#4419)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 15 Apr 2024 16:45:58 -0700
    
    
    * Fix acknowledgements in DynamoDB
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Fix bug in s3 sink dynamic bucket and catch invalid bucket message (#4413)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 11 Apr 2024 18:48:14 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __AWS DocumentDB Stream/Export improvements with S3 partition (#4409)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 11 Apr 2024 17:02:12 -0500
    
    
    * AWS DocumentDB Stream/Export improvements with S3 partition
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update S3 Folder partition with one global state
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add support for dynamic bucket and default bucket in S3 sink (#4402)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 11 Apr 2024 16:51:19 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Do not write empty lists of DlqObject to the DLQ. Just ignore these requests in the S3DlqWriter class. (#4403)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Apr 2024 12:14:20 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Validate the AWS account Id in the S3 source when configuring either the default_bucket_owner or the bucket_owners map. Implemented this by adding a new bean validation annotation @AwsAccountId in the aws-plugin-api. Resolves #4398 (#4400)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Apr 2024 12:14:13 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix bug where using upsert or update without routing parameter caused NoSuchElementException (#4397)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 11 Apr 2024 13:51:18 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Create new codec for each s3 group in s3 sink (#4410)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 11 Apr 2024 11:18:34 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Create unit test report as html (#4384)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 10 Apr 2024 15:48:21 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Modified GRPC exception handler return BAD_REQUEST for certain internal errors (#4387)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 9 Apr 2024 15:16:58 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Simple script to help generate the release notes file as a starting point (#4322)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 9 Apr 2024 12:43:46 -0700
    
    
    This PR adds a small script that I&#39;ve used to create release notes recently. It
    can help us create release notes going forward.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: float up exception (#4391)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 9 Apr 2024 14:24:25 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Updates the S3/file codecs to use the EventFactory over JacksonLog/JacksonEvent builder(). (#4355)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 9 Apr 2024 11:47:14 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add developer guide/integration test section (#4330)__

    [Jürgen Walter](mailto:juergen.walter@sap.com) - Fri, 5 Apr 2024 14:08:33 -0700
    
    
    * Add developer guide/integration test section
     Aligned with Kafka example
    
    https://github.com/opensearch-project/data-prepper/blob/51ee0df595aaad1b921c888394bf3e110ffc74e9/data-prepper-plugins/kafka-plugins/README.md#developer-guide
    
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    * Use latest OpenSearch for testing
     Version 2.12.0 onwards requires to use non-default admin password
    
    https://opensearch.org/blog/replacing-default-admin-credentials/
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;
    
    ---------
     Signed-off-by: Jürgen Walter &lt;juergen.walter@sap.com&gt;

* __Corrects the release date for 2.7.0 (#4349)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 5 Apr 2024 08:42:11 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Cache geolocation data within any given batch of Data Prepper events to avoid extra calls to the MaxMind GeoIP code. (#4357)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 5 Apr 2024 07:24:16 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds KarstenSchnitter as a maintainer to the Data Prepper project (#4389)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 5 Apr 2024 07:23:06 -0700
    
    
    Adds KarstenSchnitter as a maintainer to the Data Prepper project.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Remove unexpected event handle message (#4388)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 4 Apr 2024 15:09:03 -0700
    
    
    * Remove unexpected event handle message
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add aggregate_threshold with maximum_size to s3 sink (#4385)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 4 Apr 2024 16:54:05 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add server connections metric to http and otel sources (#4393)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 4 Apr 2024 10:53:26 -0500
    
    
    * Add metric to http source
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add to Otel logs source
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add to Otel metrics source
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add to Otel trace source
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Optimize imports
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Added &#39;long&#39; as a target type for &#39;convert_entry_type&#39; processor (#4359)__

    [Utkarsh-Aga](mailto:126544832+Utkarsh-Aga@users.noreply.github.com) - Thu, 4 Apr 2024 08:14:59 -0700
    
    
    Added &#39;long&#39; as a target type for &#39;convert_entry_type&#39; processor
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;
    
    ---------
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;
    Co-authored-by:
    Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;

* __Log the User-Agent when Data Prepper shuts down from the POST /shutdown request. (#4390)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 4 Apr 2024 07:12:33 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __ENH: automatic credential refresh in kafka source (#4258)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 3 Apr 2024 14:49:20 -0500
    
    
    * ADD: basic credentials and dynamic refreshment
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix flaky PipelineConfigurationFileReaderTest (#4386)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 3 Apr 2024 12:16:16 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Do not require field_split_characters is not empty for key_value processor (#4358)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 3 Apr 2024 12:15:52 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Update Stream Ack Manager unit test and code refactor (#4383)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 2 Apr 2024 15:17:16 -0500
    
    
    * Update Stream Ack Manager unit test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Move CheckpointStatus to stream sub package and make it package protected
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add AcknowledgementSet support to DocumentDB/MongoDB streams (#4379)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 2 Apr 2024 13:20:59 -0500
    
    
    * Add AcknowledgementSet support to DocumentDB/MongoDB streams
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update StreamAcknowledgementManagerTest
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add BackgroundThreadFactory that adds thread name prefix for debugging
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update unit test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add creation and aggregation of dynamic S3 groups based on events (#4346)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 1 Apr 2024 17:43:12 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Aggregate Processor: local mode should work when there is no when condition (#4380)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 1 Apr 2024 12:22:09 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Fix count aggregation exemplar data (#4341)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 1 Apr 2024 12:12:39 -0700
    
    
    * Fix count aggregation exemplar data
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-15df884d.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-15df884d.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Signed-off-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-15df884d.us-west-2.amazon.com&gt;
    
    Co-authored-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-15df884d.us-west-2.amazon.com&gt;

* __Bump org.jetbrains.kotlin:kotlin-stdlib-common (#4363)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Apr 2024 09:29:19 -0700
    
    
    Bumps
    [org.jetbrains.kotlin:kotlin-stdlib-common](https://github.com/JetBrains/kotlin)
    from 1.9.22 to 1.9.23.
    - [Release notes](https://github.com/JetBrains/kotlin/releases)
    - [Changelog](https://github.com/JetBrains/kotlin/blob/v1.9.23/ChangeLog.md)
    - [Commits](https://github.com/JetBrains/kotlin/compare/v1.9.22...v1.9.23)
    
    ---
    updated-dependencies:
    - dependency-name: org.jetbrains.kotlin:kotlin-stdlib-common
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#4362)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 1 Apr 2024 09:25:52 -0700
    
    
    Bumps software.amazon.awssdk:auth from 2.25.0 to 2.25.21.
    
    ---
    updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Adds integration tests for the geoip processor (#4353)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 28 Mar 2024 12:06:31 -0700
    
    
    Adds integration tests for the geoip processor.
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    Signed-off-by: David
    Venable &lt;dlv@amazon.com&gt;
    Co-authored-by: Asif Sohail Mohammed
    &lt;nsifmoh@amazon.com&gt;

* __ENH: automatic credential refresher opensearch sink (#4283)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 28 Mar 2024 13:49:44 -0500
    
    
    ENH: automatic credential refresher opensearch sink
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Integration test to verify that the core HTTP server starts. (#4255)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 28 Mar 2024 09:19:08 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes the S3 source tests when running together (#4280)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 28 Mar 2024 09:18:33 -0700
    
    
    When running all the S3 source tests together, there are empty objects. This
    adds a mocked counter to avoid a NPE.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for MongoDB/DocumentDB stream processing (#4338)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 28 Mar 2024 11:05:36 -0500
    
    
    * Add support for MongoDB/DocumentDB stream processing
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add test for DataStreamPartitionCheckpoint
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Fix ExportScheduler unit test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add ingestion type meta data and minor fixes
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update unit test
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Use the org.lz4:lz4-java project instead of the old net.jpountz.lz4 project. (#4347)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 27 Mar 2024 16:27:28 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds new metrics to help debug errors connecting to OpenSearch. Resolves #4343, #4344 (#4348)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 27 Mar 2024 15:51:00 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix the release build by only applying the Maven publish task to either projects with a name starting with data-prepper or any projects that are children of the data-prepper-plugins project. (#4337)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 26 Mar 2024 15:28:44 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Handle errors from OpenSearch by checking status field as well as error (#4335)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 26 Mar 2024 14:27:44 -0700
    
    
    Handle errors from OpenSearch by checking both the status field and the error
    body for each bulk response item.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Removes the release flag from the release GitHub Action. It is no longer needed and it conflicts with the release task. (#4332)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 26 Mar 2024 12:14:51 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Revert HTTP data chunking changes for kafka buffer done in PR 4266 (#4329)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 26 Mar 2024 11:14:08 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Adds the release notes for Data Prepper 2.7.0. (#4321)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 26 Mar 2024 10:44:24 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix Router performance issue (#4327)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 25 Mar 2024 16:17:02 -0700
    
    
    * Fix Router performance issue
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Truncate Processor: Add support to truncate all fields in an event (#4317)__

    [Krishna Kondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 25 Mar 2024 11:09:01 -0700
    
    
    Truncate Processor: Add support to truncate all fields in an event
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Split up the Maven groupIds for core, plugins, and test to match package names. (#4324)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 25 Mar 2024 10:44:36 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the next Data Prepper version to 2.8. (#4320)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 22 Mar 2024 14:05:51 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Configure the MaxMind database by default and update it so that uses the correct defaults when loading. Resolves #3942 (#4310)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 21 Mar 2024 14:05:36 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.jetbrains.kotlin:kotlin-stdlib-common (#3877)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:05:03 -0700
    
    
    Bumps
    [org.jetbrains.kotlin:kotlin-stdlib-common](https://github.com/JetBrains/kotlin)
    from 1.8.21 to 1.9.22.
    - [Release notes](https://github.com/JetBrains/kotlin/releases)
    - [Changelog](https://github.com/JetBrains/kotlin/blob/master/ChangeLog.md)
    - [Commits](https://github.com/JetBrains/kotlin/compare/v1.8.21...v1.9.22)
    
    ---
    updated-dependencies:
    - dependency-name: org.jetbrains.kotlin:kotlin-stdlib-common
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.jetbrains.kotlin:kotlin-stdlib-common (#3886)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:04:51 -0700
    
    
    Bumps
    [org.jetbrains.kotlin:kotlin-stdlib-common](https://github.com/JetBrains/kotlin)
    from 1.8.21 to 1.9.22.
    - [Release notes](https://github.com/JetBrains/kotlin/releases)
    - [Changelog](https://github.com/JetBrains/kotlin/blob/master/ChangeLog.md)
    - [Commits](https://github.com/JetBrains/kotlin/compare/v1.8.21...v1.9.22)
    
    ---
    updated-dependencies:
    - dependency-name: org.jetbrains.kotlin:kotlin-stdlib-common
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.mock-server:mockserver-junit-jupiter-no-dependencies (#3785)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:03:53 -0700
    
    
    Bumps org.mock-server:mockserver-junit-jupiter-no-dependencies from 5.14.0 to
    5.15.0.
    
    ---
    updated-dependencies:
    - dependency-name: org.mock-server:mockserver-junit-jupiter-no-dependencies
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.httpcomponents.client5:httpclient5 (#4056)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:03:02 -0700
    
    
    Bumps
    [org.apache.httpcomponents.client5:httpclient5](https://github.com/apache/httpcomponents-client)
    from 5.2 to 5.3.1.
    -
    [Changelog](https://github.com/apache/httpcomponents-client/blob/rel/v5.3.1/RELEASE_NOTES.txt)
    
    -
    [Commits](https://github.com/apache/httpcomponents-client/compare/rel/v5.2...rel/v5.3.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.httpcomponents.client5:httpclient5
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.apptasticsoftware:rssreader in /data-prepper-plugins/rss-source (#4206)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:01:46 -0700
    
    
    Bumps [com.apptasticsoftware:rssreader](https://github.com/w3stling/rssreader)
    from 3.5.0 to 3.6.0.
    - [Release notes](https://github.com/w3stling/rssreader/releases)
    - [Commits](https://github.com/w3stling/rssreader/compare/v3.5.0...v3.6.0)
    
    ---
    updated-dependencies:
    - dependency-name: com.apptasticsoftware:rssreader
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#4216)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:01:19 -0700
    
    
    Bumps software.amazon.awssdk:auth from 2.24.5 to 2.25.0.
    
    ---
    updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.maven:maven-artifact from 3.0.3 to 3.9.6 (#4226)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:00:28 -0700
    
    
    Bumps [org.apache.maven:maven-artifact](https://github.com/apache/maven) from
    3.0.3 to 3.9.6.
    - [Release notes](https://github.com/apache/maven/releases)
    - [Commits](https://github.com/apache/maven/compare/maven-3.0.3...maven-3.9.6)
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.maven:maven-artifact in /data-prepper-plugins/opensearch (#3775)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 14:00:05 -0700
    
    
    Bumps [org.apache.maven:maven-artifact](https://github.com/apache/maven) from
    3.0.3 to 3.9.6.
    - [Release notes](https://github.com/apache/maven/releases)
    - [Commits](https://github.com/apache/maven/compare/maven-3.0.3...maven-3.9.6)
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.maven:maven-artifact
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.mapdb:mapdb in /data-prepper-plugins/mapdb-processor-state (#4059)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 13:57:12 -0700
    
    
    Bumps [org.mapdb:mapdb](https://github.com/jankotek/mapdb) from 3.0.10 to
    3.1.0.
    -
    [Commits](https://github.com/jankotek/mapdb/compare/mapdb-3.0.10...mapdb-3.1.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.mapdb:mapdb
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump io.gatling.gradle from 3.10.3.1 to 3.10.4 in /performance-test (#4215)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 13:56:08 -0700
    
    
    Bumps io.gatling.gradle from 3.10.3.1 to 3.10.4.
    
    ---
    updated-dependencies:
    - dependency-name: io.gatling.gradle
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-sink (#4217)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 13:55:21 -0700
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.5
    to 2.12.7.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.5...v2.12.7)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-source (#4207)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 13:55:07 -0700
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.6
    to 2.12.7.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.6...v2.12.7)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/rss-source (#4205)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 21 Mar 2024 13:54:47 -0700
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.6
    to 2.12.7.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.6...v2.12.7)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Adds a new tags_on_no_valid_ip configuration to geoip. Tag these events differently than the tags_on_ip_not_found condition. (#4307)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 21 Mar 2024 13:46:29 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Resolves transitive dependencies for 2.7.0 (#4308)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 21 Mar 2024 13:34:04 -0700
    
    
    Updates transitive dependencies to resolve CVE-2023-51775, CVE-2024-23944,
    CVE-2023-52428. Move some constraints such that they are only in the projects
    needing them. Resolves #4282, #4290, #4296.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Send acknowledgements to source when events are forwarded to remote peer (#4305)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 21 Mar 2024 11:10:44 -0700
    
    
    Send acknowledgements to source when events are forwarded to remote peer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Provide a config option to do node local aggregation (#4306)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 20 Mar 2024 22:50:53 -0700
    
    
    * Provide a config option to do node local aggregation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified config option to be local_mode
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Refactor PipelinesDataFlowModelParser to take in an InputStream instead of a file path (#4289)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 20 Mar 2024 16:35:41 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    

* __Fix the default behavior of geoip such that all fields from the databases are used. (#4303)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 20 Mar 2024 09:42:58 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix flaky test in ExportPartitionWorkerTest (#4300)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 19 Mar 2024 15:40:34 -0500
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#4284)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 13:06:30 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.22.1 to 2.23.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.22.1...rel/2.23.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Improve geoip performance by reducing database lookups (#4297)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 19 Mar 2024 11:10:06 -0700
    
    
    Use the city database instead of the country database if city fields are
    needed. This prevents duplicate reads. Optimize the databases to use Country if
    all the fields are available in that database. It looks up locations faster
    than the city database.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support to use old ddb stream image for REMOVE events (#4275)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 19 Mar 2024 10:22:37 -0700
    
    
    Add suport to use old ddb stream image for REMOVE events
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Bump org.apache.logging.log4j:log4j-jpl in /data-prepper-core (#4202)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 10:08:14 -0700
    
    
    Bumps org.apache.logging.log4j:log4j-jpl from 2.22.1 to 2.23.0.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-jpl
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#4209)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:44:28 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.11 to 1.14.12.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.11...byte-buddy-1.14.12)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-proto-common (#4219)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:43:17 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-logs-source (#4221)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:39:13 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#4220)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:38:26 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-trace-source (#4214)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:36:37 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#4212)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:36:09 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/http-source (#4201)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:35:52 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#4204)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 19 Mar 2024 09:35:22 -0700
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.25.2 to 3.25.3.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.25.2...assertj-build-3.25.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __GeoIP performance: database expiration and InetAddress optimization (#4286)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 19 Mar 2024 07:07:40 -0700
    
    
    Performance improvements for the geoip processor: Only parse the IP address
    once and track the database expiration for each batch of the geoip processor.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Random Apache log data from performance test (#4243)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 19 Mar 2024 06:54:35 -0700
    
    
    Updates the performance test tool to generate random data for Common Apache
    Logs. This includes predefined and random IPv4 addresses as well as predefined
    IPv6 addresses. By default, only IPv4 addresses are supplied from the
    predefined list. When sending the single log, use a randomly generated log.
    Adds a StaticRequestSimulation to send the exact static log instead.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __DocumentDB/MongoDB source initial checkpoint progress and other improvemnts (#4293)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 18 Mar 2024 16:47:26 -0500
    
    
    * DocumentDB/MongoDB source initial checkpoint progress and other improvemnts
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Undo typo
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Use Awaitility in two of the mongodb unit tests instead of depending on Thread.sleep(). (#4288)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Mar 2024 13:22:02 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Refactors the geoip code packages by moving more classes into the extension package. Also make quite a few projects package protected as they are specific to the extension. (#4269)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Mar 2024 07:41:48 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Name the S3 source&#39;s SQS worker threads (#4279)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Mar 2024 07:41:04 -0700
    
    
    Creates a new common class for creating background threads. Name the threads
    for the S3 source&#39;s SQS worker threads.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Unit test fix for MongoDB LeaderScheduler (#4287)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 15 Mar 2024 07:39:53 -0700
    
    
    Unit test fix for MongoDB LeaderScheduler
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add DocumentDB/MongoDB source for initial load (#4285)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 14 Mar 2024 17:41:35 -0500
    
    
    * Add DocumentDB/MongoDB source for initial load
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update unit test parameter
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Extract the data-prepper-plugin-framework from data-prepper-core (#4260)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 14 Mar 2024 16:02:54 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add ExportScheduler and LeaderScheduler for MongoDB/DocumentDB source (#4277)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 14 Mar 2024 13:07:28 -0500
    
    
    * Add ExportScheduler and LeaderScheduler for MongoDB/DocumentDB source
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update access modifier for static field
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Unit test updates
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add MongoDB Export Partition supplier
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Logging collection when creating scheduler
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Split HTTP source data to multiple chunks before writing to byte buffer (#4266)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 13 Mar 2024 17:18:57 -0700
    
    
    * Split HTTP source data to multiple chunks before writing to byte buffer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified JsonDecoder to parse objects in addition to array of objects
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added a test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed json to array conversion
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to add new JsonObjDecoder for decoding single json objects
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed changes to JsonDecoder
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Renamed JsonObjDecoder to JsonObjectDecoder
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Fix ip check and add more tests (#4278)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 13 Mar 2024 16:54:33 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add source coordinator partition and partition state (#4276)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 13 Mar 2024 14:33:17 -0500
    
    
    * Add source coordinator partition and partition state
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Remove unused import
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add support for mongodb/documentdb initial load record export (#4271)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 13 Mar 2024 09:48:39 -0500
    
    
    * Initial Mongo/DocumentDB source Configuration and Client
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Initial Mongo/DocumentDB source Configuration and Client
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Initial Mongo/DocumentDB source Configuration and Client
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update setting gradle file with mongodb module
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Renamed Configuration parameters and refactored the MongoDBHelper class
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add MongoDB Connection helper class
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add support for mongodb/documentdb initial load record export
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Updated mongodb event metadata attribute name
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Refactored record conversion into functional class
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Remove the S3 transfer manager in favor of using the S3 client directly to download files. All download scenarios are straightforward and don&#39;t need the transfer manager. This removes some unnecessary dependencies and reduces the overall file size. (#4257)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 12 Mar 2024 14:55:28 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support large files in file source by using a thread (#4256)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 12 Mar 2024 10:39:51 -0700
    
    
    Run the file source in its own thread so that Data Prepper can read large
    files.
     Also adds stop calls to RandomStringSourceTests because these were continuing
    to run and using up memory.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Initial Mongo/DocumentDB source Configuration and Client (#4265)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 12 Mar 2024 11:09:27 -0500
    
    
    * Initial Mongo/DocumentDB source Configuration and Client
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Initial Mongo/DocumentDB source Configuration and Client
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Initial Mongo/DocumentDB source Configuration and Client
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update setting gradle file with mongodb module
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Renamed Configuration parameters and refactored the MongoDBHelper class
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add MongoDB Connection helper class
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix bug where process worker would shut down if a processor drops all… (#4262)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 12 Mar 2024 10:48:38 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds a GitHub Action to verify the aws-testing-cdk project. It runs the linter and tests. Adds a unit test for this project. Correct the formatting to pass the linter. (#4263)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 12 Mar 2024 08:40:21 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for creating SSLContext for trustStore file path (#4264)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 11 Mar 2024 17:42:52 -0500
    
    
    * Add support for creating SSLContext for trustStore file path
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Add support for creating SSLContext for trustStore file path
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#4213)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 11 Mar 2024 15:03:34 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.22.1 to 2.23.0.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.22.1...rel/2.23.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __MNT: system property on confluent IT (#4259)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 11 Mar 2024 14:57:16 -0700
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Creates a simple example of using Fluentd to send data from a file to Data Prepper. (#4248)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 11 Mar 2024 12:13:15 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rename first and second database directories to blue and green to avoid indicating order. (#4249)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 11 Mar 2024 09:05:42 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add all subprojects as core projects. (#4254)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Fri, 8 Mar 2024 12:20:01 -0800
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Fix release task after broken by #4247. (#4253)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Fri, 8 Mar 2024 11:31:42 -0600
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Set up serverless network policy before setting up index (#4250)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 8 Mar 2024 10:02:50 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Extract parsing in data-prepper-core to data-prepper-pipeline-parser module (#4247)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 7 Mar 2024 17:34:18 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add key_value_when conditional to key_value processor (#4246)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 7 Mar 2024 15:47:30 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add release task to publish all jars. (#4238)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Thu, 7 Mar 2024 13:09:40 -0800
    
    
    This commit adds a task called release which will publish all of the
    data
    prepper jars individually.
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Make using the EventFactory easier by adding a test package and class to get a test EventFactory. It uses the actual EventFactory for now, but could vary in the future. Creates two now Gradle projects - one of the event factory and another for getting a test EventFactory. This also updates the file source to create Events using the EventFactory as the initial source. (#4110)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 7 Mar 2024 12:13:40 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Various fixes for the geoip processor: avoid DNS lookups on IP addresses, better User-Agent, configuration constraints, use correct database_destination. Updates MaxMind dependencies to the latest version. Remove unused project. (#4244)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 7 Mar 2024 11:54:56 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add Buffer Latency Metric (#4237)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 7 Mar 2024 08:25:24 -0800
    
    
    * Add Buffer Latency Metric
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing code verification test by adding new test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added null check before calling updateLatency
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Bump org.wiremock:wiremock in /data-prepper-plugins/s3-source (#4208)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 7 Mar 2024 07:59:35 -0800
    
    
    Bumps [org.wiremock:wiremock](https://github.com/wiremock/wiremock) from 3.3.1
    to 3.4.2.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.3.1...3.4.2)
    
    ---
    updated-dependencies:
    - dependency-name: org.wiremock:wiremock
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Fix CVEs CVE-2024-22201  and CVE-2023-3635 (#4192)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 7 Mar 2024 07:38:24 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Modify S3 Source to create multiple SqsWorkers (#4239)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 6 Mar 2024 12:54:22 -0800
    
    
    * Modify S3 Source to create multiple SqsWorkers
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments and added integration test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Organizes the GeoIP processor Java packages. Use plugins.geoip as the root package and then move processor-specific classes into plugins.geoip.processor. (#4240)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 6 Mar 2024 09:57:40 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __ENH: use timer for latency (#4174)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 6 Mar 2024 09:41:01 -0800
    
    
    ENH: use timer for latency
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add exclude_keys option to flatten processor (#4231)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 5 Mar 2024 14:55:27 -0600
    
    
    * Add exclude_keys option to flatten processor
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments - refactor excludeKeySet
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add check for if performance_metadata is enabled before adding metadata for grok processing time to Events (#4236)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 5 Mar 2024 14:52:43 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Change grok performance_metadata to be disabled by default (#4235)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 5 Mar 2024 13:18:05 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Geoip config enhancements (#4167)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 5 Mar 2024 09:14:03 -0800
    
    
    Add when condition to each entry. Reverted when condition to processor level.
    Updated metric logic and Added new test. Geoip database readers update
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Removes the type-conversion-processor project. The actual processor is part of the mutate-event-processors project. (#4234)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 5 Mar 2024 08:03:52 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Create parse xml processor (#4191)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 4 Mar 2024 15:37:22 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add support for metadata in Events for the total time spent in grok (#4230)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 4 Mar 2024 15:36:58 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix pipeline latency to calculate correct latency when persistent buffer is used (#4187)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 29 Feb 2024 16:44:27 -0600
    
    
    * Fix pipeline latency to calculate correct latency when persistent buffer is
    used
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle error and addressed comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Fix KafkaBuffer isEmpty (#4200)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 29 Feb 2024 16:40:36 -0600
    
    
    * Fix KafkaBuffer isEmpty
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add include_performance_metadata parameter and track total grok patterns attempted in the grok processor (#4197)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 29 Feb 2024 12:10:02 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix to set kafka source truststore path and password only when they are not null value (#4199)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Thu, 29 Feb 2024 10:29:11 -0600
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add flatten processor (#4138)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 28 Feb 2024 15:20:09 -0600
    
    
    * Initial commit
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add complete functionality and tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add test cases with dots in keys
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update JacksonEvent tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Rename project to flatten-processor
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Rename flattenjson to flatten
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix commons-compress CVE (#4172)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Wed, 28 Feb 2024 15:06:21 -0600
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __This updates Jackson to 2.16.1. This version does include a change to redact input data in exceptions. So a couple tests needed modifications. Additionally, this uses ion-java 1.10.5 which has a fix for  CVE-2024-21634, so this PR will resolve #3926. (#4134)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 28 Feb 2024 15:05:53 -0600
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for spilt event processor (#4166)__

    [Srikanth Govindarajan](mailto:srikanthjg123@gmail.com) - Wed, 28 Feb 2024 14:28:25 -0600
    
    
    * Add support for spilt event processor
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add support for spilt event processor(#4089)
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add support for spilt event processor(#4089)
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    * Add support for spilt event processor(#4089)
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    
    ---------
     Signed-off-by: srigovs &lt;srigovs@amazon.com&gt;
    Signed-off-by: Srikanth
    Govindarajan &lt;srikanthjg123@gmail.com&gt;

* __Missed setting the default value in PR #4190 (#4193)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 27 Feb 2024 15:28:43 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Set default value of flattenAttributes to true in Otel metrics source (#4190)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 27 Feb 2024 12:06:32 -0800
    
    
    * Set default value of flattenAttributes to true in Otel metrics source
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added test for get/setFlattenAttributes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Modify shutdown listeners to support a List of listeners (#4189)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 27 Feb 2024 12:43:19 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support certificate content in Opensearch Source configuration to sup… (#4184)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Mon, 26 Feb 2024 16:44:33 -0600
    
    
    * Support certificate content in Opensearch Source configuration to support TLS
    and truststore on the client.
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update unit test try block coverage for staic mocked object
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add select_entries processor (#4147)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Sat, 24 Feb 2024 21:36:39 -0800
    
    
    * Add select_entries processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add new OTEL Metrics source that creates events (#4183)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Sat, 24 Feb 2024 21:35:56 -0800
    
    
    * Add new OTEL Metrics source that creates events
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to replace existing processor with new functionality where new
    events are created in the source
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Allow format expression in keys in add_entries processor (#4182)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 23 Feb 2024 17:30:50 -0600
    
    
    * Allow format expression in keys
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments: use format expression
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add csv_when parameter to the csv processor (#4179)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 23 Feb 2024 16:56:36 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support Kafka SASL_SSL/SSL security protocol for self signed certificate in Kafka Consumer (#4181)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Fri, 23 Feb 2024 14:41:11 -0800
    
    
    * Support Kafka SASL_SSL/SSL security protocol for self signed certificate in
    Kafka Consumer
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Support Kafka SASL_SSL/SSL security protocol for self signed certificate in
    Kafka Consumer
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Support Kafka SASL_SSL/SSL security protocol for self signed certifice
    
    - Renamed the field names for certificate, truststore and password.
    - Removed redundant information from build.gradle
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Support Kafka SASL_SSL/SSL security protocol for self signed certificate in
    Kafka Consumer
    
    - Add the copyright block to build.gradle
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    * Update unit test to include actual random values
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix OpenSearchSink upsert operation (#4178)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 22 Feb 2024 16:38:23 -0800
    
    
    * Fix opensearch upsert operation in Opensearch Sink
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to to Stringutils.equals
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Update dissect and user_agent readme (#4100)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 22 Feb 2024 10:21:23 -0600
    
    
    * Update dissect and user_agent readme
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix format issue
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix kafka plugin dependencies. (#4169)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Wed, 21 Feb 2024 12:53:51 -0800
    
    
    1. Integration test dependencies were being pulled in when compiling
      source code and unit tests.
    2. The wrong namespace for json-schema-validator
    was being used.
    3. Remove catching BrokerEndPointNotAvailableException because
    that
      exception will not be thrown by Kafka clients.3. Remove catching
    
    BrokerEndPointNotAvailableException because that exception will not be
    thrown
    by Kafka clients.3. Remove catching
    BrokerEndPointNotAvailableException
    because that exception will not be
    thrown by Kafka clients.
    Signed-off-by:
    Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Moves the repository declarations to the settings.gradle file to help maintain in one place. Also limit the groups used by the JitPack Maven repository to the one dependency that is needed. This way, we use Maven Central over it. (#4161)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 21 Feb 2024 12:35:19 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Catch processor exceptions instead of shutting down (#4155) (#4162)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 21 Feb 2024 11:18:47 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Geoip database update implementation (#4105)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 20 Feb 2024 20:02:46 -0600
    
    
    * Geoip processor implementation
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Delay reading from the Kafka buffer as long as the circuit breaker is open (#4135)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 20 Feb 2024 14:06:08 -0800
    
    
    Hold off on consuming from the Kafka topic as long as a pause-consume predicate
    is in place. This will allow the Kafka buffer to wait for the circuit breaker
    to close before reading. Also pause the topic while the circuit breaker is
    open.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Catch processor exceptions instead of shutting down (#4155)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 20 Feb 2024 11:36:24 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add append option to add_entries processor (#4143)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Tue, 20 Feb 2024 11:32:51 -0600
    
    
    * Add append option
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments: combine two mergeValue methods
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address comments: update assertion message
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Adds the CHANGELOG for Data Prepper 2.6.2. (#4156)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 20 Feb 2024 06:26:27 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#4153)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 19 Feb 2024 12:48:22 -0800
    
    
    Bumps software.amazon.awssdk:auth from 2.23.13 to 2.24.5.
    
    ---
    updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Registers some common producer metrics in the Kafka buffer. (#4139)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 19 Feb 2024 11:52:13 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Make expressions evaluating on keys with List or Map values not throw an exception (#4142)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 19 Feb 2024 13:06:16 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Replace try-catch with if check (#4144)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 19 Feb 2024 11:17:22 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Removes unnecessary mavenCentral() declarations in Gradle sub-projects. (#4152)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 19 Feb 2024 09:14:42 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds release notes for Data Prepper 2.6.2 (#4149)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 19 Feb 2024 08:28:15 -0800
    
    
    * Adds release notes for Data Prepper 2.6.2
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump grpcio in /release/smoke-tests/otel-span-exporter (#4104)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 19 Feb 2024 06:39:25 -0800
    
    
    Bumps [grpcio](https://github.com/grpc/grpc) from 1.53.0 to 1.53.2.
    - [Release notes](https://github.com/grpc/grpc/releases)
    -
    [Changelog](https://github.com/grpc/grpc/blob/master/doc/grpc_release_schedule.md)
    
    - [Commits](https://github.com/grpc/grpc/compare/v1.53.0...v1.53.2)
    
    ---
    updated-dependencies:
    - dependency-name: grpcio
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __KafkaConsumer should continue to poll while waiting for buffer (#4023)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 16 Feb 2024 12:36:32 -0800
    
    
    * KafkaConsumer should continue to poll while waiting for buffer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to call pause() whenever parititon assignment changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Updates the JDK version of the release to jdk-17.0.10+7. (#4136)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 16 Feb 2024 12:01:21 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update README.md (#4093)__

    [Travis Benedict](mailto:benedtra@amazon.com) - Fri, 16 Feb 2024 09:56:06 -0600
    
    
    Signed-off-by: Travis Benedict &lt;benedtra@amazon.com&gt;

* __Support for logging MDC in the Kafka buffer (#4131)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 15 Feb 2024 14:31:49 -0800
    
    
    Uses logging MDC within the KafkaBuffer entry points. Create the Kafka Buffer
    consumer threads with MDC. Name the consumer threads to help when tracking down
    thread dumps. First part of #4126
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.hibernate.validator:hibernate-validator (#3791)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 15 Feb 2024 08:56:45 -0800
    
    
    Bumps
    [org.hibernate.validator:hibernate-validator](https://github.com/hibernate/hibernate-validator)
    from 7.0.5.Final to 8.0.1.Final.
    -
    [Changelog](https://github.com/hibernate/hibernate-validator/blob/main/changelog.txt)
    
    -
    [Commits](https://github.com/hibernate/hibernate-validator/compare/7.0.5.Final...8.0.1.Final)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.hibernate.validator:hibernate-validator
     dependency-type: direct:production
     update-type: version-update:semver-major
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Require json-path 2.9.0 to fix CVE-2023-51074. Resolves #3919. (#4132)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 15 Feb 2024 08:54:45 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.hibernate.validator:hibernate-validator (#3799)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 15 Feb 2024 08:28:34 -0800
    
    
    Bumps
    [org.hibernate.validator:hibernate-validator](https://github.com/hibernate/hibernate-validator)
    from 7.0.5.Final to 8.0.1.Final.
    -
    [Changelog](https://github.com/hibernate/hibernate-validator/blob/main/changelog.txt)
    
    -
    [Commits](https://github.com/hibernate/hibernate-validator/compare/7.0.5.Final...8.0.1.Final)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.hibernate.validator:hibernate-validator
     dependency-type: direct:production
     update-type: version-update:semver-major
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Allow . and @ characters to be part of json pointer in expressions (#4130)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 15 Feb 2024 08:19:57 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Removes the Kafka Connect plugins project. (#4090)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 15 Feb 2024 08:12:58 -0800
    
    
    Removes the Kafka Connect plugins project. Deletes the source. Updates the
    README.md.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Create decrompress processor to decompress gzipped keys (#4118)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 14 Feb 2024 14:08:36 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Enhancements to map_to_list processor (#4033)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 14 Feb 2024 12:44:23 -0600
    
    
    * Add convert-field-to-list option
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Fix bug where s3 scan could skip when lastModifiedTimestamps are the same (#4124)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 14 Feb 2024 11:07:22 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Corrections to Kafka integration tests in GitHub (#4115)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 13 Feb 2024 09:16:21 -0800
    
    
    Replaces missing tests in the Kafka integration tests. Corrected the Kafka
    tests to run against the PR target so that secrets are available.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes a bug where the Kafka buffer inverted the relationship for the create_topic configuration. Supports better unit testing through some refactoring. Resolves #4111 (#4114)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 13 Feb 2024 09:14:48 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the S3 source README.md to link to the user documentation and retain the developer guide. (#4094)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 13 Feb 2024 09:13:26 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Added support for &#39;epoch_micro&#39; in date processor (#4098)__

    [Utkarsh-Aga](mailto:126544832+Utkarsh-Aga@users.noreply.github.com) - Tue, 13 Feb 2024 08:45:06 -0800
    
    
    * Added support for &#39;epoch_micro&#39; in date processor
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;
    
    * Added support for &#39;epoch_micro&#39; in date processor
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;
    
    ---------
     Signed-off-by: Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;
    Co-authored-by:
    Utkarsh Agarwal &lt;utkarsh07379@gmail.com&gt;

* __Updates the dynamodb source README.md to refer to the user documentation (#4095)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 12 Feb 2024 16:57:30 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Catch exception instead of shutting down in date processor (#4108)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 12 Feb 2024 12:07:01 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add when condition to each geoip entry (#4034)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 12 Feb 2024 10:13:45 -0600
    
    
    * Add when condition
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Runs the Kafka buffer KMS tests as part of the GitHub Actions (#4041)__

    [David Venable](mailto:dlv@amazon.com) - Sat, 10 Feb 2024 08:24:36 -0800
    
    
    Runs the Kafka buffer KMS tests using the DataPrepperTesting KMS key. Resolves
    #4040
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support input codecs in the file source. Resolves #4018. (#4019)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 9 Feb 2024 15:16:46 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Enhance copy_values processor to selectively copy entries from lists (#4085)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 9 Feb 2024 15:09:53 -0600
    
    
    * initial experiment
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add list copy options
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove unused imports
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Extract shouldCopyEntry method
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Bump org.jetbrains.kotlin:kotlin-stdlib in /data-prepper-plugins/s3-sink (#3876)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 9 Feb 2024 10:50:37 -0800
    
    
    Bumps [org.jetbrains.kotlin:kotlin-stdlib](https://github.com/JetBrains/kotlin)
    from 1.8.21 to 1.9.22.
    - [Release notes](https://github.com/JetBrains/kotlin/releases)
    - [Changelog](https://github.com/JetBrains/kotlin/blob/master/ChangeLog.md)
    - [Commits](https://github.com/JetBrains/kotlin/compare/v1.8.21...v1.9.22)
    
    ---
    updated-dependencies:
    - dependency-name: org.jetbrains.kotlin:kotlin-stdlib
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/rss-source (#4058)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 9 Feb 2024 10:48:49 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.5
    to 2.12.6.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.5...v2.12.6)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-source (#4063)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 9 Feb 2024 10:48:21 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.12.5
    to 2.12.6.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.12.5...v2.12.6)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump io.gatling.gradle from 3.10.3 to 3.10.3.1 in /performance-test (#4055)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 9 Feb 2024 10:47:27 -0800
    
    
    Bumps io.gatling.gradle from 3.10.3 to 3.10.3.1.
    
    ---
    updated-dependencies:
    - dependency-name: io.gatling.gradle
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#3896)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 9 Feb 2024 10:46:52 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.22.0 to 2.22.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.22.0...rel/2.22.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __When writing Kafka buffer events, save additional information about the encryption in the protobuf record. Contributes toward #3655. (#3976)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 8 Feb 2024 13:54:14 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.json:json in /data-prepper-plugins/avro-codecs (#4087)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 8 Feb 2024 11:13:29 -0800
    
    
    Bumps [org.json:json](https://github.com/douglascrockford/JSON-java) from
    20230227 to 20240205.
    - [Release notes](https://github.com/douglascrockford/JSON-java/releases)
    -
    [Changelog](https://github.com/stleary/JSON-java/blob/master/docs/RELEASES.md)
    - [Commits](https://github.com/douglascrockford/JSON-java/commits)
    
    ---
    updated-dependencies:
    - dependency-name: org.json:json
     dependency-type: direct:production
     update-type: version-update:semver-major
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#4042)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 14:00:26 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/http-source (#4051)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 14:00:03 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#4053)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 13:59:32 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-logs-source (#4043)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 13:34:01 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core (#4057)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 13:31:57 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/s3-source (#4061)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 13:31:30 -0800
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.1 to 1.1.10.5.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.1...v1.1.10.5)
    
    ---
    updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-trace-source (#4064)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 13:30:59 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.assertj:assertj-core in /data-prepper-plugins/otel-proto-common (#4065)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 6 Feb 2024 13:29:59 -0800
    
    
    Bumps [org.assertj:assertj-core](https://github.com/assertj/assertj) from
    3.24.2 to 3.25.2.
    - [Release notes](https://github.com/assertj/assertj/releases)
    -
    [Commits](https://github.com/assertj/assertj/compare/assertj-build-3.24.2...assertj-build-3.25.2)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.assertj:assertj-core
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump dash in /examples/trace-analytics-sample-app/sample-app (#4078)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 5 Feb 2024 18:41:33 -0800
    
    
    Bumps [dash](https://github.com/plotly/dash) from 2.14.1 to 2.15.0.
    - [Release notes](https://github.com/plotly/dash/releases)
    - [Changelog](https://github.com/plotly/dash/blob/dev/CHANGELOG.md)
    - [Commits](https://github.com/plotly/dash/compare/v2.14.1...v2.15.0)
    
    ---
    updated-dependencies:
    - dependency-name: dash
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Lower min duration validation for scheduled s3 scan interval from 30 seconds to 1 second (#4082)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 5 Feb 2024 15:57:40 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Enhancements to list_to_map processor (#4038)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 5 Feb 2024 14:36:52 -0600
    
    
    * Test key as optional
    * Add new options; simplify existing code
    * Add options to use source key as key in result map
    * Add tags_on_failure option
    * Remove restrictions on  option
    * Address review comments
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Add join function (#4075)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 5 Feb 2024 14:36:18 -0600
    
    
    * Add join function
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __FIX: plugin callback not loaded for secret refreshment (#4079)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 5 Feb 2024 09:38:52 -0600
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __ENH: error handling in opensearch client refreshment and metrics (#4039)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 2 Feb 2024 16:17:40 -0600
    
    
    * ENH: error handling in client refreshment and metrics
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Bump com.github.seancfoley:ipaddress in /data-prepper-expression (#4060)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 2 Feb 2024 09:34:17 -0800
    
    
    Bumps
    [com.github.seancfoley:ipaddress](https://github.com/seancfoley/IPAddress) from
    5.4.0 to 5.4.2.
    - [Release notes](https://github.com/seancfoley/IPAddress/releases)
    - [Commits](https://github.com/seancfoley/IPAddress/compare/v5.4.0...v5.4.2)
    
    ---
    updated-dependencies:
    - dependency-name: com.github.seancfoley:ipaddress
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates the Kafka client libraries to the latest - Apache Kafka clients to 3.6.1 and the MSK IAM authentication library to 2.0.3. Removes the AWS SDK v1 Glue package. (#4048)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 1 Feb 2024 11:05:50 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __ENH: allow disable secret refreshment (#3990)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 31 Jan 2024 15:41:13 -0600
    
    
    * ENH: allow disable secret refreshment
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Tag events that fail for all exceptions in the grok processor. Resolves #4031 (#4032)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 30 Jan 2024 12:04:34 -0800
    
    
    Tags events that fail for all exceptions. Resolves #4031
     Adds a tags_on_timeout configuration which tags events that timeout
    differently from those that fail for other reasons. Configure the default
    behavior of tags_on_timeout to take on the value of tags_on_match_failure.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Throw a more useful error when the S3 source is unable to determine the bucket ownership to use. (#4021)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 30 Jan 2024 10:58:36 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Integration tests for using the Kafka buffer with KMS encryption (#3982)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 30 Jan 2024 08:15:09 -0800
    
    
    Adds a new integration test for using the Kafka buffer with KMS encryption.
    Includes a new KMS CDK stack for any projects that need KMS to use. Some
    improvements to the CDK stack. Resolves #3980
     Change the GitHub tests to include only the Kafka buffer tests which current
    run in GitHub.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump software.amazon.awssdk:auth in /performance-test (#4030)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 30 Jan 2024 07:48:28 -0800
    
    
    Bumps software.amazon.awssdk:auth from 2.20.67 to 2.23.13.
    
    ---
    updated-dependencies:
    - dependency-name: software.amazon.awssdk:auth
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates jline to 3.25.0 to resolve CVE-2023-50572. (#4020)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 29 Jan 2024 16:29:59 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Changing version AWSSDK V1 to V2 (#4025)__

    [Prathyusha Vangala](mailto:157630736+shaavanga@users.noreply.github.com) - Mon, 29 Jan 2024 14:45:32 -0800
    
    
    Changing AWSSDK v1 to v2
     Signed-off-by: shaavanga &lt;prathyuvanga@gmail.com&gt;
    Co-authored-by: Prathyusha
    Vangala &lt;shavanga@amazon.com&gt;

* __Cancel the existing grok task when a timeout occurs. Resolves #4026 (#4027)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 29 Jan 2024 14:44:54 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Added when condition and fixed building reader on each event (#4002)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 29 Jan 2024 14:01:11 -0600
    
    
    * Added when condition and fixed building reader on each event
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Aggregator processor should evaluate aggregate_when condition before forwarding events to remote peer (#4004)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 24 Jan 2024 17:26:31 -0800
    
    
    Aggregator processor should evaluate aggregate_when condition before forwarding
    events to remote peer
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Allow flexible DateTime pattern location in index name (#4000)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Wed, 24 Jan 2024 16:18:07 -0600
    
    
    * Allow datetime pattern anywhere in index name
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add integ tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Remove leading dash in indexPrefix
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update index patterns
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Add integ tests for verifying index template creation
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update readme
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Update unit tests to address review comments
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Use regex Pattern for replaceAll
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Added ByteCount to plugin parser (#4003)__

    [Guian Gumpac](mailto:guian.gumpac@improving.com) - Wed, 24 Jan 2024 12:30:46 -0800
    
    
    Signed-off-by: Guian Gumpac &lt;guian.gumpac@improving.com&gt;

* __Fixes a build failure related to geoip. (#4005)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 23 Jan 2024 14:38:44 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates our OTel plugin projects to use JUnit 5 from JUnit 4. Use package protected access for the tests and methods. (#3970)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 23 Jan 2024 13:59:16 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rebased to latest and addressed review comments (#3998)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 23 Jan 2024 09:46:49 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Check that System.out.println or Exception::printStackTrace() are not used. Removed usage of those two in our main code and tests. (#3991)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 23 Jan 2024 09:11:05 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the common plugin and mapdb-processor-state projects to JUnit 5. (#3949)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 23 Jan 2024 08:11:00 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Log when Data Prepper is shutdown via the HTTP shutdown endpoint. (#4001)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 23 Jan 2024 07:59:30 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Change SQS visibility timeout change message log level to debug level (#3997)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 22 Jan 2024 12:50:07 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Update geoip config and use extensions (#3975)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 22 Jan 2024 12:54:37 -0600
    
    
    * Update geoip config and use extensions
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Use the official unit string for the &#39;b&#39; when creating the ByteCount string. (#3993)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 19 Jan 2024 12:06:30 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improves usability of the ByteCount class by implementing equals()/hashCode()/toString(). (#3960)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 19 Jan 2024 11:43:44 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Kafka error handling in KafkaBuffer (#3974)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 19 Jan 2024 11:35:53 -0800
    
    
    * Rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing spotless check
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Mark the EventHandle as transient in the JacksonEvent to fix a serialization error with peer forwarding. Resolves #3981. (#3983)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 18 Jan 2024 14:41:38 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix typo in truncate processor documentation (#3985)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 18 Jan 2024 14:02:44 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __ENH: metrics in secret extension (#3922)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 18 Jan 2024 14:50:19 -0600
    
    
    * ENH: add metrics in aws secrets extension
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    

* __ENH: support secret binary value (#3923)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 18 Jan 2024 11:37:36 -0600
    
    
    * ENH: support secret binary value
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Updates the Gatling version in the performance-test to 3.10.3. The 3.10 release includes a breaking change that required updating a Consumer to a Function. Added some additional instructions for running the performance tests against Amazon OpenSearch Ingestion. (#3955)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 18 Jan 2024 08:46:45 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds a new integration test for the Kafka buffer which verifies that data written is correctly read and decrypted. This work will be used to verify upcoming changes to the Protobuf model. (#3973)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 17 Jan 2024 15:08:08 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Greatly reduce the time that the KafkaSinkTest takes by mocking the constructor. Update the unit tests to JUnit 5. Only the integration tests need JUnit 4 now, but these use quite a few JUnit 4 features. (#3972)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 17 Jan 2024 13:07:35 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Remove references to default admin creds (#3869)__

    [Derek Ho](mailto:derek01778@gmail.com) - Wed, 17 Jan 2024 12:45:40 -0800
    
    
    Signed-off-by: Derek Ho &lt;dxho@amazon.com&gt;

* __Updates wiremock to 3.3.1. This also involves changing the groupId to org.wiremock which is the new groupId as of 3.0.0. (#3969)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 17 Jan 2024 10:25:32 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add geoip service extension (#3944)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Wed, 17 Jan 2024 11:56:20 -0600
    
    
    * Add geoip service extension
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Release events that are not routed to any sinks (#3959)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 16 Jan 2024 11:08:33 -0800
    
    
    * Release events that are not routed to any sinks
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed a bug in the code that&#39;s causing the test failures
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to determine unrouted events after all routing is done
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Add test yaml files
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __GitHub-issue#1994 : Implementation Of Cloudwatch metrics source plugin c… (#3128)__

    [venkataraopasyavula](mailto:126578319+venkataraopasyavula@users.noreply.github.com) - Tue, 16 Jan 2024 08:23:48 -0800
    
    
    GitHub-issue#1994 : Implementation Of Cloudwatch metrics source plugin
    configuration Junit test cases and source coordinator.
    Signed-off-by:
    venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    ---------
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    Co-authored-by:
    rajeshLovesToCode &lt;131366272+rajeshLovesToCode@users.noreply.github.com&gt;
    
    Co-authored-by: rajeshLovesToCode &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    Co-authored-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds max_request_length as a configuration for the http and OTel sources (#3958)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 12 Jan 2024 09:06:58 -0800
    
    
    Adds max_request_length as a configuration for the http, otel_trace_source,
    otel_metrics_source, and otel_logs_source sources. Resolves #3931
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add map_to_list processor (#3945)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Thu, 11 Jan 2024 12:59:02 -0800
    
    
    Add map to list processor basic functionality and unit tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Bump com.github.tomakehurst:wiremock in /data-prepper-plugins/s3-source (#3777)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 11 Jan 2024 11:59:11 -0800
    
    
    Bumps [com.github.tomakehurst:wiremock](https://github.com/wiremock/wiremock)
    from 3.0.0-beta-8 to 3.0.1.
    - [Release notes](https://github.com/wiremock/wiremock/releases)
    - [Commits](https://github.com/wiremock/wiremock/compare/3.0.0-beta-8...3.0.1)
    
    ---
    updated-dependencies:
    - dependency-name: com.github.tomakehurst:wiremock
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Add your public modifier back to one of the AbstractBuffer constructors to attempt to fix the build. (#3947)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Jan 2024 10:38:22 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Support format expressions for routing in the opensearch sink (#3863)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 11 Jan 2024 09:15:06 -0800
    
    
    * Support format expressions for routing in the opensearch sink
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add truncate string processor (#3924)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 11 Jan 2024 09:14:43 -0800
    
    
    * Add truncate string processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added check for negative numbers in the config input
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to make truncate processor a top level processor, not specific to
    strings
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Updated documentation with correct configuration
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed typos in the documentation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to allow more than one source keys in the config
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to allow multiple entries under configuration
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Adds a delay processor to put a delay into the processor chain to help with debugging and testing. (#3939)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 11 Jan 2024 08:53:57 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Corrects the bufferUsage metric by making it equal to the difference between the bufferCapacity and the available permits in the semaphore. Adds a new capacityUsed metric which tracks the actual capacity used by the semaphore which blocks. Resolves #3936. (#3937)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 10 Jan 2024 14:10:52 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Speed Up initial snapshot from MongoDB (#3675)__

    [wanghd89](mailto:wanghd89@gmail.com) - Wed, 10 Jan 2024 14:03:22 -0600
    
    
    Signed-off-by: Haidong &lt;whaidong@amazon.com&gt;
    

* __Bump org.yaml:snakeyaml in /data-prepper-plugins/kafka-plugins (#3908)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:26:21 -0800
    
    
    Bumps [org.yaml:snakeyaml](https://bitbucket.org/snakeyaml/snakeyaml) from 2.0
    to 2.2.
    -
    [Commits](https://bitbucket.org/snakeyaml/snakeyaml/branches/compare/snakeyaml-2.2..snakeyaml-2.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.yaml:snakeyaml
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.github.ua-parser:uap-java (#3774)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:12:47 -0800
    
    
    Bumps [com.github.ua-parser:uap-java](https://github.com/ua-parser/uap-java)
    from 1.5.4 to 1.6.1.
    - [Release notes](https://github.com/ua-parser/uap-java/releases)
    - [Commits](https://github.com/ua-parser/uap-java/compare/v1.5.4...v1.6.1)
    
    ---
    updated-dependencies:
    - dependency-name: com.github.ua-parser:uap-java
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-jpl in /data-prepper-core (#3879)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:08:54 -0800
    
    
    Bumps org.apache.logging.log4j:log4j-jpl from 2.22.0 to 2.22.1.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-jpl
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump commons-validator:commons-validator in /data-prepper-core (#3880)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:08:05 -0800
    
    
    Bumps commons-validator:commons-validator from 1.7 to 1.8.0.
    
    ---
    updated-dependencies:
    - dependency-name: commons-validator:commons-validator
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.httpcomponents:httpcore (#3788)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:07:38 -0800
    
    
    Bumps org.apache.httpcomponents:httpcore from 4.4.15 to 4.4.16.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.httpcomponents:httpcore
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.mapdb:mapdb in /data-prepper-plugins/mapdb-processor-state (#3793)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:06:50 -0800
    
    
    Bumps [org.mapdb:mapdb](https://github.com/jankotek/mapdb) from 3.0.8 to
    3.0.10.
    -
    [Commits](https://github.com/jankotek/mapdb/compare/mapdb-3.0.8...mapdb-3.0.10)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.mapdb:mapdb
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#3878)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 12:01:09 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.22.0 to 2.22.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.22.0...rel/2.22.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#3873)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 9 Jan 2024 11:59:49 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.10 to 1.14.11.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.10...byte-buddy-1.14.11)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Fix Null Pointer Exception in KeyValue Processor (#3927)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 9 Jan 2024 09:19:18 -0800
    
    
    * Fix Null Pointer Exception in KeyValue Processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added a test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Support larger message sizes in Kafka Buffer (#3916)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 8 Jan 2024 16:08:15 -0800
    
    
    * Support larger message sizes in Kafka Buffer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments and added new integration tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add 4xx aggregate metric and shard progress metric for dynamodb source (#3913)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 5 Jan 2024 11:57:06 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updates Armeria to 1.26.4. This also updates io.grpc to 1.58.0 which has a slight breaking changing. This is fixed by explicitly adding io.grpc:grpc-inprocess to the build. (#3915)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 5 Jan 2024 09:33:45 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Date processor test corrections for other timezones (#3911)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 3 Jan 2024 09:58:33 -0800
    
    
    * Corrections to the date processor tests so that they run in other timezones.
    Remove an unnecessary conditional and prefer arguments() syntax.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates to Gradle 8.5 (#3910)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 3 Jan 2024 08:43:29 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for epoch timestamps and configurable output format (#3860)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 20 Dec 2023 11:58:57 -0800
    
    
    * Add support for epoch timestamps and configurable output format
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Add support for epoch timestamps and configurable output format
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Updates opensearch library to 1.3.14. And run integration test against 2.11.1 and 1.3.14 as well. Resolves #3837. (#3838)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 19 Dec 2023 14:15:58 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates commons-lang3 to 3.14.0 and commons-io to 2.15.1. Also corrects some projects to use the versions from the dependency catalog. (#3850)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 13 Dec 2023 09:11:02 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add Avro integration test to s3 source (#3852)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Wed, 13 Dec 2023 10:29:07 -0600
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Add sts_header_overrides to s3 dlq configuration (#3845)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 12 Dec 2023 15:27:25 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __rebasing to latest (#3846)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 12 Dec 2023 11:45:44 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Bump org.hibernate.validator:hibernate-validator (#3765)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 12 Dec 2023 07:45:04 -0800
    
    
    Bumps
    [org.hibernate.validator:hibernate-validator](https://github.com/hibernate/hibernate-validator)
    from 8.0.0.Final to 8.0.1.Final.
    -
    [Changelog](https://github.com/hibernate/hibernate-validator/blob/main/changelog.txt)
    
    -
    [Commits](https://github.com/hibernate/hibernate-validator/compare/8.0.0.Final...8.0.1.Final)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.hibernate.validator:hibernate-validator
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.opencsv:opencsv in /data-prepper-plugins/csv-processor (#3750)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 12 Dec 2023 07:44:07 -0800
    
    
    Bumps com.opencsv:opencsv from 5.8 to 5.9.
    
    ---
    updated-dependencies:
    - dependency-name: com.opencsv:opencsv
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Clean-up from recent merge of PR #3103 (#3843)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 12 Dec 2023 06:51:19 -0800
    
    
    Cleaning up some unnecessary code and dependencies from the recent merge of PR
    #3103.
    Adds missing certificate and key files to fix failures from recent
    merge of PR #3103.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix for [BUG] Data Prepper is losing connections from S3 pool (#3836)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 11 Dec 2023 15:07:51 -0800
    
    
    * Fix for [BUG] Data Prepper is losing connections from S3 pool
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed CheckStyle errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Prometheus Sink draft code for issue #1744. (#3103)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Mon, 11 Dec 2023 12:27:41 -0800
    
    
    Prometheus Sink draft code for issue #1744.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;

* __Require Mozilla Rhino 1.7.12 to fix SNYK-JAVA-ORGMOZILLA-1314295. (#3839)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 11 Dec 2023 11:33:58 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds some tests to the common plugin library to increase test coverage and avoid JaCoCo coverage failures. (#3688)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 11 Dec 2023 10:19:34 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump com.bmuschko.docker-remote-api from 9.3.2 to 9.4.0 in /e2e-test (#3756)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 7 Dec 2023 09:53:59 -0800
    
    
    Bumps com.bmuschko.docker-remote-api from 9.3.2 to 9.4.0.
    
    ---
    updated-dependencies:
    - dependency-name: com.bmuschko.docker-remote-api
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Release notes for Data Prepper 2.6.1. (#3829)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 7 Dec 2023 08:59:21 -0800
    
    
    * Release notes for Data Prepper 2.6.1. From
    https://github.com/opensearch-project/data-prepper/milestone/25?closed=1.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add 2.6.1 change log (#3830)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Thu, 7 Dec 2023 10:50:09 -0600
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/rss-source (#3789)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 14:43:32 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.11.1
    to 2.12.5.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.11.1...v2.12.5)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-jpl in /data-prepper-core (#3742)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 14:42:44 -0800
    
    
    Bumps org.apache.logging.log4j:log4j-jpl from 2.21.1 to 2.22.0.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-jpl
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Update to Logback 1.4.14 in performance test and sample app to fix CVE-2023-6481. Resolves #3817. (#3819)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 6 Dec 2023 14:35:36 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-sink (#3798)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 14:01:16 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.11.1
    to 2.12.5.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.11.1...v2.12.5)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump joda-time:joda-time in /data-prepper-plugins/s3-source (#3790)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 14:00:25 -0800
    
    
    Bumps [joda-time:joda-time](https://github.com/JodaOrg/joda-time) from 2.11.1
    to 2.12.5.
    - [Release notes](https://github.com/JodaOrg/joda-time/releases)
    - [Changelog](https://github.com/JodaOrg/joda-time/blob/main/RELEASE-NOTES.txt)
    
    - [Commits](https://github.com/JodaOrg/joda-time/compare/v2.11.1...v2.12.5)
    
    ---
    updated-dependencies:
    - dependency-name: joda-time:joda-time
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#3734)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 13:59:09 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.9 to 1.14.10.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.9...byte-buddy-1.14.10)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#3743)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 13:57:11 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.21.1 to 2.22.0.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.21.1...rel/2.22.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#3738)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 13:56:40 -0800
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.21.1 to 2.22.0.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Changelog](https://github.com/apache/logging-log4j2/blob/2.x/RELEASE-NOTES.adoc)
    
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.21.1...rel/2.22.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.apptasticsoftware:rssreader in /data-prepper-plugins/rss-source (#3780)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Dec 2023 13:56:02 -0800
    
    
    Bumps [com.apptasticsoftware:rssreader](https://github.com/w3stling/rssreader)
    from 3.2.5 to 3.5.0.
    - [Release notes](https://github.com/w3stling/rssreader/releases)
    - [Commits](https://github.com/w3stling/rssreader/compare/v3.2.5...v3.5.0)
    
    ---
    updated-dependencies:
    - dependency-name: com.apptasticsoftware:rssreader
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Add parse_ion processor (#3803)__

    [Emma](mailto:me@its-em.ma) - Wed, 6 Dec 2023 13:46:20 -0800
    
    
    Add parse_ion processor
     Signed-off-by: Emma Becar &lt;emmacb@amazon.com&gt;
    Co-authored-by: Emma Becar
    &lt;emmacb@amazon.com&gt;

* __Gradle project maintenance: Jackson 2.15.3, use the Jackson version from the BOM consistently, use the JUnit and Mockito from the version catalog consistently. (#3802)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 6 Dec 2023 13:27:43 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Logback 1.4.12 in performance test project to fix CVE-2023-6378 (#3746)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 6 Dec 2023 13:14:47 -0800
    
    
    Use Logback 1.4.12 in the performance test project to fix CVE-2023-6378.
    Resolves #3729
    Use Logback 1.4.12 in the sample analytics project to fix
    CVE-2023-6378. Resolves #3729
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix kafka buffer metrics (#3805)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 5 Dec 2023 16:54:55 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __FIX: deal with event with object size zero (#3806)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 5 Dec 2023 13:09:44 -0600
    
    
    * FIX: deal with event with object size zero
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix bug where update/upsert bulk action did not filter exclude/include keys, document_root_key, etc (#3747)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 1 Dec 2023 14:19:58 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add missing projects to dependabot (#3717)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 1 Dec 2023 12:01:36 -0800
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Bump com.fasterxml.jackson.datatype:jackson-datatype-jsr310 (#3733)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Dec 2023 11:57:08 -0800
    
    
    Bumps com.fasterxml.jackson.datatype:jackson-datatype-jsr310 from 2.15.2 to
    2.16.0.
    
    ---
    updated-dependencies:
    - dependency-name: com.fasterxml.jackson.datatype:jackson-datatype-jsr310
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates the example analytics-service to Spring Boot 3.1.6 which fixes CVE-2023-34055. (#3721)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 30 Nov 2023 14:35:27 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Require nimbus-jose-jwt 9.37.1 which fixes CVE-2021-31684 and CVE-2023-1370 by using a newer shaded version of json-smart. (#3720)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 30 Nov 2023 14:35:15 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add aggregate metrics for ddb source export and stream (#3724)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 30 Nov 2023 10:02:48 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support append mode to file sink (#3722)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 29 Nov 2023 13:07:41 -0800
    
    
    * Support append mode to file sink
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Updated documentation in README
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Adds a Checkstyle validation to ensure that the Guava cache is not used. (#3631)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 29 Nov 2023 10:17:07 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates data-prepper-api fully to JUnit 5 and removes JUnit vintage from the Gradle project. (#3627)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 29 Nov 2023 10:12:55 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Pin versions for jaeger-hotrod docker-compose (#3709)__

    [Shirley](mailto:4163034+fridgepoet@users.noreply.github.com) - Wed, 29 Nov 2023 09:32:49 -0800
    
    
    * Pin versions for jaeger-hotrod docker-compose
     Signed-off-by: Shirley Fridgepoet
    &lt;4163034+fridgepoet@users.noreply.github.com&gt;
    
    * Use opensearch 2.9.0 and data-prepper 2
     Signed-off-by: Shirley Fridgepoet
    &lt;4163034+fridgepoet@users.noreply.github.com&gt;
    
    ---------
     Signed-off-by: Shirley Fridgepoet
    &lt;4163034+fridgepoet@users.noreply.github.com&gt;

* __MAINT: wild card (#3719)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 29 Nov 2023 07:56:01 -0800
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add 2.6.0 change log (#3714)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 28 Nov 2023 17:09:06 -0600
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Fix flaky sqs it tests (#3696)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 28 Nov 2023 14:57:12 -0600
    
    
    * Fix S3 SQS flaky tests
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __MAINT: GitHub action for e2e secrets (#3704)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 28 Nov 2023 11:06:47 -0600
    
    
    * ADD: initial AWS testing resources CDK
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MNT: renaming
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * E2E: basicLogWithAwsSecretsEndToEndTest
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: refactoring on build.gradle
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: use AWS_PROFILE
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: check aws credentials
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * maint: check absolute path of .aws
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: check output
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: check output
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: check step output
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: aws configure
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: set files
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MNT: format
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: check files
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * testing
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: run actual tests
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * TST: assume new role
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: add test
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: title
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: back test on branch
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: revert
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: job name
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: file name
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: us-east-2
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: manual workflow trigger
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: add back variable
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: use repo variables
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: target change
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * TST: any push
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: revert change
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    ---------
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Release notes for Data Prepper 2.6.0 (#3710)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 28 Nov 2023 08:58:20 -0800
    
    
    Adds the release notes for Data Prepper 2.6.0.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates the next Data Prepper version to 2.7.0. (#3708)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 28 Nov 2023 08:51:47 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix bug so GLOBAL read-only items do not expire from TTL in ddb source coordination store (#3703)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 28 Nov 2023 08:17:00 -0800
    
    
    Fix bug so GLOBAL read-only items do not expire from TTL in ddb source
    coordination store
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Gradle parallel max (#3700)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 27 Nov 2023 13:21:51 -0800
    
    
    Set the maximum workers to 2 when running the GHA build and release tasks.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Generated THIRD-PARTY file for c88c27f (#3698)__

    [opensearch-trigger-bot[bot]](mailto:98922864+opensearch-trigger-bot[bot]@users.noreply.github.com) - Mon, 27 Nov 2023 13:10:27 -0800
    
    
    Signed-off-by: GitHub &lt;noreply@github.com&gt;
    Co-authored-by: dlvenable
    &lt;dlvenable@users.noreply.github.com&gt;

* __Check if failedDeleteCount is positive before logging (#3686)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 27 Nov 2023 14:44:00 -0600
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Address comments from PR 3625 (#3633)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 27 Nov 2023 12:19:23 -0800
    
    
    * Fix crash in Kafka consumer when negative acknowledments are received
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Rebased to latest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed unrelated changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Require Apache Avro 1.11.3 to fix CVE-2023-39410. Resolves #3430. (#3695)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 27 Nov 2023 10:58:50 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates werkzeug to 3.0.1 which fixes CVE-2023-46136. This required updating to dash 2.14.1 as 2.13 does not support newer versions of werkzeug. Resolves #3552. (#3690)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 27 Nov 2023 08:52:29 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix S3 scan failing tests (#3693)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 27 Nov 2023 08:49:02 -0800
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Updates the opensearch-java client to 2.8.1 and opensearch to 1.3.13. This includes a transitive dependency update to parsson to resolve CVE-2023-4043. (#3689)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 27 Nov 2023 08:45:36 -0800
    
    
    Update required version of org.json library to resolve CVE-2023-5072. Require a
    Zookeeper version which resolves CVE-2023-44981. Require a transitive Scala
    library to resolve CVE-2023-46122.
     Resolves #3588, #3522, #3491, #3547
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __TST: validate special data in opensearch sink (#3685)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 27 Nov 2023 10:02:33 -0600
    
    
    * TST: validate special data in opensearch sink
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix crash in Kafka consumer when negative acknowledments are received (#3691)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 27 Nov 2023 08:00:42 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Select require_alias for OS bulk inserts from ISM Policy (#3560)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Tue, 21 Nov 2023 14:48:05 -0800
    
    
    * Select require_alias for OS bulk inserts from ISM Policy
     This change requires an alias when writing to an aliased
    index. This avoids
    creation of an index without alias, when
    a previous existing alias and index
    was deleted. It increases
    robustness of DataPrepper&#39;s trace index against OS
    user
    interactions.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    * 3342 Determine Alias Configuration from OS
     During OS sink initialization it is determined from OS, whether the
    
    configured index actually is an alias. If so, bulk request will require
    the
    index to always be an alias. The response is cached to avoid
    further requests.
    This also ensures, that the alias configuration is
    kept in the initially
    intended state. After all, this change is about to
    prevent an automatic index
    creation for a formerly existing alias.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    * Fix imports for checkstyle
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    * Fix integration tests
     The specific user used in some tests of OpenSerachSinkIT
    needs get
    permissions on all aliases to test for their existence.
    Another bug with
    determining the alias name is fixed as well.
     As a final result, the DataPrepper OpenSearch user requires
    write access to
    the indices and now additionally read access to
    the aliases. This can be a
    change for self-managed indices.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    * Fix Bulk Requests for older OD versions
     The `require_alias` parameter for bulk requests was only introduced
    with ES
    7.10. Since DataPrepper needs to be compatible down to 6.8,
    the parameter
    should not be used in earlier OD versions. This change
    will apply the
    parameter only when OpenSearch is detected as target.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    * Add Permission to get Cluster Info
     For checking the OS version, the test user needs an
    additional permission.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;
    
    ---------
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;

* __Use Amazon Linux 2023 as the base image for the Data Prepper Docker image. This install Temurin for the Amazon Linux 2 distribution. Resolves #3505. (#3671)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 17 Nov 2023 12:34:51 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __E2E: aws secrets tests (#3654)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 17 Nov 2023 10:34:09 -0600
    
    
    * E2E: basicLogWithAwsSecretsEndToEndTest
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __ShardId is not passed to ShardConsumer, resulting in logs saying shard is null on shutdown (#3683)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 16 Nov 2023 17:32:55 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Improve logging message for no shards found to indicate that export m… (#3681)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 16 Nov 2023 16:59:00 -0600
    
    
    Improve logging message for no shards found to indicate that export may still
    be ongoing
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add ddb source fixes/improvements (#3676)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 16 Nov 2023 10:52:55 -0600
    
    
    Add ddb source fixes/improvements
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix an NPE when the DynamoDB LeaderScheduler does not receive a leader partition. To help test this, I also allowed for a smaller lease interval in a package protected constructor. (#3672)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 16 Nov 2023 06:37:47 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improves the DefaultPluginFactory class design by creating a new class for providing arguments from the Application Context to plugin parameters. (#3615)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Nov 2023 11:02:06 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Uses export time minus 5 minutes for export document version (#3668)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 15 Nov 2023 09:06:28 -0800
    
    
    Uses export time minus 5 minutes for export document version
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __ADD: initial AWS testing resources CDK (#3501)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 15 Nov 2023 10:46:14 -0600
    
    
    * ADD: initial AWS testing resources CDK
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Correct single quote escape character in DynamoDB [#3664] (#3667)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 15 Nov 2023 08:02:31 -0800
    
    
    Resolves a bug with escaped single quotes in the DynamoDB source by updating
    the AWS SDK to 2.21.23. Also, skip data that cannot be parsed entirely rather
    than silently send empty data. Resolves #3664.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix leader partition time out issue due to exception (#3666)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Wed, 15 Nov 2023 09:42:09 -0600
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Update gRPC and HTTP logging (#3658)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 14 Nov 2023 17:26:11 -0800
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Undo rename change done in PR 3656 (#3661)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 14 Nov 2023 17:10:33 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Do not send empty lists to the DLQ when all items share the same retryable failure. Resolves #3644 (#3660)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Nov 2023 16:58:55 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds integration tests to KafkaBufferIT to verify that raw bytes are wrapped in the Protobuf Kafka message wrapper. Adds a missing validation when reading data after a writeBytes call and some other minor test improvements. (#3645)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Nov 2023 16:24:23 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Catch failure to change visibility timeout and maintain a counter (#3657)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 14 Nov 2023 16:22:43 -0800
    
    
    Catch failure to change visibility timeout and maintain a counter
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Adds a configuration to the random string source to configure the wait delay between writes to the buffer. Resolves #3595. Also uses a single thread for this source to avoid an unnecessary thread pool and increases the code coverage. (#3602)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 14 Nov 2023 14:53:29 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Change latency metric names (#3656)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 14 Nov 2023 14:05:31 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Go back to processing only 1 data node file at a time instead of 3 (#3652)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 14 Nov 2023 11:04:47 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Convert Number types to BigDecimal plainString for consistency between partition and sort keys for export and streams (#3650)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 14 Nov 2023 09:51:39 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix no acknowledgments for closed shard issue (#3651)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Tue, 14 Nov 2023 09:51:10 -0600
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Include the full exception and stack trace when an unexpected error occurs in the LeaderScheduler. (#3648)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 13 Nov 2023 16:48:11 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: add bytes metrics into opensearch source (#3646)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 13 Nov 2023 16:54:23 -0600
    
    
    * MAINT: add bytes metrics
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __MAINT: add bytes metrics into dynamo source (#3647)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 13 Nov 2023 16:54:06 -0600
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix initialization issue in DynamoDB source (#3643)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Mon, 13 Nov 2023 11:29:23 -0800
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Use a Protobuf buffer message for data in the Kafka buffer (#3635)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 13 Nov 2023 11:12:32 -0800
    
    
    Adds a Protobuf buffer message for the Kafka buffer. Data sent to the topic is
    wrapped in this and then parsed back into this. Contributes toward #3620.
     Correct the Kafka buffer tests to test correctly as bytes, adds bytes tests,
    fixes some serialization issues with the Kafka buffer.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Refactor to use Admin client instead of second set of consumers for empty check (#3637)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Sun, 12 Nov 2023 12:20:03 -0600
    
    
    * Refactor to use Admin client instead of second set of consumers for empty
    check
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove debug log
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Pass custom metric prefix if present to AbstractBuffer when using KafkaBuffer (#3638)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Sun, 12 Nov 2023 11:31:16 -0600
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Improvements to prevent data loss in DynamoDB source (#3614)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Sun, 12 Nov 2023 11:20:58 -0600
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Remove verbose debug log from JacksonEvent (#3639)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sun, 12 Nov 2023 11:14:04 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add distribution_version flag to opensearch source (#3636)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sun, 12 Nov 2023 10:42:27 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add normalize_index flag to normalize invalid dynamic indices (#3634)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sat, 11 Nov 2023 15:54:29 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Bump com.fasterxml.jackson.datatype:jackson-datatype-jdk8 (#3570)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 10 Nov 2023 16:43:31 -0800
    
    
    Bumps com.fasterxml.jackson.datatype:jackson-datatype-jdk8 from 2.15.2 to
    2.15.3.
    
    ---
    updated-dependencies:
    - dependency-name: com.fasterxml.jackson.datatype:jackson-datatype-jdk8
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#3571)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 10 Nov 2023 16:42:56 -0800
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.8 to 1.14.9.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.8...byte-buddy-1.14.9)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Create network policy for aoss source. (#3613)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Fri, 10 Nov 2023 14:15:49 -0800
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Add support OTEL traces and logs with Kafka buffer (#3625)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 10 Nov 2023 14:13:26 -0800
    
    
    * Add support OTEL traces and logs with Kafka buffer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed binary files
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Rebased and merged with latest changes
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Retry on dynamic index creation when an OpenSearchException is thrown (#3541)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Fri, 10 Nov 2023 15:53:30 -0600
    
    
    * Retry on dynamic index creation when an OpenSearchException is thrown
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Use correct exception type in unit tests
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove older cache imports
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    Signed-off-by: Chase
    &lt;62891993+engechas@users.noreply.github.com&gt;

* __Start unit tests for the OpenSearch sink testing the document_version error cases (#3599)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 10 Nov 2023 13:27:29 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Attempting to fix the flaky tests in AwsCloudMapPeerListProviderTest. This uses a higher wait for changes, and refreshes at sub-second intervals for testing. (#3628)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 10 Nov 2023 11:15:41 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add metric for shards actively being processed, lower ownership timeo… (#3629)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 10 Nov 2023 12:56:00 -0600
    
    
    Add metric for shards actively being processed, lower ownership timeout from 10
    minutes to 5 minutes for ddb source
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updated the Router_ThreeRoutesIT test with a longer timeout. Also, use Awaitility&#39;s during() method to verify that certain data never reaches a sink that it never should reach. (#3624)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 10 Nov 2023 09:57:00 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Disable the circuit breaker for buffers that write data off-heap only… (#3619)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 10 Nov 2023 08:45:05 -0800
    
    
    Disable the circuit breaker for buffers that write data off-heap only. This is
    currently only the Kafka buffer. Resolves #3616
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add splitExportTraceServiceRequest API to OTelProtoDecoder (#3600)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 9 Nov 2023 21:09:45 -0800
    
    
    * Add splitExportTraceServiceRequest API to OTelProtoDecoder
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Renamed the API
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed code and modified test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed check style test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add support for OTEL metrics source to use Kafka buffer (#3539)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 9 Nov 2023 15:32:41 -0800
    
    
    * Add support for OTEL metrics source to use Kafka buffer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added tests and fixed test failures
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add Java 11/17/21 matrix for build, test and performance test checks (#3622)__

    [Andriy Redko](mailto:drreta@gmail.com) - Thu, 9 Nov 2023 15:21:03 -0800
    
    
    Signed-off-by: Andriy Redko &lt;andriy.redko@aiven.io&gt;

* __Fix race condition in DefaultEventHandle (#3618)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 9 Nov 2023 10:09:20 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add Kafka Producer metrics for send record failures (#3611)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Wed, 8 Nov 2023 12:46:35 -0800
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Fix issue where we start from checkpoint for PIT with acks to instead start from beginning (#3610)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 8 Nov 2023 12:08:42 -0800
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Pause reading from Kafka in the Kafka buffer when the circuit breaker is open (#3595)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 8 Nov 2023 11:21:20 -0800
    
    
    Use the CircuitBreaker in the Kafka buffer to stop reading data from the Kafka
    topic and putting it into the in-memory buffer. Moves the CircuitBreaker class
    into data-prepper-api. Adds a DelegatingBuffer class to data-prepper-api.
    Resolves #3578.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Move opensearch source into same module as opensearch sink. (#3607)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Wed, 8 Nov 2023 10:07:27 -0800
    
    
    This change is required to share code between the source and sink plugins.
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Updated visibility protection timeout (#3608)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Wed, 8 Nov 2023 09:40:42 -0800
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Check topic for emptiness during KafkaBuffer shutdown (#3545)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Wed, 8 Nov 2023 11:13:45 -0600
    
    
    * Add shutdown method to buffer API
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Only allow single thread to check emptiness
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Fix logic and add 1 minute wait before requerying kafka
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests for thread safety logic
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Refactor metadata related to emptiness into own class
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Single instance per topic rather than per worker
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests for topic emptiness class
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Resolve rebase conflicts
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Some changes to the configurations for the new visibility timeout extension feature. Increase the maximum default to 2 hours, increase the maximum configurable extension to 24 hours, and rename to use the work &#34;maximum&#34; to remain consistent (e.g. maximum_messages). (#3604)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 8 Nov 2023 08:45:39 -0800
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Change Latency Metric names (#3603)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 8 Nov 2023 09:51:55 -0600
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Support ISM correctly when using composable index templates (#3590)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 8 Nov 2023 06:38:49 -0800
    
    
    Correctly support custom properties in composable index templates in the
    OpenSearch sink. This resolves #3506.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add Kafka Producer Metrics and Kafka Buffer Metrics (#3598)__

    [Dinu John](mailto:86094133+dinujoh@users.noreply.github.com) - Tue, 7 Nov 2023 22:45:19 -0600
    
    
    Signed-off-by: Dinu John &lt;86094133+dinujoh@users.noreply.github.com&gt;

* __Add dynamodb_item_version metadata that is derived from timestamp for… (#3596)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 7 Nov 2023 19:16:16 -0600
    
    
    Add dynamodb_item_version metadata that is derived from timestamp for stream
    events
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add document_version and document_version_type parameters to the open… (#3591)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 7 Nov 2023 18:38:46 -0600
    
    
    Add document_version and document_version_type parameters to the opensearch
    sink for conditional indexing of documents
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Optimize idle item between GetRecords call (#3593)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Tue, 7 Nov 2023 17:55:18 -0600
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Add CMK encryption support to DynamoDB export (#3592)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Tue, 7 Nov 2023 16:26:24 -0600
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Javadoc fixes (#3594)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 7 Nov 2023 12:18:43 -0800
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add Internal and external latency to OpenSearch and S3 sinks.  (#3583)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 7 Nov 2023 09:42:58 -0800
    
    
    Add Internal and external latency to OpenSearch and S3 sinks
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Enable acknowledgements for KafkaBuffer plugin (#3584)__

    [Hardeep Singh](mailto:mzhrde@amazon.com) - Mon, 6 Nov 2023 09:57:04 -0800
    
    
    Signed-off-by: Hardeep &lt;mzhrde@amazon.com&gt;

* __Add dynamodb_event_name metadata attribute, change mapping for Ddb INSERT and MODIFY to be index bulk action (#3585)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sun, 5 Nov 2023 10:49:05 -0600
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Change s3 scan and opensearch to only save state every 5 minutes, fix… (#3581)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sun, 5 Nov 2023 10:31:01 -0600
    
    
    Change s3 scan and opensearch to only save state every 5 minutes, fix bug where
    any action was valid in OpenSearch sink
    Signed-off-by: Taylor Gray
    &lt;tylgry@amazon.com&gt;

* __Replace Guava Cache with Caffeine for OpenSearch integration (#3586)__

    [Roman Kvasnytskyi](mailto:roman@kvasnytskyi.net) - Sat, 4 Nov 2023 13:24:12 -0700
    
    
    Signed-off-by: Roman Kvasnytskyi &lt;roman@kvasnytskyi.net&gt;

* __Add ProgressCheck callbacks to end-to-end acknowledgements (#3565)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Sat, 4 Nov 2023 08:04:22 -0700
    
    
    Add ProgressCheck callbacks to end-to-end acknowledgements
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Update end-to-end tests to use the release Docker image or a custom image with a specific Java version. Resolves #3566 (#3576)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 3 Nov 2023 11:26:53 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add acknowledgments for the ddb source (#3575)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 2 Nov 2023 11:14:41 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Modify EventHandle to be created for every event and support internal and external origination times (#3546)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 1 Nov 2023 13:52:58 -0700
    
    
    * Modify EventHandle to be created for every event and support internal and
    external origination times
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed build failures
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed build failures
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * fixed failing checkstyle error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed build errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments by adding InternalEventHandle
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed build errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-expression (#3569)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 1 Nov 2023 11:46:48 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.20.0 to 2.21.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.20.0...rel/2.21.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-jpl in /data-prepper-core (#3574)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 1 Nov 2023 10:02:27 -0700
    
    
    Bumps org.apache.logging.log4j:log4j-jpl from 2.20.0 to 2.21.1.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-jpl
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.apache.logging.log4j:log4j-bom in /data-prepper-core (#3573)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 1 Nov 2023 10:01:53 -0700
    
    
    Bumps
    [org.apache.logging.log4j:log4j-bom](https://github.com/apache/logging-log4j2)
    from 2.20.0 to 2.21.1.
    - [Release notes](https://github.com/apache/logging-log4j2/releases)
    -
    [Commits](https://github.com/apache/logging-log4j2/compare/rel/2.20.0...rel/2.21.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.logging.log4j:log4j-bom
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __OpenSearch Sink: Add log messages when there is no exception (#3532)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 31 Oct 2023 13:23:55 -0700
    
    
    Add log messages when there is exception
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Add bug fixes and improvements to DDB source (#3559)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Tue, 31 Oct 2023 14:48:32 -0500
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Updates Kafka configurations such that plugin has its own topic configurations (#3551)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 31 Oct 2023 10:20:09 -0700
    
    
    Updates Kafka buffer configurations to disallow configurations which are not
    needed - e.g. schema and the serde_format for the topic configuration. As part
    of this change, I also split the TopicConfig into three distinct interfaces and
    classes. This allows each plugin to either accept a configuration or provide a
    value of the plugin&#39;s own choosing. Also adds copyright headers to all files
    modified as part of this commit.
     Renamed is_topic_create to create_topic. Also made this a boolean internally
    instead of Boolean since it will have a value.
     Adds a zeroBytes() static method to ByteCount as a convenience.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix for Kafka buffer encryption with bytes serde_format by returning null for null input in EncryptionSerializer. (#3556)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 27 Oct 2023 14:39:02 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Catch exceptions and backoff and retry ddb source threads instead of shutting down on exception (#3554)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 27 Oct 2023 10:37:39 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix CVE error for Jetty version 11.0.12 (#3548)__

    [wanghd89](mailto:wanghd89@gmail.com) - Thu, 26 Oct 2023 13:12:39 -0500
    
    
    * Fix CVE error for Jetty version 11.0.12
     Signed-off-by: Haidong &lt;whaidong@amazon.com&gt;
    
    ---------
     Signed-off-by: Haidong &lt;whaidong@amazon.com&gt;
    Co-authored-by: Haidong
    &lt;whaidong@amazon.com&gt;

* __Implement writeBytes and isByteBuffer in the CircuitBreakingBuffer. Also update the Buffer to throw UnsupportedOperationException when writeBytes is called. (#3553)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 26 Oct 2023 09:50:44 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add tests to InMemoryBufferTest and LocalFileBufferTest (#3550)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 25 Oct 2023 14:34:18 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add obfuscate_when parameter and tags_on_match failure to obfuscate processor (#3544)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 25 Oct 2023 07:52:13 -0700
    
    
    Add obfuscate_when parameter to obfuscate processor
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __HttpSink plugin functionality for #874. (#3065)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Tue, 24 Oct 2023 17:10:29 -0700
    
    
    HttpSink plugin functionality for #874.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;

* __Add bug fixes and improvements to DDB source (#3534)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Mon, 23 Oct 2023 18:08:21 -0500
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Removed the deprecated annotation from Record and RecordMetadata as these are currently still very necessary. Resolves #3536. (#3540)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Oct 2023 14:52:26 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Test against newer versions of OpenSearch and use odd versions in the 2.x series to avoid testing against too many different versions. Updated to the latest 1.3 version. (#3512)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Oct 2023 14:51:48 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Perform a full upgrade on the base Docker image when building the Data Prepper Docker image to get latest patches. (#3497)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Oct 2023 14:51:22 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Run the end-to-end tests on Java 21 in the GitHub Actions. (#3523)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 23 Oct 2023 14:50:56 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump @babel/traverse in /release/staging-resources-cdk (#3521)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 23 Oct 2023 12:13:44 -0700
    
    
    Bumps
    [@babel/traverse](https://github.com/babel/babel/tree/HEAD/packages/babel-traverse)
    from 7.22.5 to 7.23.2.
    - [Release notes](https://github.com/babel/babel/releases)
    - [Changelog](https://github.com/babel/babel/blob/main/CHANGELOG.md)
    -
    [Commits](https://github.com/babel/babel/commits/v7.23.2/packages/babel-traverse)
    
    
    ---
    updated-dependencies:
    - dependency-name: &#34;@babel/traverse&#34;
     dependency-type: indirect
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Add logic to create or update serverless network policy. (#3510)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Mon, 23 Oct 2023 12:12:59 -0700
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Bump net.bytebuddy:byte-buddy-agent in /data-prepper-plugins/opensearch (#3527)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Mon, 23 Oct 2023 06:14:52 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy-agent](https://github.com/raphw/byte-buddy)
    from 1.14.8 to 1.14.9.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.8...byte-buddy-1.14.9)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy-agent
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Adding support for storing raw bytes in Kafka Buffer (#3519)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 20 Oct 2023 16:34:54 -0700
    
    
    * Adding support for storing raw bytes in Kafka Buffer
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to wait for the send() to finish before returning
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed unused imports
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed Kafka integration test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed json processor check style errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments and added a new test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments and added a new tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Reorder formatString expression check for JacksonEvent (#3533)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 20 Oct 2023 15:50:17 -0500
    
    
    Reorder formatString expression check for JacksonEvent
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix broken DefaultKafkaClusterConfigSupplier get API (#3529)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 18 Oct 2023 21:04:08 -0500
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#3413)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 18 Oct 2023 13:49:34 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.7 to 1.14.8.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.7...byte-buddy-1.14.8)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Rebased to latest (#3476)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 18 Oct 2023 13:08:45 -0700
    
    
    Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __Adds new AWS configurations for the KMS encryption. Resolves #3516. (#3517)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 18 Oct 2023 08:26:20 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump urllib3 in /examples/trace-analytics-sample-app/sample-app (#3518)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 18 Oct 2023 06:17:48 -0700
    
    
    Bumps [urllib3](https://github.com/urllib3/urllib3) from 2.0.6 to 2.0.7.
    - [Release notes](https://github.com/urllib3/urllib3/releases)
    - [Changelog](https://github.com/urllib3/urllib3/blob/main/CHANGES.rst)
    - [Commits](https://github.com/urllib3/urllib3/compare/2.0.6...2.0.7)
    
    ---
    updated-dependencies:
    - dependency-name: urllib3
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump urllib3 in /release/smoke-tests/otel-span-exporter (#3520)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 18 Oct 2023 06:17:13 -0700
    
    
    Bumps [urllib3](https://github.com/urllib3/urllib3) from 1.26.17 to 1.26.18.
    - [Release notes](https://github.com/urllib3/urllib3/releases)
    - [Changelog](https://github.com/urllib3/urllib3/blob/main/CHANGES.rst)
    - [Commits](https://github.com/urllib3/urllib3/compare/1.26.17...1.26.18)
    
    ---
    updated-dependencies:
    - dependency-name: urllib3
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Gradle 8.4 (#3492)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 18 Oct 2023 05:48:26 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rename/add metrics for ddb source (#3498)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 16 Oct 2023 14:47:20 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add more verbose logging for the DynamoDb source (#3500)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Mon, 16 Oct 2023 10:41:26 -0500
    
    
    Add more verbose logging to the DynamoDB source
     Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Miscellaneous fixes/improvements to the DynamoDb source (#3489)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 13 Oct 2023 09:50:12 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds KMS encryption_context for KMS encryption in the Kafka buffer. Moves the kms_key_id into a new kms section along with encryption_context. Resolves #3484 (#3486)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 12 Oct 2023 11:06:49 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Data Prepper 2.5.0 change log (#3488)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 12 Oct 2023 10:22:07 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Integrate CDC data from MySQL/Postgres/MongoDb data source (#3313)__

    [wanghd89](mailto:wanghd89@gmail.com) - Wed, 11 Oct 2023 22:10:36 -0500
    
    
    Signed-off-by: Haidong &lt;whaidong@amazon.com&gt;

* __Move ddb source coordinator config to the data-prepper-config.yaml (#3466)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 11 Oct 2023 14:40:16 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix e2e acks test (#3471)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 11 Oct 2023 12:21:47 -0700
    
    
    * Disable flaky e2e acks test
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Disabled another flaky test
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Added debug statements to debug the failing tests
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified to assign unique names to pipelines
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Trying with enabling the disabled test
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Fixed failing checkstyle error
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Reduced sleep time in InMemorySource
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    * Modified to use log4j
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;
    
    ---------
     Signed-off-by: Kondaka &lt;krishkdk@amazon.com&gt;

* __remove WIP plugins from build (#3480)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Wed, 11 Oct 2023 13:41:37 -0500
    
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Some updates to the 2.5.0 release notes. (#3479)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 11 Oct 2023 08:30:39 -0700
    
    
    Some updates to the 2.5.0 release notes.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix #3459 Unit tests fail on Windows machine (#3461)__

    [GongYi](mailto:topikachu@163.com) - Tue, 10 Oct 2023 16:38:59 -0700
    
    
    1. SinkModelTest: Use system System.lineSeparator() instead of hardcode &#39;\n&#39;
    
    2. DataPrepperArgsTest: Covert file path separators to local system.
    3.
    DateProcessorTests: Covert time to same timezone before comparing.
    4.
    InMemorySourceCoordinationStoreTest: Use greaterThanOrEqualTo to compare time
    since they may be same.
    5. QueuedPartitionsItemTest: Use sleep to get two
    different time instances.
    6. RSSSourceTest: Use mocker server to avoid
    internet connecting.
    7. ParquetOutputCodecTest: Close all outputStream objects
    in the tests.
    8.
    org.opensearch.dataprepper.plugins.sink.s3.accumulator.InMemoryBufferTest#getDuration_provides_duration_within_expected_range:
    No solution to fix. Disable it. Please see my comments in the test file.
     Signed-off-by: Gong Yi &lt;topikachu@163.com&gt;

* __Resolve Netty to 4.1.100.Final, require Jetty 11.0.17 in Data Prepper. Use Tomcat 10.1.14 in the example project. These changes fix CVE-2023-44487 to protect against HTTP/2 reset floods. Resolves #3474. (#3475)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 10 Oct 2023 16:33:25 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Shutdown kafka buffer (#3464)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Tue, 10 Oct 2023 15:49:46 -0500
    
    
    * Add shutdown method to buffer API
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove POC code
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Revert acknowledgments default
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add test for coverage
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove unused import
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Encrypted and decrypt data in the Kafka buffer (#3468)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 10 Oct 2023 13:18:03 -0700
    
    
    Encrypt and decrypt data in the Kafka buffer when the user configures. Use a
    KMS key to decrypt the data encryption key, if one is provided. Resolves #3422
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix broken build and clean up KafkaSource class. (#3469)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 10 Oct 2023 07:56:36 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix MSK integration test fix (#3465)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 9 Oct 2023 15:01:35 -0700
    
    
    Signed-off-by: Kondaka &lt;krishkdk@bcd07441e083.ant.amazon.com&gt;
    Co-authored-by:
    Kondaka &lt;krishkdk@bcd07441e083.ant.amazon.com&gt;

* __Refactors the Kafka buffer (and Kafka sink) code related to defining the serialization and deserialization classes. This migrates from using Kafka properties to providing concrete instances into the Kafka consumer/producer. We will make use of this when encrypting or decrypting data. (#3463)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 9 Oct 2023 14:04:23 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Kafka drain timeout (#3454)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Mon, 9 Oct 2023 13:40:02 -0500
    
    
    * Add getDrainTimeout method to buffer interface. Add as configurable value for
    kafka buffer
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Move getDrainTimeout to default method in the interface, add test for it,
    disable SNS sink
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove verification from non-mock
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __ENH: support index template for serverless (#3071)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 9 Oct 2023 09:02:19 -0700
    
    
    * ENH: support index template for serverless
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __ENH: support index template for serverless (#3071)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 9 Oct 2023 09:01:47 -0700
    
    
    * ENH: support index template for serverless
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __ENH: opensearch source secrets refreshment suppport (#3437)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 9 Oct 2023 08:19:50 -0700
    
    
    ENH: opensearch source secrets refreshment suppport (#3437)
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Add release-notes for 2.5.0 (#3449)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 6 Oct 2023 14:13:01 -0700
    
    
    * Add release-notes for 2.5.0
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Add AWS secrets
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Added missing items
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Addressed feedback
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Fix CVE-2023-39410 (#3450)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Sat, 7 Oct 2023 00:17:50 +0530
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Fixes some issues with the Kafka buffer and sink. Adds an integration test for the Kafka buffer and run that in the GitHub Actions. (#3451)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 6 Oct 2023 10:55:51 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Use Awaitility in the KafkaSourceJsonTypeIT to avoid sleeps. Also consolidates logic for creating and deleting topics. (#3447)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 6 Oct 2023 09:20:37 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add inline template_content support to the opensearch sink (#3431)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 6 Oct 2023 11:17:22 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Run the Kafka integration tests as a GitHub Action. Created Docker compose files for starting Kafka easily and updated the README.md instructions. (#3445)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 6 Oct 2023 09:08:41 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Removes the GeoIP processor from the build. It doesn&#39;t work and the tests are failing consistently now. (#3448)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 6 Oct 2023 08:19:54 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for Update/Upsert/Delete operations in OpenSearch Sink (#3424)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 5 Oct 2023 17:54:37 -0700
    
    
    * Add support for Update/Upsert/Delete operations in OpenSearch Sink
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed tests and removed unused imports
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Updated documentation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added test cases to improve code coverage
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed check style errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added another test for upsert action without prior create action
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added check for valid action strings at config time
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Refactor Kafka Source and Sink, implement basic Kafka buffer (#3354)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Thu, 5 Oct 2023 17:30:58 -0700
    
    
    * Refactor Kafka Source and Sink to make Kafka producer and consumer logic more
    reusable
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Implement requested changes + simple kafka buffer
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Cleaning up logs, add TODOs, etc.
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Add support for MSK in kafka buffer
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Change Topics to list for now
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * update config yaml names
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Fix unit tests
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    ---------
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Remove support for Enum and Duration values from secrets manager (#3433)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Thu, 5 Oct 2023 22:35:58 +0530
    
    
    * Remove support for Enum and Duration values from secrets manager
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Added unit tests
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/common (#3411)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 5 Oct 2023 09:50:41 -0700
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.3 to 1.1.10.5.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.3...v1.1.10.5)
    
    ---
    updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump urllib3 in /examples/trace-analytics-sample-app/sample-app (#3425)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 5 Oct 2023 09:48:34 -0700
    
    
    Bumps [urllib3](https://github.com/urllib3/urllib3) from 2.0.4 to 2.0.6.
    - [Release notes](https://github.com/urllib3/urllib3/releases)
    - [Changelog](https://github.com/urllib3/urllib3/blob/main/CHANGES.rst)
    - [Commits](https://github.com/urllib3/urllib3/compare/2.0.4...2.0.6)
    
    ---
    updated-dependencies:
    - dependency-name: urllib3
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __ENH: data-prepper-core support for secrets refreshment (#3415)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 5 Oct 2023 09:46:44 -0700
    
    
    * INIT: secrets refreshment infra
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: add interval and test validity
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: some more refactoring
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: delete unused classes
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * TST: AwsSecretsPluginConfigPublisherExtensionProviderTest
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: inject PluginConfigPublisher into PluginCreator
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: complete test cases for AwsSecretPluginIT
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: test refresh secrets
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: refactoring and documentation
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * STY: import
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: fix test cases
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: missing test case
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * MAINT: address minor comments
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    * REF: PluginConfigurationObservableRegister
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    
    ---------
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Set main version to 2.6 (#3439)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Thu, 5 Oct 2023 08:58:35 -0700
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Bump urllib3 in /release/smoke-tests/otel-span-exporter (#3427)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Tue, 3 Oct 2023 09:55:27 -0700
    
    
    Bumps [urllib3](https://github.com/urllib3/urllib3) from 1.26.7 to 1.26.17.
    - [Release notes](https://github.com/urllib3/urllib3/releases)
    - [Changelog](https://github.com/urllib3/urllib3/blob/main/CHANGES.rst)
    - [Commits](https://github.com/urllib3/urllib3/compare/1.26.7...1.26.17)
    
    ---
    updated-dependencies:
    - dependency-name: urllib3
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __-download task support for geoip (#3373)__

    [rajeshLovesToCode](mailto:131366272+rajeshLovesToCode@users.noreply.github.com) - Tue, 3 Oct 2023 09:39:32 -0700
    
    
    * -download task support for geoip
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -download task support for geoip
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -download task support for geoip
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -fix for geoip IP constant
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;

* __Add DynamoDB source plugin (#3349)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Tue, 3 Oct 2023 11:31:22 -0500
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Update release notes and change log for 2.4.1 (#3416)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 2 Oct 2023 09:58:20 -0700
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Fix CVE-2022-45688, CVE-2023-43642 (#3404)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 29 Sep 2023 19:14:59 +0530
    
    
    * Fix CVE-2022-45688
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Fix CVE-2023-43642
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Updated release notes file name (#3403)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 29 Sep 2023 16:20:20 +0530
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Add retry to Kafka Consumer Create in source (#3399)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Fri, 29 Sep 2023 16:19:57 +0530
    
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __2.4.1 release notes (#3398)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 29 Sep 2023 00:08:21 +0530
    
    
    * 2.4.1 release notes
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Updated release notes
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __2.4.1 change log (#3397)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 29 Sep 2023 00:08:02 +0530
    
    
    * 2.4.1 change log
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Updated change log
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Improve logging for failed documents in the OpenSearch sink (#3387)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 27 Sep 2023 19:38:31 +0530
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add support for fully async acknowledgments in source coordination (#3384)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 26 Sep 2023 15:34:54 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add _id as additional sort key for point-in-time and search_after (#3374)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 26 Sep 2023 13:24:20 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __CVE fixes (#3385)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 26 Sep 2023 23:38:58 +0530
    
    
    * CVE fixes
    CVE-2022-36944, WS-2023-0116, CVE-2021-39194, CVE-2023-3635,
    CVE-2023-36479, CVE-2023-40167
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Fix WS-2023-0236
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Support a local ARM Docker image by using Ubuntu Jammy for the base image. Also use only the JRE to keep the image size smaller. Resolves #3352. (#3355)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 26 Sep 2023 09:10:18 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add Dissect Processor (#3363)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 25 Sep 2023 22:30:48 -0500
    
    
    * Added Dissect Processor Functionality
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Fixed checkstyle issue
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Tweak readme and a unit test
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Fix build failures
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    * Address review comments - separate unit tests for dissector from processor;
    add delimiter and fieldhelper tests
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    Signed-off-by:
    Hai Yan &lt;oeyh@amazon.com&gt;
    Co-authored-by: Vishal Boinapalli
    &lt;vishalboinapalli3@gmail.com&gt;

* __Add tagging on failure for KeyValue processor (#3368)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 25 Sep 2023 14:32:48 -0500
    
    
    * readme, config done, main code integration in progress
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * clarify readme with example output
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * add import statement
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * Add tagging on failure
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Signed-off-by: Hai Yan
    &lt;oeyh@amazon.com&gt;
    Co-authored-by: Kat Shen &lt;katshen@amazon.com&gt;

* __Updates commons-compress to 1.24.0 which fixes CVE-2023-42503. As part of this change, I updated the Apache commons projects to use the Gradle version catalog to keep versions in sync. Resolves #3347. (#3371)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 25 Sep 2023 08:19:54 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Write to root when destination is set to null; add overwrite option (#3380)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Fri, 22 Sep 2023 11:57:13 -0500
    
    
    Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Rebased to latest (#3364)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 20 Sep 2023 12:09:10 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Consolidate the end-to-end Gradle tasks which are shared in common between the different tests. (#3344)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 20 Sep 2023 11:38:26 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump org.apache.parquet:parquet-common in /data-prepper-api (#2966)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 20 Sep 2023 10:28:07 -0700
    
    
    Bumps [org.apache.parquet:parquet-common](https://github.com/apache/parquet-mr)
    from 1.12.3 to 1.13.1.
    - [Changelog](https://github.com/apache/parquet-mr/blob/master/CHANGES.md)
    -
    [Commits](https://github.com/apache/parquet-mr/compare/apache-parquet-1.12.3...apache-parquet-1.13.1)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.parquet:parquet-common
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump commons-codec:commons-codec (#2968)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 20 Sep 2023 10:26:49 -0700
    
    
    Bumps [commons-codec:commons-codec](https://github.com/apache/commons-codec)
    from 1.15 to 1.16.0.
    -
    [Changelog](https://github.com/apache/commons-codec/blob/master/RELEASE-NOTES.txt)
    
    -
    [Commits](https://github.com/apache/commons-codec/compare/rel/commons-codec-1.15...rel/commons-codec-1.16.0)
    
    
    ---
    updated-dependencies:
    - dependency-name: commons-codec:commons-codec
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump org.hibernate.validator:hibernate-validator in /data-prepper-core (#2974)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 20 Sep 2023 10:25:41 -0700
    
    
    Bumps
    [org.hibernate.validator:hibernate-validator](https://github.com/hibernate/hibernate-validator)
    from 8.0.0.Final to 8.0.1.Final.
    -
    [Changelog](https://github.com/hibernate/hibernate-validator/blob/main/changelog.txt)
    
    -
    [Commits](https://github.com/hibernate/hibernate-validator/compare/8.0.0.Final...8.0.1.Final)
    
    
    ---
    updated-dependencies:
    - dependency-name: org.hibernate.validator:hibernate-validator
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Armeria 1.25.2 (#3351)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 20 Sep 2023 06:35:42 -0700
    
    
    Updates Armeria to 1.25.2. This also removes a Gradle resolution strategy which
    fixes some dependencies to specific versions. Instead, use a dependency version
    requirement which allows for using newer versions. Resolves #3069.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rebased to latest (#3358)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 19 Sep 2023 08:00:49 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __FEAT: AWS secret extension (#3340)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 18 Sep 2023 23:48:02 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Use async client to delete scroll and pit for OpenSearch as workaroun… (#3338)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 18 Sep 2023 14:14:34 -0500
    
    
    Use async client to delete scroll and pit for OpenSearch as workaround for bug
    in client
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Recursive (#3198)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 18 Sep 2023 14:13:28 -0500
    
    
    * readme and config
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * clarify readme
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * working on recursive implementation, resolving issues
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * resolve errors
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * inner string parse logic done, working on splitter logic
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * write recursive implementation and reorganize code for clarity, fixing bugs
    with recursing
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * basic implementation done and working, cleaning code and testing edge cases
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * resolve duplicate value test failures and add basic recursive test
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * write tests and specify configs in regards to recursive
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * switch transform_key config functionality, specify that splitters have to
    have length = 1, switch bracket check logic to pattern matching
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * clean code
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix errors
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix nits
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Co-authored-by: Kat Shen
    &lt;katshen@amazon.com&gt;

* __Updates Trace Analytics sample appliction to run again (#3348)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 18 Sep 2023 12:04:09 -0700
    
    
    Get the Trace Analytics sample app running again. This includes version updates
    for dependencies and some corrections from the previous PR which started using
    Temurin which brought in Ubuntu in the image. Adds GitHub Actions to verify
    that the trace-analytics example apps can still build Docker images.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Rename os source rate/job_count to interval/count, acquire UNASSIGNED partitions before CLOSED partitions (#3327)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Sat, 16 Sep 2023 12:06:18 -0700
    
    
    * Rename os source rate/job_count to interval/count, acquire UNASSIGNED
    partitions before CLOSED partitions
    Signed-off-by: Taylor Gray
    &lt;tylgry@amazon.com&gt;
    
    * Rename count to index_read_count
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    
    ---------
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updates the trace analytics sample app to run using the latest Spring Boot - 3.1.3. Also updates to using JDK 17 which is required, along with moving to the Temurin Docker image as the OpenJDK Docker image is deprecated. (#3343)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Sep 2023 12:02:40 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Moved the S3 source package to include s3 in the package name. (#3339)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Sep 2023 12:02:10 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Gatling performance tests - round-robin host property and documentation for recent changes. (#3320)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 15 Sep 2023 12:01:39 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __BUG: Stop S3 source on InterruptedException (#3331)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 15 Sep 2023 11:26:09 -0700
    
    
    Stop S3 source on InterruptedException
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __ENH: support pipeline extensions in pipeline config (#3299)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 14 Sep 2023 19:55:07 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Adds README for the RSS Source plugin (#2350)__

    [Shivani Shukla](mailto:67481911+sshivanii@users.noreply.github.com) - Thu, 14 Sep 2023 09:53:18 -0700
    
    
    Adds README for the RSS Source plugin
    Signed-off-by: Shivani Shukla
    &lt;sshkamz@amazon.com&gt;

* __Moves cmanning09 to the emeritus section. (#3337)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 14 Sep 2023 09:23:07 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds a Gradle task to generate an aggregate test report. This is not currently used by any automation, but this makes it available for a developer to use. (#3325)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 14 Sep 2023 06:55:22 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Run the Gradle builds in parallel to reduce the overall build time. (#3324)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 14 Sep 2023 06:55:07 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds missing license headers section to the CONTRIBUTING.md file. (#3292)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 12 Sep 2023 09:45:51 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Exponential backoff and jitter for opensearch source when no indices are available to process (#3321)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 12 Sep 2023 11:36:57 -0500
    
    
    Add linear backoff and jitter to opensearch source when no indices are
    available
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix issue of skipping new partitions/indices for the opensearch source (#3319)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 12 Sep 2023 10:57:31 -0500
    
    
    Fix issue where the source coordinator would skip creating partitions for new
    items for the os source
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    
    ---------
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix NPE in s3 scan partition supplier (#3317)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 12 Sep 2023 10:09:45 -0500
    
    
    Fix potential NPE in s3 scan partition supplier
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Uses mocking in the SQS Source test to simplify the unit tests and reduce build times. This knocks off close to a minute from the build. (#3303)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 11 Sep 2023 11:17:08 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Need two digits for dates in the common Apache log format in the Gatling performance tests. Formatting fixes. (#3318)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 8 Sep 2023 13:13:15 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump grpcio in /release/smoke-tests/otel-span-exporter (#2984)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 7 Sep 2023 14:56:12 -0700
    
    
    Bumps [grpcio](https://github.com/grpc/grpc) from 1.50.0 to 1.53.0.
    - [Release notes](https://github.com/grpc/grpc/releases)
    -
    [Changelog](https://github.com/grpc/grpc/blob/master/doc/grpc_release_schedule.md)
    
    - [Commits](https://github.com/grpc/grpc/compare/v1.50.0...v1.53.0)
    
    ---
    updated-dependencies:
    - dependency-name: grpcio
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump certifi in /release/smoke-tests/otel-span-exporter (#3062)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 7 Sep 2023 14:54:56 -0700
    
    
    Bumps [certifi](https://github.com/certifi/python-certifi) from 2022.12.7 to
    2023.7.22.
    -
    [Commits](https://github.com/certifi/python-certifi/compare/2022.12.07...2023.07.22)
    
    
    ---
    updated-dependencies:
    - dependency-name: certifi
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Gatling performance test enhancements - HTTPS, path configuration, AWS SigV4 (#3312)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 7 Sep 2023 09:29:13 -0700
    
    
    Adds Gatling configurations for using HTTPS and for configuring the target
    path. Resolves #3308. 
     Increase the maximum response time for the SingleRequestSimulation to 1
    second. This is in line with other tests. 
     Adds AWS SigV4 signing in the Gatling performance tests. Also moves the
    Gatling setup into constructors rather than static initializers. Resolves
    #3308.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds sigv4 support to Elasticsearch client (#3305)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 6 Sep 2023 14:30:33 -0700
    
    
    Adds sigv4 support to Elasticsearch client. Move
    AwsRequestSigningApacheInterceptor to aws-plugin-api, use in os source and sink
    
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add metrics for the opensearch source (#3304)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 6 Sep 2023 08:25:31 -0700
    
    
    Add metrics for the opensearch source
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Bump net.bytebuddy:byte-buddy in /data-prepper-plugins/opensearch (#3298)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 6 Sep 2023 07:45:55 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy](https://github.com/raphw/byte-buddy) from
    1.14.4 to 1.14.7.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.4...byte-buddy-1.14.7)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates Bouncy Castle to 1.76. This moves the dependency into the version catalog and starts using the jdk18on series as Data Prepper requires Java 11 as a minimum anyway. (#3302)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 6 Sep 2023 06:42:52 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump net.bytebuddy:byte-buddy-agent in /data-prepper-plugins/opensearch (#3297)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Sep 2023 09:37:28 -0700
    
    
    Bumps [net.bytebuddy:byte-buddy-agent](https://github.com/raphw/byte-buddy)
    from 1.14.4 to 1.14.7.
    - [Release notes](https://github.com/raphw/byte-buddy/releases)
    - [Changelog](https://github.com/raphw/byte-buddy/blob/master/release-notes.md)
    
    -
    [Commits](https://github.com/raphw/byte-buddy/compare/byte-buddy-1.14.4...byte-buddy-1.14.7)
    
    
    ---
    updated-dependencies:
    - dependency-name: net.bytebuddy:byte-buddy-agent
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Updates to Gradle 8.3; fixes deprecated Gradle behavior (#3269)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 1 Sep 2023 09:36:23 -0700
    
    
    Updates to Gradle 8.3, including fixing deprecated behavior. Resolves #3267
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Bump tough-cookie from 4.1.2 to 4.1.3 in /release/staging-resources-cdk (#2993)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Fri, 1 Sep 2023 09:02:21 -0700
    
    
    Bumps [tough-cookie](https://github.com/salesforce/tough-cookie) from 4.1.2 to
    4.1.3.
    - [Release notes](https://github.com/salesforce/tough-cookie/releases)
    -
    [Changelog](https://github.com/salesforce/tough-cookie/blob/master/CHANGELOG.md)
    
    - [Commits](https://github.com/salesforce/tough-cookie/compare/v4.1.2...v4.1.3)
    
    
    ---
    updated-dependencies:
    - dependency-name: tough-cookie
     dependency-type: indirect
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __MAINT: merge dataflow model instead of files (#3290)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 31 Aug 2023 15:38:14 -0500
    
    
    ---------
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Bump semver and aws-cdk-lib in /release/staging-resources-cdk (#3047)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 31 Aug 2023 11:28:13 -0700
    
    
    Bumps [semver](https://github.com/npm/node-semver) to 7.5.3 and updates
    ancestor dependencies [semver](https://github.com/npm/node-semver) and
    [aws-cdk-lib](https://github.com/aws/aws-cdk/tree/HEAD/packages/aws-cdk-lib).
    These dependencies need to be updated together.
    
     Updates `semver` from 6.3.0 to 7.5.3
    - [Release notes](https://github.com/npm/node-semver/releases)
    - [Changelog](https://github.com/npm/node-semver/blob/main/CHANGELOG.md)
    - [Commits](https://github.com/npm/node-semver/compare/v6.3.0...v7.5.3)
     Updates `semver` from 5.7.1 to 7.5.3
    - [Release notes](https://github.com/npm/node-semver/releases)
    - [Changelog](https://github.com/npm/node-semver/blob/main/CHANGELOG.md)
    - [Commits](https://github.com/npm/node-semver/compare/v6.3.0...v7.5.3)
     Updates `aws-cdk-lib` from 2.80.0 to 2.88.0
    - [Release notes](https://github.com/aws/aws-cdk/releases)
    - [Changelog](https://github.com/aws/aws-cdk/blob/main/CHANGELOG.v2.md)
    -
    [Commits](https://github.com/aws/aws-cdk/commits/v2.88.0/packages/aws-cdk-lib)
    
    ---
    updated-dependencies:
    - dependency-name: semver
     dependency-type: indirect
    - dependency-name: semver
     dependency-type: indirect
    - dependency-name: aws-cdk-lib
     dependency-type: direct:production
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Add e2e acknowledgments support to opensearch source (#3278)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 30 Aug 2023 21:49:42 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add support for OpenSearch Serverless collections to the opensearch source (#3288)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 30 Aug 2023 21:48:00 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add Support for OTel Log SeverityText (#3280) (#3281)__

    [Karsten Schnitter](mailto:k.schnitter@sap.com) - Wed, 30 Aug 2023 10:53:20 -0700
    
    
    Add Support for OTel Log SeverityText (#3280)
     The OpenTelemetry Codec lacks support for the severity text.
    This oversight
    is corrected by extracting the field from the OTLP
    source data and copying it
    to a matching field in the JSON
    document. It tightly aligns with the already
    supported SeverityNumber
    field. This closes a gap in the OTLP logs data model
    mapping.
    Unit tests of codec and JSON mapping are adjusted for the added
    
    field.
     Signed-off-by: Karsten Schnitter &lt;k.schnitter@sap.com&gt;

* __ENH: allow extension configuration from data prepper configuration (#2851)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 30 Aug 2023 12:31:05 -0500
    
    
    * ADD: initial implementation on injecting extension config
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Reduce sleep times in BlockingBufferTests to speed up unit tests. (#3221)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 29 Aug 2023 13:46:28 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Removes some unnecessary dependencies in the S3 sink and Parquet codecs (#3275)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 29 Aug 2023 08:36:14 -0700
    
    
    Removes some unnecessary dependencies in the S3 sink and Parquet codec
    projects. Updating the Parquet version to 1.13.1 consistently. Exclude HDFS
    client.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update Checkstyle to the latest version - 10.12.3 - to attempt to remove Guava vulnerability. (#3276)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 29 Aug 2023 08:35:36 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add exception handling and retry to uncaught exceptions, catch IndexN… (#3250)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 28 Aug 2023 16:24:48 -0500
    
    
    Add exception handling and retry to uncaught exceptions, catch
    IndexNotFoundException for os source
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Enable publishing to all platforms in jenkins release pipeline (#3274)__

    [Sayali Gaikawad](mailto:61760125+gaiksaya@users.noreply.github.com) - Mon, 28 Aug 2023 12:41:43 -0700
    
    
    Signed-off-by: Sayali Gaikawad &lt;gaiksaya@amazon.com&gt;

* __Adds Data Prepper 2.4.0 changelog. (#3223)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 28 Aug 2023 12:01:54 -0700
    
    
    Adds Data Prepper 2.4.0 changelog.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix jenkins maven publishing stage and disable other stages for now (#3271)__

    [Sayali Gaikawad](mailto:61760125+gaiksaya@users.noreply.github.com) - Mon, 28 Aug 2023 12:01:06 -0700
    
    
    Signed-off-by: Sayali Gaikawad &lt;gaiksaya@amazon.com&gt;

* __Removes Maxmind license keys from test URLs. (#3270)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 28 Aug 2023 10:41:27 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix for kafka source issue #3264 (aws glue excetion handling) (#3265)__

    [Hardeep Singh](mailto:mzhrde@amazon.com) - Sat, 26 Aug 2023 19:34:41 -0500
    
    
    

* __Kafka sink (#3127)__

    [rajeshLovesToCode](mailto:131366272+rajeshLovesToCode@users.noreply.github.com) - Sat, 26 Aug 2023 15:59:20 -0700
    
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;

* __Fix for kafka source issue #3247 (offset commit stops on deserialization error) (#3260)__

    [Hardeep Singh](mailto:mzhrde@amazon.com) - Fri, 25 Aug 2023 16:57:59 -0700
    
    
    Signed-off-by: Hardeep Singh &lt;mzhrde@amazon.com&gt;

* __Disallow the combination of a user-defined schema and include/exclude keys (#3254)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Aug 2023 15:42:16 -0700
    
    
    Disallow the combination of a user-defined schema and include/exclude keys in
    the Parquet/Avro sink codecs. Resolves #3253.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes build broken by RELEASING.md spotless check. (#3258)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Aug 2023 14:59:11 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adds a RELEASING.md file to the root of the project (#3251)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Aug 2023 14:04:43 -0700
    
    
    Adds a RELEASING.md file to the root of the project. This has updated
    instructions for the new release workflow. Resolves #3108.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixes a bug with the S3 parquet codec which was not calculating size correctly. Require the parquet codec only with in_memory which is how it is buffering data. Some debugging help. (#3249)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 25 Aug 2023 13:43:31 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Behavioral change to Avro codecs and schema handling (#3238)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 24 Aug 2023 14:15:53 -0700
    
    
    Change the behavior of Avro-based codecs. When a schema is defined, rely on the
    schema rather than the incoming event. If the schema is auto-generated, then
    the incoming event data must continue to match. Fix Avro arrays which were only
    supporting arrays of strings previously.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Batch the errors writing to the S3 sink to reduce the number of errors reported. (#3242)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 24 Aug 2023 14:14:24 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Catch when no object exists and mark as completed in s3 scan (#3241)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 24 Aug 2023 13:52:20 -0700
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix for kafka source not committing offsets issue #3231 (#3232)__

    [Hardeep Singh](mailto:mzhrde@amazon.com) - Thu, 24 Aug 2023 12:42:55 -0700
    
    
    Signed-off-by: Hardeep Singh &lt;mzhrde@amazon.com&gt;

* __Removes @cmanning09 from the CODEOWNERS file to allow the release build to proceed. (#3225)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 23 Aug 2023 15:45:03 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improvements in the release.yml GitHub Action: Better conditional to fail the promote if the build fails, increased the timeout, added the issues write permissions, string literal correction. (#3224)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 23 Aug 2023 12:41:19 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improve the S3 sink integration tests combinations. The tests are now more consistent and avoid some redundant tests, thus also running faster. Sets up to have fewer combinations while testing all codecs. (#3199)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 23 Aug 2023 12:16:02 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add 2.4 release notes (#3220)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Wed, 23 Aug 2023 06:43:44 -0700
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Updates documentation for the Avro codec and S3 sink. Resolves #3162. (#3211)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Aug 2023 15:17:11 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Set main version to 2.5.0 (#3215)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 22 Aug 2023 15:16:45 -0700
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Kafka source fixes: commit offsets, consumer group mutations, consumer shutdown (#3207)__

    [Hardeep Singh](mailto:mzhrde@amazon.com) - Tue, 22 Aug 2023 15:12:26 -0700
    
    
    Removed acknowledgments_timeout config from kafka source
     Signed-off-by: Hardeep Singh &lt;mzhrde@amazon.com&gt;

* __Catch exceptions when writing to the output codec and drop the event. (#3210)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Aug 2023 14:40:53 -0700
    
    
    Catch exceptions when writing to the output codec and drop the event. Correctly
    release failed events in the S3 sink.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Generated THIRD-PARTY file for fecb842 (#3212)__

    [opensearch-trigger-bot[bot]](mailto:98922864+opensearch-trigger-bot[bot]@users.noreply.github.com) - Tue, 22 Aug 2023 14:09:53 -0700
    
    
    Signed-off-by: GitHub &lt;noreply@github.com&gt;
    Co-authored-by: dlvenable
    &lt;dlvenable@users.noreply.github.com&gt;

* __Normalize the include/exclude keys in the JacksonEvent implementation in order to fix a problem where the ndjson codec was not correctly including/excluding keys. (#3209)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Aug 2023 13:47:29 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix bug where enum for s3 select was using NotBlank annotation (#3208)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 22 Aug 2023 14:04:46 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Adds an auto_schema flag to require a user to be explicit in using auto-schema generation. (#3206)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Aug 2023 10:25:03 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add jenkins release workflow and refactor GHA workflow (#3204)__

    [Sayali Gaikawad](mailto:61760125+gaiksaya@users.noreply.github.com) - Tue, 22 Aug 2023 09:31:00 -0700
    
    
    Signed-off-by: Sayali Gaikawad &lt;gaiksaya@amazon.com&gt;

* __Removes code which isn&#39;t used for the Avro and Parquet codecs. This will keep untested and errant code paths out of the project. Resolves #3201. (#3205)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Aug 2023 07:40:32 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates to the S3 sink to speed up the unit test time. There are a few major changes - use the Duration class instead of a nebulous long to have millisecond options and clarity; inject the retry sleep time so that the tests can sleep for shorter time; using mocking where possible to avoid unnecessary sleeps. (#3203)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 22 Aug 2023 07:05:30 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix: IllegalArgument Exception in String converter (#3172)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 21 Aug 2023 12:06:13 -0700
    
    
    * Fix: IllegalArgument Exception in String converter
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Added tags_on_failure
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Addressed feedback
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Corrects the output codecs for Avro/Parquet to use the include/exclude keys. Also adds a shouldNotIncludeKey method to OutputCodecContext. (#3197)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 21 Aug 2023 08:56:19 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Correctly add compression extensions to the generated S3 sink keys. If compression is internal, does not utilize. Resolves #3158. (#3196)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 21 Aug 2023 08:47:04 -0700
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix uncaught exception causing pipeline shutdown  (#3189)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 21 Aug 2023 10:15:19 -0500
    
    
    * Catch ClassCastException in JacksonOtelLog.toJsonString()
    * Add overwrite option to parse-json processor
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Updates the Data Prepper tar.gz artifact to include JDK 17.0.8_7 which is the current latest version available. (#3136)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 18 Aug 2023 18:17:15 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updated scan start_time ,end_time and range combinations (#3188)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 18 Aug 2023 16:56:54 -0500
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Corrects the JSON output codec to write Events as provided rather than convert to string. Also fixes the include/exclude keys. Adds a boolean check in OutputCodecContext so that this can be used by other codecs. (#3195)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 18 Aug 2023 16:44:40 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Suppport null values in Avro and Parquet output codecs when the schema is null. Auto-generate schemas that are nullable so that null values can be included in these schemas. Resolves part of #3158. (#3194)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 18 Aug 2023 16:15:56 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Added validations in include and exclude keys (#3181)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 18 Aug 2023 13:46:27 -0500
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __FIX: set default value for enable_compression (#3190)__

    [Qi Chen](mailto:qchea@amazon.com) - Fri, 18 Aug 2023 10:47:14 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Automatically promote the releases in the release workflow once the release issue has been approved by two maintainers. Resolves #2122. (#3149)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 18 Aug 2023 08:30:16 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Continue calling S3SinkService::output even if records is empty to flush stale batches (#3187)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Fri, 18 Aug 2023 08:29:49 -0500
    
    
    Continue calling S3SinkService::output even if records is empty to flush stale
    batches (#3187)
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __merged with latest (#3182)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 17 Aug 2023 16:23:06 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Correct Parquet support for the S3 sink and a new multipart buffer type (#3186)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 17 Aug 2023 16:35:25 -0500
    
    
    Correct the ParquetOutputCodec and moved into the S3 sink project for now. It
    has a few corrections including support for compression and avoiding multiple
    S3 copies. This PR also adds a new buffer type to the S3 sink - Multipart
    uploads. This PR also includes a number of refactorings to the project and the
    integration tests.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Update Kafka source/sink to use ByteCount (#3183)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 17 Aug 2023 14:24:30 -0700
    
    
    * Retry without seeking incase of AWSSchemaRegistryException
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Updated to link usage and config to DataPrepper documentation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Update Kafka source/sink to use ByteCount
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add Exemplars to metrics generated in aggregate processor (#3165)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 17 Aug 2023 09:43:58 -0700
    
    
    * Add Exemplars to metrics generated in aggregate processor
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Updated documentation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add limit to cardinality key, and metric for cardinality overflow (#3173)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Thu, 17 Aug 2023 08:40:39 -0700
    
    
    * Add limit to cardinality key, and metric for cardinality overflow
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Change cardinality overflow warning from once to every five minutes
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    ---------
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Adds a new integration test to the S3 sink which can test different scenarios. This currently is testing against ndjson since this codec generally works. (#3179)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 16 Aug 2023 14:50:36 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Only log that the scan is complete one time for s3 scan (#3168)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 16 Aug 2023 13:33:10 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix NPE on s3 source stopping without sqs, stop s3 scan worker thread on stopping of the s3 source (#3178)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 16 Aug 2023 13:09:41 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support other scan time configs= combinations (#3151)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Wed, 16 Aug 2023 12:53:02 -0500
    
    
    * Added support for additional time comibinations in s3 scan
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Deprecate document_id_field and add support for document_id with formatting (#3153)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 16 Aug 2023 12:27:29 -0500
    
    
    Deprecate document_id_field and add support for document_id with formatting
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Minor fixes to Kafka Source (#3174)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 16 Aug 2023 10:23:15 -0700
    
    
    * Minor fixes to Kafka Source
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed unused configs
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Reword circuit breaker configuration log message (#3175)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 16 Aug 2023 12:18:00 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix timestamp format (#3171)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Wed, 16 Aug 2023 11:52:53 -0500
    
    
    Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Fix S3 sink writing to closed stream exception (#3170)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Wed, 16 Aug 2023 11:22:07 -0500
    
    
    Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Snappy as a compression option in the S3 sink: adds new option and engine, adds missing unit test for the CompressionOption class, make other compression engine classes package private. (#3155)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 16 Aug 2023 10:39:35 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add catching and logging of exceptions for s3 scan worker (#3159)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 15 Aug 2023 15:36:04 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Support s3:// prefix (#3156)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 15 Aug 2023 10:39:01 -0500
    
    
    Support s3:// prefix
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Fixes two flaky unit tests that have failed recently (#3150)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 14 Aug 2023 16:02:18 -0500
    
    
    Fixes two unit tests that have failed and are probably flaky. The
    ParseTreeEvaluatorListenerTest appears to be using negative values sometimes,
    which seems to be unsupported. The OTelLogsSourceTest test failed as well, but
    it appears this code may not always be executed because it was mixing Hamcrest
    and Mockito.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix flaky integration test by wrapping a list in a new list to avoid a ConcurrentModificationException. Resolves #3139. (#3152)__

    [David Venable](mailto:dlv@amazon.com) - Mon, 14 Aug 2023 16:02:01 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix flakey test caused by RCF variance. Update metric for RCF Instances (#3145)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Mon, 14 Aug 2023 13:10:21 -0500
    
    
    * Fix flakey test caused by RCF variance
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Change metric name and type. Update test readability
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Fix unit test to account for metric change
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    ---------
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Fix Null pointer exception when schema registry not specified (#3147)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 11 Aug 2023 18:35:17 -0700
    
    
    * Fix Null pointer exception when schema registry not specified
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fix failing test cases
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Glue registry fixes. Fixed a bug in getMSKBootstrapServers (#3142)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 11 Aug 2023 10:28:08 -0700
    
    
    * Glue registry fixes. Fixed a bug in getMSKBootstrapServers
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Changed default auto commit reset to earliest
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add default value to cardinality keys (#3144)__

    [Jonah Calvo](mailto:caljonah@amazon.com) - Fri, 11 Aug 2023 11:14:43 -0500
    
    
    Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __Adds S3 sink compression. Resolves #3130. (#3138)__

    [David Venable](mailto:dlv@amazon.com) - Fri, 11 Aug 2023 10:58:22 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add support for scheduled scan to s3 scan (#3140)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 11 Aug 2023 10:54:42 -0500
    
    
    Add support for scheduled scan to s3 scan
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __The rss-source is defined twice in the settings.gradle and this removes the extra one. (#3134)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 10 Aug 2023 20:02:37 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Adding cardinality key support for AD processor (#3073)__

    [Jonah Calvo](mailto:jonah.calvo@gmail.com) - Thu, 10 Aug 2023 13:33:20 -0700
    
    
    * Adding cardinality key support for AD processor
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    * Refactor hash function to common package. Add metrics for RCF instances.
    Implement optional verbose mode for RCF
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;
    
    ---------
     Signed-off-by: Jonah Calvo &lt;caljonah@amazon.com&gt;

* __S3 single scan improvements (#3124)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Thu, 10 Aug 2023 15:30:28 -0500
    
    
    * S3 single scan improvements
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Correct the behavior of the JSON output codec to write a JSON object first. Adds a configurable keyName for the array. (#3132)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 10 Aug 2023 15:13:27 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Add metrics to Kafka Source (#3118)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 10 Aug 2023 11:38:43 -0700
    
    
    * Add metrics to Kafka Source
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed debug print statement
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing test case
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added total committed metric and fixed tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed number of committed records stat. Also fixed bug when acknowledgements
    enabled
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments. Fixed acknowledgements related bug
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed to use counters for records/bytes consumed metrics
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed unused code
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added a metric for keeping track of number of consumers without any
    partitions assigned
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added unit test for KafkaTopicMetrics
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Update the developer_guide.md with updated instructions for user documentation. Updated the PR template to include documentation, and updated the Issues Resolved section to encourage use of &#34;Resolves #&#34;. (#2772)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 10 Aug 2023 11:51:16 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improved Avro error reporting related to schemas (#3110)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 10 Aug 2023 11:22:33 -0500
    
    
    Check the Avro schema when starting Data Prepper and throw a clearer exception
    when an Avro field is missing from the schema. Some code clean-up.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates to the Avro codec README.md to include an example of using an Avro schema for VPC Flow Logs. Updates the YAML to make the string easier to handle. (#3111)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 10 Aug 2023 10:21:05 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __MAINT: add integ test coverage for ODFE 0.10.0 (#3131)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 9 Aug 2023 19:29:13 -0500
    
    
    * MAINT: add integ test coverage for ODFE 0.10.0
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Adds Apache commons-lang3 to the Gradle version catalog and updates it to version 3.13.0. (#3120)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 9 Aug 2023 17:23:16 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fixed issue with CloudWatchLogMetrics not updating counters when no event handles are present (#3114)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Wed, 9 Aug 2023 16:20:10 -0500
    
    
    Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    Co-authored-by:
    Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;

* __Add ttl to all dynamo source coordination store items on creation, not just when they are COMPLETED (#3121)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 9 Aug 2023 13:26:55 -0500
    
    
    Add ttl to all dynamo source coordination store items on creation, not just
    when they are COMPLETED
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add include_keys and exclude_keys to S3 sink (#3122)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Wed, 9 Aug 2023 13:15:39 -0500
    
    
    * Add validation and update document
     Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;
    
    * Add OutputCodecContext for output codecs.
     Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;
    
    * Add OutputCodecContext for output codecs.
     Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;
    
    ---------
     Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Default keys (#3075)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Tue, 8 Aug 2023 12:19:36 -0500
    
    
    * readme and config
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * skeleton logic written
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * default keys impl and tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * finish tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * rerun checks
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * change impl to have parity with logstash
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * add clarifying example to readme, fix edge cases, add tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * rename test for clarity
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * change logging statements from string.format()
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix default key check error
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * change default config name to default_values, fix to have parity with
    logstash, enhance relevant tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * rerun checks
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix nits
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * remove extraneous test
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * clean up illegal argument statements, parameterize tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Co-authored-by: Kat Shen
    &lt;katshen@amazon.com&gt;

* __S3 scan enhancements (#3049)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 7 Aug 2023 16:50:20 -0500
    
    
    * S3 scan enhancements
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __-Support for kafka-sink (#2999)__

    [rajeshLovesToCode](mailto:131366272+rajeshLovesToCode@users.noreply.github.com) - Mon, 7 Aug 2023 09:07:18 -0700
    
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;
    
    * -Support for kafka-sink
    Signed-off-by: rajeshLovesToCode
    &lt;rajesh.dharamdasani3021@gmail.com&gt;

* __Centralize exception handling and fix behavior for RequestTimeoutException (#3063)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Fri, 4 Aug 2023 16:05:54 -0500
    
    
    * Centralize exception handling and fix behavior for RequestTimeoutException
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Fix existing tests
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests for exception handlers
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add copyright headers
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add better default messages
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Fix code to set max poll interval and fetch min bytes config (#3115)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 4 Aug 2023 12:50:56 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Sns Sink Plugin with junit test cases (#2995)__

    [Uday Chintala](mailto:udaych20@gmail.com) - Fri, 4 Aug 2023 12:58:24 -0500
    
    
    Sns Sink Plugin with junit test cases
    
    ---------
     Signed-off-by: Uday Kumar Chintala &lt;udaych20@gmail.com&gt;
    Signed-off-by: Uday
    Chintala &lt;udaych20@gmail.com&gt;

* __Prometheus Sink Boiler plate code for issue #1744. (#3078)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Fri, 4 Aug 2023 10:10:49 -0500
    
    
    * Prometheus Sink boiler plate code for issue #1744.
    Signed-off-by:
    mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;
    
    * Prometheus Sink Fix for issue #1744.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;
    
    * Prometheus Sink review comment rsolved for issue #1744.
    Signed-off-by:
    mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;

* __ENH: support custom index template for ES6 in opensearch sink (#3061)__

    [Qi Chen](mailto:qchea@amazon.com) - Thu, 3 Aug 2023 11:59:06 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __GitHub-Issue#2778: Added README for CloudWatch Logs Sink (#3101)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Wed, 2 Aug 2023 17:19:06 -0500
    
    
    * Adding README
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added README to sink
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added PluginFunctionality to README
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Update data-prepper-plugins/cloudwatch-logs/README.md
     Co-authored-by: Mark Kuhn &lt;kuhnmar@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    
    * Update data-prepper-plugins/cloudwatch-logs/README.md
     Co-authored-by: Mark Kuhn &lt;kuhnmar@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    
    * Added fixes to configuration in README and example id
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added extra info in plugin functionality
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    ---------
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    Signed-off-by:
    Marcos Gonzalez Mayedo &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    
    Co-authored-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    Co-authored-by:
    Mark Kuhn &lt;kuhnmar@amazon.com&gt;

* __Bump com.opencsv:opencsv from 5.7.1 to 5.8 (#3097)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 2 Aug 2023 17:13:11 -0500
    
    
    Bumps com.opencsv:opencsv from 5.7.1 to 5.8.
    
    ---
    updated-dependencies:
    - dependency-name: com.opencsv:opencsv
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __GitHub-Issue#2778: Refactored Config to include Duration and ByteCount types (#3099)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Wed, 2 Aug 2023 16:43:33 -0500
    
    
    * Converted data types in the configuration to Data-Prepper types
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added Duration to backOffTime
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Attempting to fix unused imports
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    ---------
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    Co-authored-by:
    Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;

* __Updated GitHub Actions to use &#34;Data Prepper&#34; in the job titles for consistency and aligning with the project name. (#3104)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 2 Aug 2023 13:59:04 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix consumer synchronization. Fix consumer to use user-specified groupId (#3100)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 2 Aug 2023 10:43:37 -0700
    
    
    * Fix consumer synchronization. Fix consumer to use user-specified groupId
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fix check style error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed to retry if consume records encounters an exception
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Bump org.xerial.snappy:snappy-java in /data-prepper-plugins/common (#3095)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 2 Aug 2023 09:00:13 -0500
    
    
    Bumps [org.xerial.snappy:snappy-java](https://github.com/xerial/snappy-java)
    from 1.1.10.1 to 1.1.10.3.
    - [Release notes](https://github.com/xerial/snappy-java/releases)
    -
    [Commits](https://github.com/xerial/snappy-java/compare/v1.1.10.1...v1.1.10.3)
    
    ---
    updated-dependencies:
    - dependency-name: org.xerial.snappy:snappy-java
     dependency-type: direct:production
     update-type: version-update:semver-patch
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __GitHub-Issue#2778: Added CloudWatchLogsSink (#3084)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Tue, 1 Aug 2023 15:58:09 -0500
    
    
    GitHub-Issue#2778: Refactoring config files for CloudWatchLogs Sink (#4)
    
    
    ---------
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;alemayed@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez Mayedo
    &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    Co-authored-by: Taylor Gray
    &lt;tylgry@amazon.com&gt;
    Co-authored-by: Marcos &lt;alemayed@amazon.com&gt;

* __Fix Negative acknowledgement handling and other minor issues (#3082)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 1 Aug 2023 10:10:22 -0700
    
    
    * Fix Negative acknowledgement handling and other minor issues
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed check style errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Cleanup of unused files and config
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __HttpSink Plugin Functionality for #874. (#3036)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Tue, 1 Aug 2023 08:57:06 -0700
    
    
    * HttpSink Plugin Functionality for #874.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;
    
    * Fixed review comments for #874.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;
    
    * Fixes for #874.
    Signed-off-by: mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;

* __Added Translate Processor README.md file (#3033)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Mon, 31 Jul 2023 16:19:08 -0700
    
    
    Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __GitHub-Issue#2778: Added CouldWatchLogsService, Tests and RetransmissionException (#3023)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Mon, 31 Jul 2023 13:03:33 -0500
    
    
    * Elasticsearch client implementation with pit and no context search (#2910)
     Create Elasticsearch client, implement search and pit apis for
    ElasticsearchAccessor
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;alemayed@amazon.com&gt;
    
    * GitHub-Issue#2778: Refactoring config files for CloudWatchLogs Sink (#4)
     Added Config Files for CloudWatchLogs Sink.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added fixes from comments to code (including pathing and nomenclature syntax)
    
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Refactoring config (#5)
     Added default params for back_off and log_send_interval alongside test cases
    for ThresholdConfig.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed deleted AwsConfig file
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed the s3 dependency from build.gradle, replaced the AwsAuth.. with
    AwsConfig.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added modifiable back_off_timer, added threshold test for back_off_timer and
    params to AwsConfig
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added fixes to gradle file, added tests to AwsConfig, and used Reflective
    mapping to tests CwlSink
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added default value test to ThresholdConfig and renamed getter for
    maxRequestSize
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed unnecessary imports
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added cloudwatch-logs to settings.gradle
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added a quick fix to the back_off_time range
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added Buffer classes, ClientFactory similar to S3, and ThresholdCheck
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed unnecessary default method from ClientFactory
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added comments in Buffer Interface, change some default values to suit the
    plugin use case more
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed unused imports
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Changed the unused imports, made parameters final in the ThresholdCheck
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Made changes to the tests and the method signatures in ThresholdCheck, made
    fixes to gradle file to include catalog
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed unused methods/comments
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added CloudWatchLogsService, CloudWatchLogsServiceTest and
    RetransmissionLimitException
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed retransmission logging fixed value
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed unused imports
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed making ThresholdCheck public
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added fixes to ThresholdCheck and CloudWatchLogsService to decouple methods
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed syntax start import in CloudWatchLogsServiceTest
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Extracted LogPusher and SinkStopWatch classes for code cleanup. Addded fixes
    to variables and retry logic for InterruptExceptions
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Changed method uses in CloudWatchLogsService and removed logging the batch
    size in LogPusher
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added Multithreaded CloudWatchLogsDispatcher for handling various async calls
    to perform PLE&#39;s
     and added tests
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added fixesto test and defaulted the parameters in the config to
    CloudWatchLogs limits, customer can change this in config file
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added exponential backofftime
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed unused imports
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed up deepcopy of arraylist for service workers in CloudWatchLogsService,
    and fixed Log calling methods
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added CloudWatchLogsDispatcher builder pattern, fixed tests for Service and
    Dispatcher and modified backOffTimeBase
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed unused imports
     Signed-off-by:Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    Signed-off-by:
    Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added resetBuffer method, removed unnecessary RetransmissionException, and
    added logString pass in parameter for staging log events.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Started making changes to the tests to implement the new class structure
    (performance enhancement)
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Refactored the CloudWatchLogsDispatcher into two classes with the addition of
    Uploader, introduced simple multithread tests for CloudWatchLogsService
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed issues with locking in try block and added final multithreaded tests to
    the CloudWatchLogsService class
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added CloudWatchLogsMetricsTest, changed upper back off time bound and scale,
    and refactoring changes for better code syntax (renaming, refactoring methods
    for conciseness, etc...)
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added changes to javadoc
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Update
    data-prepper-plugins/cloudwatch-logs/src/main/java/org/opensearch/dataprepper/plugins/sink/client/CloudWatchLogsDispatcher.java
    
     Co-authored-by: Mark Kuhn &lt;kuhnmar@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    
    * Fixed comment on CloudWatchLogsDispatcher
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    ---------
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;alemayed@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez Mayedo
    &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    Co-authored-by: Taylor Gray
    &lt;tylgry@amazon.com&gt;
    Co-authored-by: Marcos &lt;alemayed@amazon.com&gt;
    
    Co-authored-by: Mark Kuhn &lt;kuhnmar@amazon.com&gt;

* __Config changes and support for adding different modes to put kafka key in the event (#3076)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Sun, 30 Jul 2023 22:54:47 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add include_keys and exclude_keys to sink (#2989)__

    [Aiden Dai](mailto:68811299+daixba@users.noreply.github.com) - Fri, 28 Jul 2023 16:43:20 -0700
    
    
    Signed-off-by: Aiden Dai &lt;daixb@amazon.com&gt;

* __Removed IterateOn otpion (#3050)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Fri, 28 Jul 2023 09:33:08 -0700
    
    
    Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Changed non-exact mathching logic (#3046)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Fri, 28 Jul 2023 09:31:02 -0700
    
    
    Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Translate Processor : Added support for S3 file mappings (#3054)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Fri, 28 Jul 2023 09:30:43 -0700
    
    
    * Added support for S3 file
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Changed logic for retrieving mappings from S3 file
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    ---------
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Moves the S3 sink and HTTP sink into their own packages. This fixes an issue where there are class conflicts at runtime. (#3067)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 27 Jul 2023 19:37:18 -0500
    
    
    

* __Exclude keys (#3055)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Thu, 27 Jul 2023 11:35:48 -0500
    
    
    * Add exclude keys
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Co-authored-by: Kat Shen
    &lt;katshen@amazon.com&gt;

* __Parquet Sink Codec  (#2928)__

    [umayr-codes](mailto:130935051+umayr-codes@users.noreply.github.com) - Thu, 27 Jul 2023 08:35:31 -0700
    
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    ---------
     Co-authored-by: umairofficial &lt;umairhusain1010@gmail.com&gt;

* __Adds new configurations to the S3 source to better define bucket ownership. Resolves #2012. (#3012)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 26 Jul 2023 14:41:29 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __-Support for Sink Codecs (#2986)__

    [umayr-codes](mailto:130935051+umayr-codes@users.noreply.github.com) - Wed, 26 Jul 2023 11:52:00 -0700
    
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: umairofficial
    &lt;umairhusain1010@gmail.com&gt;
    
    ---------
     Co-authored-by: umairofficial &lt;umairhusain1010@gmail.com&gt;

* __Add support for Glue registry (#3056)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 25 Jul 2023 15:32:30 -0700
    
    
    * Add Support for Glue registry
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed MskGlueRegistryMultiTypeIT test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed integration test failures
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified change Encryption:PLAINTEXT to Encryption:NONE
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Moved serdeFormat to TopicConfig
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Remove * imports from MskGlue test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Improves some of the timeouts for the peer forwarder tests to reduce testing time. (#3020)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 25 Jul 2023 12:49:46 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Improves some of the test timing in Data Prepper core tests which are showing somewhat high test times. (#3021)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 25 Jul 2023 12:49:32 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Work to reduce test time by reducing some repeated tests, using Awaitility, and reducing delays (#3019)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 25 Jul 2023 12:49:18 -0500
    
    
    Work to reduce test time by reducing some repeated tests, using Awaitility, and
    reducing some wait times.
     Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __FIX: missing request index (#3058)__

    [Qi Chen](mailto:qchea@amazon.com) - Tue, 25 Jul 2023 12:03:25 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __Fix bug where exception is thrown when csv source key does not exist or is null (#3053)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 25 Jul 2023 12:01:25 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __ENH: support es 6 in sink (#3045)__

    [Qi Chen](mailto:qchea@amazon.com) - Mon, 24 Jul 2023 15:52:17 -0500
    
    
    * ENH: support es 6 for bulk API
     Signed-off-by: George Chen &lt;qchea@amazon.com&gt;
    

* __Kafka source Confluent schema registry connectivity and OAuth implementation (#3037)__

    [Ajeesh Gopalakrishnakurup](mailto:61016936+ajeeshakd@users.noreply.github.com) - Mon, 24 Jul 2023 11:27:48 -0700
    
    
    * Schema registry connectivity with the oauth configurations
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Junit fixes
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Defect fixes
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Updated the review comments for the PR3037
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    ---------
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;

* __Remove brackets feature option (#3035)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 24 Jul 2023 13:17:14 -0500
    
    
    *add remove brackets feature option
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Co-authored-by: Kat Shen
    &lt;katshen@amazon.com&gt;

* __Add Support for Auth/NoAuth with/without Encryption in Kafka with integration tests (#3042)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 20 Jul 2023 09:20:15 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Bump word-wrap from 1.2.3 to 1.2.4 in /release/staging-resources-cdk (#3044)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Thu, 20 Jul 2023 10:26:17 -0500
    
    
    Bumps [word-wrap](https://github.com/jonschlinkert/word-wrap) from 1.2.3 to
    1.2.4.
    - [Release notes](https://github.com/jonschlinkert/word-wrap/releases)
    - [Commits](https://github.com/jonschlinkert/word-wrap/compare/1.2.3...1.2.4)
    
    ---
    updated-dependencies:
    - dependency-name: word-wrap
     dependency-type: indirect
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Translate Processor -  Added file_path functionality for local files (#3034)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Wed, 19 Jul 2023 14:20:24 -0700
    
    
    * Changed target_type option name to type
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Added file_path functionality for local file
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Fixed file parsing issue and changed error msgs
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Added IOException to log, made testcase change for mappings validation
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    ---------
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Consolidate logic related to extracting data from a BulkOperation (#3041)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Wed, 19 Jul 2023 13:15:41 -0500
    
    
    Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Kafka Source - Cleanup and Enhancements for MSK (#3029)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 18 Jul 2023 15:54:21 -0700
    
    
    * Kafka Source - Cleanup and Enhancements for MSK
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkstyle error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Fix race condition in data prepper sources using e2e acknowledgements (#3039)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 18 Jul 2023 15:53:41 -0700
    
    
    * Fix race condition in data prepper sources using e2e acknowledgements
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkStyle error
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add support for using expressions with formatString in JacksonEvent, use for index in OpenSearch sink (#3032)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 18 Jul 2023 12:10:24 -0500
    
    
    Add support for using expressions with formatString in JacksonEvent, use for
    index in OpenSearch sink
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    
    ---------
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __-Support for Sink Codecs (#3030)__

    [Omkar](mailto:133762828+omkarmmore95@users.noreply.github.com) - Mon, 17 Jul 2023 13:28:58 -0700
    
    
    * -Support for Sink Codecs
    Signed-off-by: omkarmmore95
    &lt;omkar.m.more95@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: omkarmmore95
    &lt;omkar.m.more95@gmail.com&gt;
    
    * -Support for Sink Codecs
    Signed-off-by: omkarmmore95
    &lt;omkar.m.more95@gmail.com&gt;

* __Duplicate values (#3026)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Mon, 17 Jul 2023 09:35:57 -0700
    
    
    * implement transform_key feature
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix unit tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix unit tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * remove bin files
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * add static final variable for string comparison
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * add whitespace description to readme, add configs
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * writing whitespace impl
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * add whitespace impl
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix impl, writing tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * write whitespace test
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * fix formatting, whitespace() -&gt; trimWhitespace()
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * edit readme, add config
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * update logic to valid values set
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * correct return value
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * update variables to static
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * correct convention for private variables
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * impl allow duplicate values, writing tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * allow duplicate values impl + tests
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * modify regex portion to final variables, remove some whitespace
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * rerun checks
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * rename methods/variables for more clarity, change default bool value to be
    false
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * rerun checks
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * change logic to reflect skip_duplicate_values
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * modify tests according to changed logic
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    * remove include keys content (accidentally included it oops)
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Signed-off-by: Katherine Shen
    &lt;40495707+shenkw1@users.noreply.github.com&gt;
    Co-authored-by: Kat Shen
    &lt;katshen@amazon.com&gt;

* __Connection code of HttpSink Plugin for #874. (#2987)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Mon, 17 Jul 2023 09:49:32 -0500
    
    
    Connection code of HttpSink Plugin.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;

* __GitHub-issue#253 : Implemented GeoIP processor integration test (#2927)__

    [venkataraopasyavula](mailto:126578319+venkataraopasyavula@users.noreply.github.com) - Fri, 14 Jul 2023 14:54:33 -0700
    
    
    * GitHub-issue#253 : Implemented GeoIP processor integration test
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor integration test
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor integration test
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor integration test
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor integration test
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;

* __Add support for Data Prepper expressions in the document_id_field of the OpenSearch sink, add opensearch prefix to opensearch source metadata keys (#3025)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 14 Jul 2023 10:51:25 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Translate Plugin: Simplified Config.  (#3022)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Thu, 13 Jul 2023 22:18:06 -0700
    
    
    * Translate Plugin: Simplified Config. Added functionality for multiple sources
    and multiple targets
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Moved helper methods out of config file
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    ---------
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Adds the Data Prepper 2.3.2 change log. (#3024)__

    [David Venable](mailto:dlv@amazon.com) - Thu, 13 Jul 2023 12:02:45 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updated Kafka security configuration (#2994)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Thu, 13 Jul 2023 08:20:50 -0700
    
    
    * Add Kafka Security Configurations
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified kafka security config. Added new fields to AwsConfig
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified AwsConfig to have msk option that can take multiple options
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __GitHub-Issue#2778: Added CloudWatchLogs Buffer, ThresholdCheck, and ClientFactory utilities. (#2982)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Wed, 12 Jul 2023 16:35:47 -0500
    
    
    Added CloudWatchLogs Buffer, ThresholdCheck, and ClientFactory utilities.
    
    ---------
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    Signed-off-by:
    Marcos Gonzalez Mayedo &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    
    Co-authored-by: Marcos &lt;alemayed@amazon.com&gt;

* __Whitespace (#3004)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Wed, 12 Jul 2023 13:28:59 -0500
    
    
    implement transform_key feature
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    
    ---------
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;
    Co-authored-by: Kat Shen
    &lt;katshen@amazon.com&gt;

* __Release notes for Data Prepper 2.3.2 (#3016)__

    [David Venable](mailto:dlv@amazon.com) - Wed, 12 Jul 2023 13:13:11 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __GitHub-issue#253 : Implemented GeoIP processor functionality (#2925)__

    [venkataraopasyavula](mailto:126578319+venkataraopasyavula@users.noreply.github.com) - Wed, 12 Jul 2023 08:58:22 -0700
    
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality
    Signed-off-by:
    venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality
    Signed-off-by:
    venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality
    Signed-off-by:
    venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality
    Signed-off-by:
    venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality
    Signed-off-by:
    venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Fixed the test-case-failed issue.
     Signed-off-by: Deepak Sahu &lt;deepak.sahu562@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Implemented GeoIP processor functionality. Addressed Code
    review comments
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;
    
    ---------
     Signed-off-by: Deepak Sahu &lt;deepak.sahu562@gmail.com&gt;
    Co-authored-by: Deepak
    Sahu &lt;deepak.sahu562@gmail.com&gt;

* __Fix bucket ownership validation. Resolves #3005 (#3009)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 11 Jul 2023 21:30:00 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Introduce option to measure bulk sizes with or without compression (#2985)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Tue, 11 Jul 2023 18:17:33 -0500
    
    
    * Initial bulk estimation improvements
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add setting to enable/disable estimation with compression
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Make max local compressions configurable
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add documentation for new settings
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove debug comment
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Remove another debug log
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Fix race condition in SqsWorker when acknowledgements are enabled (#3001)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 11 Jul 2023 15:09:26 -0700
    
    
    * Fix race condition in SqsWorker when acknowledgements are enabled
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to do the synchronization in the acknowledgement set framework
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Removed unused variable
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comment and fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed failing tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed checkStyle failure
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Retry s3 reads on socket exceptions. (#2992)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Tue, 11 Jul 2023 12:25:20 -0500
    
    
    * Retry s3 reads on socket exceptions.
     S3 will reset the conenction on their end frequently. To not lose data,
    data
    prepper should retry all socket exceptions by attempting to re-open
    the
    stream.
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;
    
    * Bubble up parquet exceptions.
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;
    
    ---------
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Fix SqsWorker error messages (#2991)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 7 Jul 2023 10:25:47 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Translate Plugin - Target Type implementation (#2979)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Thu, 6 Jul 2023 16:29:02 -0700
    
    
    * Translate Plugin - Target Type implementation
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * addressed review comments
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    ---------
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Implement transform_key feature (#2977)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Thu, 6 Jul 2023 11:37:55 -0500
    
    
    implement transform_key feature
     Signed-off-by: Kat Shen &lt;katshen@amazon.com&gt;

* __Fix S3 errors around end of file behavior. (#2983)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Wed, 5 Jul 2023 16:20:12 -0500
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Fix Stdout and File sink (#2978)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Wed, 5 Jul 2023 10:15:15 -0700
    
    
    * Fix Stdout and File sink
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed javadoc warnings and errors
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Boiler plate code of HttpSink for #874. (#2916)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Wed, 5 Jul 2023 09:27:57 -0700
    
    
    * Boiler plate code of HttpSink for #874.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;
    
    * Added copyright on classes of HttpSink for #874.
    Signed-off-by:
    mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;
    
    * Moved Accumulator package to common for #874.
    Signed-off-by: mallikagogoi7
    &lt;mallikagogoi7@gmail.com&gt;
    
    * Test cases added for accumulator related classes for #874.
    Signed-off-by:
    mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;
    
    * Added HttpSink related methos in accumulator for #874.
    Signed-off-by:
    mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;
    
    * Removed plugin specific methods from common for #874.
    Signed-off-by:
    mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;

* __GitHub-Issue#2778: Added CloudWatchLogs Sink Config Files (#2922)__

    [Marcos Gonzalez Mayedo](mailto:95880281+MaGonzalMayedo@users.noreply.github.com) - Wed, 5 Jul 2023 09:12:03 -0700
    
    
    * Elasticsearch client implementation with pit and no context search (#2910)
     Create Elasticsearch client, implement search and pit apis for
    ElasticsearchAccessor
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;alemayed@amazon.com&gt;
    
    * GitHub-Issue#2778: Refactoring config files for CloudWatchLogs Sink (#4)
     Added Config Files for CloudWatchLogs Sink.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added fixes from comments to code (including pathing and nomenclature syntax)
    
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Refactoring config (#5)
     Added default params for back_off and log_send_interval alongside test cases
    for ThresholdConfig.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Fixed deleted AwsConfig file
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed the s3 dependency from build.gradle, replaced the AwsAuth.. with
    AwsConfig.
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added modifiable back_off_timer, added threshold test for back_off_timer and
    params to AwsConfig
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added fixes to gradle file, added tests to AwsConfig, and used Reflective
    mapping to tests CwlSink
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added default value test to ThresholdConfig and renamed getter for
    maxRequestSize
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Removed unnecessary imports
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added cloudwatch-logs to settings.gradle
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    * Added a quick fix to the back_off_time range
     Signed-off-by: Marcos Gonzalez Mayedo &lt;alemayed@amazon.com&gt;
    
    ---------
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez
    Mayedo &lt;alemayed@amazon.com&gt;
    Signed-off-by: Marcos Gonzalez Mayedo
    &lt;95880281+MaGonzalMayedo@users.noreply.github.com&gt;
    Co-authored-by: Taylor Gray
    &lt;tylgry@amazon.com&gt;
    Co-authored-by: Marcos &lt;alemayed@amazon.com&gt;

* __Bump org.apache.commons:commons-compress in /data-prepper-plugins/common (#2960)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 5 Jul 2023 10:59:41 -0500
    
    
    Bumps org.apache.commons:commons-compress from 1.21 to 1.23.0.
    
    ---
    updated-dependencies:
    - dependency-name: org.apache.commons:commons-compress
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump commons-io:commons-io from 2.11.0 to 2.13.0 in /data-prepper-api (#2900)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 5 Jul 2023 10:57:43 -0500
    
    
    Bumps commons-io:commons-io from 2.11.0 to 2.13.0.
    
    ---
    updated-dependencies:
    - dependency-name: commons-io:commons-io
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __Bump com.fasterxml.jackson.datatype:jackson-datatype-jsr310 (#2796)__

    [dependabot[bot]](mailto:49699333+dependabot[bot]@users.noreply.github.com) - Wed, 5 Jul 2023 10:55:11 -0500
    
    
    Bumps com.fasterxml.jackson.datatype:jackson-datatype-jsr310 from 2.14.2 to
    2.15.2.
    
    ---
    updated-dependencies:
    - dependency-name: com.fasterxml.jackson.datatype:jackson-datatype-jsr310
     dependency-type: direct:production
     update-type: version-update:semver-minor
    ...
     Signed-off-by: dependabot[bot] &lt;support@github.com&gt;
    Co-authored-by:
    dependabot[bot] &lt;49699333+dependabot[bot]@users.noreply.github.com&gt;

* __-Support for Sink Codecs (#2881)__

    [Omkar](mailto:133762828+omkarmmore95@users.noreply.github.com) - Wed, 5 Jul 2023 10:53:44 -0500
    
    
    -Support for Sink Codecs
    Signed-off-by: omkarmmore95
    &lt;omkar.m.more95@gmail.com&gt;

* __Added Kafka config to support acknowledgments and MSK arn (#2976)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 4 Jul 2023 21:25:09 -0700
    
    
    * Added Kafka config to support acknowledgments and MSK arn
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Modified to use data-prepper-core in testImplementation
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed failing test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Define multiple keys for type conversion (#2934)__

    [wanghd89](mailto:wanghd89@gmail.com) - Tue, 4 Jul 2023 21:42:07 -0500
    
    
    * feat: add include_key options to KeyValueProcessor
     Signed-off-by: Haidong &lt;whaidong@amazon.com&gt;
    
    ---------
     Signed-off-by: Haidong &lt;whaidong@amazon.com&gt;
    Co-authored-by: Haidong
    &lt;whaidong@amazon.com&gt;

* __Translate Plugin - Added functionality for iterate_on, default, exact options (#2953)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Mon, 3 Jul 2023 14:32:32 -0500
    
    
    Added IterateOn functionality, default, exact and testcases for translate
    processor
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Kafka Source code refactoring (#2951)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 30 Jun 2023 13:01:29 -0700
    
    
    * Kafka Source code refactoring
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixes for failing build/tests
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Addressed review comments. Cleaned up code
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Add disable_authentication flag to the opensearch source (#2942)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 29 Jun 2023 11:37:34 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix CVE-2023-35165, CVE-2023-34455, CVE-2023-34453, CVE-2023-34454, C… (#2948)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Thu, 29 Jun 2023 09:59:03 -0500
    
    
    * Fix CVE-2023-35165, CVE-2023-34455, CVE-2023-34453, CVE-2023-34454,
    CVE-2023-2976
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Updated snappy version in build.gradle files
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Update simple_pipelines.md (#2947)__

    [Katherine Shen](mailto:40495707+shenkw1@users.noreply.github.com) - Thu, 29 Jun 2023 09:29:49 -0500
    
    
    Removed a space between the second ${PWD} and the rest of the line
     Signed-off-by: Katherine Shen &lt;40495707+shenkw1@users.noreply.github.com&gt;

* __Adding Translate Processor functionality and config files (#2913)__

    [Vishal Boinapalli](mailto:vishalboinapalli3@gmail.com) - Wed, 28 Jun 2023 13:45:02 -0700
    
    
    * Adding MapValues Processor functionality and config file
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Changed logic for splitting of Keys, Added config file for Regex option
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Added testcases, made changes addressing previous review comments, Changed
    the processor name from map_values to translate
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Added regexConfigTests, made code structure changes, added check for patterns
    under regex
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    * Removed * imports
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;
    
    ---------
     Signed-off-by: Vishal Boinapalli &lt;vishalboinapalli3@gmail.com&gt;

* __Sqs Source Integration Tests (#2874)__

    [Uday Chintala](mailto:udaych20@gmail.com) - Wed, 28 Jun 2023 10:02:25 -0500
    
    
    Sqs Source Integration Tests
     Signed-off-by: Uday Kumar Chintala &lt;udaych20@gmail.com&gt;

* __Remove validation that made keys starting or ending with . - or _ invalid, catch all exceptions in the parse json processor (#2945)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 27 Jun 2023 16:25:19 -0500
    
    
    Remove validation that made keys starting or ending with . - or _ invalid,
    catch all exceptions in the parse json processor
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Kafka source integration test (#2891)__

    [Ajeesh Gopalakrishnakurup](mailto:61016936+ajeeshakd@users.noreply.github.com) - Tue, 27 Jun 2023 10:11:52 -0700
    
    
    * Integration testcases
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Fix for the Integration testcases
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Fix for the white source issue
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Fixes for the merge conflicts
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    ---------
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;

* __Add basic opensearch source documentation for config (#2940)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 27 Jun 2023 12:02:36 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add support for writing tags along with events to Sink (#2850)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Tue, 27 Jun 2023 08:42:27 -0700
    
    
    * Updated to pass SinkContext to Sink constructors as suggested in the previous
    comments
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed check style errors and renamed RoutedPluginSetting to
    SinkContextPluginSetting
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed s3-sink integration test
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Added javadoc for SinkContext
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Temporarily reduce coverage minimum (#2937)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 26 Jun 2023 16:50:03 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Implement scroll apis for ElasticSearch Accessor (#2930)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 26 Jun 2023 14:58:36 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Sqs Source initial changes (#2786)__

    [Uday Chintala](mailto:udaych20@gmail.com) - Mon, 26 Jun 2023 13:12:28 -0500
    
    
    * Sqs Source implementation
     Signed-off-by: Uday Kumar Chintala &lt;udaych20@gmail.com&gt;
    
    ---------
     Signed-off-by: Uday Kumar Chintala &lt;udaych20@gmail.com&gt;
    Signed-off-by: Uday
    Chintala &lt;udaych20@gmail.com&gt;

* __Fix DLQ writer writing empty list (#2931)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 26 Jun 2023 09:48:31 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __S3 Scan time range improvements (#2883)__

    [Hai Yan](mailto:8153134+oeyh@users.noreply.github.com) - Mon, 26 Jun 2023 11:11:40 -0500
    
    
    * When no time range set, default to scan all objects; allow setting time range
    for specific bucket
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;
    
    ---------
     Signed-off-by: Hai Yan &lt;oeyh@amazon.com&gt;

* __Implement searching with scroll contexts for OpenSearch (#2923)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 23 Jun 2023 15:26:52 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix addTags API in EventMetadata (#2926)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Fri, 23 Jun 2023 10:07:09 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __GitHub-issue#253 : Implemented GeoIP Plugin Configuration Code JUnit test cases (#2909)__

    [venkataraopasyavula](mailto:126578319+venkataraopasyavula@users.noreply.github.com) - Thu, 22 Jun 2023 09:11:48 -0700
    
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;

* __Elasticsearch client implementation with pit and no context search (#2910)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Wed, 21 Jun 2023 13:59:00 -0500
    
    
    Create Elasticsearch client, implement search and pit apis for
    ElasticsearchAccessor
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Added Readme.md (#2714)__

    [Ajeesh Gopalakrishnakurup](mailto:61016936+ajeeshakd@users.noreply.github.com) - Wed, 21 Jun 2023 11:49:55 -0700
    
    
    * Added Readme.md
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Updated Readme.md
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Updated Readme.md
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    ---------
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;

* __OpenSearch Sink Optimizations (#2908)__

    [Chase](mailto:62891993+engechas@users.noreply.github.com) - Wed, 21 Jun 2023 10:12:26 -0500
    
    
    * Fix size estimation for compression. Maintain requests across iterations for
    better packing. Limit bulk response size
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add unit tests, slight refactors
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add null handling
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Increase gradle heap
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Set flush timeout in IT
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Set flush timeout to 0 in ITs
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add documentation for flush_timeout and fix OpenSearchSinkITs
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Add default to documentation
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    * Set flush_timeout to 5s in e2e tests to fall within timeouts
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;
    
    ---------
     Signed-off-by: Chase Engelbrecht &lt;engechas@amazon.com&gt;

* __Updated the release date (#2911)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 20 Jun 2023 13:45:17 -0500
    
    
    Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Kafka source retry (#2708)__

    [Ajeesh Gopalakrishnakurup](mailto:61016936+ajeeshakd@users.noreply.github.com) - Tue, 20 Jun 2023 09:50:26 -0700
    
    
    * Code rebase for the PR2708
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Fixes the code rebase issue for the PR2708
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Fixes the code rebase issue and code refactoring
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Fixes the build issue
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Refactored the consumer code for plaintext,json and avro
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    * Updated the review comments for the PR2708
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;
    
    ---------
     Signed-off-by: Ajeesh Gopalakrishnakurup &lt;ajeesh.akd@gmail.com&gt;

* __Configuration PR for HttpSink for #874. (#2890)__

    [mallikagogoi7](mailto:mallikagogoi7@gmail.com) - Mon, 19 Jun 2023 11:40:49 -0700
    
    
    Signed-off-by: mallikagogoi7 &lt;mallikagogoi7@gmail.com&gt;

* __Added 2.3.1 release notes (#2871)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 19 Jun 2023 12:44:40 -0500
    
    
    * Added 2.3.1 release notes
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Updated release notes
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Added 2.3.1 change log (#2872)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Mon, 19 Jun 2023 12:44:25 -0500
    
    
    * Added 2.3.1 change log
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Updated change log
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __GitHub-issue#253 : Implemented GeoIP Plugin boiler plate Code Structure (#2840)__

    [venkataraopasyavula](mailto:126578319+venkataraopasyavula@users.noreply.github.com) - Mon, 19 Jun 2023 10:01:15 -0700
    
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;

* __Change the title to be consistent with configuration (#2899)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 19 Jun 2023 09:13:06 -0700
    
    
    Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Do not suppress logs when there are exception in s3 source. (#2896)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Sat, 17 Jun 2023 10:04:23 -0500
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Change log for index name format failure in opensearch sink (#2894)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 16 Jun 2023 16:09:38 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Updated s3 sink metrics (#2888)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Fri, 16 Jun 2023 08:48:44 -0500
    
    
    

* __Implement NoSearchContextWorker to search with search_after and not use pit or scroll, allow override with search_context_type parameter (#2873)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 15 Jun 2023 16:14:33 -0500
    
    
    * Implement NoSearchContextWorker to search with search_after and not use pit
    or scroll, allow override with search_context_type parameter
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix silent dropping of data when index format has null keys, write to dlq if configured (#2885)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 15 Jun 2023 15:12:30 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __GitHub-issue#253 : Implemented GeoIP Plugin Configuration Code (#2811)__

    [venkataraopasyavula](mailto:126578319+venkataraopasyavula@users.noreply.github.com) - Thu, 15 Jun 2023 12:31:04 -0700
    
    
    * GitHub-issue#253 : Implemented GeoIP Plugin Configuration Code
    
    Signed-off-by: venkataraopasyavula &lt;venkataraopasyavula@gmail.com&gt;
    
    * GitHub-issue#253 : Incorporated code review comments of GeoIP Plugin
    Configuration Code
    Signed-off-by: venkataraopasyavula
    &lt;venkataraopasyavula@gmail.com&gt;

* __Update README.md for S3 sink (#2878)__

    [Travis Benedict](mailto:benedtra@amazon.com) - Thu, 15 Jun 2023 10:39:53 -0500
    
    
    Signed-off-by: Travis Benedict &lt;benedtra@amazon.com&gt;

* __Add exception when gzip input stream not have magic header. (#2879)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Thu, 15 Jun 2023 09:28:17 -0500
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __FIX: concurrentModification (#2876)__

    [Qi Chen](mailto:qchea@amazon.com) - Wed, 14 Jun 2023 21:24:07 -0500
    
    
    Signed-off-by: George Chen &lt;qchea@amazon.com&gt;

* __S3 EventBridge and security lake support (#2861)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 13 Jun 2023 17:53:18 -0500
    
    
    * EventBridge initial working draft
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Add STS external ID to all STS configurations. (#2862)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Tue, 13 Jun 2023 16:08:30 -0500
    
    
    STS external ID is required by some AWS services when making an STS
    AssumeRole
    call.
     Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Save searchAfter to state so pagination can continue where it left off when using PIT on opensearch source (#2856)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 12 Jun 2023 15:56:57 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Consolidate BufferAccumulator to buffer-api module (#2857)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 12 Jun 2023 13:29:56 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Add end-to-end acknowledgement support to Stdout and File Sinks (#2860)__

    [kkondaka](mailto:41027584+kkondaka@users.noreply.github.com) - Mon, 12 Jun 2023 11:18:18 -0700
    
    
    * Add end-to-end acknowledgement support to Stdout and File Sinks
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    * Fixed code to check for object is an instance of event
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    
    ---------
     Signed-off-by: Krishna Kondaka
    &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;
    Co-authored-by:
    Krishna Kondaka &lt;krishkdk@dev-dsk-krishkdk-2c-bd29c437.us-west-2.amazon.com&gt;

* __Sqs Source configuration code changes for #2679 (#2801)__

    [Uday Chintala](mailto:udaych20@gmail.com) - Mon, 12 Jun 2023 12:04:53 -0500
    
    
    Sqs Source configuration code changes for #2679
     Signed-off-by: Uday Kumar Chintala &lt;udaych20@gmail.com&gt;

* __Os source buffer backoff retry (#2849)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Mon, 12 Jun 2023 09:40:10 -0500
    
    
    Use buffer accumulator in opensearch source to backoff and retry
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __-Support for Sink Codecs (#2845)__

    [Omkar](mailto:133762828+omkarmmore95@users.noreply.github.com) - Fri, 9 Jun 2023 13:40:05 -0500
    
    
    Support for Sink Codecs
    Signed-off-by: omkarmmore95 &lt;omkar.m.more95@gmail.com&gt;

* __Implement basic search with point in time and search after (#2847)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Fri, 9 Jun 2023 10:06:50 -0500
    
    
    Implement basic search with point in time and search after
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Fix CVE in maven-artifact by excluding that dependency (#2848)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 8 Jun 2023 15:52:39 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __-Support for Sink Codecs (#2842)__

    [Omkar](mailto:133762828+omkarmmore95@users.noreply.github.com) - Thu, 8 Jun 2023 14:47:08 -0500
    
    
    Signed-off-by: omkarmmore95 &lt;omkar.m.more95@gmail.com&gt;

* __Create and delete point in time for processing an index (#2839)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Thu, 8 Jun 2023 11:32:22 -0500
    
    
    Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __GitHub-issue#2822: Define null characters in convert processor (#2844)__

    [saydar31](mailto:43093669+saydar31@users.noreply.github.com) - Thu, 8 Jun 2023 11:28:37 -0500
    
    
    GitHub-issue#2822: Define null characters in convert processor
    Signed-off-by:
    Aidar Shaidullin &lt;ajdarshaydullin@gmail.com&gt;
     Signed-off-by: saydar31 &lt;ajdarshaydullin@gmail.com&gt;
    
    ---------
     Signed-off-by: saydar31 &lt;ajdarshaydullin@gmail.com&gt;
    Co-authored-by: saydar31
    &lt;ajdarshaydullin@gmail.com&gt;

* __Implement opensearch index partition creation supplier and PitWorker without processing indices (#2821)__

    [Taylor Gray](mailto:tylgry@amazon.com) - Tue, 6 Jun 2023 17:59:59 -0500
    
    
    Implement opensearch index partition creation supplier and PitWorker without
    processing indices
     Signed-off-by: Taylor Gray &lt;tylgry@amazon.com&gt;

* __Added change log for 2.3 (#2836)__

    [Asif Sohail Mohammed](mailto:nsifmoh@amazon.com) - Tue, 6 Jun 2023 12:32:55 -0500
    
    
    * Added change log for 2.3
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    * Generated change log in 2.3 branch
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;
    
    ---------
     Signed-off-by: Asif Sohail Mohammed &lt;nsifmoh@amazon.com&gt;

* __Adds release notes for Data Prepper 2.3.0. (#2833)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 6 Jun 2023 10:59:57 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Updates main to Data Prepper 2.4. (#2832)__

    [David Venable](mailto:dlv@amazon.com) - Tue, 6 Jun 2023 10:44:47 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;

* __Fix bug where s3 stream was closing too early. (#2830)__

    [Adi Suresh](mailto:adsuresh@amazon.com) - Mon, 5 Jun 2023 20:21:40 -0500
    
    
    Signed-off-by: Adi Suresh &lt;adsuresh@amazon.com&gt;

* __Generated THIRD-PARTY file for 3a70e73 (#2828)__

    [opensearch-trigger-bot[bot]](mailto:98922864+opensearch-trigger-bot[bot]@users.noreply.github.com) - Mon, 5 Jun 2023 17:06:11 -0500
    
    
    Signed-off-by: GitHub &lt;noreply@github.com&gt;
    Co-authored-by: dlvenable
    &lt;dlvenable@users.noreply.github.com&gt;


