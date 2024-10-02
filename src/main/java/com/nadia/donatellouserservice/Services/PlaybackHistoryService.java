package com.nadia.donatellouserservice.Services;

import com.nadia.donatellouserservice.Entities.PlayBackHistory;
import com.nadia.donatellouserservice.Repositories.PlaybackHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaybackHistoryService {

    @Autowired
    private PlaybackHistoryRepository playbackHistoryRepository;

    public List<PlayBackHistory> getUserPlaybackHistory(Long userId) {
        return playbackHistoryRepository.findAllByUserId(userId);
    }

    public PlayBackHistory addPlaybackHistory(PlayBackHistory history) {
        return playbackHistoryRepository.save(history);
    }
}
