/*
 * Copyright © 2014 - 2024 TTS. All Rights Reserved.
 */
package org.tts.spring.scaffold.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * scaffold-web/src/main/java/org/tts/spring/scaffold/web/controller/UserController
 *
 * @author Taoshouyao
 * @version 1.0.0
 * @since 2024-03-11 13:21:04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public Map<String, Object> hello() {
        return Map.ofEntries(
                Map.entry("foo", "bar"),
                Map.entry("hello", "world")
        );
    }

    @GetMapping("/error")
    public Map<String, Object> error() {
        throw new RuntimeException("Hello world");
    }
}
