package dev.justkif.gallery.repositories;

import org.springframework.data.repository.ListCrudRepository;

import dev.justkif.gallery.models.Hero;

public interface HeroRepository extends ListCrudRepository<Hero, Integer> {

}
