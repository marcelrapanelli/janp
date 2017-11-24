package com.janp.justanormalperson.models;

/**
 * Created by Marcel.Tavares on 23/06/2017.
 */
public class LootModel {

    private ItemModel equip;
    private int dropRate;

    public ItemModel getEquip() {
        return equip;
    }

    public void setEquip(ItemModel equip) {
        this.equip = equip;
    }

    public int getDropRate() {
        return dropRate;
    }

    public void setDropRate(int dropRate) {
        this.dropRate = dropRate;
    }
}
