package org.ashish.assessment.transactionservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ashish.assessment.transactionservice.database.DataTable;
import org.ashish.assessment.transactionservice.model.Transaction;

public class TransactionService {
	
	private Map<Long, Transaction> transactions = DataTable.getTransactions();
	
	public TransactionService(){
		transactions.put(1L, new Transaction(1L, 5000.00, "debit", 0L));
		transactions.put(2L, new Transaction(2L, 15000.00, "debit", 1L));
		transactions.put(3L, new Transaction(3L, 25000.00, "debit", 1L));
		transactions.put(4L, new Transaction(4L, 6000.00, "credit", 0L));
		transactions.put(5L, new Transaction(5L, 5000.00, "credit", 4L));
	}
	
	public List<Transaction> getAllTransactions(){
		return new ArrayList<Transaction>(transactions.values());
	}
	
	public Transaction getTransaction(long id) throws Throwable{
		Transaction t = transactions.get(id);
		if(t == null)
			throw new Throwable();
		return t;
	}
	
	public Transaction addTransaction(Transaction transaction){
		//transaction.setId(transactions.size()+1);
		transactions.put(transaction.getId(), transaction);
		return transaction;
	}
	
	public Transaction updateTransaction(Transaction transaction){
		transactions.put(transaction.getId(), transaction);
		return transaction;
	}
	
	public Transaction removeTransaction(long id){
		return transactions.remove(id);
		
	}
	
	public List<Transaction> getTransactionOfType(String type){
		List<Transaction> tList = new ArrayList<>();
		for(Map.Entry<Long, Transaction> entry : transactions.entrySet()){
			if(entry.getValue().getType().equals(type)){
				tList.add(entry.getValue());
			}
		}
		return tList;
	}
	
	public double getSumAmount(long id){
		double sum = transactions.get(id).getAmount();
		for(Map.Entry<Long, Transaction> entry : transactions.entrySet()){
			if(entry.getValue().getParentId()== id){
				sum = sum + entry.getValue().getAmount();
			}
		}	
		return sum;
	}

}
