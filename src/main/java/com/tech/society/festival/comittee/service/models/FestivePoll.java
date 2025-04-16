package com.tech.society.festival.comittee.service.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document(collection = "festive_polls")
public class FestivePoll {

    @Id
    private String id;
    private long customId;
    private String societyId;
    private String occasionId;
    private String title;
    private String description;
    private String pollType; // e.g., committee-formation
    private List<String> rolesAvailable;
    private Date startTime;
    private Date endTime;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
    private int isActive;

    public FestivePoll() {}

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCustomId() {
        return customId;
    }

    public void setCustomId(long customId) {
        this.customId = customId;
    }

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getOccasionId() {
        return occasionId;
    }

    public void setOccasionId(String occasionId) {
        this.occasionId = occasionId;
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

    public String getPollType() {
        return pollType;
    }

    public void setPollType(String pollType) {
        this.pollType = pollType;
    }

    public List<String> getRolesAvailable() {
        return rolesAvailable;
    }

    public void setRolesAvailable(List<String> rolesAvailable) {
        this.rolesAvailable = rolesAvailable;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "FestivePoll{" +
                "customId=" + customId +
                ", societyId='" + societyId + '\'' +
                ", occasionId='" + occasionId + '\'' +
                ", title='" + title + '\'' +
                ", pollType='" + pollType + '\'' +
                ", rolesAvailable=" + rolesAvailable +
                '}';
    }
}