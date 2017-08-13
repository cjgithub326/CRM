/**
 * 
 */
package com.hik.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hik.service.UserService;

/**
 * @ClassName: UserController
 * @Description: 用户Controller层
 * @author jed
 * @date 2017年8月13日上午11:54:35
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
}
