package com.example

actual open class IOException actual constructor(
    message: String?
) : Exception(message)
