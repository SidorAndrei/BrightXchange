package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/random-access-memory-type")
public class RandomAccessMemoryTypeController {
    @GetMapping
    public List<RandomAccessMemoryType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public RandomAccessMemoryType getById(@PathVariable("id") Long id){
        return null;
    }
}