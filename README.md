# DeepDiveJava24

This is a demo project to show some new features of Java™ 24. (For previous version go to [DeepDiveJava23](https://github.com/pioorg/DeepDiveJava23).)

It uses `--enable-preview` and Maven, but you don't need to have Maven installed.

To run this project, you need to have Java™ 24 installed. You can use https://sdkman.io/ and/or https://openjdk.java.net/, https://adoptium.net/

If you'd like to run the example app, one of the options is this:

    $ MAVEN_OPTS="--enable-preview" ./mvnw exec:java -pl goodies

(If it doesn't work, you might have Java 24 not installed.)
