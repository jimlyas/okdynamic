# OkDynamic

OkDynamic is a lightweight `Okhttp` interceptor that helps you to navigate through your
environments. Commonly Android developers use `build variant` or `build flavor` like this:

```kotlin title="build.gradle"
productFlavors {
    create("development") {
        // Configuration for development environment
    }
    create("staging") {
        // Configuration for staging environment
    }
    create("production") {
        // Configuration for production environment
    }
}
```

This means you will need separate APKs if you want to test each environments.

But by using this library, you can dynamically change the environment on run-time without building
separate APKs.