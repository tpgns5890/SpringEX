package com.company.app.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component
@Aspect
@Log4j
public class LoginAdvice {

	@After("LogAdvice.allpointcut()")
	public void logBefore() {
		log.info("[before !!]");
	}
}
