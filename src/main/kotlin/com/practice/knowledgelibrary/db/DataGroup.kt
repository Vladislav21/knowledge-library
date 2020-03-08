package com.practice.knowledgelibrary.db

import org.apache.logging.log4j.util.Strings
import org.springframework.data.annotation.Id

data class DataGroup(
        @Id override var id: Int? = null,
        var name: String = Strings.EMPTY
): EntityPojo