package com.preloode.blog.repository.payment;

import com.preloode.blog.model.payment.PaymentMethodLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PaymentMethodLogDataRepository extends MongoRepository<PaymentMethodLogData, String> {


}
