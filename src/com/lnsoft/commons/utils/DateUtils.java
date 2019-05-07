package com.lnsoft.commons.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {
		// changeStringDate("2018.01.02");
	}

	/**
	 * Hadoop ld文件格式转换
	 * 
	 * @param date
	 * @return
	 */
	public static String changeStringDate(String date) {// 2018.01.02

		String day = date.replace(".", "-");
		String file = day + ".txt";
		String[] rs = day.split("-");
		String year = date.substring(0, 4);

		String mouth = rs[1];

		String path = year + "/" + year + mouth + "/" + file;
		System.out.println(path);
		return path;// 2018/201811/2018-11-20.txt
	}
	/**
	 * Hadoop ems文件格式转换
	 * @param date
	 * @return
	 */
	
	public static String changeStringDateNOtxt(String date) {// 2018.01.02

		String day = date.replace(".", "-");
		String file = day;
		String[] rs = day.split("-");
		String year = date.substring(0, 4);

		String mouth = rs[1];

		String path = year + "/" + year + mouth + "/" + file;
		System.out.println(path);
		return path;// 2018/201811/2018-11-20.txt
	}
	/**
	 * 监听时间格式转换
	 * 
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	public static Date MillisChange(Long time) throws ParseException {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String dateStr = dateformat.format(time);
		Date date = dateformat.parse(dateStr);
		return date;
	}
}
