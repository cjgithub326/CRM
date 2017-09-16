/**
 * 
 */
package com.hik.quartz;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hik.service.CustomerService;

/**
 * @ClassName: FindLossCustomerJob
 * @Description: ������ʧ�ͻ� ��ʱ����
 * @author jed
 * @date 2017��9��11������12:16:05
 *
 */
@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService;
	
	/**
	 * ÿһ���Ӷ���ִ��һ��
	 */
	@Scheduled(cron="0 0/1 * * * ? ")
	public void work(){
		customerService.checkCustomerLoss();
	}
	
}
