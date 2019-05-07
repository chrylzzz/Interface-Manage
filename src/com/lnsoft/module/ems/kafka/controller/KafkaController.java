package com.lnsoft.module.ems.kafka.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lnsoft.commons.IMResult.ImResult;
import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.commons.kafkaConfig.emsWay.HdfsReadEms;
import com.lnsoft.commons.selectMap.in.EmsKafkaMap;
import com.lnsoft.commons.utils.ExceptionUtil;
import com.lnsoft.module.ems.kafka.service.KafkaService;

/**
 * lcType:量测类型F,I,O。。。。 city：城市
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/im")
public class KafkaController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private KafkaService kafkaService;
	@Autowired
	private HdfsReadEms hdfsReadEms;

	@ResponseBody
	@RequestMapping(value = "/kafka")
	public ImResult sendKafka(@RequestParam(value = "city", required = true) String city, //
			@RequestParam(value = "lcType", required = false) String lcType) {
		try {
			String topic = EmsKafkaMap.emsKafkaMap.get(city);
			String type = EmsKafkaMap.emsKafkaMap.get(lcType);
			ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
			if (topic == null) {// 没有这个城市
				return ImResult.build(400, "没有这个城市，检查城市名", list);
			} else {// 有topic
				if (type == null) {// 没有这个量测类型
					list = kafkaService.conKafka(topic);
					return ImResult.build(200, "没有量测类型，展示数据", list);
				} else {// 有lc
					DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
					list = kafkaService.conKafkaByLc(topic, lcType);
					return ImResult.build(200, "成功", list);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@ResponseBody
	@RequestMapping(value = "/ems")
	public ImResult sendEms(@RequestParam(value = "city", required = true) String city, //
			@RequestParam(value = "lcType", required = true) String lcType, //
			@RequestParam(value = "date", required = true) String date) {
		try {
			String topic = EmsKafkaMap.emsKafkaMap.get(city);
			String type = EmsKafkaMap.emsKafkaMap.get(lcType);
			if(topic==null | type==null |date==null ){
				return ImResult.build(400, "参数格式不正确");
			}
			List<String> list = hdfsReadEms.readEMSByCityLcTypeDate(city, lcType, date);
			return ImResult.build(200, "成功",list);
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	// @ResponseBody
	// @RequestMapping(value = "/kafkaIn")
	// public ImResult kafkaIn(@RequestParam(value = "city", required = true)
	// String city, //
	// @RequestParam(value = "lcType", required = false) String lcType) {
	// try {
	// String topic = EmsKafkaMap.emsKafkaMap.get(city);
	// String type = EmsKafkaMap.emsKafkaMap.get(lcType);
	// List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	// if (topic == null) {// 没有这个城市
	// String message = "没有这个城市，检查城市名";
	// return ImResult.build(400, "没有这个城市，检查城市名", list);
	// } else {// 有topic
	// if (type == null) {// 没有这个量测类型
	// list = kafkaService.conKafka(topic);
	// return ImResult.build(200, "没有量测类型，展示数据", list);
	// } else {// 有lc
	// DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
	// list = kafkaService.conKafkaByLc(topic, lcType);
	// return ImResult.build(200, "成功", list);
	// }
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// return ImResult.build(500, ExceptionUtil.getStackTrace(e));
	// }
	// }
	// @ResponseBody
	// @RequestMapping(value = "/kafka2")
	// public ImResult sendKafka2(@RequestParam(value = "lcType", required =
	// false) String lcType) {
	// try {
	// String type = EmsKafkaMap.emsKafkaMap.get(lcType);
	// if (type == null) {
	// return ImResult.build(400, "没有这个lc");
	// } else {
	// //量测类型 数据库 20端口
	// DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
	// List<String> str = kafkaService.queryLcType(lcType);
	// return ImResult.build(200, "yes", str);
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// return ImResult.build(400, "发送kafka失败");
	// }
	// }
}
