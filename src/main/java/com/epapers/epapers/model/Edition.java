package com.epapers.epapers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Edition {
    @JsonProperty("EditionId")
    String editionId;
    @JsonProperty("EditionDisplayName")
    String editionName;
}
