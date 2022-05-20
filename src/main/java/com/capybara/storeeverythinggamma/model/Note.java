package com.capybara.storeeverythinggamma.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Note {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private String title;
    private String description;
    private String category;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date data;

    public Note() {
    }

    public Note(Integer id, String title, String description, String category, Date data) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
