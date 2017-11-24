package com.janp.justanormalperson.populators;

import com.janp.justanormalperson.models.HeroModel;
import org.springframework.stereotype.Component;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
@Component
public class HeroPopulator {

    public void populate(HeroModel source, HeroModel target) {
        target.setBaseHp(source.getBaseHp());
        target.setAttack(source.getAttack());
        target.setDefense(source.getDefense());
        target.setSpeed(source.getSpeed());
        target.setGold(source.getGold());
    }
}
