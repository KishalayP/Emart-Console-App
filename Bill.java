package com.Emart;

public class Bill {
	private int billdate;
	private int billmonth;
	private int billyear;
	private long bcustid;
	private String bcustname;
	private float discount;
	private long orderid;
	private int amountPayable;
	public int getBilldate() {
		return billdate;
	}
	public void setBilldate(int billdate) {
		this.billdate = billdate;
	}
	public int getBillmonth() {
		return billmonth;
	}
	public void setBillmonth(int billmonth) {
		this.billmonth = billmonth;
	}
	public int getBillyear() {
		return billyear;
	}
	public void setBillyear(int billyear) {
		this.billyear = billyear;
	}
	public long getBcustid() {
		return bcustid;
	}
	public void setBcustid(long bcustid) {
		this.bcustid = bcustid;
	}
	public String getBcustname() {
		return bcustname;
	}
	public void setBcustname(String bcustname) {
		this.bcustname = bcustname;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public long getAmountPayable() {
		return amountPayable;
	}
	public void setAmountPayable(int amountPayable) {
		this.amountPayable = amountPayable;
	}
	
	public Bill(int billdate,int billmonth,int billyear,long bcustid,String bcustname,float discount,long l,int amountpayable) {
		this.billmonth=billmonth;
		this.billyear=billyear;
		this.billdate=billdate;
		this.billmonth=billmonth;
		this.billyear=billyear;
		this.bcustid=bcustid;
		this.bcustname=bcustname;
		this.discount=discount;
		this.orderid=l;
		this.amountPayable=amountpayable;
	}
	public Bill(int billdate,int billmonth,int billyear,long bcustid,String bcustname,long orderid,int amontpayable) {
		this.billmonth=billmonth;
		this.billyear=billyear;
		this.billdate=billdate;
		this.billmonth=billmonth;
		this.billyear=billyear;
		this.bcustid=bcustid;
		this.bcustname=bcustname;
		this.amountPayable=amontpayable;
		
		this.orderid=orderid;
	}
}
