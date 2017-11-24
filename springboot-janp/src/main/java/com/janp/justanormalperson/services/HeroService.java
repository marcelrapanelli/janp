package com.janp.justanormalperson.services;

import com.janp.justanormalperson.models.HeroModel;
import com.janp.justanormalperson.populators.HeroPopulator;
import com.janp.justanormalperson.repository.impl.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
@Service
public class HeroService {

//    @Value("${hybris.export.class.attribute.value.endpoint}")
//    private String apiExportAttributeValue;

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private HeroPopulator heroPopulator;

    public boolean generateHero(String heroName){
        boolean successOnCreation = false;
        HeroModel heroModel = getHeroByName(heroName);
        if(heroModel == null){
            heroModel = new HeroModel(heroName);
            heroRepository.save(heroModel);
            successOnCreation = true;
        }

        return successOnCreation;
    }

    public boolean updateHero(HeroModel heroData){
        boolean successOnCreation = false;
        HeroModel heroModel = getHeroByName(heroData.getName());
        if(heroModel != null){
            heroPopulator.populate(heroData, heroModel);
            heroRepository.save(heroModel);
            successOnCreation = true;
        }

        return successOnCreation;
    }

    public List<HeroModel> getHeroListForAccount(String accountId){
        List<HeroModel> herolist = heroRepository.findByAccountId(accountId);
        return herolist;
    }

    public HeroModel getHeroByName(String name){
        HeroModel hero = heroRepository.findByName(name);
        return hero;
    }
}
