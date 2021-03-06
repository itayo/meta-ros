# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_footstep_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_footstep_msgs/4.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc9da9e34bcee9ea2255e64773ab0fc2"
SRC_URI[sha256sum] = "b485af7f4da4394eec3b02b09a3d53b464eda6b996e311b4a2281601aec8e658"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_footstep_msgs-4.2.0-0"

inherit catkin
