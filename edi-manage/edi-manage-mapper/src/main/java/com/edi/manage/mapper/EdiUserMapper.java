package com.edi.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.mapper.common.Mapper;

import com.edi.manage.pojo.EdiUser;

public interface EdiUserMapper extends Mapper<EdiUser>
{

	public EdiUser queryByID(@Param("id") String id);

	public List<EdiUser> querByList();

}