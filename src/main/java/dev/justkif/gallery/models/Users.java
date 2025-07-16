package dev.justkif.gallery.models;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotEmpty;

public record Users(

    @Id
    String username,

    @NotEmpty
    String password

) {

}
