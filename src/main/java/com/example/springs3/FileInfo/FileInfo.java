package com.example.springs3.FileInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
public class FileInfo {
    @Id
    private int id;
    private String name;
    @NotEmpty
    private String description;
    private LocalDate localDate;
    private String imageURL;

    public FileInfo(int id, String name, String description, LocalDate localDate, String imageURL) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.localDate = localDate;
        this.imageURL = imageURL;
    }

    public FileInfo() {
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                ", imageURL='" + imageURL + '\'' +
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
