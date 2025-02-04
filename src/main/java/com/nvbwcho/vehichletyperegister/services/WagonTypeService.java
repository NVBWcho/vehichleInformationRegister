package com.nvbwcho.vehichletyperegister.services;

import com.nvbwcho.vehichletyperegister.daos.WagonTypeDoa;
import com.nvbwcho.vehichletyperegister.repositories.GenericDoorTypeRepo;
import com.nvbwcho.vehichletyperegister.repositories.GenericWagonBodyTypeRepo;
import com.nvbwcho.vehichletyperegister.repositories.WagonTypeRepo;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WagonTypeService {


    @Autowired
    private WagonTypeRepo wagonTypeRepo;


    @Autowired
    private GenericWagonBodyTypeRepo genericWagonBodyTypeRepo;

    @Autowired
    private GenericDoorTypeRepo genericDoorTypeRepo;


    public void saveWagonType(WagonType wagonType){
        wagonTypeRepo.save(wagonType);
    }

    public List<WagonType> getAllWagonTyes(){
        return  wagonTypeRepo.findAll();
    }




    public Optional<WagonType> addNewWagonType(WagonTypeDoa wagonTypeDoa){
        WagonType wagonType=new WagonType();
        Optional<GenericWagonBodyType> inputBodyType=genericWagonBodyTypeRepo.findByBodyTypeAbbreviation(wagonTypeDoa.getBodyTypeAbbreviation());
        Optional<GenericWagonDoorType> inputDoorType=genericDoorTypeRepo.findByDoorTypeAbbreviation(wagonTypeDoa.getDoorTypeAbbreviation());
        wagonType.setGenericWagonBodyType(inputBodyType.get());
        wagonType.setGenericWagonDoorType(inputDoorType.get());
        wagonType.setVehichleTyeAbbreviation(inputBodyType.get().getBodyTypeAbbreviation()+":"+inputDoorType.get().getDoorTypeAbbreviation());

        return Optional.of(wagonTypeRepo.save(wagonType));


    }
}
