package com.lnsoft.module.qx.qxlys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lnsoft.module.qx.qxlys.mapper.QxlysMapper;
import com.lnsoft.module.qx.qxlys.pojo.Qxlysvisit;
import com.lnsoft.module.qx.qxlys.service.QxlysService;

@Service
public class QxlysServiceImpl implements QxlysService {
	@Autowired
	private QxlysMapper qxlysMapper;

	@Transactional(value = "mybatis_transactionManager", // 这个可以指定是那个事务管理管理器
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertQxlysVisit(Map<String, Object> visitMap) {
		qxlysMapper.insertQxlysVisit(visitMap);
	}

	@Override
	public Map<String, Object> queryQxlysVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Qxlysvisit> list = qxlysMapper.queryQxlysVisitAll();
		PageInfo<Qxlysvisit> pi = new PageInfo<>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return map;
	}

}
