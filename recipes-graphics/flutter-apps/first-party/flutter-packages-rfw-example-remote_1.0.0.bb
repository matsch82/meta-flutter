#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "remote"
DESCRIPTION = "Example of fetching remote widgets for RFW"
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "ff587b7c9552a47e716a822eca3a1eaa39154a65"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "remote"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-rfw-example-remote"
FLUTTER_APPLICATION_PATH = "packages/rfw/example/remote"

inherit flutter-app
