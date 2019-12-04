package com.battcn.service.system;

import com.battcn.entity.Num;
import com.battcn.entity.NumExample;
import com.battcn.service.BaseService;
import com.github.pagehelper.PageInfo;


public interface NumService {

	
	PageInfo<Num> getList();

	Num getNum(Long id);

	Integer editNum(Num record);

	Integer addNum(Num num);

    Num get(String agentlevel);

	Num gets(String merType);
}
