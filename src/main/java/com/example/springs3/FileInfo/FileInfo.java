package com.example.springs3.FileInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class FileInfo {
    @Id
    private int id;
    private String name;
    @Size(min = 2, message = "Description must be at least 2 characters long")
    @NotEmpty
    private String description;
    private LocalDate localDate;

    public FileInfo(int id, String name, String description, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.localDate = localDate;
    }

    public FileInfo() {

    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
