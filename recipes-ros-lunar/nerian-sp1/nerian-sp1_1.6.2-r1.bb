# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Node for the SP1 Stereo Vision System by Nerian Vision Technologies"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=c7db68edca7cfc138f25a9f40359c82b"

DEPENDS = "boost catkin cv_bridge message_generation message_runtime roscpp sdl sensor_msgs std_msgs"
SRC_URI = "https://github.com/nerian-vision/nerian_sp1-release/archive/release/lunar/nerian_sp1/1.6.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8330baab874462a0e0769cbe15327412"
SRC_URI[sha256sum] = "d8f354de7945b704eb2357b5805fa50bc4adbf7ba21c6bb055c76c3d5989924e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin