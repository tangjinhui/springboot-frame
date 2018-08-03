package com.rayootech.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
* @ClassName: SpringbootApplication  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author tjh  
* @date 2018年7月27日 上午10:19:53  
*
 */
@SpringBootApplication
@EnableConfigServer
public class SpringbootApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
