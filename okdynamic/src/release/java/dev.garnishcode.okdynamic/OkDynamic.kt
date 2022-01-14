package dev.garnishcode.okdynamic

import okhttp3.Interceptor

/**
 * @author Jimly A.
 * @since 14-Jan-22
 **/
class OkDynamic : Interceptor {
    override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
}