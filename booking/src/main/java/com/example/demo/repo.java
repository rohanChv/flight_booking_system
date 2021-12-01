package com.example.demo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<book,String>{
@Query("{'fid':?0,'name':?1}")
public book get(String fid,String name);

@Query("{'name':?0}")
public Optional<book> getbooking(String name);
}
