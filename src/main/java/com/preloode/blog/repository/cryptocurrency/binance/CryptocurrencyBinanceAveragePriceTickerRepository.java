package com.preloode.blog.repository.cryptocurrency.binance;

import com.preloode.blog.model.cryptocurrency.binance.CryptocurrencyBinanceAveragePriceTicker;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CryptocurrencyBinanceAveragePriceTickerRepository extends MongoRepository<CryptocurrencyBinanceAveragePriceTicker, String> {


}
