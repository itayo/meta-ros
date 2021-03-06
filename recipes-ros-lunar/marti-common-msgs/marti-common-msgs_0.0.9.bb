# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_common_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_common_msgs/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "12c91225d0289233d15c838af274a806"
SRC_URI[sha256sum] = "1b0b19b335f76b450fed7594dfd382e3c4bb9ab1251d4320348287b9875c41df"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_common_msgs-0.0.9-0"

inherit catkin
