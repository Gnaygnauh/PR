/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.setRoleMapper
 *
 *    Filename:    setRoleMapper.java
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
 *    Create at:   2019年12月4日 下午4:54:17
 *
 *    Revision:
 *
 *    2019年12月4日 下午4:54:17
 *        - first revision
 *
 *****************************************************************/
package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Role;
import com.model.User;

/**
 * @ClassName setRoleMapper
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2019年12月4日 下午4:54:17
 * @version 1.0.0
 */

public interface SetRoleMapper {

	/**
	 * 
	 * @Description (查询所有用户)
	 * @return
	 */
	List<User> selectUsers();

	/**
	 * @Description (查询所有的角色)
	 * @return
	 */
	List<Role> selectRoles();

	/**
	 * @Description (对数据库user表做修改)
	 * @param uids
	 * @param rid
	 * @return
	 */
	int updateRoleByUid(@Param("uids") int[] uids, @Param("rid") int rid);

}
