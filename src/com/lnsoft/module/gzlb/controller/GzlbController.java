package com.lnsoft.module.gzlb.controller;

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
import com.lnsoft.module.gzlb.service.GzlbService;

@Controller
@RequestMapping(value = "/im")
public class GzlbController {

	@Autowired
	private GzlbService GzlbService;

	@ResponseBody
	@RequestMapping(value = "/gzlb")
	public ImResult gzlb(@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectOutMap.selectOutMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// gzlb端口
				DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
				List<HashMap<String, Object>> list = null;
				// 有id
				if (objId != null) {
					// 表中没有这个id
					// if(){}
					list = GzlbService.mapperQueryAllById(tableName, objId);
				} else {
					// 没id
					list = GzlbService.mapperQueryAll(tableName, null);
				}
				return ImResult.ok(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	// @ResponseBody
	// @RequestMapping(value = "/gzlbIn")
	// public ImResult gzlbIn(
	// @RequestParam(value = "tableName", required = true) String tableName,
	// @RequestParam(value = "objId", required = false) String objId) {
	//
	// try {
	// String data = SelectInMap.selectInMap.get(tableName.toUpperCase());
	// // 没有这个表
	// if (data == null) {
	// return ImResult.build(400, "没有这个表");
	// } else {// 有表
	// // gzlb端口
	// DataSourceContextHolder
	// .setDataSourceType(DataSourceConst.C3P0_20);
	// List<Map<String, Object>> list = null;
	// // 有id
	// if (objId != null) {
	// // 表中没有这个id
	// // if(){}
	// list = GzlbService.mapperQueryAllById(tableName, objId);
	// } else {
	// // 没id
	// list = GzlbService.mapperQueryAll(tableName, null);
	// }
	// return ImResult.ok(list);
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// return ImResult.build(500, ExceptionUtil.getStackTrace(e));
	// }
	// }
}
