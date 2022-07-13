package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.ProcessorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("ProcessorService")
public class ProcessorService {
    @Autowired
    @Qualifier("ProcessorMemory")
    private ProcessorDAO processorDAO;
}