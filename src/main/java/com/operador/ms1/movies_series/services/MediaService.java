package com.operador.ms1.movies_series.services;

import com.operador.ms1.movies_series.models.MediaModel;
import com.operador.ms1.movies_series.repositories.IMediaRepository;
import com.operador.ms1.movies_series.utils.MediaElementsMapper;
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

        return mediaRepository.save(MediaElementsMapper.toUpdate(request, mediaElement));
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
