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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "hero")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hero {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @NotEmpty
    @NotNull
    private String gender;

    @Column(name = "level")
    @NotNull
    private Integer level;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "race_name")
    private Race race;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hero_class_name")
    private HeroClass heroClass;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "galaxy_name")
    private Galaxy galaxy;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attributes_id")
    private Attributes attributes;

}
