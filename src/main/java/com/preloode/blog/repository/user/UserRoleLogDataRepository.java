package com.preloode.blog.repository.user;

import com.preloode.blog.model.user.UserRoleLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRoleLogDataRepository extends MongoRepository<UserRoleLogData, String> {


}
