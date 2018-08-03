package com.rayootech.project.service;

import com.rayootech.project.entity.ProjectData;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 可研数据录入 服务类
 * </p>
 *
 * @author ${author}
 * @since 2018-07-27
 */

public interface MPProjectDataService extends IService<ProjectData> {
	List<ProjectData> selectById(ProjectData projectData);
}
