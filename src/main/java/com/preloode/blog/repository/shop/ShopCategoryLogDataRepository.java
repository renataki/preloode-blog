package com.preloode.blog.repository.shop;

import com.preloode.blog.model.shop.ShopCategoryLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShopCategoryLogDataRepository extends MongoRepository<ShopCategoryLogData, String> {


}
