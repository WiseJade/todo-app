package com.todo.todolist.user.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.todo.todolist.todo.entity.Todo;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "DISPLAY_NAME", nullable = false, length = 50)
    private String displayName;

    @Column(name = "LOGIN_ID", nullable = false, length = 50)
    private String loginId;

    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    @JsonManagedReference
    private List<Todo> todos = new ArrayList<>();
}
