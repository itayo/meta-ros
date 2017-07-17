# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides Gazebo plugins to simulate the Katana arm."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fe6a07ee75db997e0a74d91b3b60fb3a"

DEPENDS = "actionlib catkin control_msgs control_toolbox gazebo_ros katana_msgs sensor_msgs trajectory_msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_gazebo_plugins/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c8f0816545b31df7572a65540a3beee"
SRC_URI[sha256sum] = "96a8ff8e3d80379aae4c3e6b3f85cdc246b0804def033376c67e91e448cf27f1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin