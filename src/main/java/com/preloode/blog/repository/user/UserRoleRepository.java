package com.preloode.blog.repository.user;

import com.preloode.blog.enumeration.global.Status;
import com.preloode.blog.model.user.UserRole;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRoleRepository extends MongoRepository<UserRole, String> {


    @Query("{'name' : ?0}")
    public UserRole findByName(String name);


    @Query("{'status' : ?0}")
    public List<UserRole> findByStatusSort(Status status, Sort sort);


}
