package com.lnsoft.module.pms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lnsoft.commons.IMResult.ImResult;
import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.commons.selectMap.SelectInMap;
import com.lnsoft.commons.selectMap.SelectOutMap;
import com.lnsoft.commons.utils.ExceptionUtil;
import com.lnsoft.module.pms.service.PmsService;

@Controller
@RequestMapping(value = "/im")
public class PmsController {

	@Autowired
	private PmsService pmsService;

	@ResponseBody
	@RequestMapping(value = "/pms")
	public ImResult pms(
			@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectOutMap.selectOutMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// pms端口
				DataSourceContextHolder
						.setDataSourceType(DataSourceConst.C3P0_18);
				List<HashMap<String, Object>> list = null;
				// 有id,根据表对应的id，查
				if (objId != null) {
					// 表中没有此id
					// if(objId!=){}
					list = pmsService.mapperQueryAllById(tableName, objId);
				} else {
					// 没id
					list = pmsService.mapperQueryAll(tableName, null);
				}
				return ImResult.ok(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/pmsIn")
	public ImResult pmsIn(
			@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectInMap.selectInMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// pms端口
				DataSourceContextHolder
						.setDataSourceType(DataSourceConst.C3P0_18);
				List<HashMap<String, Object>> list = null;
				// 有id,根据表对应的id，查
				if (objId != null) {
					// 表中没有此id
					// if(objId!=){}
					list = pmsService.mapperQueryAllById(tableName, objId);
				} else {
					// 没id
					list = pmsService.mapperQueryAll(tableName, null);
				}
				return ImResult.ok(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
