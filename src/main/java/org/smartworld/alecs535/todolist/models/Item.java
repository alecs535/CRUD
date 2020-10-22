package org.smartworld.alecs535.todolist.models;

import javax.persistence.*;
import java.util.*;

/**
 * Класс описания дела.
 */
@Entity
@Table(name = "todolist.item")
public class Item {

    /** Идентификатор дела */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /** Идентификатор списка, в который входит дело */
    @Column
    private long idList;

    /** Дата создания дела */
    @Column
    private Date dateCreate;

    /** Дата изменения дела */
    @Column
    private Date dateModify;

    /** Название дела */
    @Column
    private String title;

    /** Краткое описание дела */
    @Column
    private String description;

    /** Срочность дела */
    @Column
    private int urgencyId;

    /** Состояние сделано или нет дело */
    @Column
    private Boolean isDone;

    /**
     * @return Получить идентификатор списка
     */
    public long getIdList() {
        return idList;
    }

    /**
     * @param idList Присвоить идентификатор списка
     */
    public void setIdList(long idList) {
        this.idList = idList;
    }

    /**
     * @return Получить дату создания дела
     */
    public Date getDateCreate() {
        return dateCreate;
    }

    /**
     * @param dateCreate Установить дату создания дела
     */
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    /**
     * @return Получить дату изменения дела
     */
    public Date getDateModify() {
        return dateModify;
    }

    /**
     * @param dateModify Установить дату изменения дела
     */
    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    /**
     * @return Получить название дела
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title Установить название дела
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Получить краткое описание дела
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Установить краткое описание дела
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Получить срочность дела
     */
    public int getUrgencyId() {
        return urgencyId;
    }

    /**
     * @param urgencyId Установить срочность дела
     */
    public void setUrgencyId(int urgencyId) {
        this.urgencyId = urgencyId;
    }

    /**
     * @return Получить состояние сделано или нет
     */
    public Boolean getIsDone() {
        return isDone;
    }

    /**
     * @param done Установить состояние сделано или нет
     */
    public void setIsDone(Boolean done) {
        this.isDone = done;
    }


}