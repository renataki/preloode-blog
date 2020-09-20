package com.preloode.blog.repository.transaction;

import com.preloode.blog.enumeration.transaction.TransactionType;
import com.preloode.blog.model.transaction.TicketNumber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface TicketNumberRepository extends MongoRepository<TicketNumber, String> {


    @Query("{'type' : ?0}")
    public TicketNumber findByType(TransactionType type);


}
