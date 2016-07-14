package com.edi.manage.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
* <p>Title: Item </p>
* <p>@Description: 商品信息类 </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年7月13日 下午3:08:19 
*/
public class Item extends BasePojo
{
	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

	/**
	 * 用户id
	 */
	@JsonIgnore
	private Long uid;

	/**
	 * 商品总品名：品名*数量|…|品名*数量 
	 */
	@Column(name = "itemName")
	private String itemName;

	/**
	 * 商品数量
	 */
	@Column(name = "itemNumber")
	private String itemNumber;

	/**
	 * 商品价值
	 */
	@Column(name = "itemValue")
	private String itemValue;

	/**
	 * 商品体积
	 */
	@Column(name = "itemVolume")
	private String itemVolume;

	/**
	 * 总重量（KG 精度.00） 
	 */
	@Column(name = "itemWeight")
	private String itemWeight;

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
	 * @return the 用户id
	 */
	public Long getUid()
	{
		return uid;
	}

	/**
	 * @param 用户id the uid to set
	 */
	public void setUid(Long uid)
	{
		this.uid = uid;
	}

	/**
	 * @return the 商品总品名：品名数量|…|品名数量
	 */
	public String getItemName()
	{
		return itemName;
	}

	/**
	 * @param 商品总品名：品名数量|…|品名数量 the itemName to set
	 */
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	/**
	 * @return the 商品数量
	 */
	public String getItemNumber()
	{
		return itemNumber;
	}

	/**
	 * @param 商品数量 the itemNumber to set
	 */
	public void setItemNumber(String itemNumber)
	{
		this.itemNumber = itemNumber;
	}

	/**
	 * @return the 商品价值
	 */
	public String getItemValue()
	{
		return itemValue;
	}

	/**
	 * @param 商品价值 the itemValue to set
	 */
	public void setItemValue(String itemValue)
	{
		this.itemValue = itemValue;
	}

	/**
	 * @return the 商品体积
	 */
	public String getItemVolume()
	{
		return itemVolume;
	}

	/**
	 * @param 商品体积 the itemVolume to set
	 */
	public void setItemVolume(String itemVolume)
	{
		this.itemVolume = itemVolume;
	}

	/**
	 * @return the 总重量（KG精度.00）
	 */
	public String getItemWeight()
	{
		return itemWeight;
	}

	/**
	 * @param 总重量（KG精度.00） the itemWeight to set
	 */
	public void setItemWeight(String itemWeight)
	{
		this.itemWeight = itemWeight;
	}

}