package com.preloode.blog.repository.transaction;

import com.preloode.blog.model.transaction.TicketNumberLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketNumberLogDataRepository extends MongoRepository<TicketNumberLogData, String> {


}
