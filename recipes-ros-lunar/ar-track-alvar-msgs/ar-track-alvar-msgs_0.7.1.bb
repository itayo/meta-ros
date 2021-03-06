# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/lunar/ar_track_alvar_msgs/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4667142f331b86e49c94e43d38f8cf4d"
SRC_URI[sha256sum] = "c0682bbc76d3ca88e8b58a15d474d7c5a048b877c45e8751765fd39352fd8139"
S = "${WORKDIR}/ar_track_alvar-release-release-lunar-ar_track_alvar_msgs-0.7.1-0"

inherit catkin
