package com.practice.knowledgelibrary.db

import com.practice.knowledgelibrary.testng.BaseTestNgTest
import com.practice.knowledgelibrary.utils.RandomPrimitives
import org.apache.logging.log4j.util.Strings
import org.testng.Assert
import org.testng.annotations.Test

class EmployeeTest : BaseTestNgTest() {

    private val testable : Employee = Employee()

    @Test
    fun testGetId() {
        val expectedId = RandomPrimitives.getRandomInt()
        this.testable.id = expectedId
        val actualId = this.testable.id
        Assert.assertEquals(actualId, expectedId)
    }

    @Test
    fun testGetFirstName() {
        val expectedFirstName = RandomPrimitives.getRandomString()
        this.testable.firstName = expectedFirstName
        val actualFirstName = this.testable.firstName
        Assert.assertEquals(actualFirstName, expectedFirstName)
    }

    @Test
    fun testGetLastName() {
        val expectedLastName = RandomPrimitives.getRandomString()
        this.testable.lastName = expectedLastName
        val actualLastName = this.testable.lastName
        Assert.assertEquals(actualLastName, expectedLastName)
    }

    @Test
    fun testDefaultProperties() {
        val actualId = this.testable.id
        val actualFirstName = this.testable.firstName
        val actualLastName = this.testable.lastName
        Assert.assertNull(actualId)
        Assert.assertSame(actualFirstName, Strings.EMPTY)
        Assert.assertSame(actualLastName, Strings.EMPTY)
    }

    @Test
    fun testCopy() {
        val actualResult = this.testable.copy()
        Assert.assertEquals(actualResult, this.testable)
    }
}