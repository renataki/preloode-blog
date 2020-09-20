package com.preloode.blog.repository.shop;

import com.preloode.blog.model.shop.ShopProductLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ShopProductLogDataRepository extends MongoRepository<ShopProductLogData, String> {


}
