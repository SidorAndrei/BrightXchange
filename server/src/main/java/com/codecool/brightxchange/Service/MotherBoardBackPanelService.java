package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.MotherBoardBackPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("MotherBoardBackPanelService")
public class MotherBoardBackPanelService{
    @Autowired
    @Qualifier("MotherBoardBackPanelMemory")
    private MotherBoardBackPanelDAO motherBoardBackPanelDAO;
}