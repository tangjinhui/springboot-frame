package com.rayootech.core.result;

import java.io.Serializable;

/**
 * 
* @ClassName: ResponseBodyInfo  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author tjh  
* @date 2018年7月26日 下午5:23:06  
*  
* @param <T>
 */
public class ResponseBodyInfo<T> implements Serializable{
	/**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 8109581286630475092L;

	// 错误代码
	protected int status;

	// 错误提示
	protected String message;

	// 返回对象
	protected T data;

	protected Object page;

	protected ResponseBodyInfo() {
	}
	protected ResponseBodyInfo(int errorCode,String message) {
		this.status=errorCode;
		this.message=message;
	}
	protected ResponseBodyInfo(int errorCode, String errorText, T data) {
		this.status = errorCode;
		this.message = errorText;
		this.data = data;
	}

	public ResponseBodyInfo(int status, String message, T data, Object page) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.page = page;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	public Object getPage() {
		return page;
	}

	public void setPage(Object page) {
		this.page = page;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ResponseBodyInfo{");
		sb.append("errorCode=").append(status);
		sb.append(", errorText='").append(message).append('\'');
		sb.append(", data=").append(data);
		sb.append('}');
		return sb.toString();
	}
}