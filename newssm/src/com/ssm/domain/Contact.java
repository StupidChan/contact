package com.ssm.domain;

public class Contact {
	private Integer t_id;
	private Integer t_age;
	private String t_name;
	private String  t_phone;
	private String  t_school;
	private String t_address;
	private String t_gender;
	private Integer user_id;
	
	private User user;

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}

	public Integer getT_age() {
		return t_age;
	}

	public void setT_age(Integer t_age) {
		this.t_age = t_age;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

	public String getT_school() {
		return t_school;
	}

	public void setT_school(String t_school) {
		this.t_school = t_school;
	}

	public String getT_address() {
		return t_address;
	}

	public void setT_address(String t_address) {
		this.t_address = t_address;
	}

	public String getT_gender() {
		return t_gender;
	}

	public void setT_gender(String t_gender) {
		this.t_gender = t_gender;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
