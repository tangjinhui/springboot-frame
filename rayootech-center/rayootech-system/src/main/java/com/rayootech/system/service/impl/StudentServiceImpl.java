package com.rayootech.system.service.impl;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rayootech.system.entity.Student;
import com.rayootech.system.mapper.StudentDao;
import com.rayootech.system.service.MPStudentService;

import lombok.extern.slf4j.Slf4j;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-07-25
 */
@Slf4j
@Service("MPStudentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements MPStudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> queryAll() {
		
		return studentDao.queryAllStudents();
	}
	@Override
	public boolean deleteById(String id) {
		// TODO 自动生成的方法存根
		return false;
	}
	@Override
	public long insertStudent(Student stu) {
		// TODO 自动生成的方法存根
		return studentDao.addStudent(stu);
	}
	@Override
	public boolean updateStudent(Student entity) {
		// TODO 自动生成的方法存根
		try {
			if(entity !=null)
				studentDao.updateStudent(entity);
				return true;
		}catch(Exception e) {
			log.error("StudentServiceImplExcetion",e);
			return false;
		}
		
	}

}
