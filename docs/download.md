## Getting Personal Access Token

Before downloading this library, you need to configure personal access token in Github.

Click [here](https://github.com/settings/tokens) for configuring it!

!!! info Store your token for later!

## Defining Credential

After generating your personal access token, store it inside `gradle.properties` like this:

```groovy
gpr_user=yourgithubusername
gpr_key=yourgeneratedpersonalaccesstoken
```

## Defining Repository

Add this repository to your gradle configuration:

```groovy title="build.gradle"
allProjects {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/jimlyas/okdynamic")
            credentials {
                username = properties["gpr_user"].toString() // (1)
                password = properties["gpr_key"].toString() // (2)
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

Change **VERSION** to the version of the library you want to use.

![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/jimlyas/okdynamic?sort=semver)