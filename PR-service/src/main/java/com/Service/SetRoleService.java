/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.Service
 *
 *    Filename:    SetRoleService.java
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
 *    Create at:   2019年12月4日 下午4:23:14
 *
 *    Revision:
 *
 *    2019年12月4日 下午4:23:14
 *        - first revision
 *
 *****************************************************************/
package com.Service;

import java.util.List;
import java.util.Map;

import com.model.Role;
import com.model.User;

/**
 * @ClassName SetRoleService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2019年12月4日 下午4:23:14
 * @version 1.0.0
 */
public interface SetRoleService {

	/**
	 * 
	 * @Description (查看所有角色)
	 * @return 所有角色的聚合
	 */
	List<Role> selectRoles();

	/**
	 * 
	 * @param size
	 * @param start
	 * @Description (查看所有用户的基本信息)
	 * @return 所有用户的聚合
	 */
	List<User> selectUser(int start, int size);

	/**
	 * 
	 * @param uid
	 * @param rid
	 * @Description (修改权限)
	 * @return
	 */
	Map<String, Object> updateRoleByUid(int[] uids, int rid);

}
