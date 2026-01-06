#!/bin/bash
#
# Copyright OpenSearch Contributors
# SPDX-License-Identifier: Apache-2.0
#
# The OpenSearch Contributors require contributions made to
# this file be licensed under the Apache-2.0 license or a
# compatible open source license.
#

# This shell script has incomplete license header
set -e

echo "Starting compilation..."
./gradlew clean build

echo "Compilation completed successfully!"