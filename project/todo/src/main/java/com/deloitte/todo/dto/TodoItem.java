package com.deloitte.todo.dto;

import com.deloitte.todo.model.ToDoEntiy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoItem {
    private int id;
    private String task;
    private Boolean done;
    private String lastUpdateTime;
     public TodoItem(ToDoEntiy entity){
        this.id = entity.getId();
        this.task = entity.getTask();
        this.done =entity.getDone();
        this.lastUpdateTime= entity.getLastUpdateTime();
    }
}
