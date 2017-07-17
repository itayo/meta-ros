# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by
"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "angles boost catkin cmake_modules eigen python-numpy roscpp sensor_msgs tf"
SRC_URI = "https://github.com/ros-gbp/laser_geometry-release/archive/release/lunar/laser_geometry/1.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7a367a0cbb7cbf08454d07ed545ceea"
SRC_URI[sha256sum] = "fab02fa90e5d28d87d9967ffe7294f061bd292f2e5adb8d245767e52b71c002c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin