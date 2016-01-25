package org.ashish.assessment.transactionservice.database;

import java.util.HashMap;
import java.util.Map;

import org.ashish.assessment.transactionservice.model.Transaction;

public class DataTable {
	private static Map<Long, Transaction> transactions = new HashMap<>();

	public static Map<Long, Transaction> getTransactions() {
		return transactions;
	}
}
