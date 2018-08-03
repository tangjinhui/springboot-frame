package com.rayootech.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
* @ClassName: App  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author tjh  
* @date 2018年7月27日 下午1:53:44  
*
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
