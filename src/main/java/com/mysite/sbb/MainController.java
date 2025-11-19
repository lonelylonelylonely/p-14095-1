package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody // 이 메서드가 반환하는 값을 HTTP 응답 본문에 출력하도록 설정
    // 즉, "==^^==" 이 문자열이 웹 브라우저에 표시됨
    public String index() {
        System.out.println("index() method called!");
        return "==^^==";
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello() method called!");
    }
}