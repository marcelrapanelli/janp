package com.janp.justanormalperson.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
@Document(collection = "enemy")
public class EnemyModel {

    private String name;
    private int level;
    private int baseHp;
    private int attack;
    private int defense;
    private int speed;
    private List<LootModel> lootModel;
    private GoldLootModel goldLootModel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<LootModel> getLootModel() {
        return lootModel;
    }

    public void setLootModel(List<LootModel> lootModel) {
        this.lootModel = lootModel;
    }

    public GoldLootModel getGoldLootModel() {
        return goldLootModel;
    }

    public void setGoldLootModel(GoldLootModel goldLootModel) {
        this.goldLootModel = goldLootModel;
    }
}
