package com.lnsoft.commons.selectMap.in;

import java.util.HashMap;
import java.util.Map;

public class GzlbInMap {
	public static final Map<String, String> gzlbInMap = new HashMap<String, String>();
	static {
		// 故障录波表
		gzlbInMap.put("ZTXS.T_QXXT_REPORTINFO", "ID");// 全息系统总表
		gzlbInMap.put("ZTXS.T_QXXT_RECORDFILE", "ID");// 全息系统文件表
		gzlbInMap.put("ZTXS.T_QXXT_RECORD", "ID");// 全息系统录波表
		gzlbInMap.put("ZTXS.T_QXXT_RELAY", "ID");// 全息系统场站表
		gzlbInMap.put("ZTXS.T_GZLB_RECORD", "ID");// 故障录波表
		gzlbInMap.put("ZTXS.T_JDBH_GZLB_MAIN", "ID");// 故障录波主表
		gzlbInMap.put("ZTXS.T_JDBH_GZLB_SUB1", "ID");// 故障录波从表
		gzlbInMap.put("ZTXS.T_JDBH_GZLB_DATA", "ID");// 故障录波波形数据
	}
}
