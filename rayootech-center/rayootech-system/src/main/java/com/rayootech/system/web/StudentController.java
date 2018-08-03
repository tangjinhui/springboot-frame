package com.rayootech.system.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.rayootech.core.result.JsonResult;
import com.rayootech.system.entity.Student;
import com.rayootech.system.service.MPStudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2018-07-25
 */
@Api("测试Student")
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private MPStudentService studentService;
	
	@ApiOperation(value="查询所有的学生",notes="queryall查询")
	@RequestMapping(value="/query",method = RequestMethod.GET)
	public JsonResult queryStudent() {
		List<Student> queryAllStudent = studentService.queryAll();
		return  JsonResult.success(queryAllStudent);
	}
	@ApiOperation(value="插入学生")
	@RequestMapping(value="/insert",method = RequestMethod.GET)
	public JsonResult insertStudent() {
		Student student = new Student();
		student.setClassId("2");
		student.setId(2L);
		long id =studentService.insertStudent(student);
		return JsonResult.success(id);
	}
	@ApiOperation(value="更新学生")
	@RequestMapping(value="/update",method = RequestMethod.GET)
	public JsonResult updateStudent() {
		Student student = new Student();
		student.setClassId("22");
		student.setId(2L);
		boolean flag = studentService.updateStudent(student);
		return JsonResult.success("success");
	}
}

