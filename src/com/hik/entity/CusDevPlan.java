/**
 * 
 */
package com.hik.entity;

import java.util.Date;

/**
 * @ClassName: CusDevPlan
 * @Description: �ͻ������ƻ�ʵ��
 * @author jed
 * @date 2017��9��2������9:09:46
 *
 */
public class CusDevPlan {
	
	private Integer id; //���
	private SaleChance saleChance; //���ۻ���
	private String planItem;  //�ƻ���
	private Date planDate;  //�ƻ�����
	private String exeAffect; //ִ��Ч��
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SaleChance getSaleChance() {
		return saleChance;
	}
	public void setSaleChance(SaleChance saleChance) {
		this.saleChance = saleChance;
	}
	public String getPlanItem() {
		return planItem;
	}
	public void setPlanItem(String planItem) {
		this.planItem = planItem;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public String getExeAffect() {
		return exeAffect;
	}
	public void setExeAffect(String exeAffect) {
		this.exeAffect = exeAffect;
	}
	
	

}
