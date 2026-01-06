#!/usr/bin/env python3
#
# Copyright OpenSearch Contributors
# SPDX-License-Identifier: Apache-2.0
#
# The OpenSearch Contributors require contributions made to
# this file be licensed under the Apache-2.0 license or a
# compatible open source license.
#

"""
This file has only the short header (missing the 3 additional lines).
"""

import sys
import time

def monitor_system():
    """Monitor system resources."""
    while True:
        print("Monitoring...")
        time.sleep(60)

if __name__ == "__main__":
    monitor_system()