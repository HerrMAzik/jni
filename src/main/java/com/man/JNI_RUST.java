package com.man;

public class JNI_RUST {
    native void printText();

    native int mul(int x, int y);

    static native int div(int x, int y);

    static {
        System.loadLibrary("jni_rust");
    }

    public static void main(String[] args) {
        JNI_RUST jni = new JNI_RUST();

        System.out.println(jni.mul(321, 123));
        System.out.println(123 * 321);

        for (int i = 0; i < 256; i++) {
            JNI_RUST.div(i * 256, i + 1);
        }
        System.out.println(JNI_RUST.div(12356, 13));
        System.out.println(321 / 123);


        jni.printText();
    }
}
