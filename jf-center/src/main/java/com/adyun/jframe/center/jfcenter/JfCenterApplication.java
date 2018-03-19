package com.adyun.jframe.center.jfcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author devon
 * @date 2018-02-05
 * 启动一个服务注册中心提供给其他应用进行对话
 */
@EnableEurekaServer
@SpringBootApplication
public class JfCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JfCenterApplication.class, args);
    }
}
