package com.nadia.donatellouserservice.Repositories;

import com.nadia.donatellouserservice.Entities.PlaybackHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaybackHistoryRepository extends JpaRepository<PlaybackHistory, Long> {
    List<PlaybackHistory> findAllByUserId(Long userId);
}
