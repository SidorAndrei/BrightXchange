package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphics-card-producer")
public class GraphicsCardProducerController {
    @GetMapping
    public List<GraphicsCardProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GraphicsCardProducer getById(@PathVariable("id") Long id){
        return null;
    }

}