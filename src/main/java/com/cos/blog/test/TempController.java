package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {

    @GetMapping("/temp/home")
    public String tempHome(){
        System.out.println("tempH");
        //파일리턴 기본경로 :src/main/resources/static
        //리턴명 :/home.html
        //풀경로 :src/main/resources/static/home.html
        return "/test.html";
    }
}
