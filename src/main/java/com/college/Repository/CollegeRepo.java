package com.college.Repository;

import com.college.model.CollegeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends MongoRepository<CollegeDetails,String> {
}
