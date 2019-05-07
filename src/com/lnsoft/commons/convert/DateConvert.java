package com.lnsoft.commons.convert;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 全局日期处理
 * */
public class DateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String stringDate) {
		// SimpleDateFormat dateFormat=new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			if (stringDate.length() > 10) {
				return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.parse(stringDate);
			} else {
				return new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
