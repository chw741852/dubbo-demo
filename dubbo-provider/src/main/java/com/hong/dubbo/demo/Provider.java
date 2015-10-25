package com.hong.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Hongwei on 2015/10/23.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/provider.xml"});
        ctx.start();
        System.out.println("service start.");
        System.in.read();
    }
}
