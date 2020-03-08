package com.practice.knowledgelibrary.db

interface EntityPojo {
    val id: Int?

    fun hasId() : Boolean {
        return id != null
    }
}