package org.highload.oblivionheadhunter.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterHeroDto {

    private String name;
    private String gender;
    private Integer level;
    private String raceName;
    private String className;
    private String password;

}
