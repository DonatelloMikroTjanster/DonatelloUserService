package com.nadia.donatellouserservice.Services;

import com.nadia.donatellouserservice.Entities.Media;
import com.nadia.donatellouserservice.Repositories.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    public List<Media> getMedia() {
        return mediaRepository.findAll();
    }

    public Media getMediaById(Long id) {
        return mediaRepository.findById(id).orElse(null);
    }

   /* public Media createMedia(Media media) {
        return mediaRepository.save(media);
    }

    public Media updateMedia(Long id, Media updatedMedia) {
        return mediaRepository.findById(id).map(media -> {
            media.setTitle(updatedMedia.getTitle());
            media.setMediaType(updatedMedia.getMediaType());
            return mediaRepository.save(media);
        }).orElse(null);
    }

    public void deleteMedia(Long id) {
        mediaRepository.deleteById(id);
    }

    */


}
