package es.vanadis.testingrunes.setup

fun <T> lazyUnsychronized(initializer: () -> T): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE, initializer)