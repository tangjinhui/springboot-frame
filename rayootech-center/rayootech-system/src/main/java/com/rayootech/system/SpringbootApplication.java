package com.rayootech.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
* @ClassName: SpringbootApplication  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author tjh  
* @date 2018年7月26日 下午5:23:48  
*
 */

@EnableSwagger2
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
