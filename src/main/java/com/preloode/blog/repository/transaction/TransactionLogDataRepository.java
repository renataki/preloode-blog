package com.preloode.blog.repository.transaction;

import com.preloode.blog.model.transaction.TransactionLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TransactionLogDataRepository extends MongoRepository<TransactionLogData, String> {


}
