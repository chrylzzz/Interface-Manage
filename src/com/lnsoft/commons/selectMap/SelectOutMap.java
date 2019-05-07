package com.lnsoft.commons.selectMap;

import java.util.HashMap;
import java.util.Map;
/**
 * 对外提供
 * @author Chr
 *
 */
public class SelectOutMap {
	public static final Map<String, String> selectOutMap = new HashMap<String, String>();
	// key-表名，value-表id
	static {
//外部访问本系统的
	//pms
		//select台帐
		selectOutMap.put("T_SB_ZWYC_XL", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DAOXIAN", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DIXIAN", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_GT", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_GL", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSBYQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSDLQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSFHKG", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSGLKG", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSCHQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSDLSRDQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_XLBLQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_XLGZZSQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSDRQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSDYHGQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSDLHGQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSZHHGQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSFDQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZSTRBYQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZDTYQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_ZYYHJRD", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DLD", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DLZD", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DLJT", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DLFZX", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_XLFSSS", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_ZBYQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_PDBYQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_SYB", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JDB", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DLQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_GLKG", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_FHKG", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_RDQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_MX", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DKQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DLHGQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DYHGQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_ZHHGQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DLDRQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_OHDRQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_BLQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_XHZZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JDDZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_ZHDQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_KGG", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_FDXQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_BLZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JYZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_CQTG", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_ZBQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JHLBQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JDW", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_GZZSQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_ZNDL", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DLZD", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_DLJT", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_GZZZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JTWGBCZZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JZWGBCFSZZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_CLBCZZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_LBDRQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JLLBQ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_CQG", "OBJ_ID");
		selectOutMap.put("T_SB_ZLSB_TBSFZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZLSB_QDDZ", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_ZNHWG", "OBJ_ID");
		selectOutMap.put("T_SB_ECSB_HLZKBXT", "OBJ_ID");
		selectOutMap.put("T_SB_ZLSB_HLZFNLSXT", "OBJ_ID");
		selectOutMap.put("T_SB_ZLSB_HLZFWLQXT", "OBJ_ID");
		selectOutMap.put("T_SB_DYSB_DYXL", "OBJ_ID");
		selectOutMap.put("T_SB_ZNYC_JGDY", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_WLG", "OBJ_ID");
		selectOutMap.put("T_SB_ZWYC_DL", "OBJ_ID");
		//select缺陷
		selectOutMap.put("T_DW_BZZX_GGDMB", "OBJ_ID");
		selectOutMap.put("T_DW_BZZX_BZFLB", "OBJ_ID");
		selectOutMap.put("T_YJ_DWYJ_QXJL", "OBJ_ID");
		//select试验设备
		selectOutMap.put("T_ZH_ZTJX_GGDM", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYJL", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYSB", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYSBXM", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYSJZ", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYZXMJG", "OBJ_ID");
		//select试验存储规则
		selectOutMap.put("T_ZH_ZTJX_SYMB", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYXZ", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYMBXM ", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYXM", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYXMZXM", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYZXM", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYBWSBLX", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYBW", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYMBXB", "OBJ_ID");
		selectOutMap.put("T_ZH_ZTJX_SYXB", "OBJ_ID");
		//=============================================================
	//带电检测
		//红外
		selectOutMap.put("DDJC_HWRXJC_BASE", "YSJL_ID");
		selectOutMap.put("DDJC_HWRXJC_DATA", "SJID");
		//GIS超声
		selectOutMap.put("DDJC_GISCSJF_BASE", "YSJL_ID");
		selectOutMap.put("DDJC_GISCSJF_DATA", "SJID");
		//GIS特高频
		selectOutMap.put("DDJC_GISTGPJF_BASE", "YSJL_ID");
		selectOutMap.put("DDJC_GISTGPJF_DATA", "SJID");
		//开关柜超声
		selectOutMap.put("DDJC_KGGCSBJF_BASE", "YSJL_ID");
		selectOutMap.put("DDJC_KGGCSBJF_DATA", "SJID");
		//开关柜暂态地电压
		selectOutMap.put("DDJC_KGGZTDDY_BASE", "YSJL_ID");
		selectOutMap.put("DDJC_KGGZTDDY_DATA", "SJID");
		//=============================================================
	//故障录波表
		selectOutMap.put("ZTXS.T_QXXT_REPORTINFO", "ID");//全息系统总表
		selectOutMap.put("ZTXS.T_QXXT_RECORDFILE", "ID");//全息系统文件表
		selectOutMap.put("ZTXS.T_QXXT_RECORD", "ID");//全息系统录波表
		selectOutMap.put("ZTXS.T_QXXT_RELAY", "ID");//全息系统场站表
		selectOutMap.put("ZTXS.T_GZLB_RECORD", "ID");//故障录波表
		selectOutMap.put("ZTXS.T_JDBH_GZLB_MAIN", "ID");//故障录波主表
		selectOutMap.put("ZTXS.T_JDBH_GZLB_SUB1", "ID");//故障录波从表
		selectOutMap.put("ZTXS.T_JDBH_GZLB_DATA", "ID");//故障录波波形数据
		//=============================================================
	//在线监测
		//装置台账
		selectOutMap.put("ZXJC_APP.CMST_TRANSFDEVICE", "OBJ_ID");//逻辑装置台帐
		selectOutMap.put("ZXJC_APP.CMST_PHYSICSDEVICE", "OBJ_ID");//物理装置台帐
		//状态检测数据
		selectOutMap.put("ZXJC_APP.CMST_TINYWATER", "OBJ_ID");//变压器油中微水
		selectOutMap.put("ZXJC_APP.CMST_PARTDISCHARGE", "OBJ_ID");//变压器局部放电
		selectOutMap.put("ZXJC_APP.CMST_IRONCOREELECTRICITY", "OBJ_ID");//变压器铁芯接地电流
		selectOutMap.put("ZXJC_APP.CMST_GISPARTDISCHARGE", "OBJ_ID");//GIS局部放电
		selectOutMap.put("ZXJC_APP.CMST_LIGHTNINGROD", "OBJ_ID");//金属氧化物避雷器全电流
		selectOutMap.put("ZXJC_APP.CMST_AIRPRESSURE", "OBJ_ID");//GIS_SF6气体压力
		selectOutMap.put("ZXJC_APP.CMST_SOLUBLEGASINOIL", "OBJ_ID");//变压器油中溶解气体
		selectOutMap.put("ZXJC_APP.CMST_AIRMOISTURE", "OBJ_ID");//GIS_SF6气体水分
		//=============================================================
	//气象
		selectOutMap.put("BGW_APP_QX_QXZHYJ", "YJXH");//气象灾害预警数据
		//=============================================================





		
//		selectOutMap.put("xxx", "OBJ_ID");
	}
	
}
