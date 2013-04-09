package com.driew.tools.json2java;

public class MyClass {
	private String myString;
	private boolean myBoolean;
	private int myInt;
	private MySubClass mySubClass;
	
	
	public int getMyInt() {
		return myInt;
	}
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
	public boolean isMyBoolean() {
		return myBoolean;
	}
	public void setMyBoolean(boolean myBoolean) {
		this.myBoolean = myBoolean;
	}
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
	public MySubClass getMySubClass() {
		return mySubClass;
	}
	public void setMySubClass(MySubClass mySubClass) {
		this.mySubClass = mySubClass;
	}
	@Override
	public String toString() {
		return "MyClass [myString=" + myString + ", myBoolean=" + myBoolean
				+ ", myInt=" + myInt + ", mySubClass=" + mySubClass + "]";
	}
	
}
