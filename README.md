# GraalVM - Polyglot and Truffle

## Compiling and running
```
$ mvn clean package
$ /Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.2.0/Contents/Home/bin/js --polyglot --jvm src/main/js/polyglot.js
$ java -jar target/graalvm_polyglot-0.0.1-SNAPSHOT.jar
$ target/graalvm_polyglot
```