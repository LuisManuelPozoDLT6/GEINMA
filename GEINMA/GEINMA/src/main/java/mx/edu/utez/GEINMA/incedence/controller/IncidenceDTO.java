package mx.edu.utez.GEINMA.incedence.controller;

import mx.edu.utez.GEINMA.experience.model.Experience;
import mx.edu.utez.GEINMA.status.model.Status;
import mx.edu.utez.GEINMA.user.model.User;

public class IncidenceDTO {
    private long id;
    private String description;
    private String dateRegistered;
    private User client;
    private User technical;
    private Status status;
    private Experience experience;

    public IncidenceDTO() {
    }

    public IncidenceDTO(long id, String description, String dateRegistered, User client, User technical, Status status, Experience experience) {
        this.id = id;
        this.description = description;
        this.dateRegistered = dateRegistered;
        this.client = client;
        this.technical = technical;
        this.status = status;
        this.experience = experience;
    }

    public IncidenceDTO(String description, String dateRegistered, User client, Status status) {
        this.description = description;
        this.dateRegistered = dateRegistered;
        this.client = client;
        this.status = status;
    }

    public IncidenceDTO(long id, String description, String dateRegistered, User client, User technical, Status status) {
        this.id = id;
        this.description = description;
        this.dateRegistered = dateRegistered;
        this.client = client;
        this.technical = technical;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getTechnical() {
        return technical;
    }

    public void setTechnical(User technical) {
        this.technical = technical;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
