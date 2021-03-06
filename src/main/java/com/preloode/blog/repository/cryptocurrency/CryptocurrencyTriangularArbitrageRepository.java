package com.preloode.blog.repository.cryptocurrency;

import com.preloode.blog.enumeration.cryptocurrency.CryptocurrencyArbitrageStatus;
import com.preloode.blog.model.cryptocurrency.CryptocurrencyTriangularArbitrage;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface CryptocurrencyTriangularArbitrageRepository extends MongoRepository<CryptocurrencyTriangularArbitrage, String> {


    @Query("{'status' : {$ne : ?0}}")
    public List<CryptocurrencyTriangularArbitrage> findNotStatusSort(CryptocurrencyArbitrageStatus status, Sort sort);


}
