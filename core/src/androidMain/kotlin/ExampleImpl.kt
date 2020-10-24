package com.example

import com.benasher44.uuid.Uuid

data class ExampleImpl(
    override val uuid: Uuid,
    override val exception: IOException,
) : Example
