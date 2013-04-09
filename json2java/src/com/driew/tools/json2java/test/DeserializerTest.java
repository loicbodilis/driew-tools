package com.driew.tools.json2java.test;
import static org.junit.Assert.*;

import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

import com.driew.tools.json2java.Deserializer;
import com.driew.tools.json2java.MyClass;
import com.driew.tools.json2java.MyClassWithoutEmptyConstructor;
import com.driew.tools.json2java.exceptions.NoEmptyConstructorException;


public class DeserializerTest {

	@Test
	public void testSimpleDeserializationOneLevel() throws ParseException {
		String json = 
				"{" +
						"\"myString\" : \"mysuperstring\"," +
						"\"myInt\" : 3, " +
						"\"myBoolean\" : true," +
				"}";
		Deserializer<MyClass> deserializer = new Deserializer<MyClass>();
		MyClass myInstance = deserializer.parse(json, MyClass.class);
		assertEquals("mysuperstring", myInstance.getMyString());
		assertEquals(3, myInstance.getMyInt());
		assertEquals(true, myInstance.isMyBoolean());
	}
	
	@Test(expected = NoEmptyConstructorException.class)
	public void testDeserializationWrongConstructor() throws ParseException {
		String json = 
				"{" +
						"\"myString\" : \"mysuperstring\"," +
						"\"myInt\" : 3, " +
						"\"myBoolean\" : true," +
				"}";
		Deserializer<MyClassWithoutEmptyConstructor> deserializer = new Deserializer<MyClassWithoutEmptyConstructor>();
		MyClassWithoutEmptyConstructor myInstance = deserializer.parse(json, MyClassWithoutEmptyConstructor.class);
	}

}
