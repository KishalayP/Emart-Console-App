package com.Emart;

public class Order {
	private long orderId;
	private long orderedItemid;
	private long ordercustid;
	private int orderquantity;
	private int orderedprice;
	private String itemname;
	private String paymentstatus;
	private String deliverystatus;
	private String ordercustname;
	
	public String getOrdercustname() {
		return ordercustname;
	}

	public void setOrdercustname(String ordercustname) {
		this.ordercustname = ordercustname;
	}

	public String getDeliverystatus() {
		return deliverystatus;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public void setDeliverystatus(String deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public Order() {
		
	}

	public Order(long orderid,long Itemid,long orderedcustid,String itemname,int orderquantity,int orderprice) {
		this.orderId=orderid;
		this.orderedItemid=Itemid;
		this.ordercustid=orderedcustid;
		this.orderquantity=orderquantity;
		this.orderedprice=orderprice;
		this.itemname=itemname;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getOrderedItemid() {
		return orderedItemid;
	}

	public void setOrderedItemid(long orderedItemid) {
		this.orderedItemid = orderedItemid;
	}

	public long getOrdercustid() {
		return ordercustid;
	}

	public void setOrdercustid(long ordercustid) {
		this.ordercustid = ordercustid;
	}

	public int getOrderquantity() {
		return orderquantity;
	}

	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}

	public int getOrderedprice() {
		return orderedprice;
	}

	public void setOrderedprice(int orderedprice) {
		this.orderedprice = orderedprice;
	}
	 
	public void paymentstatus() {
		
	}
	
}
