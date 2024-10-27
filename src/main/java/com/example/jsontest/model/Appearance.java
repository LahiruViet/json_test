package com.example.jsontest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Appearance {

    private String id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Type type;
    private List<String> tags;
    private String url;
}
