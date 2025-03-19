buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Adicione esta linha:
        classpath("com.google.gms:google-services:4.4.1")  // Use a versão mais recente
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}