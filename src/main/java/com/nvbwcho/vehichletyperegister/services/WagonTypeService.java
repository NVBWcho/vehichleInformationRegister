package com.nvbwcho.vehichletyperegister.services;

import com.nvbwcho.vehichletyperegister.repositories.WagonTypeRepo;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WagonTypeService {


    @Autowired
    private WagonTypeRepo wagonTypeRepo;


    public void saveWagonType(WagonType wagonType){
        wagonTypeRepo.save(wagonType);
    }

    public List<WagonType> getAllWagonTyes(){
        return  wagonTypeRepo.findAll();
    }
}
