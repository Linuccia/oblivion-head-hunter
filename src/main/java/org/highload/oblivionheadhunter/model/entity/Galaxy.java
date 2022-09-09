package org.highload.oblivionheadhunter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "galaxy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Galaxy {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    @NotEmpty
    @NotNull
    private String description;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attributes_id")
    @NotNull
    private Attributes attributes;

}
