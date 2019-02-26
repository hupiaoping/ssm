package com.ilovestudy.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : Luckee
 * @date : 2019/2/26 14:43
 * @description :
 */
public class MyAspect {

    private final Logger logger = LoggerFactory.getLogger(MyAspect.class);

    public void beforeExecution(JoinPoint joinPoint){
        System.out.println("@Before advice");
        logger.info("before executing " + joinPoint.getSignature().getName());
    }
}
