package com.lnsoft.commons.ldConfig;

import java.util.ArrayList;
import java.util.List;

import com.lnsoft.commons.utils.DateUtils;
import com.lnsoft.commons.utils.HdfsUtil;

public class HdfsReadFile {
	public static ArrayList<String> readFileByDate(String date) {
		String path = DateUtils.changeStringDate(date);
		ArrayList<String> list = HdfsUtil.readFileByDate(//
				"hdfs://nncluster/data-repository/ods/thunder/realtime-cache/" + path);
		for (String s : list) {
			System.out.println(s);
		}
		return list;
	}

	public static void main(String[] args) {
		// String path = DateUtils.changeStringDate("2018.09.06");
//		 readFileByDate("2018.09.06");
	}
}
