/**
 * 
 */
package com.hik.util;

import java.util.List;

/**
 * @ClassName: ColletionUtil
 * @Description: 集合工具类 
 * @author jed
 * @date 2017年8月19日下午4:20:51
 *
 */
public class CollectionUtil {

	/**
	 * 
	 * @MethodName: isEmpty
	 * @Description: 集合为空
	 * @author jed
	 * @date 2017年8月19日下午4:27:09
	 * @param @param list
	 * @param @return    
	 * @return boolean    返回类型
	 * @param list
	 * @return
	 *
	 */
	public static boolean isEmpty(List<?> list){
		if(null==list||list.size()==0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 
	 * @MethodName: isNotEmpty
	 * @Description: 集合不为空 
	 * @author jed
	 * @date 2017年8月19日下午4:33:13
	 * @param @param list
	 * @param @return    
	 * @return boolean    返回类型
	 * @param list
	 * @return
	 *
	 */
	public static boolean isNotEmpty(List<?> list){
		if(null!=list && !list.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
