# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cmake-modules message-filters roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/lunar/imu_complementary_filter/1.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e67127f017f8957d7aaf30056a303a75"
SRC_URI[sha256sum] = "df9d5dfc0e9469d64f78ff67225494976ff8a0aa529107224d9efdc1cb7c0777"
S = "${WORKDIR}/imu_tools-release-release-lunar-imu_complementary_filter-1.1.5-0"

inherit catkin
