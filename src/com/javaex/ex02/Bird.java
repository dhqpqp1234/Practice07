package com.javaex.ex02;

public abstract class Bird {
   //필드
	protected String name;
	//생성자
	
	//메소드 gs
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//메소드 일반

	public abstract void sing();
	
	public abstract void fly();
	
	public abstract void showName();
	
	
	

}
