package com.operador.ms1.movies_series.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mediaData")
@Getter
@Setter
public class MediaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "poster")
    private String poster;

    @Column(name = "description")
    private String description;

    @Column(name = "director")
    private String director;

    @Column(name = "releaseYear")
    private Integer releaseYear;

    @Column(name = "duration")
    private String duration;

    @Column(name = "rating")
    private String rating;

    @Column(name = "trailerID")
    private String trailerID;

    @Column(name = "available")
    private Boolean available;

    @Column(name = "price")
    private Float price;

    @Column(name = "state")
    private String state;
}
