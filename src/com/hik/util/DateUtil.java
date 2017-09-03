/**
 * 
 */
package com.hik.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: ���ڴ����� 
 * @author jed
 * @date 2017��9��3������10:51:50
 *
 */
public class DateUtil {
	
	/**
	 * 
	 * @MethodName: formatDate
	 * @Description: ����תΪ�ַ�������
	 * @author jed
	 * @date 2017��9��3������10:55:20
	 * @param @param date
	 * @param @param format
	 * @param @return    
	 * @return String    ��������
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
	 * @Description: �����ַ���ת����
	 * @author jed
	 * @date 2017��9��3������10:58:09
	 * @param @param str
	 * @param @param format
	 * @param @return
	 * @param @throws ParseException    
	 * @return Date    ��������
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
	 * @Description: ��ȡ��ǰ�����ַ���
	 * @author jed
	 * @date 2017��9��3������11:00:28
	 * @param @return    
	 * @return String    ��������
	 * @return
	 *
	 */
	public static String getCurrentDateStr(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
	
}
