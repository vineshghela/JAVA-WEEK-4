package com.qa.constructors;

public class TwoFactor {

	String uName;
	String password;
	int code;

	public TwoFactor(String uName, String password, int code) {

		this.uName = uName;
		this.password = password;
		this.code = code;
	}

	public TwoFactor(String uName, String password) {

		this.uName = uName;
		this.password = password;
	}

}
