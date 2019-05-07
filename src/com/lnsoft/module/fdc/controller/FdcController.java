package com.lnsoft.module.fdc.controller;

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
import com.lnsoft.commons.utils.ExceptionUtil;
import com.lnsoft.module.fdc.service.FdcService;

@Controller
@RequestMapping(value = "/im")
public class FdcController {

	@Autowired
	private FdcService fdcService;

	@ResponseBody
	@RequestMapping(value = "/fdc")
	public ImResult ddjc(@RequestParam(value = "ment", required = false) Integer ment) {

		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
			List<HashMap<String, String>> data = fdcService.queryFdcByInnerfragment(ment);
			if (data == null) {
				return ImResult.build(400, "没有这个量测类型的数据", null);
			}
			return ImResult.build(200, "success", data);
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
