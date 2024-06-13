package com.operador.ms1.movies_series.services;

import com.operador.ms1.movies_series.models.MediaModel;
import com.operador.ms1.movies_series.repositories.IMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MediaService {

    @Autowired
    IMediaRepository mediaRepository;

    public ArrayList<MediaModel> getMediaElements() {
        return (ArrayList<MediaModel>) mediaRepository.findAll();
    }

    public MediaModel saveMediaElement(MediaModel request) {
        return mediaRepository.save(request);
    }

    public Optional<MediaModel> getMediaElementById(Long id) {
        return mediaRepository.findById(id);
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public MediaModel updateMediaElementById(MediaModel request, Long id) {
        MediaModel mediaElement = mediaRepository.findById(id).get();

        return mediaRepository.save(mapMediaElements(request, mediaElement));
    }

    private MediaModel mapMediaElements(MediaModel request, MediaModel mediaElement) {

        if (null != request.getType()) {
            mediaElement.setType(request.getType());
        }
        if (null != request.getTitle()) {
            mediaElement.setTitle(request.getTitle());
        }
        if (null != request.getPoster()) {
            mediaElement.setPoster(request.getPoster());
        }
        if (null != request.getDescription()) {
            mediaElement.setDescription(request.getDescription());
        }
        if (null != request.getDirector()) {
            mediaElement.setDirector(request.getDirector());
        }
        if (null != request.getReleaseYear()) {
            mediaElement.setReleaseYear(request.getReleaseYear());
        }
        if (null != request.getDuration()) {
            mediaElement.setDuration(request.getDuration());
        }
        if (null != request.getRating()) {
            mediaElement.setRating(request.getRating());
        }
        if (null != request.getTrailerID()) {
            mediaElement.setTrailerID(request.getTrailerID());
        }
        if (null != request.getAvailable()) {
            mediaElement.setAvailable(request.getAvailable());
        }
        if (null != request.getPrice()) {
            mediaElement.setPrice(request.getPrice());
        }
        if (null != request.getState()) {
            mediaElement.setState(request.getState());
        }

        return mediaElement;
    }

    public Boolean deleteMediaElementById(Long id) {
        try {
            mediaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
