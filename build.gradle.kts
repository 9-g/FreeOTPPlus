// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
        classpath(kotlin("gradle-plugin", version = "1.3.50"))
    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}
