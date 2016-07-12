package com.edi.manage.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
* <p>Title: EdiUser </p>
* <p>@Description:  </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年7月8日 下午1:51:56 
*/
@Table(name = "edi_user")
public class EdiUser extends BasePojo
{
	/**
	 * 用户名称
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	/**
	 * 下单信息
	 */
	@Transient
	private List<Requestorder> requestorders;

	/**
	 * @return the 下单信息
	 */
	public List<Requestorder> getRequestorders()
	{
		return requestorders;
	}

	/**
	 * @param 下单信息 the requestorders to set
	 */
	public void setRequestorders(List<Requestorder> requestorders)
	{
		this.requestorders = requestorders;
	}

	/**
	 * 白名单
	 */
	private String ip;

	/**
	 * 数据结构表ID
	 */
	private Integer xid;

	/**
	 * 数据类型 json/xml
	 */
	@Column(name = "DataType")
	private String datatype;

	/**
	 * EID 客户标识
	 */
	@Column(name = "ClientFlag")
	private String clientflag;

	/**
	 * EID 客户秘钥
	 */
	@Column(name = "VerifySeed")
	private String verifyseed;

	/**
	 * 分仓标识
	 */
	@Column(name = "DataFlag")
	private String dataflag;

	/**
	 * 用户类型  0标准 1定制
	 */
	@Column(name = "OrderType")
	private Integer ordertype;

	/**
	 * 更新时间
	 */
	@Column(name = "UpdateTime")
	private Date updatetime;

	/**
	 * 创建时间
	 */
	@Column(name = "RecordTime")
	private Date recordtime;

	/**
	 * 获取用户名称
	 *
	 * @return id - 用户名称
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * 设置用户名称
	 *
	 * @param id 用户名称
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 获取白名单
	 *
	 * @return ip - 白名单
	 */
	public String getIp()
	{
		return ip;
	}

	/**
	 * 设置白名单
	 *
	 * @param ip 白名单
	 */
	public void setIp(String ip)
	{
		this.ip = ip == null ? null : ip.trim();
	}

	/**
	 * 获取数据结构表ID
	 *
	 * @return xid - 数据结构表ID
	 */
	public Integer getXid()
	{
		return xid;
	}

	/**
	 * 设置数据结构表ID
	 *
	 * @param xid 数据结构表ID
	 */
	public void setXid(Integer xid)
	{
		this.xid = xid;
	}

	/**
	 * 获取数据类型 json/xml
	 *
	 * @return DataType - 数据类型 json/xml
	 */
	public String getDatatype()
	{
		return datatype;
	}

	/**
	 * 设置数据类型 json/xml
	 *
	 * @param datatype 数据类型 json/xml
	 */
	public void setDatatype(String datatype)
	{
		this.datatype = datatype == null ? null : datatype.trim();
	}

	/**
	 * 获取EID 客户标识
	 *
	 * @return ClientFlag - EID 客户标识
	 */
	public String getClientflag()
	{
		return clientflag;
	}

	/**
	 * 设置EID 客户标识
	 *
	 * @param clientflag EID 客户标识
	 */
	public void setClientflag(String clientflag)
	{
		this.clientflag = clientflag == null ? null : clientflag.trim();
	}

	/**
	 * 获取EID 客户秘钥
	 *
	 * @return VerifySeed - EID 客户秘钥
	 */
	public String getVerifyseed()
	{
		return verifyseed;
	}

	/**
	 * 设置EID 客户秘钥
	 *
	 * @param verifyseed EID 客户秘钥
	 */
	public void setVerifyseed(String verifyseed)
	{
		this.verifyseed = verifyseed == null ? null : verifyseed.trim();
	}

	/**
	 * 获取分仓标识
	 *
	 * @return DataFlag - 分仓标识
	 */
	public String getDataflag()
	{
		return dataflag;
	}

	/**
	 * 设置分仓标识
	 *
	 * @param dataflag 分仓标识
	 */
	public void setDataflag(String dataflag)
	{
		this.dataflag = dataflag == null ? null : dataflag.trim();
	}

	/**
	 * 获取用户类型  0标准 1定制
	 *
	 * @return OrderType - 用户类型  0标准 1定制
	 */
	public Integer getOrdertype()
	{
		return ordertype;
	}

	/**
	 * 设置用户类型  0标准 1定制
	 *
	 * @param ordertype 用户类型  0标准 1定制
	 */
	public void setOrdertype(Integer ordertype)
	{
		this.ordertype = ordertype;
	}

	/**
	 * 获取更新时间
	 *
	 * @return UpdateTime - 更新时间
	 */
	public Date getUpdatetime()
	{
		return updatetime;
	}

	/**
	 * 设置更新时间
	 *
	 * @param updatetime 更新时间
	 */
	public void setUpdatetime(Date updatetime)
	{
		this.updatetime = updatetime;
	}

	/**
	 * 获取创建时间
	 *
	 * @return RecordTime - 创建时间
	 */
	public Date getRecordtime()
	{
		return recordtime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param recordtime 创建时间
	 */
	public void setRecordtime(Date recordtime)
	{
		this.recordtime = recordtime;
	}

}