package com.rayootech.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rayootech.system.entity.Student;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2018-07-25
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {
	
	List<Student> queryAllStudents();
	
	long addStudent(Student student);
	
	void updateStudent(Student student);
}
