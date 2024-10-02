package com.nadia.donatellouserservice.Repositories;

import com.nadia.donatellouserservice.Entities.PlayBackHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaybackHistoryRepository extends JpaRepository<PlayBackHistory, Long> {
    List<PlayBackHistory> findAllByUserId(Long userId);
}
