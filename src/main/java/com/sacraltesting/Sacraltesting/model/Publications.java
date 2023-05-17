package com.sacraltesting.Sacraltesting.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Publications {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String publisher;
    private int days;
    private boolean isActive;
    private String databaseId;
    private LocalDate dateCreated;
    private LocalDate dateModified;
    private String action;
    private String wholesaler;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getPublisher() {
        return publisher;
    }
 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
 
    public int getDays() {
        return days;
    }
 
    public void setDays(int days) {
        this.days = days;
    }
 
    public boolean isActive() {
        return isActive;
    }
 
    public void setActive(boolean active) {
        isActive = active;
    }
 
    public String getDatabaseId() {
        return databaseId;
    }
 
    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }
 
    public LocalDate getDateCreated() {
        return dateCreated;
    }
 
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
 
    public LocalDate getDateModified() {
        return dateModified;
    }
 
    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }
 
    public String getAction() {
        return action;
    }
 
    public void setAction(String action) {
        this.action = action;
    }
 
    public String getWholesaler() {
        return wholesaler;
    }
 
    public void setWholesaler(String wholesaler) {
        this.wholesaler = wholesaler;
    }
}