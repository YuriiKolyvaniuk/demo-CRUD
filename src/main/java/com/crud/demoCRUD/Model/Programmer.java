package com.crud.demoCRUD.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROGRAMMERS")
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private Long age;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "EXP_IN_IT")
    private Long exp_in_IT;


}
