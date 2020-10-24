buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.4.10"))
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}

subprojects {
    repositories {
        google()
        jcenter()
    }
}
