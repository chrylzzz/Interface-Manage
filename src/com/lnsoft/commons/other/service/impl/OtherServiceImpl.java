package com.lnsoft.commons.other.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsoft.commons.other.mapper.OtherMapper;
import com.lnsoft.commons.other.service.OtherService;

@Service
public class OtherServiceImpl implements OtherService{

	@Autowired
	private OtherMapper otherMapper;
	
	@Override
	public int queryCountByEMS() {
		return otherMapper.queryCountByEMS();
	}

	@Override
	public int queryCountByPMS() {
		return otherMapper.queryCountByPMS();
	}

	@Override
	public int queryCountByDDJC() {
		return otherMapper.queryCountByDDJC();
	}

	@Override
	public int queryCountByLD() {
		return otherMapper.queryCountByLD();
	}

	@Override
	public int queryCountByGZLB() {
		return otherMapper.queryCountByGZLB();
	}

	@Override
	public int queryCountByQXZHYJ() {
		return otherMapper.queryCountByQXZHYJ();
	}

	@Override
	public int queryCountBySBDZJC() {
		return otherMapper.queryCountBySBDZJC();
	}

}
