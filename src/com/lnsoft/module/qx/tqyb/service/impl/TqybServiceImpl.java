package com.lnsoft.module.qx.tqyb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lnsoft.module.qx.tqyb.mapper.TqybMapper;
import com.lnsoft.module.qx.tqyb.pojo.Tqybvisit;
import com.lnsoft.module.qx.tqyb.service.TqybService;

@Service
public class TqybServiceImpl implements TqybService {

	@Autowired
	private TqybMapper tqybMapper;

	@Transactional(value = "mybatis_transactionManager", //
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertTqybVisit(Map<String, Object> visitMap) {
		tqybMapper.insertTqybVisit(visitMap);
	}

	@Override
	public Map<String, Object> queryTqybVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Tqybvisit> list = tqybMapper.queryTqybVisitAll();
		PageInfo<Tqybvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return map;
	}

}
