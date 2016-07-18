package com.edi.web.service;

import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edi.commcn.httpclientapi.bean.HttpResult;
import com.edi.dom4j.OrderToEdiOrder;
import com.edi.manage.pojo.EdiUser;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class OrderService
{

	@Autowired
	private EdiUserService ediService;

	private static final XmlMapper XMLMAPPER = new XmlMapper();

	public HttpResult saveOrderInputStream(InputStream is, String ip)
	{

		HttpResult result = new HttpResult();// 响应数据
		String ediString = null;// 数据转换后的 要发送到EDI的数据
		String userXML = null;// 用户数据

		// 获取用户配置信息
		result = getEdiUser(ip, userXML);
		if (result != null) { return result; }

		String order = null;// 订单源数据
		// 获取 订单源数据 订单源数据
		result = getOrder(order, is, userXML, ip);
		if (result != null) { return result; }

		try
		{
			ediString = OrderToEdiOrder.outEdiOrder(order, userXML);
		}
		catch (Exception e)
		{
			result.setCode(500);
			result.setBody(" 转换数据格式出错 :  ip =" + ip + "  异常信息：" + e.getMessage());
			return result;
		}

		// TODO ediString 将转换的数据发送EDI数据库

		result.setCode(200);
		result.setBody(" 处理成功 ");
		return result;
	}

	public HttpResult saveOrder(String order, String ip)
	{

		HttpResult result = new HttpResult();// 响应数据
		String ediString = null;// 数据转换后的 要发送到EDI的数据
		String userXML = null;// 用户数据

		// 获取用户配置信息
		result = getEdiUser(ip, userXML);
		if (result != null) { return result; }

		try
		{
			ediString = OrderToEdiOrder.outEdiOrder(order, userXML);
		}
		catch (Exception e)
		{
			result.setCode(500);
			result.setBody(" 转换数据格式出错 :  ip =" + ip + "  异常信息：" + e.getMessage());
			return result;
		}

		// TODO ediString 将转换的数据发送EDI数据库

		result.setCode(200);
		result.setBody(" 处理成功 ");
		return result;
	}

	/**
	 * 获取 用户配置信息
	 * 
	 * @param ip  用户IP 
	 * @param userXML 
	 * @return  HttpResult =null  正常 ！= 异常
	 */
	private HttpResult getEdiUser(String ip, String userXML)
	{
		HttpResult result = new HttpResult();

		try
		{
			// TODO 当前缺少 redis 缓存层 key:ip val:userXML 先找缓存 找不到缓存 在 后台获取
			EdiUser edi = new EdiUser();
			edi.setIp(ip);
			List<EdiUser> ediList = ediService.queryIp(edi);
			if (ediList == null || ediList.size() == 0)
			{
				result.setCode(404);
				result.setBody("IP 白名单 未找到改IP :" + ip);
				return result;
			}
			userXML = XMLMAPPER.writeValueAsString(ediList.get(0));
			result = null;
		}
		catch (Exception e)
		{
			result.setCode(500);
			result.setBody(" 获取用户配置信息出错 :  ip =" + ip + "  异常信息：" + e.getMessage());
		}
		return result;
	}

	/**
	 *  获得  订单源数据   用户配置XML 根节点
	 * 
	 * @param order  订单源数据
	 * @param ediUserRoot 用户配置XML 根节点
	 * @return
	 */
	private HttpResult getOrder(String order, InputStream is, String userXML, String ip)
	{
		try
		{
			Document ediUserDocument = DocumentHelper.parseText(userXML);// 用户配置数据
			Element ediUserRoot = ediUserDocument.getRootElement();
			String encoding = ediUserRoot.element("Encoding").getText();
			order = IOUtils.toString(is, encoding);
		}
		catch (Exception e)
		{
			HttpResult result = new HttpResult();
			result.setCode(500);
			result.setBody(" 字节流转码异常或用户配置数据转换异常 :  ip =" + ip + "  异常信息：" + e.getMessage());
			return result;
		}
		return null;
	}

}
