package com.corejsf;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Past;

@Named("user")
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;
	
	@Past
	private Date birthday = new GregorianCalendar(2000, 0, 1).getTime();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
