package com.deloitte.todo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TODO_TBL")
public class ToDoEntiy {
    @Column
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String task;
    @Column
    private Boolean done;
    @Column
    private String lastUpdateTime;
    @ManyToOne
    private User user;
}
