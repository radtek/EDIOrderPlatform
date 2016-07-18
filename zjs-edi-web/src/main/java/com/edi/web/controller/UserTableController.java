package com.edi.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edi.commcn.httpclientapi.bean.HttpResult;
import com.edi.manage.pojo.EdiUser;
import com.edi.web.controller.base.BaseController;
import com.edi.web.service.EdiUserService;

@RestController
@RequestMapping(value = "table", produces = "application/json;charset=utf-8")
public class UserTableController extends BaseController<EdiUser>
{
	@Autowired
	private EdiUserService ediUserService;

	/**
	 * 保存
	 * @param TbContentCategory
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "request", method = RequestMethod.POST)
	public ResponseEntity<HttpResult> saveContentCategory(HttpServletRequest request)
	{
		try
		{
			System.out.println();
			return ResponseEntity.ok(this.ediUserService.saveSelective(request.getParameterMap()));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
