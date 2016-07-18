package com.edi.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.edi.commcn.httpclientapi.bean.HttpResult;
import com.edi.commcn.httpclientapi.service.ApiService;
import com.edi.manage.pojo.EdiUser;
import com.edi.web.service.base.BaseService;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EdiUserService extends BaseService<EdiUser>
{
	private static final ObjectMapper ObjectMapper = new ObjectMapper();

	@Override
	public String getFunction()
	{
		return "eiduser";
	}

	@Value("${restful.url}")
	private String url;

	@Autowired
	private ApiService aipService;

	public List<EdiUser> queryIp(EdiUser ip) throws Exception
	{
		HttpResult result = aipService.doPost(url + "/" + this.getFunction() + "/queryIp", ip);
		if (result.getCode() != 200) { throw new Exception("为查询到 配置文件"); }

		JavaType javaType = ObjectMapper.getTypeFactory().constructParametricType(ArrayList.class,
				EdiUser.class);
		return (List<EdiUser>) ObjectMapper.readValue(result.getBody(), javaType);
	}

}
