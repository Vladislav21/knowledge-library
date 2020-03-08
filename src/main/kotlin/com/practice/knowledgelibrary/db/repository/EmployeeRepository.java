package com.practice.knowledgelibrary.db.repository;

import com.practice.knowledgelibrary.db.Employee;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {

    @Query("select * from employee e where e.name = :name")
    Flux<Employee> findByName(String name);
}
