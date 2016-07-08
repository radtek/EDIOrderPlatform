package com.edi.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edi.manage.mapper.EdiUserMapper;
import com.edi.manage.pojo.EdiUser;
import com.edi.manage.service.base.BaseService;

@Service
public class EdiUserService extends BaseService<EdiUser>
{
	@Autowired
	private EdiUserMapper mapper;

	public EdiUser queryByID(String id)
	{
		return mapper.queryByID(id);
	}

	public List<EdiUser> querByList()
	{
		return mapper.querByList();
	}
}
