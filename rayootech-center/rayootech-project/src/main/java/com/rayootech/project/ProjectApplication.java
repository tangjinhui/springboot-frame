package com.rayootech.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @ClassName: ProjectApplication
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author tjh
 * @date 2018年7月27日 下午4:01:09
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class,args);
	}
}
