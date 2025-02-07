package com.nvbwcho.vehichletyperegister;

import com.nvbwcho.vehichletyperegister.services.BodyTypeService;
import com.nvbwcho.vehichletyperegister.services.DoorTypeService;
import com.nvbwcho.vehichletyperegister.services.WagonTypeService;
import com.nvbwcho.vehichletyperegister.vehichletype.ExtendedBoolean;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.TypeOfDoorOpening;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class VehichletyperegisterApplication  {


	@Autowired
	private DoorTypeService doorTypeService;

	@Autowired

	private BodyTypeService bodyTypeService;

	@Autowired
	private WagonTypeService wagonTypeService;

	public static void main(String[] args) {
		SpringApplication.run(VehichletyperegisterApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeDatbase() {

		return  args -> {
			createTestWagonType();

		};

	}

	void createTestDoorType() {

		GenericWagonDoorType bombardierTalentThreeDoor = new GenericWagonDoorType(TypeOfDoorOpening.AUTOMATIC, 130, "standardBombardierDoor");

		doorTypeService.saveDoorType(bombardierTalentThreeDoor);

		/*List<GenericWagonDoorType> allDoorTypes=doorTypeService.getExistingDoorTypes();
		if(allDoorTypes.size()>0){
			for(GenericWagonDoorType genericWagonDoorType:allDoorTypes){
				System.out.println(genericWagonDoorType);
			}
		}*/

	}


	void createTestBodyType(){
		GenericWagonBodyType bombardierTalentThreeBody=new GenericWagonBodyType();
		bombardierTalentThreeBody.setBodyTypeAbbreviation("bomdardierTalentThree");
		bombardierTalentThreeBody.setMinimumHeightOfFloorFromGround_D3100(60);
		bombardierTalentThreeBody.setAccessibleToiletAvailable_D3061(ExtendedBoolean.AVAILABLE);
		bodyTypeService.saveBodyType(bombardierTalentThreeBody);
		Optional<GenericWagonBodyType> bodyType=bodyTypeService.getBodyTypeByAbbreviation("bomdardierTalentThree");
		System.out.println(bodyType.get());



	}


	void createTestWagonType(){

		createTestDoorType();
		createTestBodyType();
		Optional<GenericWagonDoorType> doorType=doorTypeService.getDoorTypeByAbbreviation("standardBombardierDoor");
		Optional<GenericWagonBodyType> bodyType=bodyTypeService.getBodyTypeByAbbreviation("bomdardierTalentThree");
		WagonType wagonType=new WagonType(bodyType.get(),doorType.get(),"bombardierTalentThree");
		wagonTypeService.saveWagonType(wagonType);
		List<WagonType> allTypes=wagonTypeService.getAllWagonTyes();
		for(WagonType wagonwagonType:allTypes ){
			System.out.println(wagonwagonType);

		}
	}

}
