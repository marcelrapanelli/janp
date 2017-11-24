package com.janp.justanormalperson.controllers;

import com.janp.justanormalperson.datas.ResponseData;
import com.janp.justanormalperson.models.HeroModel;
import com.janp.justanormalperson.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marcel.Tavares on 16/10/2017.
 */
@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    HeroService heroService;

    @RequestMapping(value = "generate", method = RequestMethod.POST)
    public ResponseEntity<ResponseData> createHero(@RequestBody String heroName) {
        ResponseData responseData = new ResponseData(false, true, "Created with success!");
        if(!heroService.generateHero(heroName)) {
            responseData = new ResponseData(true, false, "Failed to create.");
        }
        return ResponseEntity.ok(responseData);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResponseEntity<ResponseData> updateHero(@RequestBody HeroModel heroModel) {
        ResponseData responseData = new ResponseData(false, true, "Created with success!");
        if(!heroService.updateHero(heroModel)) {
            responseData = new ResponseData(true, false, "Failed to create.");
        }
        return ResponseEntity.ok(responseData);
    }

    @RequestMapping(value = "get-all", method = RequestMethod.GET)
    public ResponseEntity<HeroModel> getAllHeros(@RequestBody String accountId) {
        ResponseEntity responseEntity = ResponseEntity.ok(heroService.getHeroListForAccount(accountId));
        return responseEntity;
    }

    @RequestMapping(value = "get-one", method = RequestMethod.GET)
    public ResponseEntity<HeroModel> getHero(@RequestBody String heroName) {
        ResponseEntity responseEntity = ResponseEntity.ok(heroService.getHeroByName(heroName));
        return responseEntity;
    }
}
