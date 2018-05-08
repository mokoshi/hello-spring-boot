package com.example.hello

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@Controller
@EnableAutoConfiguration
class HelloApplication {

    @RequestMapping("/")
    @ResponseBody
    internal fun home(): String {
        return "Hello World!"
    }

    companion object {

        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(HelloApplication::class.java, *args)
        }
    }
}