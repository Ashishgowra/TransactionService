package org.ashish.assessment.transactionservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction {
	private long id;
	private double amount;
	private String type;
    private long parentId = 0L;
    
    public Transaction(){} 
    
    public Transaction(long id, double amount, String type, long parentId) {
    	this.id = id;
    	this.amount = amount;
    	this.type = type;
    	this.parentId = parentId;
	}

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}



}
