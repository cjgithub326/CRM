/**
 * 
 */
package com.hik.util;

import java.util.List;

/**
 * @ClassName: ColletionUtil
 * @Description: ���Ϲ����� 
 * @author jed
 * @date 2017��8��19������4:20:51
 *
 */
public class CollectionUtil {

	/**
	 * 
	 * @MethodName: isEmpty
	 * @Description: ����Ϊ��
	 * @author jed
	 * @date 2017��8��19������4:27:09
	 * @param @param list
	 * @param @return    
	 * @return boolean    ��������
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
	 * @Description: ���ϲ�Ϊ�� 
	 * @author jed
	 * @date 2017��8��19������4:33:13
	 * @param @param list
	 * @param @return    
	 * @return boolean    ��������
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
