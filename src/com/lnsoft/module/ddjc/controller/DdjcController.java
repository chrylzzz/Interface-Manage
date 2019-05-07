package com.lnsoft.module.ddjc.controller;

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
import com.lnsoft.module.ddjc.service.DdjcService;
/**
 * 对外的是ddjc
 * 对内的是ddjcIn
 * 对外都是原名
 * 对内都有In
 * @author chu
 *
 */
@Controller
@RequestMapping(value = "/im")
public class DdjcController {

	@Autowired
	private DdjcService ddjcService;

	/**
	 * 
	 * @param tableName
	 *            带电检测的tableName有两种类型，_base和_data
	 * @param objId
	 *            两种类型的objId不同 表名后缀为：_BASE，如DDJC_HWRXJC_BASE，表主键为YSJL_ID
	 *            表名后缀为：_Data，如DDJC_HWRXJC_DATA，表主键为SJID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/ddjc")
	public ImResult ddjc(
			@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectOutMap.selectOutMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// ddjc端口
				DataSourceContextHolder
						.setDataSourceType(DataSourceConst.C3P0_13);
				List<HashMap<String, Object>> list = null;
				// 有id
				if (objId != null) {
					// 表中没有这个id
					// if(){}
					list = ddjcService.jdbcQueryAllById(tableName, objId);
				} else {
					// 没id
					list = ddjcService.jdbcQueryAll(tableName);
				}
				return ImResult.ok(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	@ResponseBody
	@RequestMapping(value = "/ddjcIn")
	public ImResult ddjcIn(
			@RequestParam(value = "tableName", required = true) String tableName,
			@RequestParam(value = "objId", required = false) String objId) {

		try {
			String data = SelectInMap.selectInMap.get(tableName.toUpperCase());
			// 没有这个表
			if (data == null) {
				return ImResult.build(400, "没有这个表");
			} else {// 有表
					// ddjc端口
				DataSourceContextHolder
						.setDataSourceType(DataSourceConst.C3P0_13);
				List<HashMap<String, Object>> list = null;
				// 有id
				if (objId != null) {
					// 表中没有这个id
					// if(){}
					list = ddjcService.jdbcQueryAllById(tableName, objId);
				} else {
					// 没id
					list = ddjcService.jdbcQueryAll(tableName);
				}
				return ImResult.ok(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
