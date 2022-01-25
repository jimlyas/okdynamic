package dev.garnishcode.okdynamic

import okhttp3.Interceptor

/**
 * @author Jimly A.
 * @since 14-Jan-22
 **/
class OkDynamic : Interceptor {
    private lateinit var environments: Array<out Pair<Environment, String>>

    private var environment: Environment = Environment.DEVELOPMENT

    override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())

    fun setEnvironment(environment: Environment) {
        this.environment = environment
    }

    companion object {
        fun get(vararg urls: Pair<Environment, String>) =
            OkDynamic().apply {
                environments = urls
            }
    }
}