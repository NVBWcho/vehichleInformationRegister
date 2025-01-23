package com.nvbwcho.vehichletyperegister.services;

import com.nvbwcho.vehichletyperegister.repositories.GenericWagonBodyTypeRepo;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BodyTypeService {

    @Autowired
    private GenericWagonBodyTypeRepo genericWagonBodyTypeRepo;

    public  void saveBodyType(GenericWagonBodyType genericWagonBodyType){
        genericWagonBodyTypeRepo.save(genericWagonBodyType);
    }


    public Optional<GenericWagonBodyType> getBodyTypeByAbbreviation(String abbreviation){

        Optional<GenericWagonBodyType> genericWagonBodyType=genericWagonBodyTypeRepo.findByBodyTypeAbbreviation(abbreviation);

        return  genericWagonBodyType;
    }




}
