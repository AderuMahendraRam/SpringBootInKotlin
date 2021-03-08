package com.org.amr.calculator.service

import org.springframework.stereotype.Service

@Service
class TaskService {
    var allTasks = mutableMapOf<Int,String>(1 to "Code Push",2 to "Code Review",3 to "Code Merge")

    fun getTasks(): MutableMap<Int, String>{
        return allTasks;
    }
}