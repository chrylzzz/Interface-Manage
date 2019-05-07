package com.lnsoft.commons.interacptorConfig;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
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

/**
 * 返回前端信息的监听
 */
@RestController
@RequestMapping(value = "itcpt")
public class InteracptorController {
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
	@Autowired
	private QxlysService qxlysService;
	@Autowired
	private TqybService tqybService;
	@Autowired
	private FdcService fdcService;

	// ====================对外提供的==============================
	
	@RequestMapping(value = "fdcVisit", method = RequestMethod.POST)
	public Map<String, Object> fdcVisit(Integer page, Integer rows) {
		try {
			// 切换数据库
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = fdcService.queryFdcVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@RequestMapping(value = "pmsVisit", method = RequestMethod.POST)
	public Map<String, Object> pmsvisit(Integer page, Integer rows) {
		try {
			// 切换数据库
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = pmsService.queryPmsVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// qxzhyj
	@RequestMapping(value = "qxzhyjVisit", method = RequestMethod.POST)
	public Map<String, Object> qxzhyjVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = qxzhyjService.queryQxzhyjVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// qxlys
	@RequestMapping(value = "qxlysVisit", method = RequestMethod.POST)
	public Map<String, Object> qxlysVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = qxlysService.queryQxlysVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// tqyb
	@RequestMapping(value = "tqybVisit", method = RequestMethod.POST)
	public Map<String, Object> tqybVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = tqybService.queryTqybVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// sbdzxjc
	@RequestMapping(value = "sbdzxjcVisit", method = RequestMethod.POST)
	public Map<String, Object> sbdzxjcVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = sbdzxjcService.querySbdzxjcVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// gzlb
	@RequestMapping(value = "gzlbVisit", method = RequestMethod.POST)
	public Map<String, Object> gzlbVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = gzlbService.queryGzlbVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// kafka
	@RequestMapping(value = "kafkaVisit", method = RequestMethod.POST)
	public Map<String, Object> kafkaVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = kafkaService.queryKafkaVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// ld
	@RequestMapping(value = "ldVisit", method = RequestMethod.POST)
	public Map<String, Object> ldVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = ldService.queryLdVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// ddjc
	@RequestMapping(value = "ddjcVisit", method = RequestMethod.POST)
	public Map<String, Object> ddjcVisit(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = ddjcService.queryDdjcVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// ====================对内提供的==============================
	@RequestMapping(value = "pmsVisitIn", method = RequestMethod.POST)
	public Map<String, Object> pmsVisitIn(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = pmsService.queryPmsInVisitAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// sbdzxjc
	@RequestMapping(value = "sbdzxjcVisitIn", method = RequestMethod.POST)
	public Map<String, Object> sbdzxjcVisitIn(Integer page, Integer rows) {
		try {
			DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_39);
			Map<String, Object> map = sbdzxjcService.querySbdzxjcInVisitInAll(page, rows);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/*
	 * // qxzhyj
	 * 
	 * @RequestMapping(value = "qxzhyjVisitIn", method = RequestMethod.POST)
	 * public Map<String, Object> qxzhyjVisitIn(Integer page, Integer rows) {
	 * try { Map<String, Object> map = qxzhyjService.queryQxzhyjVisitInAll(page,
	 * rows); return map; } catch (Exception e) { e.printStackTrace(); return
	 * null; } }
	 */

	/*
	 * 
	 * // gzlb
	 * 
	 * @RequestMapping(value = "gzlbVisitIn", method = RequestMethod.POST)
	 * public Map<String, Object> gzlbVisitIn(Integer page, Integer rows) { try
	 * { Map<String, Object> map = gzlbService.queryGzlbVisitInAll(page, rows);
	 * return map; } catch (Exception e) { e.printStackTrace(); return null; } }
	 * 
	 * // kafka
	 * 
	 * @RequestMapping(value = "kafkaVisitIn", method = RequestMethod.POST)
	 * public Map<String, Object> kafkaVisitIn(Integer page, Integer rows) { try
	 * { Map<String, Object> map = kafkaService.queryKafkaVisitInAll(page,
	 * rows); return map; } catch (Exception e) { e.printStackTrace(); return
	 * null; } }
	 * 
	 * // ld
	 * 
	 * @RequestMapping(value = "ldVisitIn", method = RequestMethod.POST) public
	 * Map<String, Object> ldVisitIn(Integer page, Integer rows) { try {
	 * Map<String, Object> map = ldService.queryLdVisitInAll(page, rows); return
	 * map; } catch (Exception e) { e.printStackTrace(); return null; } }
	 */

	// ddjc
	/*
	 * @RequestMapping(value = "ddjcVisitIn", method = RequestMethod.POST)
	 * public Map<String, Object> ddjcVisitIn(Integer page, Integer rows) { try
	 * { Map<String, Object> map = ddjcService.queryDdjcInVisitAll(page, rows);
	 * return map; } catch (Exception e) { e.printStackTrace(); return null; } }
	 */
}
