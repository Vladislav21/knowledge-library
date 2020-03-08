package com.practice.knowledgelibrary.utils

import java.util.UUID
import java.util.concurrent.ThreadLocalRandom
import kotlin.math.abs

class RandomPrimitives {
    companion object {
        private val RANDOM: ThreadLocalRandom = ThreadLocalRandom.current()
        fun getRandomInt() = abs(RANDOM.nextInt())
        fun getRandomString() = UUID.randomUUID().toString()
    }
}