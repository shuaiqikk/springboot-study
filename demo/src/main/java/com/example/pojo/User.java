package com.example.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties("password"/* 或者用value="password" */)
//通过@JsonIgnoreProperties(value="password")在类前注解的方式等同于用@JsonIgnore注解在对应的属性前。
public class User {

	private String name;
	//@JsonIgnore
	private String password;
	private int age;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a", locale="zh", timezone="GMT+8")
	private Date birthday;
	@JsonInclude(Include.NON_NULL)
	private String desc;
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public int getAge() {
		return age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getDesc() {
		return desc;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
