package com.lnsoft.commons.selectMap.in;

import java.util.HashMap;
import java.util.Map;

public class SbdzxjcInMap {
	public static final Map<String, String> sbdzxjcInMap = new HashMap<String, String>();
	static {
		// 在线监测
		// 装置台账
		sbdzxjcInMap.put("ZXJC_APP.CMST_TRANSFDEVICE", "OBJ_ID");// 逻辑装置台帐
		sbdzxjcInMap.put("ZXJC_APP.CMST_PHYSICSDEVICE", "OBJ_ID");// 物理装置台帐
		// 状态检测数据
		sbdzxjcInMap.put("ZXJC_APP.CMST_TINYWATER", "OBJ_ID");// 变压器油中微水
		sbdzxjcInMap.put("ZXJC_APP.CMST_PARTDISCHARGE", "OBJ_ID");// 变压器局部放电
		sbdzxjcInMap.put("ZXJC_APP.CMST_IRONCOREELECTRICITY", "OBJ_ID");// 变压器铁芯接地电流
		sbdzxjcInMap.put("ZXJC_APP.CMST_GISPARTDISCHARGE", "OBJ_ID");// GIS局部放电
		sbdzxjcInMap.put("ZXJC_APP.CMST_LIGHTNINGROD", "OBJ_ID");// 金属氧化物避雷器全电流
		sbdzxjcInMap.put("ZXJC_APP.CMST_AIRPRESSURE", "OBJ_ID");// GIS_SF6气体压力
		sbdzxjcInMap.put("ZXJC_APP.CMST_SOLUBLEGASINOIL", "OBJ_ID");// 变压器油中溶解气体
		sbdzxjcInMap.put("ZXJC_APP.CMST_AIRMOISTURE", "OBJ_ID");// GIS_SF6气体水分
	}
}
