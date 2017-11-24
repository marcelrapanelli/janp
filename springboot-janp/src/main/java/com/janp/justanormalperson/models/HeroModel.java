package com.janp.justanormalperson.models;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */

@Document(collection = "hero")
public class HeroModel {

    private String id;
    @Indexed(unique = true)
    private String name;
    private String accountId;
    private int level;
    private int baseHp;
    private int attack;
    private int defense;
    private int speed;
    private int gold;

    private HeroAttsModel heroAttributes;
    private HeroEquipModel heroEquips;
    private HeroDepositModel heroDeposit;

    public HeroModel() {}

    public HeroModel(String name) {
        this.name = name;
        this.level = 1;
        this.baseHp = 100;
        this.attack = 5;
        this.defense = 5;
        this.speed = 5;
        this.gold = 100;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public HeroAttsModel getHeroAttributes() {
        return heroAttributes;
    }

    public void setHeroAttributes(HeroAttsModel heroAttributes) {
        this.heroAttributes = heroAttributes;
    }

    public HeroEquipModel getHeroEquips() {
        return heroEquips;
    }

    public void setHeroEquips(HeroEquipModel heroEquips) {
        this.heroEquips = heroEquips;
    }

    public HeroDepositModel getHeroDeposit() {
        return heroDeposit;
    }

    public void setHeroDeposit(HeroDepositModel heroDeposit) {
        this.heroDeposit = heroDeposit;
    }
}
