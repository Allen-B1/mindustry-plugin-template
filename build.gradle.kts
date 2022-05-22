plugins {
    kotlin("jvm") version "1.3.72"
}

repositories {
    mavenCentral()
    maven { url = uri("https://www.jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("net.folivo:trixnity-client:2.0.0")
    compileOnly("com.github.Anuken.Arc:arc-core:v135.2")
    compileOnly("com.github.Anuken.Mindustry:core:v135.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    jar {
        from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    }
}
