package dev.justkif.gallery.repositories;

import org.springframework.data.repository.ListCrudRepository;

import dev.justkif.gallery.models.Users;

public interface UsersRepository extends ListCrudRepository<Users, Integer> {

}
