package dev.justkif.gallery.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.justkif.gallery.dtos.HeroWithThumbnail;
import dev.justkif.gallery.services.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("")
    List<HeroWithThumbnail> getAllWithThumbnails() {
        return heroService.getAllWithThumbnails();
    }

}
