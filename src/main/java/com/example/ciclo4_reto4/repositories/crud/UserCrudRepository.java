package com.example.ciclo4_reto4.repositories.crud;


import com.example.ciclo4_reto4.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();

}
