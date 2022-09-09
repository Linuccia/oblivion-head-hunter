package org.highload.oblivionheadhunter.model.entity;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TypeDefs(@TypeDef(typeClass = StringArrayType.class, name = "string-array"))
public class User {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    @NotEmpty
    @NotNull
    private String password;

    @Type(type = "string-array")
    @Column(name = "role", columnDefinition = "text[]")
    private String[] roles;

}
