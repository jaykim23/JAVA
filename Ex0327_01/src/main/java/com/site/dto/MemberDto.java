package com.site.dto;

public class MemberDto {
	
	private String id;
	private String pw;
	private String name;
	private String nName;
	
	public MemberDto() {}
	
	public MemberDto(String id, String pw, String name, String nName) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nName = nName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getnName() {
		return nName;
	}

	public void setnName(String nName) {
		this.nName = nName;
	}
	
	
}