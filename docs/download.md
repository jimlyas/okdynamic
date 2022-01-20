## Getting Personal Access Token

Before downloading this library, you need to configure personal access token in Github,
click [here](https://github.com/settings/tokens).

Store your token for later.

## Defining Repository

Add this repository to your gradle configuration:

```groovy title="build.gradle"
allProjects {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/jimlyas/okdynamic")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME") // (1)
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN") // (2)
            }
        }
    }
}
```

1. Your **github** username
2. Your Personal Access Token that you generate earlier

## Adding Dependencies

In your app's `build.gradle`, add this dependencies:

```groovy title="build.gradle"
dependencies {
    implementation "com.github.jimlyas:okdynamic:VERSION"
}
```

By changing the VERSION to the latest version of the library
![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/jimlyas/okdynamic?sort=semver)