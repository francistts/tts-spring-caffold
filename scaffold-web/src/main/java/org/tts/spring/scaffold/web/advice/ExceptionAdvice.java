/*
 * Copyright © 2014 - 2024 TTS. All Rights Reserved.
 */
package org.tts.spring.scaffold.web.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * scaffold-web/src/main/java/org/tts/spring/scaffold/web/advice/ExceptionAdvice
 *
 * @author Taoshouyao
 * @version 1.0.0
 * @since 2024-03-11 13:25:19
 */
@ControllerAdvice(basePackages = {"org.tts.spring.scaffold.web.controller"})
public class ExceptionAdvice {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ModelAndView onServerError(final RuntimeException exception) {
        return new ModelAndView("/error/500.html");
    }
}
