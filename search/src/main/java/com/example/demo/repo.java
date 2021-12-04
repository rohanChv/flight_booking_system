package com.example.demo;


import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<flight_info,String>{

	@Query("{'route':?0,'date':?1}")
	List<flight_info>findflight(String route,String date);
	@Query("{'fid':?0}")
	flight_info getrd(String fid);
}
