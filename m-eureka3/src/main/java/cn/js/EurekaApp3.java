package cn.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName EurekaApp
 * @Description TODO
 * @createTime 2019年08月20日 14:59:00
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp3 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp3.class,args);
    }
}
