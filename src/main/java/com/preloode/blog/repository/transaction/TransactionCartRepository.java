package com.preloode.blog.repository.transaction;

import com.preloode.blog.enumeration.global.Status;
import com.preloode.blog.model.transaction.TransactionCart;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TransactionCartRepository extends MongoRepository<TransactionCart, String> {


    @Query("{'status' : ?0}")
    public List<TransactionCart> findByStatusSort(Status status, Sort sort);


}
