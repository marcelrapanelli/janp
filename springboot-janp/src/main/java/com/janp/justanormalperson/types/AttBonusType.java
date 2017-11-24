package com.janp.justanormalperson.types;

import com.janp.justanormalperson.enums.AttEnum;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
public class AttBonusType {
    private AttEnum attribute;
    private int bonusValue;

    public AttEnum getAttribute() {
        return attribute;
    }

    public void setAttribute(AttEnum attribute) {
        this.attribute = attribute;
    }

    public int getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(int bonusValue) {
        this.bonusValue = bonusValue;
    }
}
