package com.example.ciclo4_reto4.repositories.crud;


import com.example.ciclo4_reto4.models.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplementsCrudRepository extends MongoRepository<Supplements,String> {

}
