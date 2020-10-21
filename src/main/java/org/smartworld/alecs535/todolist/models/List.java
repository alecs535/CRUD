package org.smartworld.alecs535.todolist.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
public class List {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private Date dateCreate;
    private Date dateModify;
    private String title;

}
