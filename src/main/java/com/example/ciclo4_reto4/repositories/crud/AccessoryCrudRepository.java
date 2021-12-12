package com.example.ciclo4_reto4.repositories.crud;


import com.example.ciclo4_reto4.models.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccessoryCrudRepository extends MongoRepository<Accessory,String>  {

    Optional<Accessory> findById(String reference);
}
