package com.lnsoft.commons.selectMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 对内提供
 * 
 * @author Chr
 *
 */
public class SelectInMap {
	public static final Map<String, String> selectInMap = new HashMap<String, String>();
	// key-表名，value-表id
	static {
		// 对内提供的
		// 只有红外有单独的对外提供的表
		// 其他的四种数据都是对内的数据表中就有信息
		selectInMap.put("DDJC_TXSB_JG", "OBJ_ID");
		// sbdzxjc:在线监测,//预警数据
		selectInMap.put("ZXJC_APP.CMST_SOLUBLEGASINOIL_YUJ", "OBJ_ID");// 变压器油中溶解气体
		selectInMap.put("ZXJC_APP.CMST_TINYWATER_YUJ", "OBJ_ID");// 变压器油中微水
		selectInMap.put("ZXJC_APP.CMST_AIRMOISTURE_YUJ", "OBJ_ID");// GIS_SF6气体水分
		selectInMap.put("ZXJC_APP.CMST_AIRPRESSURE_YUJ", "OBJ_ID");// GIS_SF6气体压力
		selectInMap.put("ZXJC_APP.CMST_PARTDISCHARGE_YUJ", "OBJ_ID");// 变压器局部放电
		selectInMap.put("ZXJC_APP.CMST_IRONCOREELECTRICITY_YUJ", "OBJ_ID");// 变压器铁芯接地电流
		selectInMap.put("ZXJC_APP.CMST_LIGHTNINGROD_YUJ", "OBJ_ID");// 金属氧化物避雷器全电流
		selectInMap.put("ZXJC_APP.CMST_GISPARTDISCHARGE_YUJ", "OBJ_ID");// GIS局部放电
		// pms
		selectInMap.put("T_ZH_ZTJX_SBDYDZB", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_XXDJSJG", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_ZTLJSJG", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_BJJSJG", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_SBJSJG", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_PJDZ", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_SBLXYPJDZGLB", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_PJBJ", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_PJGZ", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_ZTLMX", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_ZTLFZ", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_PDYJ", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_ZTLXXD", "OBJ_ID");
		selectInMap.put("T_ZH_ZTJX_ZTXXSJGLB", "OBJ_ID");
		selectInMap.put("T_SB_ZNYC_TZ", "OBJ_ID");
		// 状态评价
//		selectInMap.put("SCYW.T_SB_ZNYC_TZ_CYHPJ", "OBJ_ID");
		// 20数据库
		// 指标管理
//		selectInMap.put("T_TGSS_ZB_ZBJS_MAIN", "OBJ_ID");
//		selectInMap.put("T_TGSS_ZB_ZBJS_ZTPJ_SUB", "OBJ_ID");
//		selectInMap.put("T_TGSS_ZB_ZBJS_DDJC_SUB", "OBJ_ID");
//		selectInMap.put("T_TGSS_ZB_ZBJS_ZXJC_SUB", "OBJ_ID");
//		selectInMap.put("T_TGSS_ZB_ZXJC", "OBJ_ID");
//		selectInMap.put("T_TGSS_ZB_DDJC", "OBJ_ID");
//		selectInMap.put("T_TGSS_ZB_ZTPJ", "OBJ_ID");
		//带电检测-预警信息
//		selectInMap.put("T_TGSS_KSYJ_GISCSJF", "OBJ_ID");
//		selectInMap.put("T_TGSS_KSYJ_GISTGP", "OBJ_ID");
//		selectInMap.put("T_TGSS_KSYJ_KGGCSBJF", "OBJ_ID");
//		selectInMap.put("T_TGSS_KSYJ_KGGZTDDY", "OBJ_ID");
//		selectInMap.put("T_TGSS_KSYJ_TXSB", "OBJ_ID");


	}
}
