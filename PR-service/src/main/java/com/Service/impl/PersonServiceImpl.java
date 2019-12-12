package com.Service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.Service.PersonService;
import com.mapper.PersonMapper;
@Service("personService")
public class PersonServiceImpl implements PersonService {
 
	@Autowired
	private PersonMapper personMapper;
	@Resource
	private RedisTemplate redisTemplate;
	
	@Override
	public Map<String, String> SelectPersonCount() {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();
		//先到缓存中读取
		System.out.println("进入");
		String pCount=(String) redisTemplate.opsForValue().get("count");
		
		//有就拿出 没有就到服务器里面去拿
		if(pCount==null) {
			System.out.println("redis有");
			pCount=String.valueOf(personMapper.SelectPersonCount());
			System.out.println(pCount);
			redisTemplate.opsForValue().set("count", pCount,1,TimeUnit.HOURS);
			map.put("abbb",pCount);
		}else {
			map.put("abbb",pCount);
		}
		return map;
	}

	@Override
	public Map<String, String> AddPerson() {
		// TODO Auto-generated method stub
		return null;
	}

}
