package com.todo.todolist.todo.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoPostDto {
    private String title;
    private String body;
}
