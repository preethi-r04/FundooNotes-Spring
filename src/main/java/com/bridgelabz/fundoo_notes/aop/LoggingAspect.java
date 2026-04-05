package com.bridgelabz.fundoo_notes.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.bridgelabz.fundoo.service.*.*(..))")
    public void logBefore() {
        System.out.println("Method execution started...");
    }
}