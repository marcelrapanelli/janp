package com.janp.justanormalperson.models;

import com.janp.justanormalperson.enums.EquipEnum;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
@Document(collection = "equip")
public class EquipModel extends ItemModel {
    private EquipEnum equipType;

    public EquipEnum getEquipType() {
        return equipType;
    }

    public void setEquipType(EquipEnum equipType) {
        this.equipType = equipType;
    }
}
