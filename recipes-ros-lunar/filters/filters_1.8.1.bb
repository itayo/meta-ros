# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides a standardized interface for processing data as a sequence"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin pluginlib rosconsole roscpp roslib rostest"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "df5eae9955a25253e36aab36d65f7394"
SRC_URI[sha256sum] = "7141ed6aa2c29c2e897a12a1ad77aa77420f29c1803cf73de2e7d8783b8e016c"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.8.1-0"

inherit catkin
