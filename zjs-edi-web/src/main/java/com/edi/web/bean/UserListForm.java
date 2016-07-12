package com.edi.web.bean;

import java.util.List;

public class UserListForm
{
	private String name;

	private List<Requestorder> requestorders;

	/**
	 * @return the requestorders
	 */
	public List<Requestorder> getRequestorders()
	{
		return requestorders;
	}

	/**
	 * @param requestorders the requestorders to set
	 */
	public void setRequestorders(List<Requestorder> requestorders)
	{
		this.requestorders = requestorders;
	}

	private List<User> users;

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

	public List<User> getUsers()
	{
		return users;
	}

	public void setUsers(List<User> users)
	{
		this.users = users;
	}
}
