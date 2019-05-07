package com.lnsoft.module.sbdzxjc.controller;

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
import com.lnsoft.module.sbdzxjc.service.SbdzxjcService;

@Controller
@RequestMapping(value = "/im")
public class SbdzxjcController {
	@Autowired
	private SbdzxjcService zxjcService;

	@ResponseBody
	@RequestMapping(value = "/sbdzxjc")
	public ImResult sbdzxjc(@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectOutMap.selectOutMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// sbdzxjc端口
				DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_48);
				List<HashMap<String, Object>> list = null;
				// 时间戳处理查询
				if (tableName.equals("ZXJC_APP.CMST_SOLUBLEGASINOIL")) {
					if (objId != null) {
						list = zxjcService.queryTableHaveTSById(objId);
					} else {
						list = zxjcService.queryTableHaveTS();
					}
					return ImResult.ok(list);
				} else {
					// 有id
					if (objId != null) {
						// 表中没有这个id
						// if(){}
						list = zxjcService.mapperQueryAllById(tableName, objId);
					} else {
						// 没id
						list = zxjcService.mapperQueryAll(tableName, null);
					}
					return ImResult.ok(list);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/sbdzxjcIn")
	public ImResult sbdzxjcIn(@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectInMap.selectInMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// sbdzxjc端口
				DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_48);
				List<HashMap<String, Object>> list = null;
				// 时间戳处理查询
				if (tableName.equals("ZXJC_APP.CMST_SOLUBLEGASINOIL")) {
					if (objId != null) {
						list = zxjcService.queryTableHaveTSById(objId);
					} else {
						list = zxjcService.queryTableHaveTS();
					}
					return ImResult.ok(list);
				} else {
					// 有id
					if (objId != null) {
						// 表中没有这个id
						// if(){}
						list = zxjcService.mapperQueryAllById(tableName, objId);
					} else {
						// 没id
						list = zxjcService.mapperQueryAll(tableName, null);
					}
					return ImResult.ok(list);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
