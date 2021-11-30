package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface repo extends MongoRepository<flight,String>{

}
