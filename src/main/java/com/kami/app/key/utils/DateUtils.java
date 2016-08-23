package com.kami.app.key.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
	
	/**
	 * 获取当前时间，format：(YY-MM-DD HH:MM:SS)
	 * @Description: TODO
	 * @param    
	 * @return void  
	 * @throws
	 * @author Kami
	 * @date 2016年8月16日
	 */
	public static Date getCurDateTime(){
		//设置时区
		TimeZone timeZone = TimeZone.getTimeZone("GMT-8");
		TimeZone.setDefault(timeZone);
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	public static void main(String[] args){
		System.err.println(DateUtils.getCurDateTime());
	}
}
