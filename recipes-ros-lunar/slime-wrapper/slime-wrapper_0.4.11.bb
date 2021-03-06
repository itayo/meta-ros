# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS wrapper for slime"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "public_domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=90cf8e14bb501c1f6d3eda81e45e438a"

DEPENDS = "catkin-native catkin emacs"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/slime_wrapper/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "369b3581c8e28c49b089ea2b841e4ffd"
SRC_URI[sha256sum] = "185e640dc0aa15c20b59211c7e597e993ae7b56a0608d88efee860de2be320b4"
S = "${WORKDIR}/ros_emacs_utils-release-release-lunar-slime_wrapper-0.4.11-0"

inherit catkin
