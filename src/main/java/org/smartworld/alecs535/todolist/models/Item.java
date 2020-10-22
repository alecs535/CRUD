package org.smartworld.alecs535.todolist.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todolist.item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long idList;
    @Column
    private Date dateCreate;
    @Column
    private Date dateModify;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private int urgencyId;
    @Column
    private Boolean isDone;

    public long getIdList() {
        return idList;
    }

    public void setIdList(long idList) {
        this.idList = idList;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateModify() {
        return dateModify;
    }

    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUrgencyId() {
        return urgencyId;
    }

    public void setUrgencyId(int urgencyId) {
        this.urgencyId = urgencyId;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }


}