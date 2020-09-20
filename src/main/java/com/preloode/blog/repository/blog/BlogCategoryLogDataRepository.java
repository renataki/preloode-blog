package com.preloode.blog.repository.blog;

import com.preloode.blog.model.blog.BlogCategoryLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogCategoryLogDataRepository extends MongoRepository<BlogCategoryLogData, String> {





}
