package dev.justkif.gallery.services;

import org.springframework.stereotype.Service;

import dev.justkif.gallery.repositories.SkinRepository;

@Service
public class SkinService {

    private final SkinRepository skinRepository;
    
    public SkinService(SkinRepository skinRepository) {
        this.skinRepository = skinRepository;
    }

}
