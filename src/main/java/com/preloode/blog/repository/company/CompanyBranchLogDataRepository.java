package com.preloode.blog.repository.company;

import com.preloode.blog.model.company.CompanyBranchLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CompanyBranchLogDataRepository extends MongoRepository<CompanyBranchLogData, String> {


}
