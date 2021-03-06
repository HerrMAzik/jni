package com.man;

public class JNI_CPP {
    native void printText();

    native int mul(int x, int y);

    static native int div(int x, int y);

    static {
        System.loadLibrary("jni_cpp");
    }

    public static void main(String[] args) {
        JNI_CPP jni = new JNI_CPP();

        System.out.println(jni.mul(321, 123));
        System.out.println(123 * 321);

        for (int i = 0; i < 25600; i++) {
            JNI_CPP.div(i * 256, i + 1);
        }
        JNI_CPP.div(12356, 13);
        System.out.println(321 / 123);


        jni.printText();
    }
}
