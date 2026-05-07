package com.mysite.sbb;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    public void index() {
        System.out.println("index() 메서드 호출됨!");
    }
}
