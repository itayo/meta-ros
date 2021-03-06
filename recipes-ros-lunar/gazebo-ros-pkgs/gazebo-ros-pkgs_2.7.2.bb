# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for using ROS with the  simulator."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=8caad55b0e7a31e039fbcff07dba789e"

DEPENDS = "catkin-native gazebo-dev gazebo-msgs gazebo-plugins gazebo-ros"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_ros_pkgs/2.7.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7f21de1c4019502392c1cbf977357398"
SRC_URI[sha256sum] = "77f05d91b1cfd597e446e239c01bc5337ae36968a40505383c527e08f489f1ec"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_ros_pkgs-2.7.2-0"

inherit catkin
