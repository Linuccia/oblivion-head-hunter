package org.highload.oblivionheadhunter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "attributes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attributes {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "power")
    @NotNull
    private Integer power;

    @Column(name = "intellect")
    @NotNull
    private Integer intellect;

    @Column(name = "willpower")
    @NotNull
    private Integer willpower;

    @Column(name = "dexterity")
    @NotNull
    private Integer dexterity;

    @Column(name = "speed")
    @NotNull
    private Integer speed;

    @Column(name = "endurance")
    @NotNull
    private Integer endurance;

    @Column(name = "charm")
    @NotNull
    private Integer charm;

    @Column(name = "luck")
    @NotNull
    private Integer luck;

}
