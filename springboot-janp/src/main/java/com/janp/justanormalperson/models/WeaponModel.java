package com.janp.justanormalperson.models;

import com.janp.justanormalperson.enums.WeaponEnum;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
@Document(collection = "weapon")
public class WeaponModel extends ItemModel {

    private WeaponEnum weaponType;

    public WeaponEnum getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponEnum weaponType) {
        this.weaponType = weaponType;
    }
}
