package com.org.amr.calculator.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.org.amr.calculator.service.TaskService
import org.springframework.web.bind.annotation.PostMapping

@RestController
class TaskController {

    @Autowired
    private lateinit var service:TaskService

    @GetMapping("/")
    fun checkApplication():String{
        return "Application is UP :)"
    }

    @GetMapping("/task")
    fun getTasks():MutableMap<Int, String>{
        return service.getTasks()
    }

    @PostMapping("/task")
    fun addTask():MutableMap<Int, String>{
       //TODO
        return service.getTasks()
    }
}