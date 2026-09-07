package com.example.careertracker.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 疎通確認用のエンドポイント。
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
