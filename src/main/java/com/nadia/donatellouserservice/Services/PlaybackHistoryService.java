package com.nadia.donatellouserservice.Services;

import com.nadia.donatellouserservice.Entities.PlaybackHistory;
import com.nadia.donatellouserservice.Repositories.PlaybackHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaybackHistoryService {

    @Autowired
    private PlaybackHistoryRepository playbackHistoryRepository;

    public List<PlaybackHistory> getUserPlaybackHistory(Long userId) {
        return playbackHistoryRepository.findAllByUserId(userId);
    }

    public PlaybackHistory addPlaybackHistory(PlaybackHistory history) {
        return playbackHistoryRepository.save(history);
    }
}
