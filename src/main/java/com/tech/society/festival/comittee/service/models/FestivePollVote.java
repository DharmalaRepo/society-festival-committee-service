package com.tech.society.festival.comittee.service.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "festive_poll_votes")
public class FestivePollVote {

    @Id
    private String id;
    private long customId;
    private long pollId;
    private String societyId;
    private String occasionId;
    private String residentId;
    private String interestedRole;
    private String reason;
    private String status; // Pending, Approved, Rejected
    private Date votedDate;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
    private int isActive;

    public FestivePollVote() {}

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

    public long getPollId() {
        return pollId;
    }

    public void setPollId(long pollId) {
        this.pollId = pollId;
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

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getInterestedRole() {
        return interestedRole;
    }

    public void setInterestedRole(String interestedRole) {
        this.interestedRole = interestedRole;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getVotedDate() {
        return votedDate;
    }

    public void setVotedDate(Date votedDate) {
        this.votedDate = votedDate;
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
        return "FestivePollVote{" +
                "pollId=" + pollId +
                ", residentId='" + residentId + '\'' +
                ", interestedRole='" + interestedRole + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}