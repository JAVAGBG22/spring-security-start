package com.example.authStarter.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {
    @Id
    private String id;

    private String title;
    private String description;


    public Todo() {

    }

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;

    }

    public String getId() {
        return id;
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


    @Override
    public String toString() {
        return "Todo [id=" + id + ", title=" + title + ", desc=" + description + "]";
    }
}
