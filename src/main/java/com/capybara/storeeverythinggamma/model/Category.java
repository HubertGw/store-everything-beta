package com.capybara.storeeverythinggamma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(min=3, max=20)
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
