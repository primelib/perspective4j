plugins {
    `java-library`
    id("me.philippheuer.configuration") version "0.10.6"
}

val version: String = properties["version"] as? String ?: "0.0.0"

projectConfiguration {
    type.set(me.philippheuer.projectcfg.domain.ProjectType.LIBRARY)
    javaVersion.set(JavaVersion.VERSION_17)
    artifactGroupId.set("io.github.primelib")
    artifactId.set("perspective4j")
    artifactDisplayName.set("perspective4j")
    artifactDescription.set("A Java Wrapper for the Perspective API")

    pom = { pom ->
        pom.url.set("https://github.com/primelib/perspective4j")
        pom.issueManagement {
            system.set("GitHub")
            url.set("https://github.com/primelib/perspective4j/issues")
        }
        pom.inceptionYear.set("2017")
        pom.developers {
            developer {
                id.set("PhilippHeuer")
                name.set("Philipp Heuer")
                email.set("git@philippheuer.me")
                roles.addAll("maintainer")
            }
        }
        pom.licenses {
            license {
                name.set("MIT Licence")
                distribution.set("repo")
                url.set("https://github.com/primelib/perspective4j/blob/main/LICENSE")
            }
        }
        pom.scm {
            connection.set("scm:git:git://github.com/primelib/perspective4j.git")
            developerConnection.set("scm:git:git://github.com/primelib/perspective4j.git")
            url.set("https://github.com/primelib/perspective4j")
        }
    }
}

dependencies {
    // bom
    api(platform("io.github.openfeign:feign-bom:12.4"))
    api(platform("io.github.resilience4j:resilience4j-bom:2.1.0"))

    // annotations
    implementation("org.jetbrains:annotations:24.0.1")

    // feign
    implementation("io.github.openfeign:feign-core")
    implementation("io.github.openfeign:feign-jackson")
    implementation("io.github.openfeign:feign-slf4j")
    implementation("io.github.openfeign:feign-okhttp")
    implementation("io.github.openfeign:feign-micrometer")

    // resilience4J
    implementation("io.github.resilience4j:resilience4j-feign")
    implementation("io.github.resilience4j:resilience4j-bulkhead")
    implementation("io.github.resilience4j:resilience4j-retry")
    implementation("io.github.resilience4j:resilience4j-circuitbreaker")
    implementation("io.github.resilience4j:resilience4j-ratelimiter")
    implementation("io.github.resilience4j:resilience4j-micrometer")

    // metrics
    implementation("io.micrometer:micrometer-core:1.11.1")

    // test
    testImplementation("org.slf4j:slf4j-simple:2.0.7")
}
