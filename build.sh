#!/usr/bin/env sh
root=$PWD

./gradlew compileJava

fd -a -x cp '{}' cpp/ ";" JNI_CPP.h build/generated/sources/headers/
cd $root/cpp && rm -rf bin && mkdir -p bin && cd bin && cmake -DCMAKE_BUILD_TYPE=Release .. && make

cd $root/rust && cargo build --release && mkdir -p bin && cp target/release/libjni_rust.so bin/libjni_rust.so

cd $root/javacpp
rm -rf bin
mkdir -p bin/com/man
cp JavaCpp.h bin/com/man/
cp ../src/main/java/com/man/JavaCpp.java bin/com/man/
cd bin && java -jar ../javacpp.jar -clean com/man/JavaCpp.java -exec
