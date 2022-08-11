package org.ajax.dto;

public class Member_0810Dto {
	private String userId;
	private String userPw;
	private String userPhone;
	
	public Member_0810Dto(String userId, String userPw, String userPhone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userPhone = userPhone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
}
