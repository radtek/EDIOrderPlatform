package com.edi.web.controller;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edi.commcn.httpclientapi.bean.HttpResult;
import com.edi.web.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController
{

	@Autowired
	private OrderService orderService;

	/**
	 * 下单
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<HttpResult> saveEntity(HttpServletRequest request)
	{
		HttpResult result = new HttpResult();

		String ip = "";
		if (request.getHeader("x-forwarded-for") == null) ip = request.getRemoteAddr();
		else ip = request.getHeader("x-forwarded-for");

		InputStream is = null;
		try
		{
			is = request.getInputStream();
		}
		catch (Exception e)
		{
			result.setBody("获取传输流失败");
			result.setCode(500);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
		}

		result = orderService.saveOrderInputStream(is, ip);

		return ResponseEntity.ok(result);

	}
}
