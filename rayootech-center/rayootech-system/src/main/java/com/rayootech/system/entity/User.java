package com.rayootech.system.entity;

public class User {

	@SuppressWarnings("unused")
	private String loginWay;
	private String showPassword;
	private String phoneNumber;
	private String mobileCode;
	private String validate_token;
	private String computedTime;
	private String userInfo;
	private String userAccount;
	private String passWord;
	private String captchaCodeImg;
	private String codeNumber;
	private String showAlert;
	private String alertText;
	private String guoliwei;
	private String tjhtest;
	public String getShowPassword() {
		return showPassword;
	}

	public void setShowPassword(String showPassword) {
		this.showPassword = showPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}

	public String getComputedTime() {
		return computedTime;
	}

	public void setComputedTime(String computedTime) {
		this.computedTime = computedTime;
	}
}
