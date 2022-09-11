package org.highload.oblivionheadhunter.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuildEnterRequestDto {

    private Long id;
    private HeroInfoDto heroInfo;

}
