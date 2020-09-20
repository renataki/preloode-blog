package com.preloode.blog.repository.company;

import com.preloode.blog.model.company.CompanyLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CompanyLogDataRepository extends MongoRepository<CompanyLogData, String> {


}
