package com.mapper;

public interface PersonMapper {

	/**
	 * 查询总的人数
	 */
	int SelectPersonCount();
	
	/**
	 * 添加人
	 */
	int AddPerson();
}
