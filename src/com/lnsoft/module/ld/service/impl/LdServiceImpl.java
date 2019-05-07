package com.lnsoft.module.ld.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lnsoft.commons.ldConfig.HdfsReadFile;
import com.lnsoft.module.ld.mapper.LdMapper;
import com.lnsoft.module.ld.pojo.Ldvisit;
import com.lnsoft.module.ld.service.LdService;
@WebService
@Service
public class LdServiceImpl implements LdService {

	@Autowired
	private LdMapper ldMapper;
	/**
	 * hdfs读取
	 */
	@Override
	public ArrayList<String> readFileBydate(String date) {
		return HdfsReadFile.readFileByDate(date);
	}

	// jianting
	@Transactional(value = "mybatis_transactionManager", //
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertLdVisit(HashMap<String, Object> visitMap) {
		ldMapper.insertLdVisit(visitMap);

	}

	@Override
	public HashMap<String, Object> queryLdVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Ldvisit> list = ldMapper.queryLdVisitAll();
		PageInfo<Ldvisit> pi = new PageInfo<>(list);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return map;
	}


}
