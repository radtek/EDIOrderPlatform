package com.edi.manage.mapper;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.edi.manage.pojo.Item;

public interface ItemMapper extends Mapper<Item>
{
	public List<Item> querybyuid(String id);
}