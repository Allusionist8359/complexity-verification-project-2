#! /bin/bash

#( cd simple-datasets/src/main/java && javac -d test Main.java )
./gradlew build -PskipCheckerFramework --rerun-tasks
( cd simple-datasets/src/main/java && java -jar ../../../../jayhorn-0.8/jayhorn/build/libs/jayhorn.jar -j ../../../build/classes/java/main -solution -trace -verbose )