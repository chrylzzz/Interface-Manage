package com.lnsoft.commons.selectMap.out;

import java.util.HashMap;
import java.util.Map;

public class SbdzxjcOutMap {
	public static final Map<String, String> sbdzxjcOutMap = new HashMap<String, String>();
	static{
		sbdzxjcOutMap.put("ZXJC_APP.CMST_SOLUBLEGASINOIL_YUJ", "OBJ_ID");//变压器油中溶解气体
		sbdzxjcOutMap.put("ZXJC_APP.CMST_TINYWATER_YUJ", "OBJ_ID");//变压器油中微水
		sbdzxjcOutMap.put("ZXJC_APP.CMST_AIRMOISTURE_YUJ", "OBJ_ID");//GIS_SF6气体水分
		sbdzxjcOutMap.put("ZXJC_APP.CMST_AIRPRESSURE_YUJ", "OBJ_ID");//GIS_SF6气体压力
		sbdzxjcOutMap.put("ZXJC_APP.CMST_PARTDISCHARGE_YUJ", "OBJ_ID");//变压器局部放电
		sbdzxjcOutMap.put("ZXJC_APP.CMST_IRONCOREELECTRICITY_YUJ", "OBJ_ID");//变压器铁芯接地电流
		sbdzxjcOutMap.put("ZXJC_APP.CMST_LIGHTNINGROD_YUJ", "OBJ_ID");//金属氧化物避雷器全电流
		sbdzxjcOutMap.put("ZXJC_APP.CMST_GISPARTDISCHARGE_YUJ", "OBJ_ID");//GIS局部放电
	}
}
