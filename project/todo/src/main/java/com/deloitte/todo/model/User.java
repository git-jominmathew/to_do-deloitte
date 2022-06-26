package com.deloitte.todo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_TBL")
@Getter
@Setter
public class User {
    @Column
    private String userName;

    @Column
    private String password;

    @Id
    @GeneratedValue
    @Column
    private int id ;

    public User(String name,String pwd){
        this.userName = name;
        this.password = pwd;
    }

}
