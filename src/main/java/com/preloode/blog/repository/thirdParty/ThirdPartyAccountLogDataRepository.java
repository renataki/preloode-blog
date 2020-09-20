package com.preloode.blog.repository.thirdParty;

import com.preloode.blog.model.thirdParty.ThirdPartyAccountLogData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ThirdPartyAccountLogDataRepository extends MongoRepository<ThirdPartyAccountLogData, String> {


}
