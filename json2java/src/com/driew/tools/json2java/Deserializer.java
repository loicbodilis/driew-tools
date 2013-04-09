package com.driew.tools.json2java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.driew.tools.json2java.exceptions.NoEmptyConstructorException;

public class Deserializer<D> {
	public static void main(String[] args) throws ParseException {
		Deserializer<MyClass> deserializer = new Deserializer<MyClass>();
		String json = 
			"{" +
					"\"myString\" : \"mysuperstring\"," +
					"\"myInt\" : 3, " +
					"\"myBoolean\" : true," +
			"}";
		MyClass myInstance = deserializer.parse(json, MyClass.class);
		System.out.println(myInstance);
	}
	
	public Deserializer() {
	}
	
	public D parse(String json, Class<D> myClass) throws ParseException, NoEmptyConstructorException{
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(json);
		JSONObject jsonObj = (JSONObject) obj;
		
		
		Constructor<D> constructor;
		D myInstance = null;
		try {
			constructor = myClass.getConstructor();
			myInstance =constructor.newInstance();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			throw new NoEmptyConstructorException();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myInstance;
	}
	 
}
