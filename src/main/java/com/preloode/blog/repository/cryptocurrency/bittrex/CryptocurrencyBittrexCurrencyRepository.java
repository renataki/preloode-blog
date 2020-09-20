package com.preloode.blog.repository.cryptocurrency.bittrex;

import com.preloode.blog.enumeration.cryptocurrency.bittrex.BittrexCurrencyStatus;
import com.preloode.blog.model.cryptocurrency.bittrex.CryptocurrencyBittrexCurrency;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CryptocurrencyBittrexCurrencyRepository extends MongoRepository<CryptocurrencyBittrexCurrency, String> {


    @Query("{'status' : ?0}")
    public List<CryptocurrencyBittrexCurrency> findByStatusSort(BittrexCurrencyStatus status, Sort sort);


}
