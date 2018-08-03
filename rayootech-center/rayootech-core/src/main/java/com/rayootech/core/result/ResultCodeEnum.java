package com.rayootech.core.result;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: ResultCodeEnum
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author tjh
 * @date 2018年7月26日 下午5:16:31
 *
 */
public enum ResultCodeEnum {

	SUCCESS(200, "sucess"), FAILURE(500, "Failure"), INPUTPARAMNULL(5001, "输入参数为null");

	private int code;
	private String message;

	public static Map<Integer, ResultCodeEnum> resultMap = new HashMap<Integer, ResultCodeEnum>();

	static {
		for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
			resultMap.put(resultCodeEnum.code, resultCodeEnum);
		}

	}

	public static ResultCodeEnum getEnum(int code) {
		return resultMap.get(code);
	}

	private ResultCodeEnum(int code, String message) {
		this.setCode(code);
		this.setMessage(message);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
