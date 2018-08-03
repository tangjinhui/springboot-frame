package com.rayootech.project.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 可研数据录入
 * </p>
 *
 * @author ${author}
 * @since 2018-07-27
 */
@TableName("project_data")
public class ProjectData implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="entityId", type= IdType.AUTO)
	private Long entityId;
    /**
     * 项目ID
     */
	private Long projectId;
    /**
     * 参数ID
     */
	@TableField("indicator_id")
	private Long indicatorId;
    /**
     * 数据项标识
     */
	@TableField("data_item")
	private String dataItem;
    /**
     * 数据项取值
     */
	@TableField("item_value")
	private String itemValue;
    /**
     * 年份
     */
	private Integer year;
    /**
     * 季度
     */
	private Integer quarter;
    /**
     * 0-可研预测1投后预测2-计划3-实际4-偏差值
     */
	private Integer entityType;
    /**
     * 操作用户ITCODE
     */
	private String itcode;
    /**
     * 资源ID
     */
	private Long resourceId;
	private Date createTime;
    /**
     * 偏差值原因分析说明
     */
	private String memo;
    /**
     * 月份
     */
	private Integer month;


	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(Long indicatorId) {
		this.indicatorId = indicatorId;
	}

	public String getDataItem() {
		return dataItem;
	}

	public void setDataItem(String dataItem) {
		this.dataItem = dataItem;
	}

	public String getItemValue() {
		return itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	public Integer getEntityType() {
		return entityType;
	}

	public void setEntityType(Integer entityType) {
		this.entityType = entityType;
	}

	public String getItcode() {
		return itcode;
	}

	public void setItcode(String itcode) {
		this.itcode = itcode;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "ProjectData{" +
			", entityId=" + entityId +
			", projectId=" + projectId +
			", indicatorId=" + indicatorId +
			", dataItem=" + dataItem +
			", itemValue=" + itemValue +
			", year=" + year +
			", quarter=" + quarter +
			", entityType=" + entityType +
			", itcode=" + itcode +
			", resourceId=" + resourceId +
			", createTime=" + createTime +
			", memo=" + memo +
			", month=" + month +
			"}";
	}
}
