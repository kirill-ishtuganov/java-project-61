plugins {
    id("java")
    id ("application")
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = ("hexlet.code.App")
}

tasks.compileJava {
    options.release = 20
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}