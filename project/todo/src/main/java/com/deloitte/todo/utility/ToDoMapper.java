package com.deloitte.todo.utility;

import com.deloitte.todo.model.ToDoEntiy;
import com.deloitte.todo.dto.TodoItem;

import java.util.List;
import java.util.stream.Collectors;

public class ToDoMapper {

    /**
     * method to map Entity To DTO List
     * @param entiyList
     * @return
     */
    public static List<TodoItem> mapToDTO(List<ToDoEntiy> entiyList){
            return entiyList.stream()
                .map(TodoItem::new).collect(Collectors.toList());
    }
}
