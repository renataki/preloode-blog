package com.preloode.blog.repository.user;

import com.preloode.blog.model.user.UserLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserLogDataRepository extends MongoRepository<UserLogData, String> {


}
