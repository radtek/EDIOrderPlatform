package com.edi.manage.mapper;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.edi.manage.pojo.EdiUser;

public interface EdiUserMapper extends Mapper<EdiUser>
{

	public List<EdiUser> querByList();

	public List<EdiUser> querById(Long id);

	public List<EdiUser> querByIp(String ip);

}