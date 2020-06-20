#include <iostream>
#include "com_man_JNI_CPP.h"

JNIEXPORT void JNICALL Java_com_man_JNI_1CPP_printText
(JNIEnv *, jobject) {
    std::cout << "test text";
}

JNIEXPORT jint JNICALL Java_com_man_JNI_1CPP_mul
  (JNIEnv *, jobject, jint x, jint y) {
    return x * y;
}

JNIEXPORT jint JNICALL Java_com_man_JNI_1CPP_div
  (JNIEnv *, jclass, jint x, jint y) {
    std::cout << "N";
    return 1;
}

JNIEXPORT jint JNICALL JavaCritical_com_man_JNI_1CPP_div
  (jint x, jint y) {
    std::cerr << "\ncritical\n";
    return -1;
}
