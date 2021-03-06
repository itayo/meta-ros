# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python interface for camera calibration information.      This ROS package provi"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg python-pyyaml rospy rostest sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/camera_info_manager_py-release/archive/release/lunar/camera_info_manager_py/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de0314920b1744755b4f661bc65e6590"
SRC_URI[sha256sum] = "e5cda8655dbf530dcec51e373f7079771ae09ab287411d4e59af60eb5dbcc13d"
S = "${WORKDIR}/camera_info_manager_py-release-release-lunar-camera_info_manager_py-0.2.3-0"

inherit catkin
