package com.lnsoft.module.ems.kafka.service.impl;

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
import com.lnsoft.commons.kafkaConfig.MyKafkaConsumer;
import com.lnsoft.commons.kafkaConfig.emsWay.HdfsReadEms;
import com.lnsoft.module.ems.kafka.mapper.EmsLcMapper;
import com.lnsoft.module.ems.kafka.mapper.KafkaMapper;
import com.lnsoft.module.ems.kafka.pojo.Kafkavisit;
import com.lnsoft.module.ems.kafka.service.KafkaService;

@Service
@WebService
public class KafkaServerImpl implements KafkaService {

	@Autowired
	private EmsLcMapper emsLcMapper;
	@Autowired
	private MyKafkaConsumer mc;
	@Autowired
	private KafkaMapper kafkaMapper;
	@Autowired
	private HdfsReadEms hdfsReadEms;


	@Override
	public ArrayList<HashMap<String, String>> conKafka(String topic) {
		return mc.con(topic);
	}

	/**
	 * 根据量测类型的key ：xxx:xxx ， 得到对应的量测类型： I，O....
	 */
	@Override
	public ArrayList<String> queryLcType(String lcType) {
		return emsLcMapper.queryLcType(lcType);
	}

	@Override
	public ArrayList<HashMap<String, String>> conKafkaByLc(String topic, String lcType) {
		return mc.conByLcType(topic, lcType);
	}

	//jianting
	@Transactional(value = "mybatis_transactionManager", // 
			propagation = Propagation.REQUIRED, //
			readOnly = false, //
			timeout = -1, rollbackFor = { Exception.class })
	@Override
	public void insertKafkaVisit(HashMap<String, Object> visitMap) {
		kafkaMapper.insertKafkaVisit(visitMap);
	}

	@Override
	public HashMap<String, Object> queryKafkaVisitAll(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Kafkavisit> list = kafkaMapper.queryKafkaVisitAll();
		PageInfo<Kafkavisit> pi = new PageInfo<>(list);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("total", pi.getTotal());
		map.put("rows", list);
		return map;
	}

	@Override
	public ArrayList<String> readEMSByCityLcTypeDateFromWs(String city, String lcType, String date) {
		return hdfsReadEms.readEMSByCityLcTypeDate(city, lcType, date);
	}
}
