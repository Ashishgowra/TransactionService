package org.ashish.assessment.transactionservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ashish.assessment.transactionservice.model.Transaction;
import org.ashish.assessment.transactionservice.service.TransactionService;

@Path("/transactions")
public class Resource {
	
	TransactionService transactionService = new TransactionService();
	
	@PUT
	@Path("transaction/{transaction_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Transaction addTransaction(@PathParam("transaction_id") long id, Transaction transaction){
		transaction.setId(id);
		return transactionService.addTransaction(transaction);
	}
	
//	@PUT
//	@Path("transaction/{transaction_id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Transaction updateTransaction(@PathParam("transaction_id") long id, Transaction transaction){
//		transaction.setId(id);
//		return transactionService.updateTransaction(transaction);
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Transaction> getAllTransaction(){
		return transactionService.getAllTransactions();
	}
	
	@GET
	@Path("transaction/{transaction_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Transaction getTransaction(@PathParam("transaction_id") long id) throws Throwable{
		return transactionService.getTransaction(id);
	}
	
	@GET
	@Path("types/{type}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Transaction> getTransactionOfType(@PathParam("type") String type){
		return transactionService.getTransactionOfType(type);
	}
	
	@GET
	@Path("sum/{transaction_id}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public double getSum(@PathParam("transaction_id") long id){
		return transactionService.getSumAmount(id);
	}
	
}
