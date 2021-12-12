package com.example.ciclo4_reto4.controllers;



import com.example.ciclo4_reto4.models.Supplements;
import com.example.ciclo4_reto4.services.SupplementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplements")
@CrossOrigin("*")
public class SupplementsController {
    @Autowired
    private SupplementsService supplementsService;

    @GetMapping("/all")
    public List<Supplements> getAll(){
        return supplementsService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplements registrar(@RequestBody Supplements supplements){
        return  supplementsService.registrar(supplements);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplements update(@RequestBody Supplements supplements){
        return supplementsService.update(supplements);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") String id){
        return supplementsService.delete(id);
    }

}

