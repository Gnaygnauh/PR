/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.setrole.controller
 *
 *    Filename:    SetRoleController.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     Administrator
 *
 *    @version:    1.0.0
 *
 *    Create at:   2019年12月4日 下午3:49:01
 *
 *    Revision:
 *
 *    2019年12月4日 下午3:49:01
 *        - first revision
 *
 *****************************************************************/
package com.setrole.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.SetRoleService;
import com.model.Role;
import com.model.User;

/**
 * @ClassName SetRoleController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2019年12月4日 下午3:49:01
 * @version 1.0.0
 */
@Controller
public class SetRoleController {

	@Autowired
	private SetRoleService setRoleService;

	/**
	 * 展示角色 设置权限
	 */
	@RequestMapping("showRoles")
	@ResponseBody
	public List<Role> showRoles() {
//		System.out.println(setRoleService.selectRoles().size());
		return setRoleService.selectRoles();
	}

	/**
	 * 展示角色 设置权限
	 */
	@RequestMapping("showUsers")
	@ResponseBody
	public List<User> showUsers(@RequestParam("page") int start, @RequestParam("rows") int size) {
//		System.out.println(setRoleService.selectUser().size());
		return setRoleService.selectUser(start, size);
	}

	/**
	 * 
	 * @Description (修改权限的提交)
	 * @return 0失败，1成功
	 */
	@RequestMapping("commitPermission")
	@ResponseBody
	public Map<String, Object> commitPermission(@RequestParam("uids") int[] uids, @RequestParam("rid") int rid) {

		return setRoleService.updateRoleByUid(uids, rid);
	}

}
