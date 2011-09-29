package com.reviewboard.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static String toString(Date date){
		return formatter.format(date);
	}
	
	public static Date toDate(String str) throws ParseException{
		return formatter.parse(str);
	}
	
}
