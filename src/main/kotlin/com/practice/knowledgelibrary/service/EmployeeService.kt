package com.practice.knowledgelibrary.service

import com.practice.knowledgelibrary.db.Employee
import reactor.core.publisher.Flux

interface EmployeeService {
    fun findByName(name: String) : Flux<Employee>
}