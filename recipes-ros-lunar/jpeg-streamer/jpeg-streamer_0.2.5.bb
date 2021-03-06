# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tools for streaming JPEG-formatted CompressedImage topics over HTTP"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native catkin image-transport roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/lunar/jpeg_streamer/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa8b0d76db1d066b0af020dadbd83bae"
SRC_URI[sha256sum] = "6a9c3148dde80b45b8bab45b637ab6da3bb388b466aeb49d1d6c8f236a41fff4"
S = "${WORKDIR}/camera_umd-release-release-lunar-jpeg_streamer-0.2.5-0"

inherit catkin
