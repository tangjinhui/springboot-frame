package com.rayootech.system.service;

import com.rayootech.system.entity.Student;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * 
 * @ClassName: MPStudentService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author tjh
 * @date 2018年7月25日 下午2:08:27
 *
 */
public interface MPStudentService extends IService<Student> {
	/**
	 * 
	 * @Title: queryAll @Description: TODO(这里用一句话描述这个方法的作用) @param @return
	 * 设定文件 @return List<Student> 返回类型 @throws
	 */
	List<Student> queryAll();
	/**
	 * 
	 */
	long insertStudent(Student stu);
	/***
	 * 
	* @Title: deleteById  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param id
	* @param @return    设定文件  
	* @return boolean    返回类型  
	* @throws
	 */
	boolean deleteById(String id);
	/**
	 * 
	 */
	boolean updateStudent(Student entity);
}
