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
