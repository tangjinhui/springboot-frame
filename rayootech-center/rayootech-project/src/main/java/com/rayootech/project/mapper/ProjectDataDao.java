package com.rayootech.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rayootech.project.entity.ProjectData;

/**
 * <p>
 * 可研数据录入 Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2018-07-27
 */
@Mapper
public interface ProjectDataDao extends BaseMapper<ProjectData> {
	
	List<ProjectData> selectById(ProjectData projectData);
}
