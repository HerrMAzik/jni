cmake_minimum_required(VERSION 3.16)
project(jni_cpp)

set(CMAKE_CXX_STANDARD 20)

add_library(jni_cpp SHARED com_man_JNI_CPP.cpp com_man_JNI_CPP.h)

include_directories(/usr/lib/jvm/java-14-openjdk/include/)
include_directories(/usr/lib/jvm/java-14-openjdk/include/linux)
link_directories(/usr/lib/jvm/java-14-openjdk/include/)
link_directories(/usr/lib/jvm/java-14-openjdk/include/linux)
