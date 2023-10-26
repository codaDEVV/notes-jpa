package com.coda.notes.models;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Component
@Entity
public class Note {
    private int id;
    private String title;
    private String content;
    private LocalDate creationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must not be negative");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (content.length() < 50 && !content.isEmpty()) {
            this.title = title;
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content.length() < 200 && !content.isEmpty()) {
            this.content = content;
        }
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

}
