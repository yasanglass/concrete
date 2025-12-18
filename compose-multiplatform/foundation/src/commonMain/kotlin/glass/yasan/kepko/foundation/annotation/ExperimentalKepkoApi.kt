package glass.yasan.kepko.foundation.annotation

@RequiresOptIn(
    level = WARNING,
)
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
)
public annotation class ExperimentalKepkoApi
