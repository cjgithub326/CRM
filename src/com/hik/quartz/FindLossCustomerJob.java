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
 * @Description: 查找流失客户 定时任务
 * @author jed
 * @date 2017年9月11日上午12:16:05
 *
 */
@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService;
	
	/**
	 * 每一分钟定期执行一次
	 */
	@Scheduled(cron="0 0/1 * * * ? ")
	public void work(){
		customerService.checkCustomerLoss();
	}
	
}
