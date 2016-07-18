package com.edi.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edi.manage.mapper.EdiUserMapper;
import com.edi.manage.pojo.EdiUser;
import com.edi.manage.pojo.Receiver;
import com.edi.manage.pojo.Requestorder;
import com.edi.manage.pojo.Sender;
import com.edi.manage.service.base.BaseService;

@Service
public class EdiUserService extends BaseService<EdiUser>
{
	@Autowired
	private EdiUserMapper mapper;

	@Autowired
	private ItemService itemService;

	@Autowired
	private ReceiverService receiverService;

	@Autowired
	private RequestorderService requestorderService;

	@Autowired
	private SenderService senderService;

	public List<EdiUser> querByList()
	{
		return mapper.querByList();
	}

	public List<EdiUser> querById(Long id)
	{
		return mapper.querById(id);
	}

	public List<EdiUser> querByIp(String ip)
	{
		return mapper.querByIp(ip);
	}

	public void saveEdiUsers(EdiUser e)
	{

		this.saveSelective(e);

		List<Requestorder> rList = e.getRequestorders();
		if (rList.size() > 0)
		{
			for (Requestorder requestorder : rList)
			{
				requestorder.setUid(e.getId());
				requestorderService.saveSelective(requestorder);

				/*
				 * Item item = requestorder.getItem();
				 * System.out.println(requestorder.getUid());
				 * item.setUid(requestorder.getUid());
				 * itemService.saveSelective(item);
				 */
				Receiver re = requestorder.getReceiver();
				re.setUid(requestorder.getUid());
				receiverService.saveSelective(re);

				Sender sender = requestorder.getSender();
				sender.setUid(requestorder.getUid());
				senderService.saveSelective(sender);
			}

		}

	}

}
