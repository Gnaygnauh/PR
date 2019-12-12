package com.Service;

import java.util.Map;

public interface PersonService {
	/**
	 * 查询总的人数
	 */
	Map<String, String> SelectPersonCount();
	
	/**
	 * 添加人
	 */
	Map<String, String> AddPerson();
}
