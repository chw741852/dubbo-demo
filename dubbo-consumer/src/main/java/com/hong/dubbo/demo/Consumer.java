package com.hong.dubbo.demo;

import com.hong.dubbo.interfaces.simple.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hongwei on 2015/10/25.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/consumer.xml"});
        ctx.start();
        DemoService demoService = (DemoService) ctx.getBean("demoService");
        String hello = demoService.sayHello("world");

        System.out.println(hello);
    }
}
