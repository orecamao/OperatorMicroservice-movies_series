package com.operador.ms1.movies_series.controllers;

import com.operador.ms1.movies_series.models.MediaModel;
import com.operador.ms1.movies_series.services.MediaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/media-elements")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @GetMapping
    public ArrayList<MediaModel> getMediaElements() {
        return this.mediaService.getMediaElements();
    }

    @PostMapping
    public MediaModel saveMediaElement(@RequestBody MediaModel request) {
        return this.mediaService.saveMediaElement(request);
    }

    @GetMapping(path = "/{id}")
    public Optional<MediaModel> getMediaElementById(@PathVariable("id") Long id) {
        return this.mediaService.getMediaElementById(id);
    }

    @PutMapping(path = "/{id}")
    public MediaModel updateMediaElementById(@RequestBody MediaModel request, @PathVariable("id") Long id) {
        return this.mediaService.updateMediaElementById(request, id);
    }

    @PatchMapping(path = "/{id}")
    public MediaModel patchMediaElementById(@RequestBody MediaModel request, @PathVariable("id") Long id) {
        return this.mediaService.updateMediaElementById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteMediaElementById(@PathVariable("id") Long id) {
        boolean ok = this.mediaService.deleteMediaElementById(id);
        if(ok) {
            return "User with id ".concat(id.toString()).concat(" has been deleted.");
        } else {
            return "Error deleting user with id ".concat(id.toString()).concat(".");
        }
    }
}
