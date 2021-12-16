package com.dnyanesh.quarkus.dto;

public class UserDetails {
	private String name;
	private String email;

	public UserDetails() {
	}

	public UserDetails(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
