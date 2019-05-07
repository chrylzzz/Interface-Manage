package com.lnsoft.commons.selectMap.in;

import java.util.HashMap;
import java.util.Map;

/**
 * key:城市 value:topic
 * 
 * @author Chr
 *
 */
public class EmsKafkaMap {
	public static final Map<String, String> emsKafkaMap = new HashMap<String, String>();
	static {
		// empkafka-缩写
		emsKafkaMap.put("pmsln", "wjd");//省调
		emsKafkaMap.put("jn", "jnalllcz");
		emsKafkaMap.put("jin", "jinalllcz");
		emsKafkaMap.put("bz", "bzalllcz");
		emsKafkaMap.put("dy", "dyalllcz");
		emsKafkaMap.put("dz", "dzalllcz");
		emsKafkaMap.put("hz", "hzalllcz");
		emsKafkaMap.put("lc", "lcalllcz");
		emsKafkaMap.put("lw", "lwalllcz");
		emsKafkaMap.put("rz", "rzalllcz");
		emsKafkaMap.put("taa", "taalllcz");
		emsKafkaMap.put("wf", "wfalllcz");
		emsKafkaMap.put("wh", "whalllcz");
		emsKafkaMap.put("yt", "ytalllcz");
		emsKafkaMap.put("zb", "zballlcz");
		emsKafkaMap.put("zz", "zzalllcz");
		emsKafkaMap.put("qd", "qdalllcz");
		emsKafkaMap.put("ly", "lyalllcz");
		//emskafka-全名
//		emsKafkaMap.put("省调", "wjd");//省调
//		emsKafkaMap.put("济南", "jnalllcz");
//		emsKafkaMap.put("济宁", "jinalllcz");
//		emsKafkaMap.put("滨州", "bzalllcz");
//		emsKafkaMap.put("东营", "dyalllcz");
//		emsKafkaMap.put("德州", "dzalllcz");
//		emsKafkaMap.put("菏泽", "hzalllcz");
//		emsKafkaMap.put("聊城", "lcalllcz");
//		emsKafkaMap.put("莱芜", "lwalllcz");
//		emsKafkaMap.put("日照", "rzalllcz");
//		emsKafkaMap.put("泰安", "taalllcz");
//		emsKafkaMap.put("潍坊", "wfalllcz");
//		emsKafkaMap.put("威海", "whalllcz");
//		emsKafkaMap.put("烟台", "ytalllcz");
//		emsKafkaMap.put("淄博", "zballlcz");
//		emsKafkaMap.put("枣庄", "zzalllcz");
//		emsKafkaMap.put("青岛", "qdalllcz");
//		emsKafkaMap.put("临沂", "lyalllcz");
		// 量测类型
		emsKafkaMap.put("P", "yes");
		emsKafkaMap.put("Q", "yes");
		emsKafkaMap.put("U", "yes");
		emsKafkaMap.put("I", "yes");
		emsKafkaMap.put("Uab", "yes");
		emsKafkaMap.put("OT", "yes");
		emsKafkaMap.put("Ua", "yes");
		emsKafkaMap.put("Ub", "yes");
		emsKafkaMap.put("Uc", "yes");
		emsKafkaMap.put("Ia", "yes");
		emsKafkaMap.put("Ib", "yes");
		emsKafkaMap.put("Ic", "yes");
		emsKafkaMap.put("Ubc", "yes");
		emsKafkaMap.put("Uca", "yes");
		emsKafkaMap.put("Uac", "yes");
		emsKafkaMap.put("Ucb", "yes");
	}
	
//	地市：pmsln,jn,jin,bz,dy,dz,hz,lc,lw,rz,ta,wf,wh,yt,zb,zz,qd,ly
//	量测类型：P,Q,U,I,Uab,OT,Ua,Ub,Uc,Ia,Ib,Ic,Ubc,Uca,Uac,Ucb
	// topics：
	// wjd,省调，pmsln
	// jnalllcz,济南
	// jinalllcz,济宁
	// bzalllcz,滨州
	// dyalllcz,东营
	// dzalllcz,德州
	// hzalllcz,菏泽
	// lcalllcz,聊城
	// lwalllcz,莱芜
	// rzalllcz,日照
	// taalllcz,泰安
	// wfalllcz,潍坊
	// whalllcz,威海
	// ytalllcz,烟台
	// zballlcz,淄博
	// zzalllcz,枣庄
	// qdalllcz,青岛
	// lyalllcz,临沂
}
