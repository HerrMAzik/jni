use jni::{
    objects::{JClass, JObject},
    sys::jint,
    JNIEnv,
};

#[no_mangle]
pub extern "system" fn Java_com_man_JNI_1RUST_printText(_env: JNIEnv, _object: JObject) {
    println!("rust string");
}

#[no_mangle]
pub extern "system" fn Java_com_man_JNI_1RUST_mul(
    _env: JNIEnv,
    _object: JObject,
    x: jint,
    y: jint,
) -> jint {
    x * y
}

#[no_mangle]
pub extern "system" fn Java_com_man_JNI_1RUST_div(
    _env: JNIEnv,
    _class: JClass,
    x: jint,
    y: jint,
) -> jint {
    print!("N");
    1
}

#[no_mangle]
pub extern "system" fn JavaCritical_com_man_JNI_1RUST_div(
    x: jint,
    y: jint,
) -> jint {
    eprint!("\ncritical\n");
    -1
}
