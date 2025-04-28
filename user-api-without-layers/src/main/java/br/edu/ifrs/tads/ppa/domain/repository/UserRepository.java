package br.edu.ifrs.tads.ppa.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import br.edu.ifrs.tads.ppa.domain.model.User;

public interface UserRepository extends ListCrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    // This interface will automatically provide CRUD operations for the User entity
    // You can add custom query methods here if needed

    Optional<User> findByHandle(String handle);

    boolean existsByHandle(String handle);
    

}
