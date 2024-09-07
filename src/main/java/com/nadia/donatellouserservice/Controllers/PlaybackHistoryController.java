package com.nadia.donatellouserservice.Controllers;

import com.nadia.donatellouserservice.Entities.PlaybackHistory;
import com.nadia.donatellouserservice.Services.PlaybackHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playback_history")
public class PlaybackHistoryController {

    @Autowired
    private PlaybackHistoryService playbackHistoryService;

    //hämta uppspelningshistorik för en specifik user
    @GetMapping("/gethistory/{userId}")
    public ResponseEntity<List<PlaybackHistory>> getPlaybackHistory(@PathVariable Long userId) {
        return new ResponseEntity<>(playbackHistoryService.getUserPlaybackHistory(userId), HttpStatus.OK);
    }

    //lägga till uppspelningshistorik
    @PostMapping("/addhistory")
    public ResponseEntity<PlaybackHistory> addPlaybackHistory(@RequestBody PlaybackHistory history) {
        return new ResponseEntity<>(playbackHistoryService.addPlaybackHistory(history),HttpStatus.CREATED);
    }
}
