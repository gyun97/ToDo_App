package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //Spring MVC에서 브라우저와 통신하는 인터페이스
public class HelloController {
    @GetMapping("/hello") // "/hello"라는 요청이 들어오면 "hello" 리턴
    public String hello() {
        return "hello"; // 탬블릿 파일 hello.html을 사용하겠다는 뜻. hello.html은 thymeleaf의 탬플릿의 일종
    }

}
