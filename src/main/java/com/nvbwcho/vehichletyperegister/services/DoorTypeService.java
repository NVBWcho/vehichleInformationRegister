package com.nvbwcho.vehichletyperegister.services;

import com.nvbwcho.vehichletyperegister.daos.DoorTypeDao;
import com.nvbwcho.vehichletyperegister.repositories.GenericDoorTypeRepo;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoorTypeService {

    @Autowired
    private GenericDoorTypeRepo genericDoorTypeRepo;


    public void saveDoorType(GenericWagonDoorType genericWagonDoorType){
        genericDoorTypeRepo.save(genericWagonDoorType);
    }

    public List<GenericWagonDoorType> getExistingDoorTypes(){
        List<GenericWagonDoorType> allDoorTypes=genericDoorTypeRepo.findAll();

        return allDoorTypes;
    }

    public  Optional<GenericWagonDoorType> getDoorTypeByAbbreviation(String doorTypeAbbreviation){
        return genericDoorTypeRepo.findByDoorTypeAbbreviation(doorTypeAbbreviation);
    }


    public Optional<GenericWagonDoorType> addNewDoorType(DoorTypeDao doorTypeDao){
        GenericWagonDoorType genericWagonDoorType=new GenericWagonDoorType();

        doorTypeDao.getOpeningType_D3040().ifPresent(genericWagonDoorType::setOpeningType_D3040);
        doorTypeDao.getWidthOfDoor_D3041().ifPresent(genericWagonDoorType::setWidthOfDoor_D3041);
        genericWagonDoorType.setDoorTypeAbbreviation(doorTypeDao.getDoorTypeAbbreviation());

        genericDoorTypeRepo.save(genericWagonDoorType);
        return  genericDoorTypeRepo.findByDoorTypeAbbreviation(doorTypeDao.getDoorTypeAbbreviation());
    }
}
