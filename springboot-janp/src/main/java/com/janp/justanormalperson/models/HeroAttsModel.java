package com.janp.justanormalperson.models;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
// WORKS LIKE A POJO
public class HeroAttsModel {
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
}
