package com.lnsoft.commons.other.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lnsoft.commons.IMResult.ImResult;
import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.commons.other.service.OtherService;
import com.lnsoft.module.pms.service.PmsService;

@Controller
@RequestMapping(value = "/im")
public class OtherController {
	@Autowired
	private OtherService otherService;
	@Autowired
	private PmsService pmsService;

	// @Autowired
	// private DdjcService ddjcService;
	// @Autowired
	// private KafkaServer kafkaService;
	// @Autowired
	// private GzlbService gzlbService;
	// @Autowired
	// private LdService ldService;
	// @Autowired
	// private QxzhyjService qxzhyjService;
	// @Autowired
	// private SbdzxjcService sbdzjcService;
	// 登录
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, //
			@RequestParam("password") String password, HttpServletRequest request) {

		if (email.equals("123@qq.com") && password.equals("123")) {
			return "commons/index";
		}
		return "commons/error";

	}

	// 访问频率
	@ResponseBody
	@RequestMapping(value = "setCharts2")
	public ImResult setCharts2() {
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);

		double pmsCount = otherService.queryCountByPMS();
		double emsCount = otherService.queryCountByEMS();
		double ddjcCount = otherService.queryCountByDDJC();
		double gzlbCount = otherService.queryCountByGZLB();
		double ldCount = otherService.queryCountByLD();
		double qxzhyjCount = otherService.queryCountByQXZHYJ();
		double sbdzjcCount = otherService.queryCountBySBDZJC();
		double allCount = pmsCount + emsCount + ddjcCount + ldCount + qxzhyjCount + sbdzjcCount + gzlbCount;

		List<Double> data = new ArrayList<>();
		Map<String,Object> map=new HashMap<>();
		map.put("pmsCount", (pmsCount / allCount));
		data.add((pmsCount / allCount));
		data.add((emsCount / allCount));
		data.add((ddjcCount / allCount));
		data.add((ldCount / allCount));
		data.add((qxzhyjCount / allCount));
		data.add((sbdzjcCount / allCount));
		data.add((gzlbCount / allCount));
		return ImResult.build(200, "yes", data);
	}

	// 访问次数
	@ResponseBody
	@RequestMapping(value = "setCharts1")
	public ImResult setCharts1() {
		// Map<String,Integer> data=empServiceImpl.getCountByMap();
		// List<String> data=empServiceImpl.getCountByList();
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
		int pmsCount = otherService.queryCountByPMS();
		int emsCount = otherService.queryCountByEMS();
		int ddjcCount = otherService.queryCountByDDJC();
		int gzlbCount = otherService.queryCountByGZLB();
		int ldCount = otherService.queryCountByLD();
		int qxzhyjCount = otherService.queryCountByQXZHYJ();
		int sbdzjcCount = otherService.queryCountBySBDZJC();
		List<Integer> data = new ArrayList<>();
		data.add(pmsCount);
		data.add(emsCount);
		data.add(ddjcCount);
		data.add(ldCount);
		data.add(qxzhyjCount);
		data.add(sbdzjcCount);
		data.add(gzlbCount);

		return ImResult.build(200, "yes", data);
	}
}
