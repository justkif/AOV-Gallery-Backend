package dev.justkif.gallery.models;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotEmpty;

public record Skin(

    @Id
    Integer id,
    
    @NotEmpty
    String name,

    @NotEmpty
    String thumbnail_link,

    String label_link,

    String image_link,

    String video_link

) {

}
