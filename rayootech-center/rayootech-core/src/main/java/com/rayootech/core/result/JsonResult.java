package com.rayootech.core.result;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.github.pagehelper.PageInfo;

/**
 * 
* @ClassName: JsonResult  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author tjh  
* @date 2018年7月26日 下午5:20:21  
*
 */
public class JsonResult extends ResponseBodyInfo<Object>{

	/**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = -1223476253132142882L;
	public final static JsonResult SUCCESS = new JsonResult(ResultCodeEnum.SUCCESS.getCode(),ResultCodeEnum.SUCCESS.getMessage());
	public final static JsonResult FAILURE = new JsonResult(ResultCodeEnum.FAILURE.getCode(), ResultCodeEnum.FAILURE.getMessage());

	public JsonResult() {
		super();
	}
	public JsonResult(int code,String message){
		super(code,message);
	}
	public JsonResult(int code,String message,Object obj){
		super(code,message,obj);
	}
	public JsonResult(int code,String message,Object obj,Object page){
		super(code,message,obj,page);
	}
	public static JsonResult success(Object obj) {
		return new JsonResult(SUCCESS.getStatus(),SUCCESS.getMessage(),obj);
	}
	/**
	 * 
	* @Title: failure  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param obj
	* @param @return    设定文件  
	* @return JsonResult    返回类型  
	* @throws
	 */
	public static JsonResult failure(Object obj) {
		return new JsonResult(FAILURE.getStatus(), FAILURE.getMessage(), obj);
	}
	/**
	 * 
	* @Title: failure  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param errorCode
	* @param @param message
	* @param @return    设定文件  
	* @return JsonResult    返回类型  
	* @throws
	 */
	public static JsonResult failure(int errorCode, String message) {
		return new JsonResult(errorCode, message);
	}
	/**
	 * 
	* @Title: failure  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param errorCode
	* @param @param obj
	* @param @return    设定文件  
	* @return JsonResult    返回类型  
	* @throws
	 */
	public static JsonResult failure(int errorCode,String message, Object obj) {
		return new JsonResult(errorCode, message, obj);
	}
	/**
	 * 
	* @Title: successPage  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param obj
	* @param @param page
	* @param @return    设定文件  
	* @return JsonResult    返回类型  
	* @throws
	 */
	public static JsonResult successPage(Object obj, Object page) {
		return new JsonResult(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage(), obj, page);
	}
}
