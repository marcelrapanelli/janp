package com.janp.justanormalperson.models;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */

public class HeroEquipModel {
    private EquipModel helmet;
    private EquipModel armor;
    private EquipModel legs;
    private EquipModel boots;
    private EquipModel shield;
    private WeaponModel weapon;

    public EquipModel getHelmet() {
        return helmet;
    }

    public void setHelmet(EquipModel helmet) {
        this.helmet = helmet;
    }

    public EquipModel getArmor() {
        return armor;
    }

    public void setArmor(EquipModel armor) {
        this.armor = armor;
    }

    public EquipModel getLegs() {
        return legs;
    }

    public void setLegs(EquipModel legs) {
        this.legs = legs;
    }

    public EquipModel getBoots() {
        return boots;
    }

    public void setBoots(EquipModel boots) {
        this.boots = boots;
    }

    public EquipModel getShield() {
        return shield;
    }

    public void setShield(EquipModel shield) {
        this.shield = shield;
    }

    public WeaponModel getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponModel weapon) {
        this.weapon = weapon;
    }
}
