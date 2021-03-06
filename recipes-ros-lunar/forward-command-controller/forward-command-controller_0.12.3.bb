# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "forward_command_controller"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface realtime-tools std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/forward_command_controller/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc4a493de9f6ed7ceca542b914258e02"
SRC_URI[sha256sum] = "e8d7391b7a4737e7ae8c7b5d49a37f5ab48be1cc5368ffb4832ff78a46fbd277"
S = "${WORKDIR}/ros_controllers-release-release-lunar-forward_command_controller-0.12.3-0"

inherit catkin
