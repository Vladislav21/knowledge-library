package com.practice.knowledgelibrary.db

import org.apache.logging.log4j.util.Strings
import org.springframework.data.annotation.Id

data class Employee(
        @Id override var id: Int? = null,
        var firstName: String = Strings.EMPTY,
        var lastName: String = Strings.EMPTY
): EntityPojo