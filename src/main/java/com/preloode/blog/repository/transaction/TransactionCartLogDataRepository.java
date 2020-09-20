package com.preloode.blog.repository.transaction;

import com.preloode.blog.model.transaction.TransactionCartLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionCartLogDataRepository extends MongoRepository<TransactionCartLogData, String> {


}
