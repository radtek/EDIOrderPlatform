package com.edi.manage.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Sender extends BasePojo
{
	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 用户id
	 */
	private Long uid;

	/**
	 * 详细地址(丌要包含省市区县) 
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
	 * 移劢电话，最多 2 个用/隔开
	 */
	private String mobile;

	/**
	 * 寄件人或收件人姓名(最多 15 个汉字)
	 */
	private String name;

	/**
	 * 固定电话，包括区号、电话号码及分机号
	 */
	private String phone;

	/**
	 * 寄件人或收件人邮编
	 */
	private String postcode;

	/**
	 * 寄件或收件省（北京市、湖北省）
	 */
	private String prov;

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
	 * 获取用户id
	 *
	 * @return uid - 用户id
	 */
	public Long getUid()
	{
		return uid;
	}

	/**
	 * 设置用户id
	 *
	 * @param uid 用户id
	 */
	public void setUid(Long uid)
	{
		this.uid = uid;
	}

	/**
	 * 获取详细地址(丌要包含省市区县) 
	 *
	 * @return address - 详细地址(丌要包含省市区县) 
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * 设置详细地址(丌要包含省市区县) 
	 *
	 * @param address 详细地址(丌要包含省市区县) 
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
	 * 获取移劢电话，最多 2 个用/隔开
	 *
	 * @return mobile - 移劢电话，最多 2 个用/隔开
	 */
	public String getMobile()
	{
		return mobile;
	}

	/**
	 * 设置移劢电话，最多 2 个用/隔开
	 *
	 * @param mobile 移劢电话，最多 2 个用/隔开
	 */
	public void setMobile(String mobile)
	{
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * 获取寄件人或收件人姓名(最多 15 个汉字)
	 *
	 * @return name - 寄件人或收件人姓名(最多 15 个汉字)
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * 设置寄件人或收件人姓名(最多 15 个汉字)
	 *
	 * @param name 寄件人或收件人姓名(最多 15 个汉字)
	 */
	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 获取固定电话，包括区号、电话号码及分机号
	 *
	 * @return phone - 固定电话，包括区号、电话号码及分机号
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * 设置固定电话，包括区号、电话号码及分机号
	 *
	 * @param phone 固定电话，包括区号、电话号码及分机号
	 */
	public void setPhone(String phone)
	{
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * 获取寄件人或收件人邮编
	 *
	 * @return postcode - 寄件人或收件人邮编
	 */
	public String getPostcode()
	{
		return postcode;
	}

	/**
	 * 设置寄件人或收件人邮编
	 *
	 * @param postcode 寄件人或收件人邮编
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
}