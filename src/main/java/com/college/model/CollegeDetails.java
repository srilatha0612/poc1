package com.college.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class CollegeDetails {
    private  String Collegename;
    private String CollegeAddress;
    private int numberofstudents;
}
