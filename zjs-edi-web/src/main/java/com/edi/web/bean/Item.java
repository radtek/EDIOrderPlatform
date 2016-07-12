package com.edi.web.bean;

public class Item extends BasePojo
{
	/**
	 * id
	 */
	private Long id;

	/**
	 * 用户id
	 */
	private Long uid;

	/**
	 * 商品总品名：品名*数量|…|品名*数量 
	 */
	private String itemname;

	/**
	 * 商品数量
	 */
	private String itemnumber;

	/**
	 * 商品价值
	 */
	private String itemvalue;

	/**
	 * 商品体积
	 */
	private String itemvolume;

	/**
	 * 总重量（KG 精度.00） 
	 */
	private String itemweight;

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
	 * 获取商品总品名：品名*数量|…|品名*数量 
	 *
	 * @return itemname - 商品总品名：品名*数量|…|品名*数量 
	 */
	public String getItemname()
	{
		return itemname;
	}

	/**
	 * 设置商品总品名：品名*数量|…|品名*数量 
	 *
	 * @param itemname 商品总品名：品名*数量|…|品名*数量 
	 */
	public void setItemname(String itemname)
	{
		this.itemname = itemname == null ? null : itemname.trim();
	}

	/**
	 * 获取商品数量
	 *
	 * @return itemnumber - 商品数量
	 */
	public String getItemnumber()
	{
		return itemnumber;
	}

	/**
	 * 设置商品数量
	 *
	 * @param itemnumber 商品数量
	 */
	public void setItemnumber(String itemnumber)
	{
		this.itemnumber = itemnumber == null ? null : itemnumber.trim();
	}

	/**
	 * 获取商品价值
	 *
	 * @return itemvalue - 商品价值
	 */
	public String getItemvalue()
	{
		return itemvalue;
	}

	/**
	 * 设置商品价值
	 *
	 * @param itemvalue 商品价值
	 */
	public void setItemvalue(String itemvalue)
	{
		this.itemvalue = itemvalue == null ? null : itemvalue.trim();
	}

	/**
	 * 获取商品体积
	 *
	 * @return itemvolume - 商品体积
	 */
	public String getItemvolume()
	{
		return itemvolume;
	}

	/**
	 * 设置商品体积
	 *
	 * @param itemvolume 商品体积
	 */
	public void setItemvolume(String itemvolume)
	{
		this.itemvolume = itemvolume == null ? null : itemvolume.trim();
	}

	/**
	 * 获取总重量（KG 精度.00） 
	 *
	 * @return itemweight - 总重量（KG 精度.00） 
	 */
	public String getItemweight()
	{
		return itemweight;
	}

	/**
	 * 设置总重量（KG 精度.00） 
	 *
	 * @param itemweight 总重量（KG 精度.00） 
	 */
	public void setItemweight(String itemweight)
	{
		this.itemweight = itemweight == null ? null : itemweight.trim();
	}
}
