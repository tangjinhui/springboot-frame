package com.rayootech.project.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rayootech.core.result.JsonResult;
import com.rayootech.project.entity.ProjectData;
import com.rayootech.project.service.MPProjectDataService;

/**
 * <p>
 * 可研数据录入 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2018-07-27
 */
@RestController
@RequestMapping("/projectData")
public class ProjectDataController {
	
	@Autowired
	private MPProjectDataService projectSerivice;
	@RequestMapping("/{id}")
	public JsonResult queryProject(@PathVariable Long id) {
		ProjectData projectData = new ProjectData();
		projectData.setEntityId(id);
		List<ProjectData> selectById = projectSerivice.selectById(projectData);
		return JsonResult.success(selectById);
	}
}

