package com.man;

public class JNI_CPP {
    native void printText();
    native int mul(int x, int y);

    static {
        System.loadLibrary("jni_cpp");
    }

    public static void main(String[] args) {
        JNI_CPP jni = new JNI_CPP();
        System.out.println(jni.mul(321, 123));
        System.out.println(123 * 321);
        jni.printText();
    }
}
