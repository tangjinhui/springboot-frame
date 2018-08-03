package com.rayootech.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rayootech.project.entity.ProjectData;
import com.rayootech.project.mapper.ProjectDataDao;
import com.rayootech.project.service.MPProjectDataService;

/**
 * <p>
 * 可研数据录入 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-07-27
 */
@Service
public class ProjectDataServiceImpl extends ServiceImpl<ProjectDataDao, ProjectData> implements MPProjectDataService {
	
	@Autowired
	private ProjectDataDao projectDataDao;
	@Override
	public List<ProjectData> selectById(ProjectData projectData) {
		// TODO 自动生成的方法存根
		return projectDataDao.selectById(projectData);
	}

}
