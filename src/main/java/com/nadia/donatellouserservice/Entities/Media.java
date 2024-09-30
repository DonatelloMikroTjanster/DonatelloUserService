package com.nadia.donatellouserservice.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "genre", nullable = false, length = 100)
    private String genre;

    @Column(name = "media_category", nullable = false, length = 100)
    private String mediaCategory;

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

    public String getMediaCategory() {
        return mediaCategory;
    }

    public void setMediaCategory(String mediaType) {
        this.mediaCategory = mediaType;
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
