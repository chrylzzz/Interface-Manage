package com.lnsoft.commons.kafkaConfig;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class KafkaDataUtil {
	/**
	 * 得到量测类型
	 * 处理得到xxx&xxx
	 * @param str
	 * @return
	 */
	 public static String splitString(String str) {
	 String[] rs = str.split("&");
	 StringBuffer buff = new StringBuffer(rs[0]);
	 // System.out.println(rs[2]);20181128071239015
	 return buff.append("&").append(rs[1]).toString();
	 }

	/**
	 * 处理mda.key()得到map
	 * 
	 * @param str
	 * @return
	 */
	// str为mda.key()：pmsln&1514094&20181128100042413
	public static HashMap<String, String> allData(String key, String message) {
		HashMap<String, String> map = new HashMap<String, String>();
		String[] rs = key.split("&");
		String keyId=splitString(key);
		// 存放与数据库量测类型的keyId = pmsln&1304657
		map.put("keyId", keyId);
		// 时间
		String news = rs[2].substring(0, rs[2].length() - 3);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime ldt = LocalDateTime.parse(news, dtf);

		DateTimeFormatter fa = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dateTime = ldt.format(fa);
		// 时间，rs[2]:20181128071239015 截取了毫秒：2018-11-28 07:12:39
		map.put("dateTime", dateTime);
		map.put("message", message);
		return map;

	}
	/**
	 * ems处理数据：pmsln&1164527&20181219035144608,0.0
	 * 返回该数据的两侧类型
	 * @param str
	 * @return
	 */
	 public static String splitStringByEMSgetLcType(String str) {
	 String[] rs = str.split("&");
	 //rs[0]pmsln
	 //rs[1]1164527
	 //rs[2]20181219035144608,0.0
	 //rs[3]
	 return rs[1].toString();
	 }
	public static void main(String[] args) {
		 String str = splitString("pmsln&130465788&20181128071239015");
//		 Map<String, String> map = allData("pmsln&1304657222&20181128071239015","xxxx");
//		 for(Map.Entry<String, String> m:map.entrySet()){
//			 System.out.println("key=="+m.getKey());
//			 System.out.println("value=="+m.getValue());
//			 System.out.println("map.get=="+map.get(m));
//		 }
		// System.out.println(str);
//		// String s="20181128071239015";
//		// String news=s.substring(0,s.length()-3);
//		// //System.out.println(news);
//		// DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//		// LocalDateTime ldt=LocalDateTime.parse(news,dtf);
//		// //System.out.println(ldt);
//		// DateTimeFormatter fa=DateTimeFormatter.ofPattern("yyyy-MM-dd
//		// HH:mm:ss");
//		// String datetime=ldt.format(fa);
//		// System.out.println(datetime);
//
//		// Map<String, String> map=allData("pmsln&1304657&20181128071239015");
//		// System.out.println(map.get("keyId"));
//		// System.out.println(map.get("dateTime"));
////		List<Map<String, String>> allDate = new ArrayList<Map<String, String>>();
////		Map<String, String> oneData = new HashMap<String, String>();
////		for (int i = 0; i < 10; i++) {
////
////			oneData.put("x", i + "2");
////			allDate.add(oneData);
////		}
////		for(Map<String, String> map:allDate){
////			for(String s:map.keySet()){
////				System.out.println(s+":"+map.get(s));
////			}
////		}
	}
}
