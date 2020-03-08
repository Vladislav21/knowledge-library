package com.practice.knowledgelibrary.testng

import org.mockito.MockitoAnnotations
import org.testng.annotations.BeforeMethod

open class BaseTestNgTest {

    @BeforeMethod
    protected fun initMocks() {
        MockitoAnnotations.initMocks(this)
    }
}