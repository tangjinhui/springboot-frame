package com.rayootech.system.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author tjh
 * @date 2018年7月24日 下午6:12:42
 *
 */
@RestController
@RequestMapping("/user")
@Api(value = "UserController", description ="User相关操作接口定义类")
public class UserController {
	/**
	 * 
	* @Title: userHello  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws
	 */
	@ApiOperation(value = "hello", notes = "测试")
	@RequestMapping("/hello")
	public String userHello() {
		return "user";
	}
}
