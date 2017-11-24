package com.janp.justanormalperson.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
@Document(collection = "deposit")
public class HeroDepositModel {

    private String id;
    private List<EquipModel> equips;
    private List<WeaponModel> weapons;
//    private List<CommonItemModel> items;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EquipModel> getEquips() {
        return equips;
    }

    public void setEquips(List<EquipModel> equips) {
        this.equips = equips;
    }

    public List<WeaponModel> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<WeaponModel> weapons) {
        this.weapons = weapons;
    }
}
