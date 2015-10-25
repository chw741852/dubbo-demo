package com.hong.dubbo.demo.provider;

import com.hong.dubbo.demo.DemoService;

/**
 * Created by Hongwei on 2015/10/23.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
