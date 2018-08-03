package com.rayootech.core.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
* @ClassName: SwaggerConfig  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author tjh  
* @date 2018年7月24日 下午6:13:30  
*
 */
@Configuration  
public class SwaggerConfig {
	
	@Bean
	public Docket adminApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.useDefaultResponseMessages(false);
	}

	/**
	 * 
	* @Title: apiInfo  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @return    设定文件  
	* @return ApiInfo    返回类型  
	* @throws
	 */
	private ApiInfo apiInfo(){
		Contact contact = new Contact("tjh", "https://www.baidu.com", "tangjinhui0606@rayootech.com");
		return new ApiInfoBuilder()
				.title("Rayootech API Document")
				.description("Rayootech API Document")
				.license("Rayootech Alpha Version")
				.contact(contact)
				.version("1.0")
				.build();
	}
}
