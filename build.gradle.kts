import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.mandrake"
version = "1.0-SNAPSHOT"

buildscript {
//    var kotlinVer: String by extra
//    var kotlinTestVer: String by extra
//
//    kotlinVer = "1.3.0"
//    kotlinTestVer = "3.1.10"
}

val kotlinVer: String by extra { "1.3.10" }
val kotlinTestVer: String by extra { "3.1.10" }

repositories {
    jcenter()
}

plugins {
    kotlin("jvm") version "1.3.10"
    application
    java
}

application {
    mainClassName = "io.mandrake.effective.Main"
}

dependencies {
    // compile(kotlin(module = "stdlib-jre8", version = kotlinVer))
    compile(kotlin(module = "stdlib", version = kotlinVer))
    testCompile("io.kotlintest:kotlintest:$kotlinTestVer")
}

val compileKotlin by tasks.getting(KotlinCompile::class) {
    // Customise the “compileKotlin” task.
    kotlinOptions.jvmTarget = "1.8"
    doLast { println("Finished compiling Kotlin source code") }
}
val compileTestKotlin by tasks.getting(KotlinCompile::class) {
    // Customise the “compileTestKotlin” task.
    kotlinOptions.jvmTarget = "1.8"
    doLast { println("Finished compiling Kotlin source code for testing") }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
