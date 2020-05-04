package com.example.datacouchbase;

import com.example.datacouchbase.entities.Building;
import com.example.datacouchbase.repositories.BuildingRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@SpringBootApplication
public class DataCouchbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataCouchbaseApplication.class, args);
    }



}

@RestController
class BuildingController {
    @Autowired
    private BuildingRepository repository;

    @GetMapping("/")
    public Iterable<Building> getAll() {
        return repository.findAll();

    }
}