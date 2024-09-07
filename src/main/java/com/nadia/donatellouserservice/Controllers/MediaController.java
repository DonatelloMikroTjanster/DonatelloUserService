package com.nadia.donatellouserservice.Controllers;

import com.nadia.donatellouserservice.Entities.Media;
import com.nadia.donatellouserservice.Repositories.MediaRepository;
import com.nadia.donatellouserservice.Services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;


    @GetMapping("/allmedia")
    public ResponseEntity<List<Media>> getAllMedia() {
        return new ResponseEntity<>(mediaService.getMedia(), HttpStatus.OK);
    }

    @GetMapping("/getmedia/{id}")
    public ResponseEntity<Media> getMediaById(@PathVariable Long id) {
        Media media = mediaService.getMediaById(id);
        return media != null ? new ResponseEntity<>(media, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }




}
