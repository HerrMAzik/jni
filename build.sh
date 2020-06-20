#!/usr/bin/env sh

./gradlew compileJava
fd -a -x cp '{}' cpp/ ";" .h build/generated/sources/headers/
cd cpp && rm -rf bin && mkdir -p bin && cd bin && cmake -DCMAKE_BUILD_TYPE=MinSizeRel .. && make
