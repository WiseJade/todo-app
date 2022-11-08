package com.todo.todolist.todo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.todo.todolist.user.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TODO_ID")
    private Long todoId;

    @Column(name = "BODY")
    private String body;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "DUE_DATE")
    private Date dueDate;

    @Column(name = "IS_DONE")
    private boolean isDone;

    @Setter
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    @JsonBackReference
    private User user;
}
