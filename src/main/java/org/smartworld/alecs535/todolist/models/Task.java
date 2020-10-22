package org.smartworld.alecs535.todolist.models;

import javax.persistence.*;
import java.util.*;

/**
 * Класс описания списка дел.
 */
@Entity
@Table(name = "todolist.task")
public class Task {

    /**
     *  Идентификатор дела
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Date dateCreate;

    @Column
    private Date dateModify;

    @Column
    private String title;

    /**
     * @return Дата создания списка дел
     */
    public Date getDateCreate() {
        return dateCreate;
    }

    /**
     * @param dateCreate Дата создания списка дел
     */
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    /**
     * @return Дата изменения списка дел
     */
    public Date getDateModify() {
        return dateModify;
    }

    /**
     * @param dateModify Дата изменения списка дел
     */
    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    /**
     * @return Название списка дел
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title Название списка дел
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
