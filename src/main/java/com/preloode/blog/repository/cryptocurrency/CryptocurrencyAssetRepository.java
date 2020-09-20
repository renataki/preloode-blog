package com.preloode.blog.repository.cryptocurrency;

import com.preloode.blog.model.cryptocurrency.CryptocurrencyAsset;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface CryptocurrencyAssetRepository extends MongoRepository<CryptocurrencyAsset, String> {


    @Query("{'name' : {$in : ?0}}")
    public List<CryptocurrencyAsset> findInName(Set<String> name);


}
