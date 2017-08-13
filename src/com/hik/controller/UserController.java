/**
 * 
 */
package com.hik.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hik.entity.User;
import com.hik.service.UserService;

/**
 * @ClassName: UserController
 * @Description: �û�Controller��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User resultUser = userService.login(user);
		if(resultUser==null){//��¼ʧ��
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "�û������������");
			return "login";
		}else{//����ɹ�
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", resultUser);
			return "redirect:/main.jsp";
		}
	}
}
