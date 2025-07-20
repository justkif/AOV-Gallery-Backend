package dev.justkif.gallery.services;

import org.springframework.stereotype.Service;

import dev.justkif.gallery.repositories.HeroRepository;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

}
