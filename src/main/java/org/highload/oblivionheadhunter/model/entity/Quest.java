package org.highload.oblivionheadhunter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quest")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quest {

    @Id
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "guild_name")
    private Guild guild;

    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "conditions_id")
    private Conditions conditions;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reward_id")
    private Reward reward;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hero_name")
    private Hero hero;

    @Column(name = "status")
    private String status;

}
