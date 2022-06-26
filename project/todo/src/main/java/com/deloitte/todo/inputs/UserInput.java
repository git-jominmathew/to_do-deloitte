package com.deloitte.todo.inputs;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserInput {
    @NotNull(message = "Name may not be null")
    private String name;
    @NotNull(message = "password may not be null")
    private String password;
}
