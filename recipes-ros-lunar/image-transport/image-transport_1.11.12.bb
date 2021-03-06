# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_transport should always be used to subscribe to and publish images. It pro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-filters pluginlib rosconsole roscpp roslib sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/image_transport/1.11.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59af35996f127e873b629bcdb6a6bec6"
SRC_URI[sha256sum] = "b66281a2c2b3ad9dc88a74d00031be1113b240fdf1d2b9e4dab0c04937b2c2b0"
S = "${WORKDIR}/image_common-release-release-lunar-image_transport-1.11.12-0"

inherit catkin
