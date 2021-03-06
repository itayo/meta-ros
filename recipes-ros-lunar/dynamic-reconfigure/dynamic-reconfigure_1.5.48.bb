# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This unary stack contains the dynamic_reconfigure package which provides a means"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native message-generation message-runtime roscpp roscpp-serialization roslib rospy rosservice rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/dynamic_reconfigure-release/archive/release/lunar/dynamic_reconfigure/1.5.48-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3658703b5bd3cc7aa3fefeeeaaafd959"
SRC_URI[sha256sum] = "1236a1919fa4b2724b780399732d455897a60ab11c9d20aa3e05dfa33f546b29"
S = "${WORKDIR}/dynamic_reconfigure-release-release-lunar-dynamic_reconfigure-1.5.48-0"

inherit catkin
