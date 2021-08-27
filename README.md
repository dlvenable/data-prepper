# POC Changes

Made data-prepper-core depend upon only plugins:common

Added new projects:
* data-prepper-cli-main : An uber jar with all the plugins
* data-prepper-cli-alt : A jar without any plugins, even "core-plugins"

POC Classes: See [data-prepper-core's plugin directory](data-prepper-core/src/main/java/com/amazon/dataprepper/plugin).

Moved the simple plugins into a new project named core-plugins (e.g. File)

Tests are broken! They have not been moved with all this refactoring.

## Steps to Try

Assemble the project. Remember, the tests don't run.

```
java15 ./gradlew clean assemble
```

### Main

Run the CLI with a good pipeline

```
data-prepper-cli-main/build/libs/data-prepper-cli-main-2.0.0-poc.jar
```

### Alt

Deploy the jar to Maven local

```
java15 ./gradlew -pdata-prepper-plugins/core-plugins publishToMavenLocal
```

# Data Prepper

We envision Data Prepper as an open source data collector for observability data (trace, logs, metrics) that can filter, enrich, transform, normalize, and aggregate data for downstream analysis and visualization. It will support stateful processing across multiple instances of data pipelines for observability use cases such as distributed tracing and multi-line log events (e.g. stack traces, aggregations, and log-to-metric transformations). Currently Data Prepper supports processing of distributed trace data and will support processing of logs and metric data in the future. 


## Status

* Update the Preppers to load from the plugin classes

* Test this for main [DONE]

* Running the alt project results in an exception before I expect.

```
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2021-08-27T16:57:33,920 [main] INFO  com.amazon.dataprepper.pipeline.server.DataPrepperServer - Creating Data Prepper server without TLS
2021-08-27T16:57:33,954 [main] INFO        com.amazon.dataprepper.DataPrepper - Using pipelines.yaml configuration file
2021-08-27T16:57:33,972 [main] INFO  com.amazon.dataprepper.parser.PipelineParser - Building pipeline [simple-test-pipeline] from provided configuration
2021-08-27T16:57:33,973 [main] INFO  com.amazon.dataprepper.parser.PipelineParser - Building [random] as source component for the pipeline [simple-test-pipeline]
Exception in thread "main" java.lang.ExceptionInInitializerError
	at com.amazon.dataprepper.plugins.source.SourceFactory.newSource(SourceFactory.java:23)
	at com.amazon.dataprepper.parser.PipelineParser.lambda$buildPipelineFromConfiguration$1(PipelineParser.java:94)
	at java.base/java.util.Optional.orElseGet(Optional.java:369)
	at com.amazon.dataprepper.parser.PipelineParser.buildPipelineFromConfiguration(PipelineParser.java:94)
	at com.amazon.dataprepper.parser.PipelineParser.parseConfiguration(PipelineParser.java:75)
	at com.amazon.dataprepper.DataPrepper.execute(DataPrepper.java:132)
	at com.amazon.dataprepper.DataPrepperExecute.main(DataPrepperExecute.java:33)
Caused by: org.reflections.ReflectionsException: Scanner TypeAnnotationsScanner was not configured
	at org.reflections.Store.get(Store.java:39)
	at org.reflections.Store.get(Store.java:61)
	at org.reflections.Store.get(Store.java:46)
	at org.reflections.Reflections.getTypesAnnotatedWith(Reflections.java:429)
	at org.reflections.Reflections.getTypesAnnotatedWith(Reflections.java:416)
	at com.amazon.dataprepper.plugins.PluginRepository.findPlugins(PluginRepository.java:47)
	at com.amazon.dataprepper.plugins.PluginRepository.<clinit>(PluginRepository.java:42)
	... 7 more
```

* Still need to implement the Maven Local Plugin Provider

## Table of Contents

- [Overview](docs/readme/overview.md)
- Trace Analytics
  - [Overview](docs/readme/trace_overview.md)
  - [Trace Analytics Setup](docs/readme/trace_setup.md)
  - [Scaling and Tuning](docs/readme/trace_tuning.md)
- Project Details
  - [Setup](docs/readme/project_setup.md)
  - [Error Handling](docs/readme/error_handling.md)
  - [Logging](docs/readme/logs.md)
  - [Monitoring](docs/readme/monitoring.md)
  - [Contribute](#Contribute)
  - [Code of Conduct](#Code-of-Conduct)
  - [Security Issue Notifications](#Security-Issue-Notifications)
  - [License](#License)



## Contribute

We invite developers from the larger OpenSearch community to contribute and help improve test coverage and give us feedback on where improvements can be made in design, code and documentation. You can look at  [contribution guide](CONTRIBUTING.md) for more information on how to contribute.

## Code of Conduct

This project has adopted an [Open Source Code of Conduct](CODE_OF_CONDUCT.md).

## Security Issue Notifications

If you discover a potential security issue in this project, please refer to the [security policy](https://github.com/opensearch-project/data-prepper/security/policy).

## License

This library is licensed under the Apache 2.0 License. [Refer](LICENSE)

## Copyright

Copyright OpenSearch Contributors. See [NOTICE](NOTICE.txt) for details.
