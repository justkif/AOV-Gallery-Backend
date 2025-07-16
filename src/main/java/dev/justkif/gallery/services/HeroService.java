package dev.justkif.gallery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.justkif.gallery.dtos.HeroWithThumbnail;
import dev.justkif.gallery.exceptions.NotFoundException;
import dev.justkif.gallery.models.Hero;
import dev.justkif.gallery.repositories.HeroRepository;
import dev.justkif.gallery.utils.throwIf;

@Service
public class HeroService {

    private final HeroRepository heroRepository;
    private final SkinService skinService;

    public HeroService(HeroRepository heroRepository, SkinService skinService) {
        this.heroRepository = heroRepository;
        this.skinService = skinService;
    }

    public List<HeroWithThumbnail> getAllWithThumbnails() {
        List<Hero> heroes = heroRepository.findAll();
        throwIf.listEmpty(heroes, new NotFoundException("No heros found."));
        return heroes.stream()
            .map(hero -> {
                List<Integer> skinIds = hero.skin_ids();
                if (skinIds != null && !skinIds.isEmpty()) {
                    Integer defaultSkinId = skinIds.get(0);
                    return HeroWithThumbnail.createOne(
                        hero.name(),
                        skinService.getThumbnail(defaultSkinId)
                    );
                }
                return HeroWithThumbnail.createOne(hero.name(), null);
            })
            .toList();
    }

}
