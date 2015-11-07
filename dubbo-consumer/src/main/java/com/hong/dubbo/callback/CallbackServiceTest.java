package com.hong.dubbo.callback;

import com.hong.dubbo.interfaces.callback.CallbackService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hongwei on 2015/11/7.
 */
public class CallbackServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/consumer.xml");
        ctx.start();

        CallbackService callbackService = (CallbackService) ctx.getBean("callbackService");
        callbackService.addListener("http://10.20.160.198/wiki/display/dubbo/foo.bar", msg -> System.out.println("callback1: " + msg));
    }
}
