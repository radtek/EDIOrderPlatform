package com.edi.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edi.manage.mapper.ItemMapper;
import com.edi.manage.pojo.Item;
import com.edi.manage.service.base.BaseService;

@Service
public class ItemService extends BaseService<Item>
{

	@Autowired
	private ItemMapper itemMapper;

	public List<Item> querybyuid(String id)
	{
		return itemMapper.querybyuid(id);
	}

}
