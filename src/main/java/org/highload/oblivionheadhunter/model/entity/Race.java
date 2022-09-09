package org.highload.oblivionheadhunter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "race")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Race {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    @NotEmpty
    @NotNull
    private String description;


    @OneToOne
    @JoinColumn(name = "attributes_id")
    private Attributes attributes;

}
