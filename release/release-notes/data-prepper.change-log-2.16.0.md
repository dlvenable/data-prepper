
* __Remove approvers sections__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:42:48 -0500
    
    EAD -&gt; refs/heads/main, tag: refs/tags/2.16.0, refs/remotes/origin/main, refs/remotes/origin/HEAD
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Assemble only for speed__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:42:47 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __2.16 release__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:42:47 -0500
    
    
    Signed-off-by: David Venable &lt;dlv@amazon.com&gt;
    

* __Updates some GitHub Actions plugins in the release__

    [David Venable](mailto:dlv@amazon.com) - Mon, 6 Apr 2026 19:42:47 -0500
    
    
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


