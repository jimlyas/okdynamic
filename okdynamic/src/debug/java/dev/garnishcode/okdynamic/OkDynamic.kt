package dev.garnishcode.okdynamic

import okhttp3.Interceptor
import okhttp3.Response

/**
 * @author Jimly A.
 * @since 14-Jan-22
 **/
class OkDynamic : Interceptor {
    private lateinit var environments: Array<out Pair<Environment.Type, String>>

    @Environment.Type
    private var state: Int = Environment.DEVELOP

    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }

    companion object {
        fun get(vararg urls: Pair<Environment.Type, String>) =
            OkDynamic().apply {
                environments = urls
            }
    }
}