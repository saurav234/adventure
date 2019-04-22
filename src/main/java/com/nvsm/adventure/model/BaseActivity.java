package com.nvsm.adventure.model;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
public class BaseActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;

    private Date endDate;

    private Long type;

    private String image;

    private Long maxParticipants;

    private Long minParticipants;

    private Double cost;

    private String name;
    @Column(length=1024)
    private String description;

    private String eligibilityDescription;

    private Long duration;

    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(Long maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public Long getMinParticipants() {
        return minParticipants;
    }

    public void setMinParticipants(Long minParticipants) {
        this.minParticipants = minParticipants;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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

    public String getEligibilityDescription() {
        return eligibilityDescription;
    }

    public void setEligibilityDescription(String eligibilityDescription) {
        this.eligibilityDescription = eligibilityDescription;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
