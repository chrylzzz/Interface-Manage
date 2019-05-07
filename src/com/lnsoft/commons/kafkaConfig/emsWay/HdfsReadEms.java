package com.lnsoft.commons.kafkaConfig.emsWay;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lnsoft.commons.utils.DateUtils;
import com.lnsoft.commons.utils.HdfsUtil;
import com.lnsoft.module.ems.kafka.service.KafkaService;

/**
 * 
 * @author Chr
 *
 *         读取ems在hadoop上最新的文件
 * 
 */
@Component
public class HdfsReadEms {

	@Autowired
	private KafkaService kafkaService;

	/**
	 * 根据城市，量测类型日期，查ems数据
	 * 
	 * @param city
	 * @param lcType
	 * @param date
	 * @return
	 * 
	 * 该方法直接拼接 hdfs的对应的city，和lcType和date路径，不需要在判断，取出的数据都为需要的数据类型
	 */
	public ArrayList<String> readEMSByCityLcTypeDate(String city, String lcType, String date) {
		String path = DateUtils.changeStringDateNOtxt(date);
		System.out.println(path);
		String endFileName = HdfsUtil.getEndFileName(//
				"hdfs://nncluster/data-repository/ods/ems-" + city + "/measurements/" + lcType + "/realtime-detail/"
						+ path);
		System.out.println(endFileName);
		ArrayList<String> list = HdfsUtil.readFileByDate(//
				"hdfs://nncluster/data-repository/ods/ems-" + city + "/measurements/" + lcType + "/realtime-detail/"
						+ path + "/" + endFileName);
		//查出对应的所有量测类型的keyId
/*		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
		List<String> keyIds = kafkaService.queryLcType(lcType);*/
		//
//		List<String> allData = new ArrayList<String>();
//		//list里放的是所有的:xxx&xxxxx&xxxx
//		for (String message : list) {
//			String keyId = KafkaDataUtil.splitString(message);
//			for (String s : keyIds) {
//				if (s.equals(keyId)) {
//
//					allData.add(message);
//				}
//			}
//		}
//		return allData;
		return list;
	}

	public static void main(String[] args) {
		// String path = DateUtils.changeStringDate("2018.09.06");
		// test("pmsln", "I", "2018.12.19");
//		List<String> allDate =new HdfsReadEms().readEMSByCityLcTypeDate("pmsln", "I", "2018.12.19");
//		for (String s : allDate) {
//			System.out.println(s);
//		}
//		long startTime=System.currentTimeMillis();
//		new Thread(new Runnable(){
//
//			
//			@Override
//			public void run() {
//				for(int x=0;x<5;x++){
//					new HdfsReadEms().readEMSByCityLcTypeDate("pmsln", "I", "2018.12.19");
//				}
//			}
//			
//			
//			
//		}).start();
//		long endTime =System.currentTimeMillis();
//		System.err.println("=============="+(endTime-startTime)+"===============");
	}
	// ========================
	// public static List<String> test(String city, String lcType, String date)
	// {
	// String path = DateUtils.changeStringDateNOtxt(date);
	// System.out.println(path);
	// String endFileName = HdfsUtil.getEndFileName(//
	// "hdfs://nncluster/data-repository/ods/ems-" + city + "/measurements/" +
	// lcType + "/realtime-detail/"
	// + path);
	// System.out.println(endFileName);
	// List<String> list = HdfsUtil.readFileByDate(//
	// "hdfs://nncluster/data-repository/ods/ems-" + city + "/measurements/" +
	// lcType + "/realtime-detail/"
	// + path + "/" + endFileName);
	// System.out.println("================");
	// for (String s : list) {
	// System.out.println(s);
	// }
	// return list;
	// }
	

}
