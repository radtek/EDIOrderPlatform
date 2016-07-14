package com.edi.manage.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
* <p>Title: Receiver </p>
* <p>@Description: 收货人地址类 </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年7月13日 下午3:08:00 
*/
public class Receiver extends BasePojo
{
	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
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
	@Column(name = "postCode")
	private String postCode;

	/**
	 * 寄件或收件省（北京市、湖北省）
	 */
	private String prov;

	/**
	 * 用户ID
	 */
	@JsonIgnore
	private Long uid;

	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * @return the 详细地址(含省市区县)
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param 详细地址(含省市区县) the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @return the 寄件或收件市（北京市、宜昌市）
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param 寄件或收件市（北京市、宜昌市） the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * @return the 寄件或收件区县(如东城区、延庆县)
	 */
	public String getDistrict()
	{
		return district;
	}

	/**
	 * @param 寄件或收件区县(如东城区、延庆县) the district to set
	 */
	public void setDistrict(String district)
	{
		this.district = district;
	}

	/**
	 * @return the 移劢电话
	 */
	public String getMobile()
	{
		return mobile;
	}

	/**
	 * @param 移劢电话 the mobile to set
	 */
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	/**
	 * @return the 寄件人或收件人姓名
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param 寄件人或收件人姓名 the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the 固定电话
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * @param 固定电话 the phone to set
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/**
	 * @return the 邮编
	 */
	public String getPostCode()
	{
		return postCode;
	}

	/**
	 * @param 邮编 the postCode to set
	 */
	public void setPostCode(String postCode)
	{
		this.postCode = postCode;
	}

	/**
	 * @return the 寄件或收件省（北京市、湖北省）
	 */
	public String getProv()
	{
		return prov;
	}

	/**
	 * @param 寄件或收件省（北京市、湖北省） the prov to set
	 */
	public void setProv(String prov)
	{
		this.prov = prov;
	}

	/**
	 * @return the 用户ID
	 */
	public Long getUid()
	{
		return uid;
	}

	/**
	 * @param 用户ID the uid to set
	 */
	public void setUid(Long uid)
	{
		this.uid = uid;
	}

}