package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.RandomAccessMemoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RAMService")
public class RAMService {
    @Autowired
    private RandomAccessMemoryDAO randomAccessMemoryDAO;
}