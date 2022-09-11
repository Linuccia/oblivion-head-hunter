package org.highload.oblivionheadhunter.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.highload.oblivionheadhunter.model.entity.Conditions;
import org.highload.oblivionheadhunter.model.entity.Reward;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestResponseDto {

    private String name;
    private String guildName;
    private String description;
    private Conditions conditions;
    private Reward reward;
    private String heroName;
    private String status;

}
