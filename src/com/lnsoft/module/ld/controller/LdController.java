package com.lnsoft.module.ld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lnsoft.commons.IMResult.ImResult;
import com.lnsoft.commons.ldConfig.HdfsReadFile;
import com.lnsoft.commons.utils.ExceptionUtil;
import com.lnsoft.module.ld.service.LdService;

/**
 * date格式: 2018.01.02
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/im")
public class LdController {

	@Autowired
	private LdService ldService;

	@ResponseBody
	@RequestMapping(value = "/ld")
	public ImResult ld(@RequestParam(value = "date", required = true) String date) {
		try {

			List<String> data = HdfsReadFile.readFileByDate(date);

			return ImResult.build(200, "成功", data);
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, //
					"该日期没有雷电数据", //
					ExceptionUtil.getStackTrace(e));
		}
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/ldIn") public ImResult ldIn(@RequestParam(value
	 * = "date", required = false) String date) { try { if
	 * (StringUtils.isEmpty(date)) { return ImResult.build(400, "时间格式不对"); }
	 * List<Row> data = ldService.readFile(date); return ImResult.build(200,
	 * "成功", data); } catch (Exception e) { e.printStackTrace(); return
	 * ImResult.build(500, ExceptionUtil.getStackTrace(e)); } }
	 */

}
