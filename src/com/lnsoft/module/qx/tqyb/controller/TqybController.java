package com.lnsoft.module.qx.tqyb.controller;

import static com.lnsoft.commons.utils.FtpUtilParam.HOST;
import static com.lnsoft.commons.utils.FtpUtilParam.PASSWORD;
import static com.lnsoft.commons.utils.FtpUtilParam.PORT;
import static com.lnsoft.commons.utils.FtpUtilParam.REMOTEPATH_TQYB;
import static com.lnsoft.commons.utils.FtpUtilParam.USERNAME;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lnsoft.commons.IMResult.ImResult;
import com.lnsoft.commons.utils.ExceptionUtil;
import com.lnsoft.commons.utils.ImDownloadUtil;

@Controller
@RequestMapping(value = "/im")
public class TqybController {

	@ResponseBody
	@RequestMapping(value = "/tqyb")
	public ImResult tqyb(
			@RequestParam(value = "date", required = true) String date) {// 2017.01.01
		try {
			List<Map<String, String>> list = ImDownloadUtil.getInstance()
					.downLoad(HOST, PORT,//
							USERNAME, PASSWORD,//
							REMOTEPATH_TQYB,//
							date);
			if (list != null) {
				return ImResult.build(200, "success", list);
			}
			return ImResult.build(400, "暂无消息");
		} catch (Exception e) {
			e.printStackTrace();
			return ImResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
