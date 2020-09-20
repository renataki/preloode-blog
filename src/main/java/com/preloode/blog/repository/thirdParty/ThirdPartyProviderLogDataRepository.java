package com.preloode.blog.repository.thirdParty;

import com.preloode.blog.model.thirdParty.ThirdPartyProviderLogData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ThirdPartyProviderLogDataRepository extends MongoRepository<ThirdPartyProviderLogData, String> {


}
