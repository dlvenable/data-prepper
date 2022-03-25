# Data Prepper Sample Plugin

This project is a sample plugin for Data Prepper. It creates a new plugin named `hello`. This plugin adds a new field to each event with a key of `hello`
and a value of `world`.

## Setup

You must use Java 14 for building Data Prepper and the plugin.

All the following commands are run from the root of the Data Prepper directory.

### 1) Assemble Data Prepper

First, assemble Data Prepper.

```
./gradlew clean assemble
```


## Run Sample

### 1) Build Sample

```
./gradlew -p examples/data-prepper-sample-plugin assemble
```

### 2) Run Data Prepper with Plugin

```
./examples/data-prepper-sample-plugin/run-sample.sh
```


You should see event lines which look like:

```
{"message":"1564de58-a3b3-452f-8131-fb8b4a53a4ee","hello":"world"}
{"message":"52436e2e-f6c4-4547-9041-d97cbdeca58d","hello":"world"}
{"message":"bb5a7ea4-8e12-4c0c-b328-72fc1812c656","hello":"world"}
```

## Improvements Coming in Data Prepper

### Directory Structure

GitHub [#305](https://github.com/opensearch-project/data-prepper/issues/305)

```
data-prepper-$VERSION/
  bin/
    data-prepper                    # Shell script to run Data Prepper on Linux/macOS
  lib/
    data-prepper-core.jar                 # Not an uber-jar
    data-prepper-logstash-converter.jar   # Each project jar is broken out 
    data-prepper-api.jar
    ...
  plugins/
    data-prepper-sample-plugin.jar        # The plugin could be loaded here
    some-other-plugin.jar
```

The improvements to the directory structure will improve the classloading for Data Prepper. It will simplify the `run-sample.sh` script.

### Plugin Redesign

GitHub Issue [#321](https://github.com/opensearch-project/data-prepper/issues/321)

Two related changes:

* Provide classloader isolation for plugins. This can avoid jar-hell issues related to conflicting dependency versions.
* Download plugins from Maven Central so that sharing plugins is easier.

