package com.edi.web.service;

import org.springframework.stereotype.Service;

import com.edi.manage.pojo.EdiUser;
import com.edi.web.service.base.BaseService;

@Service
public class EdiUserService extends BaseService<EdiUser>
{

	@Override
	public String getFunction()
	{
		return "eiduser";
	}

}
