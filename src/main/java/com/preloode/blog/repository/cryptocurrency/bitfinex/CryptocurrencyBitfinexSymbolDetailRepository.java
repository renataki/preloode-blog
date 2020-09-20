package com.preloode.blog.repository.cryptocurrency.bitfinex;

import com.preloode.blog.model.cryptocurrency.bitfinex.CryptocurrencyBitfinexSymbolDetail;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CryptocurrencyBitfinexSymbolDetailRepository extends MongoRepository<CryptocurrencyBitfinexSymbolDetail, String> {


}
