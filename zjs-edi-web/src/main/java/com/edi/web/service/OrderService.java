package com.edi.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edi.commcn.httpclientapi.bean.HttpResult;
import com.edi.web.bean.EdiUser;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class OrderService
{

	@Autowired
	private EdiUserService ediService;

	private static final XmlMapper XMLMAPPER = new XmlMapper();

	public HttpResult saveOrder(String order, String ip)
	{
		EdiUser edi = new EdiUser();
		edi.setIp(ip);

		HttpResult result = new HttpResult();

		try
		{
			List<EdiUser> ediList = ediService.queryListByWhere(edi);
			if (ediList.size() == 0)
			{
				result.setCode(404);
				result.setBody("IP 白名单 未找到改IP :" + ip);
			}

			String userXML = XMLMAPPER.writeValueAsString(ediList.get(0));

		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
}
