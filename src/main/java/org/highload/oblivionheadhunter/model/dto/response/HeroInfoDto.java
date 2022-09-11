package org.highload.oblivionheadhunter.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.highload.oblivionheadhunter.model.entity.Attributes;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroInfoDto {

    private String name;
    private String gender;
    private Integer level;
    private String raceName;
    private String className;
    private String galaxyName;
    private Attributes attributes;

}
