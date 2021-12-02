package com.example.demo;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<fare,String>{
	@Query("{'fid':?0}")
	public Optional<fare>getinfo(String fid);

}
