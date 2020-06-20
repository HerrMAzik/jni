#!/usr/bin/env sh
root=$PWD

cd $root
./gradlew compileJava
fd -a -x cp '{}' cpp/ ";" JNI_CPP.h build/generated/sources/headers/
cd cpp && rm -rf bin && mkdir -p bin && cd bin && cmake -DCMAKE_BUILD_TYPE=MinSizeRel .. && make

cd $root/javacpp
rm -rf bin
mkdir -p bin/com/man
cp JavaCpp.h bin/com/man/
cp ../src/main/java/com/man/JavaCpp.java bin/com/man/
cd bin && java -jar ../javacpp.jar -clean com/man/JavaCpp.java -exec
