package com.janp.justanormalperson.repository.impl;

import com.janp.justanormalperson.models.HeroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
public interface HeroRepository extends MongoRepository<HeroModel, String> {

    HeroModel findByName(String name);
    List<HeroModel> findByAccountId(String accountId);
}
