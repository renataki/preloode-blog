package com.preloode.blog.repository.cryptocurrency.binance;

import com.preloode.blog.enumeration.cryptocurrency.binance.BinanceSymbolStatus;
import com.preloode.blog.model.cryptocurrency.binance.CryptocurrencyBinanceExchangeInformation;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CryptocurrencyBinanceExchangeInformationRepository extends MongoRepository<CryptocurrencyBinanceExchangeInformation, String> {


    @Query("{'status' : ?0}")
    public List<CryptocurrencyBinanceExchangeInformation> findByStatusSort(BinanceSymbolStatus status, Sort sort);


}
