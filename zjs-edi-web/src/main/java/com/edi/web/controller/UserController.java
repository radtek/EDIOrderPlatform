package com.edi.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edi.web.bean.UserListForm;
import com.edi.web.controller.base.BaseController;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController extends BaseController<UserListForm>
{

}
