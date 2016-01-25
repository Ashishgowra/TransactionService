# TransactionService
Transaction Services for storing, returning and updating transactions

Resource methods:

1. PUT /transactionservice/transaction/$transaction_id
   - public Transaction addTransaction() method
   
2. GET /transactionservice/transaction/$transaction_id
  - public Transaction getTransaction() method
  
3. GET /transactionservice/types/$type  [Returning whole transactions instead of only transaction ids]
   - public List<Transaction> getTransactionOfType()
  
4. GET /transactionservice/sum/$transaction_id
  - public double getSum()
  - 
  
Testing:
- Done using POSTMAN Rest Client in Chrome.
- Sample transaction data is in code itself.
