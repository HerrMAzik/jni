package com.man;


import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.StdString;

@Platform(include = "JavaCpp.h")
@Namespace("JavaCpp")
public class JavaCpp {

    public static class CppClass extends Pointer {
        static {
            Loader.load();
        }

        public CppClass() {
            allocate();
        }

        private native void allocate();

        public native @StdString String get_text(String text);
    }

    public static void main(String[] args) {
        CppClass c = new CppClass();
        String text = c.get_text("text");
        System.out.println(text);
    }
}
