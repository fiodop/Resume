package com.resume.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.resume.model.entity.HRInfo
import com.resume.model.entity.Resume
import com.resume.service.HRInfoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList

@RestController
@RequestMapping("resume")
class Controller(private val hRInfoService : HRInfoService) {
    val objectMapper = ObjectMapper()

    @GetMapping("artem")
    fun getResume() : String{
        val petProjects = hashMapOf("Telegram collector bot" to "https://github.com/fiodop/telegram_collector_bot", "Task managemetn system" to  "https://github.com/fiodop/Task_Management_System")
        val resumeArtem  = Resume("Артём", "Ключаров", "Нет коммерческого опыта", "ФГБОУ ВО СПбГУВМ 2023-2023гг", "Java Core, OOP, SQL(SQLite, mySQL, postgreSQL, JBDC, DI, IoC, multithreading, AOP, Hibernate, Spring MVC, Spring Security, Spring Data JPA, Sring Boot", petProjects)
        val response = objectMapper.writeValueAsString(resumeArtem)
        println(response)
        return response
    }
    @PostMapping("feedback")
    fun feedback(@RequestBody hrInfo : HRInfo){
        hRInfoService.save(hrInfo)
    }
}