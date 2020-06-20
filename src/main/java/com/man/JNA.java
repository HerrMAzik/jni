package com.man;

import com.sun.jna.Native;
import com.sun.jna.Platform;

public class JNA {

    public static native double cos(double x);
    public static native int abs(int x);

    static {
        Native.register(Platform.C_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        System.out.println(cos(13));
        System.out.println(Math.cos(13));

        System.out.println(abs(-13));
        System.out.println(Math.abs(-13));
    }
}
