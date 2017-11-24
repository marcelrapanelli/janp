package com.janp.justanormalperson.datas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Marcel.Tavares on 23/06/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EquipData {

    @JsonProperty("email")
    private String email;
}
