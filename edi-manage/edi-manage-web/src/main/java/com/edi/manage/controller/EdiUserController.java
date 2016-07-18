package com.edi.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edi.manage.controller.base.BaseController;
import com.edi.manage.pojo.EdiUser;
import com.edi.manage.service.EdiUserService;

@RestController
@RequestMapping(value = "eiduser", produces = "application/json;charset=utf-8")
public class EdiUserController extends BaseController<EdiUserService, EdiUser>
{

	@Autowired
	private EdiUserService ediUserService;

	// 通用方法 满足不了需求的时候 可直接从写 改方法

	/**
	 * 保存 并保存关联项
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<EdiUser> saveContentCategory(EdiUser M)
	{
		try
		{
			ediUserService.saveEdiUsers(M);
			return ResponseEntity.ok(null);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

		}

	}

	/**
	 * 通过 ID 查询用户
	 * @return
	 */
	@Override
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<EdiUser> queryMByid(@PathVariable("id") Long id)
	{

		try
		{
			List<EdiUser> m = ediUserService.querById(id);
			return ResponseEntity.ok(m.get(0));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@RequestMapping(value = "queryIp", method = RequestMethod.POST, produces = "application/xml")
	public ResponseEntity<EdiUser> queryIp(@RequestParam("ip") String ip)
	{

		try
		{
			List<EdiUser> m = ediUserService.querByIp(ip);
			return ResponseEntity.ok(m.get(0));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
