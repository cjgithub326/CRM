/**
 * 
 */
package com.hik.entity;

/**
 * @ClassName: CustomerReprieve
 * @Description: �ͻ���ʧ�ݻ���ʩʵ����
 * @author jed
 * @date 2017��9��17������10:02:30
 *
 */
public class CustomerReprieve {

	private Integer id;  //���
	private CustomerLoss customerLoss;  // �ͻ���ʧ
	private String measure;  // �ݻ���ʩ
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CustomerLoss getCustomerLoss() {
		return customerLoss;
	}
	public void setCustomerLoss(CustomerLoss customerLoss) {
		this.customerLoss = customerLoss;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	
	
}
