package org.ajax.dto;

public class Board_0810Dto {
	private int no;
	private String userId;
	private String title;
	private String content;
	
	public Board_0810Dto(int no, String userId, String title, String content) {
		super();
		this.no = no;
		this.userId = userId;
		this.title = title;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
