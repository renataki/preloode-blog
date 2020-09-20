package com.preloode.blog.repository.shop;

import com.preloode.blog.model.shop.ShopBrandLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShopBrandLogDataRepository extends MongoRepository<ShopBrandLogData, String> {


}
