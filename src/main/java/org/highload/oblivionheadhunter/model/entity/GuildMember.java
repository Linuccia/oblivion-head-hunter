package org.highload.oblivionheadhunter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "guild_member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuildMember {

    @EmbeddedId
    private GuildMemberId id;

    @Column(name = "rang")
    @NotEmpty
    @NotNull
    private String rang;

}
