package dev.justkif.gallery.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public record Hero(

    @Id
    String name,

    List<Integer> skin_ids

) {

}
