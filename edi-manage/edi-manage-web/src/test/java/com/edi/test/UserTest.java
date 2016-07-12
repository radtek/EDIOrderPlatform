package com.edi.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.edi.manage.pojo.EdiUser;
import com.edi.manage.pojo.Item;
import com.edi.manage.pojo.Receiver;
import com.edi.manage.pojo.Requestorder;
import com.edi.manage.pojo.Sender;
import com.edi.manage.service.EdiUserService;

public class UserTest
{

	EdiUserService edi;

	@Before
	public void setUp() throws Exception
	{
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.setValidating(false);
		context.load("classpath:spring/applicationContext*.xml");
		context.refresh();
		edi = context.getBean(EdiUserService.class);
	}

	@Test
	public void Test_ById()
	{
		for (EdiUser u : edi.querByList())
		{
			List<Requestorder> r = u.getRequestorders();

			if (r == null)
			{
				System.out.println(11);
			}
			else
			{
				for (Requestorder requestorder : r)
				{
					Item item = requestorder.getItem();
					if (item != null)
					{
						System.out.println(item.getUid());
					}
					else
					{
						System.out.println(111);
					}

					Receiver receiver = requestorder.getReceiver();
					if (receiver != null)
					{
						System.out.println(receiver.getUid());
					}
					else
					{
						System.out.println(111);
					}
					Sender sender = requestorder.getSender();
					if (sender != null)
					{
						System.out.println(sender.getUid());
					}
					else
					{
						System.out.println(1111);
					}
				}
			}

		}
	}
}
