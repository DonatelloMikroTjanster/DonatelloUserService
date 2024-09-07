package com.nadia.donatellouserservice.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String mediacategory; //enum klass

    @OneToMany(mappedBy = "media", cascade = CascadeType.ALL)
    private List<PlaybackHistory> playbackHistories;

    @OneToMany(mappedBy = "media", cascade = CascadeType.ALL)
    private List<Rating> ratings;


    //Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMediacategory() {
        return mediacategory;
    }

    public void setMediacategory(String mediaType) {
        this.mediacategory = mediaType;
    }

    public List<PlaybackHistory> getPlaybackHistories() {
        return playbackHistories;
    }

    public void setPlaybackHistories(List<PlaybackHistory> playbackHistories) {
        this.playbackHistories = playbackHistories;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
