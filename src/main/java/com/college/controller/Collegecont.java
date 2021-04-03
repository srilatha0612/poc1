package com.college.controller;

import com.college.Repository.CollegeRepo;
import com.college.model.CollegeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Collegecont
{
    @Autowired
    public CollegeRepo repo;

@PostMapping
public void createCollegeData(@RequestBody CollegeDetails collegeDetails)
{
    repo.save(collegeDetails);
}
    @GetMapping
            public List<CollegeDetails> getDetails()
    {

        List<CollegeDetails> all = repo.findAll();
        return all;
    }

}

