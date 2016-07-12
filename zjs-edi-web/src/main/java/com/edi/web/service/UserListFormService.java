package com.edi.web.service;

import org.springframework.stereotype.Service;

import com.edi.web.bean.UserListForm;
import com.edi.web.service.base.BaseService;

@Service
public class UserListFormService extends BaseService<UserListForm>
{

	@Override
	public String getFunction()
	{
		return "1";
	}
}
