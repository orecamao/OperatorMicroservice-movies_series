package com.operador.ms1.movies_series.utils;

import com.operador.ms1.movies_series.models.MediaModel;

public class MediaElementsMapper {

    public static MediaModel toUpdate(MediaModel request, MediaModel mediaElement) {

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
}
