package com.edi.web.bean;

public class Receiver extends BasePojo
{
	/**
	 * id
	 */
	private Long id;

	/**
	 * 详细地址(含省市区县) 
	 */
	private String address;

	/**
	 * 寄件或收件市（北京市、宜昌市）
	 */
	private String city;

	/**
	 * 寄件或收件区县(如东城区、延庆县)
	 */
	private String district;

	/**
	 * 移劢电话
	 */
	private String mobile;

	/**
	 * 寄件人或收件人姓名
	 */
	private String name;

	/**
	 * 固定电话
	 */
	private String phone;

	/**
	 * 邮编
	 */
	private String postcode;

	/**
	 * 寄件或收件省（北京市、湖北省）
	 */
	private String prov;

	/**
	 * 用户ID
	 */
	private Long uid;

	/**
	 * 获取id
	 *
	 * @return id - id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * 设置id
	 *
	 * @param id id
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * 获取详细地址(含省市区县) 
	 *
	 * @return address - 详细地址(含省市区县) 
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * 设置详细地址(含省市区县) 
	 *
	 * @param address 详细地址(含省市区县) 
	 */
	public void setAddress(String address)
	{
		this.address = address == null ? null : address.trim();
	}

	/**
	 * 获取寄件或收件市（北京市、宜昌市）
	 *
	 * @return city - 寄件或收件市（北京市、宜昌市）
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * 设置寄件或收件市（北京市、宜昌市）
	 *
	 * @param city 寄件或收件市（北京市、宜昌市）
	 */
	public void setCity(String city)
	{
		this.city = city == null ? null : city.trim();
	}

	/**
	 * 获取寄件或收件区县(如东城区、延庆县)
	 *
	 * @return district - 寄件或收件区县(如东城区、延庆县)
	 */
	public String getDistrict()
	{
		return district;
	}

	/**
	 * 设置寄件或收件区县(如东城区、延庆县)
	 *
	 * @param district 寄件或收件区县(如东城区、延庆县)
	 */
	public void setDistrict(String district)
	{
		this.district = district == null ? null : district.trim();
	}

	/**
	 * 获取移劢电话
	 *
	 * @return mobile - 移劢电话
	 */
	public String getMobile()
	{
		return mobile;
	}

	/**
	 * 设置移劢电话
	 *
	 * @param mobile 移劢电话
	 */
	public void setMobile(String mobile)
	{
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * 获取寄件人或收件人姓名
	 *
	 * @return name - 寄件人或收件人姓名
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * 设置寄件人或收件人姓名
	 *
	 * @param name 寄件人或收件人姓名
	 */
	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 获取固定电话
	 *
	 * @return phone - 固定电话
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * 设置固定电话
	 *
	 * @param phone 固定电话
	 */
	public void setPhone(String phone)
	{
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * 获取邮编
	 *
	 * @return postcode - 邮编
	 */
	public String getPostcode()
	{
		return postcode;
	}

	/**
	 * 设置邮编
	 *
	 * @param postcode 邮编
	 */
	public void setPostcode(String postcode)
	{
		this.postcode = postcode == null ? null : postcode.trim();
	}

	/**
	 * 获取寄件或收件省（北京市、湖北省）
	 *
	 * @return prov - 寄件或收件省（北京市、湖北省）
	 */
	public String getProv()
	{
		return prov;
	}

	/**
	 * 设置寄件或收件省（北京市、湖北省）
	 *
	 * @param prov 寄件或收件省（北京市、湖北省）
	 */
	public void setProv(String prov)
	{
		this.prov = prov == null ? null : prov.trim();
	}

	/**
	 * 获取用户ID
	 *
	 * @return uid - 用户ID
	 */
	public Long getUid()
	{
		return uid;
	}

	/**
	 * 设置用户ID
	 *
	 * @param uid 用户ID
	 */
	public void setUid(Long uid)
	{
		this.uid = uid;
	}
}
