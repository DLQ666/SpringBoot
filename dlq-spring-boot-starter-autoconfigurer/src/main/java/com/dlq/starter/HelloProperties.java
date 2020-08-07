package com.dlq.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *@program: SpringBoot
 *@description: 属性用来绑定配置文件里的
 *@author: Hasee
 *@create: 2020-08-07 21:24
 */
@ConfigurationProperties(prefix = "dlq.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
