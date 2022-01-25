!!! info
    You need to inject the `OkDynamic` class as singleton, use Dependency Injection tools like Dagger, Hilt, or Koin.

This is the example for using Koin

## Initialize the class

Initialize your Interceptor like this:
```kotlin title="KoinModule.kt"
single(named("okdynamic")) {
    OkDynamic.get(
        Pair(Environment.DEVELOPMENT, "https://development.api.com"),
        Pair(Environment.STAGING, "https://staging.api.com"),
        Pair(Environment.PRODUCTION, "https://production.api.com")
    )
}
```

This library support three environments **(Development, Staging, Production)**.

Change the base url based on your services.

## Adding the Interceptor

In your `okhttp` builder, add the interceptor:

```kotlin title="OkhttpModule.kt"
single {
        OkHttpClient.Builder().apply {
            readTimeout(2, TimeUnit.MINUTES)
            connectTimeout(2, TimeUnit.MINUTES)
            callTimeout(5, TimeUnit.MINUTES)
            addInterceptor(get(named("okdynamic")))
        }.build()
}
```