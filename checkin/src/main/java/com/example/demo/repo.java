package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<book,String>{
@Query("{'name':?0,'fid':?1}")
book get(String name,String fid);
}
