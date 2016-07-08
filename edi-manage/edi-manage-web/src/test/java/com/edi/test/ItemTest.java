package com.edi.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.edi.manage.pojo.Item;
import com.edi.manage.service.ItemService;

public class ItemTest
{
	ItemService edi;

	@Before
	public void setUp() throws Exception
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.setValidating(false);
		context.load("classpath:spring/applicationContext*.xml");
		context.refresh();
		edi = context.getBean(ItemService.class);
	}

	@Test
	public void Test_1()
	{
		List<Item> list = edi.querybyuid("3");
		for (Item item : list)
		{
			System.out.println(item.getUid());
		}

	}

}
