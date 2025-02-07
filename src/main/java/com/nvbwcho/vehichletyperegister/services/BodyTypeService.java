package com.nvbwcho.vehichletyperegister.services;

import com.nvbwcho.vehichletyperegister.daos.BodyTypeDao;
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

    public Optional<GenericWagonBodyType> addNewBodyType(BodyTypeDao bodyTypeDao){
        GenericWagonBodyType genericWagonBodyType=new GenericWagonBodyType();
        if(bodyTypeDao.getAreaForMobilityRestrictedAvailable_D3050().isPresent()){
            genericWagonBodyType.setAreaForMobilityRestrictedAvailable_D3050(bodyTypeDao.getAreaForMobilityRestrictedAvailable_D3050().get());
        }


        bodyTypeDao.getInformationDisplayInternal_D3020().ifPresent(genericWagonBodyType::setInformationDisplayInternal_D3020);

        bodyTypeDao.getInformationDisplayExternal_D3021().ifPresent(genericWagonBodyType::setInformationDisplayExternal_D3021);



        bodyTypeDao.getLoudspeakerAutomatic_D3030().ifPresent(genericWagonBodyType::setLoudspeakerAutomatic_D3030);

        bodyTypeDao.getLoudSpeakerManual_D3031().ifPresent(genericWagonBodyType::setLoudSpeakerManual_D3031);

        bodyTypeDao.getLocationOfMobilityAreaForMobilityRestricted_D3051().ifPresent(genericWagonBodyType::setLocationOfMobilityAreaForMobilityRestricted_D3051);

        bodyTypeDao.getToiletAvailable_D3060().ifPresent(genericWagonBodyType::setToiletAvailable_D3060);

        bodyTypeDao.getAccessibleToiletAvailable_D3061().ifPresent(genericWagonBodyType::setAccessibleToiletAvailable_D3061);

        bodyTypeDao.getTicketMachineAvailable_D3070().ifPresent(genericWagonBodyType::setTicketMachineAvailable_D3070);

        bodyTypeDao.getWidthOfWagonAtDoor_D3090().ifPresent(genericWagonBodyType::setWidthOfWagonAtDoor_D3090);

        bodyTypeDao.getMinimumHeightOfFloorFromGround_D3100().ifPresent(genericWagonBodyType::setMinimumHeightOfFloorFromGround_D3100);

        bodyTypeDao.getHeightOfLowestStep_D3101().ifPresent(genericWagonBodyType::setHeightOfLowestStep_D3101);

        bodyTypeDao.getHeightOfStep_D3111().ifPresent(genericWagonBodyType::setHeightOfStep_D3111);

        bodyTypeDao.getNumberOfSteps_D3112().ifPresent(genericWagonBodyType::setNumberOfSteps_D3112);

        bodyTypeDao.getHasStairs_D3110().ifPresent(genericWagonBodyType::setHasStairs_D3110);

        bodyTypeDao.getFoldableSteps_D3113().ifPresent(genericWagonBodyType::setFoldableSteps_D3113);

        genericWagonBodyType.setBodyTypeAbbreviation(bodyTypeDao.getBodyTypeAbbreviation());



        genericWagonBodyTypeRepo.save(genericWagonBodyType);
        return  getBodyTypeByAbbreviation(bodyTypeDao.getBodyTypeAbbreviation());

    }


    public GenericWagonBodyType editBodyTypeDetails(BodyTypeDao bodyTypeDao){
        return  null;
    }




}
