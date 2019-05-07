package com.lnsoft.commons.selectMap.in;

import java.util.HashMap;
import java.util.Map;

/**
 * 外部访问进来的接口数据
 * 
 * @author Chr
 */
public class DdjcInMap {
	public static final Map<String, String> ddjcInMap = new HashMap<String, String>();
	static {
		// 带电检测
		// 红外
		ddjcInMap.put("DDJC_HWRXJC_BASE", "YSJL_ID");
		ddjcInMap.put("DDJC_HWRXJC_DATA", "SJID");
		// GIS超声
		ddjcInMap.put("DDJC_GISCSJF_BASE", "YSJL_ID");
		ddjcInMap.put("DDJC_GISCSJF_DATA", "SJID");
		// GIS特高频
		ddjcInMap.put("DDJC_GISTGPJF_BASE", "YSJL_ID");
		ddjcInMap.put("DDJC_GISTGPJF_DATA", "SJID");
		// 开关柜超声
		ddjcInMap.put("DDJC_KGGCSBJF_BASE", "YSJL_ID");
		ddjcInMap.put("DDJC_KGGCSBJF_DATA", "SJID");
		// 开关柜暂态地电压
		ddjcInMap.put("DDJC_KGGZTDDY_BASE", "YSJL_ID");
		ddjcInMap.put("DDJC_KGGZTDDY_DATA", "SJID");
	}
}
