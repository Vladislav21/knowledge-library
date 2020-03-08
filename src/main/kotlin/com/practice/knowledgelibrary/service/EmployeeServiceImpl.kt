package com.practice.knowledgelibrary.service

import com.practice.knowledgelibrary.db.Employee
import com.practice.knowledgelibrary.db.repository.EmployeeRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class EmployeeServiceImpl(
        private val employeeRepository: EmployeeRepository
) : EmployeeService {

    override fun findByName(name: String): Flux<Employee> {
        val result = this.employeeRepository.findByName(name)
        return result;
    }

}