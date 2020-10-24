package com.example

expect open class IOException(
    message: String? = null,
) : Exception
