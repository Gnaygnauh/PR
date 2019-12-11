/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.model
 *
 *    Filename:    Role.java
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
 *    Create at:   2019年12月4日 下午3:59:09
 *
 *    Revision:
 *
 *    2019年12月4日 下午3:59:09
 *        - first revision
 *
 *****************************************************************/
package com.model;

/**
 * @ClassName Role
 * @Description TODO(角色实体)
 * @author Administrator
 * @Date 2019年12月4日 下午3:59:09
 * @version 1.0.0
 */

public class Role {

	// 角色id
	private int rid;
	// 角色名
	private String rname;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

}
