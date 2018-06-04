package com.ubimo.mau.app.models;

public class Greeting {
	
	private long id;
	private String content;
	
	public Greeting() {
		
	}
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
}
