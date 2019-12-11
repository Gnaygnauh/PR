/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.Service.impl
 *
 *    Filename:    SetRoleServiceImpl.java
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
 *    Create at:   2019年12月4日 下午4:25:34
 *
 *    Revision:
 *
 *    2019年12月4日 下午4:25:34
 *        - first revision
 *
 *****************************************************************/
package com.Service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Service.SetRoleService;
import com.github.pagehelper.PageHelper;
import com.mapper.SetRoleMapper;
import com.model.Role;
import com.model.User;

/**
 * @ClassName SetRoleServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2019年12月4日 下午4:25:34
 * @version 1.0.0
 */
@Service
public class SetRoleServiceImpl implements SetRoleService {

	@Autowired
	private SetRoleMapper setRoleMapper;

	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see com.Service.SetRoleService#selectRoles()
	 */
	@Override
	public List<Role> selectRoles() {
		// TODO Auto-generated method stub
		return setRoleMapper.selectRoles();
	}

	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see com.Service.SetRoleService#updateRoleByUid(int)
	 */
	@Override
	@Transactional
	public Map<String, Object> updateRoleByUid(int[] uids, int rid) {
		// TODO Auto-generated method stub
		Map<String, Object> msg = new HashMap<String, Object>();
		int result = setRoleMapper.updateRoleByUid(uids, rid);
		if (result >= 1) {
			msg.put("msg", 1);
		} else {
			msg.put("msg", 0);
		}
		return msg;
	}

	/*
	 * (非 Javadoc) Description:
	 * 
	 * @see com.Service.SetRoleService#selectUser(int, int)
	 */
	@Override
	public List<User> selectUser(int start, int size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(start, size);
		List<User> luser = setRoleMapper.selectUsers();
		return luser;
	}

}
