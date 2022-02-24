#!/bin/sh

#
# Copyright OpenSearch Contributors
# SPDX-License-Identifier: Apache-2.0
#

SCRIPT_DIRECTORY=`dirname "$0"`
DATA_PREPPER_JAR_SCRIPT_DIRECTORY=${DATA_PREPPER_JAR_SCRIPT_DIRECTORY:-${SCRIPT_DIRECTORY}/../../data-prepper-core/build/libs/*}

java -cp ${SCRIPT_DIRECTORY}/build/libs/data-prepper-sample-plugin-1.0-SNAPSHOT.jar:${DATA_PREPPER_JAR_SCRIPT_DIRECTORY} com.amazon.dataprepper.DataPrepperExecute ${SCRIPT_DIRECTORY}/say-hello-pipeline.yaml ${SCRIPT_DIRECTORY}/data-prepper-config.yaml
