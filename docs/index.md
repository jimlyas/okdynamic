# OkDynamic

OkDynamic is a lightweight `Okhttp` interceptor that helps you to navigate through your
environments. Commonly Android developers use `build variant` or `build flavor` like this:

```kotlin
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

This means you need to build separate APKs for each environments if you want to test it. But by
using this library, you don't need have to do that anymore.