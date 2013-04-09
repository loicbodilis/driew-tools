package com.driew.tools.json2java;

import java.util.List;

public class MySubClass {
	private List<String> myStringList;

	public List<String> getMyStringList() {
		return myStringList;
	}

	public void setMyStringList(List<String> myStringList) {
		this.myStringList = myStringList;
	}

	@Override
	public String toString() {
		return "MySubClass [myStringList=" + myStringList + "]";
	}
	
}
