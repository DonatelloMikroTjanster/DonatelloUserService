package com.nadia.donatellouserservice.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "media_category", nullable = false, length = 100)
    private String mediaCategory;

    @Column(name = "genre", nullable = false, length = 100)
    private String genre;

    @Column(name = "release_date", nullable = false, length = 100)
    private LocalDate releaseDate;

    @Column(name = "url", nullable = false, length = 100)
    private String url;

    @Column(name = "duration", nullable = false, length = 100)
    private String duration;


    @OneToMany(mappedBy = "media", cascade = CascadeType.ALL)
    private List<PlaybackHistory> playbackHistories;

    @OneToMany(mappedBy = "media", cascade = CascadeType.ALL)
    private List<Rating> ratings;


    public Media() {

    }


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

    public void setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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
