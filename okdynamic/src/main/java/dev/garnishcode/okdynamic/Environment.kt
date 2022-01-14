package dev.garnishcode.okdynamic

import androidx.annotation.IntDef

/**
 * @author Jimly A.
 * @since 14-Jan-22
 **/
class Environment {
    companion object {
        const val DEVELOP = 0
        const val STAGING = 1
        const val PRODUCTION = 2
    }

    @IntDef(DEVELOP, STAGING, PRODUCTION)
    @Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.FIELD,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.CONSTRUCTOR
    )
    @Retention(AnnotationRetention.SOURCE)
    annotation class Type
}


