package com.lnsoft.commons.interacptorConfig;

import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.commons.utils.DateUtils;
import com.lnsoft.module.ddjc.service.DdjcService;
import com.lnsoft.module.ems.kafka.service.KafkaService;
import com.lnsoft.module.fdc.service.FdcService;
import com.lnsoft.module.gzlb.service.GzlbService;
import com.lnsoft.module.ld.service.LdService;
import com.lnsoft.module.pms.service.PmsService;
import com.lnsoft.module.qx.qxlys.service.QxlysService;
import com.lnsoft.module.qx.qxzhyj.service.QxzhyjService;
import com.lnsoft.module.qx.tqyb.service.TqybService;
import com.lnsoft.module.sbdzxjc.service.SbdzxjcService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AuthInteracptor implements HandlerInterceptor {
	@Autowired
	private PmsService pmsService;
	@Autowired
	private DdjcService ddjcService;
	@Autowired
	private KafkaService kafkaService;
	@Autowired
	private GzlbService gzlbService;
	@Autowired
	private LdService ldService;
	@Autowired
	private SbdzxjcService sbdzxjcService;
	@Autowired
	private QxzhyjService qxzhyjService;
	// 气象六要素
	@Autowired
	private QxlysService qxlysService;
	// 天气预报
	@Autowired
	private TqybService tqybService;
	@Autowired
	private FdcService fdcService;

	private static Logger logger = Logger.getLogger(AuthInteracptor.class);
	Map<String, Object> visitMap = new HashMap<String, Object>();

	// (3)跳转视图成功之后，触发afterCompletion方法
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		visitMap.put("status", 0);
		String thisRequestPath = (String) visitMap.get("requestPath");
		// 切换数据库~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
		// ================对外提供的========================
		if (thisRequestPath.equals("/im/pms")) {// pms
			pmsService.insertPmsVisit((HashMap<String, Object>) visitMap);
			logger.info("pms");
		} else if (thisRequestPath.equals("/im/ddjc")) {// 带电检测
			ddjcService.insertDdjcVisit((HashMap<String, Object>) visitMap);
			logger.info("ddjc");
		} else if (thisRequestPath.equals("/im/kafka")) {// kafka
			kafkaService.insertKafkaVisit((HashMap<String, Object>) visitMap);
			logger.info("kafka");
		} else if (thisRequestPath.equals("/im/ems")) {// mes也存在kafkavisit中了，因为im/kafka有bug
			kafkaService.insertKafkaVisit((HashMap<String, Object>) visitMap);
			logger.info("kafka");
		} else if (thisRequestPath.equals("/im/gzlb")) {// 故障录波
			gzlbService.insertGzlbVisit((HashMap<String, Object>) visitMap);
			logger.info("gzlb");
		} else if (thisRequestPath.equals("/im/ld")) {// 雷电
			ldService.insertLdVisit((HashMap<String, Object>) visitMap);
			logger.info("ld");
		} else if (thisRequestPath.equals("/im/qxlys")) {// 气象六要素
			qxlysService.insertQxlysVisit(visitMap);
			logger.info("qxlys");
		} else if (thisRequestPath.equals("/im/tqyb")) {// 天气预报
			tqybService.insertTqybVisit(visitMap);
			logger.info("tqyb");
		} else if (thisRequestPath.equals("/im/sbdzxjc")) {// 输变电在线监测
			sbdzxjcService.insertSbdzxjcVisit((HashMap<String, Object>) visitMap);
			logger.info("sbdzxjc");
		} else if (thisRequestPath.equals("/im/qxzhyj")) {// 气象灾害预警
			qxzhyjService.insertQxzhyjVisit((HashMap<String, Object>) visitMap);
			logger.info("qxzhyj");
		} else if (thisRequestPath.equals("/im/fdc")) {// 发电厂
			fdcService.insertFdcVisit((HashMap<String, Object>) visitMap);
			logger.info("fdc");
		} // ===============对内提供的=====================
		else if (thisRequestPath.equals("/im/pmsIn")) {// pms
			pmsService.insertPmsInVisit((HashMap<String, Object>) visitMap);
		} else if (thisRequestPath.equals("/im/ddjcIn")) {// 带电检测
			ddjcService.insertDdjcInVisit((HashMap<String, Object>) visitMap);
		} else if (thisRequestPath.equals("/im/sbdzxjcIn")) {// 输变电在线监测
			sbdzxjcService.insertSbdzxjcInVisit((HashMap<String, Object>) visitMap);
		} /*
			 * else if (thisRequestPath.equals("/im/kafkaIn")) {// kafka
			 * kafkaService.insertKafkaInVisit(visitMap); } else if
			 * (thisRequestPath.equals("/im/gzlbIn")) {// 故障录波
			 * gzlbService.insertGzlbInVisit(visitMap); } else if
			 * (thisRequestPath.equals("/im/ldIn")) {// 雷电
			 * ldService.insertLdInVisit(visitMap); } else if
			 * (thisRequestPath.equals("/im/qxlysIn")) {// 气象六要素
			 * 
			 * } else if (thisRequestPath.equals("/im/tqybIn")) {// 天气预报
			 * 
			 * } else if (thisRequestPath.equals("/im/qxzhyjIn")) {// 气象灾害预警
			 * qxzhyjService.insertQxzhyjInVisit(visitMap); }
			 */
	}

	// (2)跳转视图之前 触发postHandle方法
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		long startTime = (Long) request.getAttribute("startTime");
		Long endTime = System.currentTimeMillis();

		Long executeTime = endTime - startTime;

		Date et = DateUtils.MillisChange(endTime);// String
		visitMap.put("executeTime", executeTime);// long类型
		visitMap.put("endTime", et);// date类型
		logger.error("executeTime-" + executeTime + "ms&" + "endTime-" + DateUtils.MillisChange(endTime));
		logger.error("===");
	}

	// (1)在后台请求方法之前 ，先执行 preHandle该方法
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		visitMap.put("requestPath", request.getServletPath());

		Date st = DateUtils.MillisChange(startTime);

		visitMap.put("startTime", st);
		visitMap.put("ipHost", request.getRemoteAddr() + ":" + request.getRemotePort());
		visitMap.put("requestCount", 1);

		logger.error("requestServletPath-" + request.getServletPath() + "&" + "startTime-"//
				+ DateUtils.MillisChange(startTime) + "&" + "ipHost-" + request.getRemoteAddr() + ":"//
				+ request.getRemotePort());
		// 查看是否有user登录
		// String username = (String) session.getAttribute("username");
		// String password = (String) session.getAttribute("password");
		// if (username == null || password == null) {
		// // 没有就跳转没登陆的界面
		// response.sendRedirect(request.getContextPath() +
		// "/pages/commons/404.jsp");
		// return false;
		// }

		// String url = request.getRequestURI();
		//
		// if (StringUtils.isNotBlank(url) && url.toLowerCase().indexOf("login")
		// < 0) {
		//
		// if (username == null || password == null) {
		//
		// String localUrl = request.getScheme() + "://" +
		// request.getServerName() + ":" + request.getServerPort()
		// + request.getContextPath() + "/";
		//
		// System.out.println("=====" + localUrl);
		// response.sendRedirect(localUrl + "/pages/commons/login.jsp");
		// return false;
		//
		// }
		//
		// }
		return true;
	}

}
