package com.nvbwcho.vehichletyperegister.services;

import com.nvbwcho.vehichletyperegister.daos.WagonTypeDoa;
import com.nvbwcho.vehichletyperegister.exceptions.NonUniqueValueException;
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

    @Autowired
    private BodyTypeService bodyTypeService;

    @Autowired
    private DoorTypeService doorTypeService;


    public void saveWagonType(WagonType wagonType){
        wagonTypeRepo.save(wagonType);
    }

    public List<WagonType> getAllWagonTyes(){
        return  wagonTypeRepo.findAll();
    }




    public Optional<WagonType> addNewWagonType(WagonTypeDoa wagonTypeDoa){
        //System.out.println(wagonTypeDoa.getBodyTypeAbbreviation());
        //System.out.println(wagonTypeDoa.getDoorTypeAbbreviation());


        try {


            Optional<GenericWagonBodyType> bodyType=bodyTypeService.getBodyTypeByAbbreviation("bomdardierTalentThree");
            System.out.println(bodyType);
            Optional<GenericWagonBodyType> inputBodyType=bodyTypeService.getBodyTypeByAbbreviation(wagonTypeDoa.getBodyTypeAbbreviation());
            System.out.println(inputBodyType);
            Optional<GenericWagonDoorType> inputDoorType=doorTypeService.getDoorTypeByAbbreviation(wagonTypeDoa.getDoorTypeAbbreviation());

            WagonType wagonType=new WagonType(inputBodyType.get(),inputDoorType.get());

            wagonType.setVehichleTyeAbbreviation(inputBodyType.get().getBodyTypeAbbreviation()+":"+inputDoorType.get().getDoorTypeAbbreviation());
            return Optional.of(wagonTypeRepo.save(wagonType));
        }catch (Exception e){
            System.out.println("i am here");
            throw  new NonUniqueValueException("this wagontype already exists");
        }





    }
}
