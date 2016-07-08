package com.edi.manage.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Requestorder extends BasePojo
{
	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 发货人信息
	 */
	@Transient
	private Sender sender;

	/**
	 * @return the 发货人信息
	 */
	public Sender getSender()
	{
		return sender;
	}

	/**
	 * @param 发货人信息 the sender to set
	 */
	public void setSender(Sender sender)
	{
		this.sender = sender;
	}

	/**
	 * 收件人信息
	 */
	@Transient
	public Receiver receiver;

	/**
	 * @return the 收件人信息
	 */
	public Receiver getReceiver()
	{
		return receiver;
	}

	/**
	 * @param 收件人信息 the receiver to set
	 */
	public void setReceiver(Receiver receiver)
	{
		this.receiver = receiver;
	}

	/**
	 * 商品信息
	 */
	@Transient
	private Item item;

	/**
	 * @return the 商品信息
	 */
	public Item getItem()
	{
		return item;
	}

	/**
	 * @param 商品信息 the item to set
	 */
	public void setItem(Item item)
	{
		this.item = item;
	}

	/**
	 * 用户id
	 */
	private Long uid;

	/**
	 * 代收金额（代收订单时，金额必须>0）
	 */
	private String codamount;

	/**
	 * 数据标识(用于分仓发货,C2C 类客户省略) 
	 */
	private String dataflag;

	/**
	 * 订单标识
	 */
	private String flag;

	/**
	 * 保险费(暂丌使用)
	 */
	private String insurancevalue;

	/**
	 * 商品总品名：品名*数量|…|品名*数量 
	 */
	private String itemsname;

	/**
	 * 商品总数量。根据您的发货单位统计数量
	 */
	private String itemsnumber;

	/**
	 * 商品尺寸：长*宽*高*件数,
	 */
	private String itemsvolume;

	/**
	 * 总重量（KG 精度.00） 
	 */
	private String itemsweight;

	/**
	 * 客户标识(宅急送提供)
	 */
	private String logisticproviderid;

	/**
	 * 快递单号(宅急送物流单号) 
	 */
	private String mailno;

	/**
	 * 客户单号（物流订单号）
	 */
	private String orderno;

	/**
	 * 重要提示
	 */
	private String remark;

	/**
	 * 物流子订单号，多个子订单号逗号隔开
	 */
	private String suborderno;

	/**
	 * 业务交易号（财务对账使用）
	 */
	private String tradeno;

	/**
	 * 代收订单 0、普通正向 1、退货订单 2 
	 */
	private String type;

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
	 * 获取代收金额（代收订单时，金额必须>0）
	 *
	 * @return codamount - 代收金额（代收订单时，金额必须>0）
	 */
	public String getCodamount()
	{
		return codamount;
	}

	/**
	 * 设置代收金额（代收订单时，金额必须>0）
	 *
	 * @param codamount 代收金额（代收订单时，金额必须>0）
	 */
	public void setCodamount(String codamount)
	{
		this.codamount = codamount == null ? null : codamount.trim();
	}

	/**
	 * 获取数据标识(用于分仓发货,C2C 类客户省略) 
	 *
	 * @return dataflag - 数据标识(用于分仓发货,C2C 类客户省略) 
	 */
	public String getDataflag()
	{
		return dataflag;
	}

	/**
	 * 设置数据标识(用于分仓发货,C2C 类客户省略) 
	 *
	 * @param dataflag 数据标识(用于分仓发货,C2C 类客户省略) 
	 */
	public void setDataflag(String dataflag)
	{
		this.dataflag = dataflag == null ? null : dataflag.trim();
	}

	/**
	 * 获取订单标识
	 *
	 * @return flag - 订单标识
	 */
	public String getFlag()
	{
		return flag;
	}

	/**
	 * 设置订单标识
	 *
	 * @param flag 订单标识
	 */
	public void setFlag(String flag)
	{
		this.flag = flag == null ? null : flag.trim();
	}

	/**
	 * 获取保险费(暂丌使用)
	 *
	 * @return insurancevalue - 保险费(暂丌使用)
	 */
	public String getInsurancevalue()
	{
		return insurancevalue;
	}

	/**
	 * 设置保险费(暂丌使用)
	 *
	 * @param insurancevalue 保险费(暂丌使用)
	 */
	public void setInsurancevalue(String insurancevalue)
	{
		this.insurancevalue = insurancevalue == null ? null : insurancevalue.trim();
	}

	/**
	 * 获取商品总品名：品名*数量|…|品名*数量 
	 *
	 * @return itemsname - 商品总品名：品名*数量|…|品名*数量 
	 */
	public String getItemsname()
	{
		return itemsname;
	}

	/**
	 * 设置商品总品名：品名*数量|…|品名*数量 
	 *
	 * @param itemsname 商品总品名：品名*数量|…|品名*数量 
	 */
	public void setItemsname(String itemsname)
	{
		this.itemsname = itemsname == null ? null : itemsname.trim();
	}

	/**
	 * 获取商品总数量。根据您的发货单位统计数量
	 *
	 * @return itemsnumber - 商品总数量。根据您的发货单位统计数量
	 */
	public String getItemsnumber()
	{
		return itemsnumber;
	}

	/**
	 * 设置商品总数量。根据您的发货单位统计数量
	 *
	 * @param itemsnumber 商品总数量。根据您的发货单位统计数量
	 */
	public void setItemsnumber(String itemsnumber)
	{
		this.itemsnumber = itemsnumber == null ? null : itemsnumber.trim();
	}

	/**
	 * 获取商品尺寸：长*宽*高*件数,
	 *
	 * @return itemsvolume - 商品尺寸：长*宽*高*件数,
	 */
	public String getItemsvolume()
	{
		return itemsvolume;
	}

	/**
	 * 设置商品尺寸：长*宽*高*件数,
	 *
	 * @param itemsvolume 商品尺寸：长*宽*高*件数,
	 */
	public void setItemsvolume(String itemsvolume)
	{
		this.itemsvolume = itemsvolume == null ? null : itemsvolume.trim();
	}

	/**
	 * 获取总重量（KG 精度.00） 
	 *
	 * @return itemsweight - 总重量（KG 精度.00） 
	 */
	public String getItemsweight()
	{
		return itemsweight;
	}

	/**
	 * 设置总重量（KG 精度.00） 
	 *
	 * @param itemsweight 总重量（KG 精度.00） 
	 */
	public void setItemsweight(String itemsweight)
	{
		this.itemsweight = itemsweight == null ? null : itemsweight.trim();
	}

	/**
	 * 获取客户标识(宅急送提供)
	 *
	 * @return logisticproviderid - 客户标识(宅急送提供)
	 */
	public String getLogisticproviderid()
	{
		return logisticproviderid;
	}

	/**
	 * 设置客户标识(宅急送提供)
	 *
	 * @param logisticproviderid 客户标识(宅急送提供)
	 */
	public void setLogisticproviderid(String logisticproviderid)
	{
		this.logisticproviderid = logisticproviderid == null ? null : logisticproviderid.trim();
	}

	/**
	 * 获取快递单号(宅急送物流单号) 
	 *
	 * @return mailno - 快递单号(宅急送物流单号) 
	 */
	public String getMailno()
	{
		return mailno;
	}

	/**
	 * 设置快递单号(宅急送物流单号) 
	 *
	 * @param mailno 快递单号(宅急送物流单号) 
	 */
	public void setMailno(String mailno)
	{
		this.mailno = mailno == null ? null : mailno.trim();
	}

	/**
	 * 获取客户单号（物流订单号）
	 *
	 * @return orderno - 客户单号（物流订单号）
	 */
	public String getOrderno()
	{
		return orderno;
	}

	/**
	 * 设置客户单号（物流订单号）
	 *
	 * @param orderno 客户单号（物流订单号）
	 */
	public void setOrderno(String orderno)
	{
		this.orderno = orderno == null ? null : orderno.trim();
	}

	/**
	 * 获取重要提示
	 *
	 * @return remark - 重要提示
	 */
	public String getRemark()
	{
		return remark;
	}

	/**
	 * 设置重要提示
	 *
	 * @param remark 重要提示
	 */
	public void setRemark(String remark)
	{
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * 获取物流子订单号，多个子订单号逗号隔开
	 *
	 * @return suborderno - 物流子订单号，多个子订单号逗号隔开
	 */
	public String getSuborderno()
	{
		return suborderno;
	}

	/**
	 * 设置物流子订单号，多个子订单号逗号隔开
	 *
	 * @param suborderno 物流子订单号，多个子订单号逗号隔开
	 */
	public void setSuborderno(String suborderno)
	{
		this.suborderno = suborderno == null ? null : suborderno.trim();
	}

	/**
	 * 获取业务交易号（财务对账使用）
	 *
	 * @return tradeno - 业务交易号（财务对账使用）
	 */
	public String getTradeno()
	{
		return tradeno;
	}

	/**
	 * 设置业务交易号（财务对账使用）
	 *
	 * @param tradeno 业务交易号（财务对账使用）
	 */
	public void setTradeno(String tradeno)
	{
		this.tradeno = tradeno == null ? null : tradeno.trim();
	}

	/**
	 * 获取代收订单 0、普通正向 1、退货订单 2 
	 *
	 * @return type - 代收订单 0、普通正向 1、退货订单 2 
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * 设置代收订单 0、普通正向 1、退货订单 2 
	 *
	 * @param type 代收订单 0、普通正向 1、退货订单 2 
	 */
	public void setType(String type)
	{
		this.type = type == null ? null : type.trim();
	}
}