/**
 * 
 */
package com.hik.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: 日期处理类 
 * @author jed
 * @date 2017年9月3日上午10:51:50
 *
 */
public class DateUtil {
	
	/**
	 * 
	 * @MethodName: formatDate
	 * @Description: 日期转为字符串日期
	 * @author jed
	 * @date 2017年9月3日上午10:55:20
	 * @param @param date
	 * @param @param format
	 * @param @return    
	 * @return String    返回类型
	 * @param date
	 * @param format
	 * @return
	 *
	 */
	public static String formatDate(Date date,String format){
		String result="";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if(date!=null){
			result = sdf.format(date);
		}
		return result;
	}
	
	/**
	 * 
	 * @MethodName: formatString
	 * @Description: 日期字符串转日期
	 * @author jed
	 * @date 2017年9月3日上午10:58:09
	 * @param @param str
	 * @param @param format
	 * @param @return
	 * @param @throws ParseException    
	 * @return Date    返回类型
	 * @param str
	 * @param format
	 * @return
	 * @throws ParseException
	 *
	 */
	public static Date formatString(String str,String format) throws ParseException{
		if(StringUtil.isNotEmpty(str)){
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(str);
	}

	/**
	 * 
	 * @MethodName: getCurrentDateStr
	 * @Description: 获取当前日期字符串
	 * @author jed
	 * @date 2017年9月3日上午11:00:28
	 * @param @return    
	 * @return String    返回类型
	 * @return
	 *
	 */
	public static String getCurrentDateStr(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
	
}
