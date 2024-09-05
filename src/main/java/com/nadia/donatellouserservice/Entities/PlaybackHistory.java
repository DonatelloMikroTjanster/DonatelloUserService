package com.nadia.donatellouserservice.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "playback_history")
public class PlaybackHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mediaType;

    private String mediaTitle;

    private LocalDateTime playbackDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    //Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaTitle() {
        return mediaTitle;
    }

    public void setMediaTitle(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    public LocalDateTime getPlaybackDate() {
        return playbackDate;
    }

    public void setPlaybackDate(LocalDateTime playbackDate) {
        this.playbackDate = playbackDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
