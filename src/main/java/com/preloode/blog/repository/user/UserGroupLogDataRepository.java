package com.preloode.blog.repository.user;

import com.preloode.blog.model.user.UserGroupLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserGroupLogDataRepository extends MongoRepository<UserGroupLogData, String> {


}
