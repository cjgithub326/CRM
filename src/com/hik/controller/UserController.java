/**
 * 
 */
package com.hik.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hik.entity.PageBean;
import com.hik.entity.SaleChance;
import com.hik.entity.User;
import com.hik.service.UserService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.processors.JsDateJsonBeanProcessor;

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
	
	/**
	 * @MethodName: login
	 * @Description: �û���¼
	 * @author jed
	 * @date 2017��8��19������4:10:42
	 * @param @param user
	 * @param @param request
	 * @param @return    
	 * @return String    ��������
	 * @param user
	 * @param request
	 * @return
	 *
	 */
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
	
	/**
	 * @MethodName: list
	 * @Description: ��ҳ������ѯ�û�
	 * @author jed
	 * @date 2017��8��19������4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param user
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param user
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,User user,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", StringUtil.formatLike(user.getUserName()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<User> userList = userService.find(map);
		Long total = userService.getTotal(map);
		JSONObject result = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(userList)){
			jsonArray = JSONArray.fromObject(userList);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: ��ӻ����޸��û�
	 * @author jed
	 * @date 2017��8��19������9:32:19
	 * @param @param user
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param user
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(User user,HttpServletResponse response) throws Exception{
		long resultTotal=0L;
		if(user.getId()==null){//���
			resultTotal = userService.save(user);
		}else{//����
			resultTotal = userService.update(user);
		}
		JSONObject result = new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result); 
		return null;
	}
	
	/**
	 * 
	 * @MethodName: delete
	 * @Description: ɾ���û�
	 * @author jed
	 * @date 2017��8��19������10:56:44
	 * @param @param ids
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response) throws Exception{
		String[] idsStr = ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			userService.delete(Integer.parseInt(idsStr[i]));
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: customerManagerComboList
	 * @Description: ��ȡ�ͻ�������Ϣ �����������õ�
	 * @author jed
	 * @date 2017��8��27������10:47:02
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/customerManagerComboList")
	public String customerManagerComboList(HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleName", "�ͻ�����");
		List<User> userList= userService.find(map);
		JSONArray row = JSONArray.fromObject(userList);
		ResponseUtil.write(response, row);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: modifyPassword
	 * @Description: �޸��û����� 
	 * @author jed
	 * @date 2017��12��3������10:31:13
	 * @param @param id
	 * @param @param newPassword
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param id
	 * @param newPassword
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/modifyPassword")
	public String modifyPassword(Integer id,String newPassword,HttpServletResponse response) throws Exception{
		User user = new User();
		user.setId(id);
		user.setPassword(newPassword);
		int resultTotal = userService.update(user);
		JSONObject result = new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result); 
		return null;
	}
	
	/**
	 * 
	 * @MethodName: logout
	 * @Description: �û�ע��
	 * @author jed
	 * @date 2017��12��3������10:33:53
	 * @param @param session
	 * @param @return    
	 * @return String    ��������
	 * @param session
	 * @return
	 *
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate(); //sessionʧЧ
		return "redirect:/login.jsp";  //�ض��򵽵�¼ҳ��
	}
	
}
