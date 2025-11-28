package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb") // 아래 메서드를 액션 메서드로 지정
    // 액션 메서드: 웹 브라우저가 "/" 경로로 접속했을 때 실행되는 메서드
    @ResponseBody // 이 메서드가 리턴하는 값을 응답으로 보냄 -> HTTP 응답 본문에 출력하도록 설정
    // 즉, "==^^==" 이 문자열이 웹 브라우저에 표시됨
    public String index() {
        System.out.println("index() method called!");
        return "==^^==";
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello() method called!");
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}