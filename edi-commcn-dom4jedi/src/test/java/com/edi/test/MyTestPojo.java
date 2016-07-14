package com.edi.test;

import org.dom4j.VisitorSupport;

import com.fasterxml.jackson.annotation.JacksonInject;

public class MyTestPojo extends VisitorSupport
{

	@JacksonInject
	private String name;

	private String age;

	/**
	 * @return the name 
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age)
	{
		this.age = age;
	}

}
