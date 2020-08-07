package com.dlq.starter;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-07 21:23
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloSpringBoot(String name) {
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
