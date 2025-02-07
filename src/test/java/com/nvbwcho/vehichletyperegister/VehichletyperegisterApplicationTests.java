package com.nvbwcho.vehichletyperegister;

import com.nvbwcho.vehichletyperegister.services.BodyTypeService;
import com.nvbwcho.vehichletyperegister.services.DoorTypeService;
import com.nvbwcho.vehichletyperegister.services.WagonTypeService;
import com.nvbwcho.vehichletyperegister.vehichletype.ExtendedBoolean;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.TypeOfDoorOpening;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class VehichletyperegisterApplicationTests {

	@Autowired
	private DoorTypeService doorTypeService;

	@Autowired
	private BodyTypeService bodyTypeService;


	@Autowired
	private WagonTypeService wagonTypeService;

	@Test
	void contextLoads() {
	}

	@Test
	void someTest(){
		System.out.println("hello test");
	}



	@Test

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

	@Test

	void fetchBodyDetailsByAbbreviation(){

		createTestBodyType();
		Optional<GenericWagonBodyType> bodyType=bodyTypeService.getBodyTypeByAbbreviation("bomdardierTalentThree");
		System.out.println(bodyType.get());

	}

	@Test
	void fetchDoorTypeByAbbreviation(){
		createTestDoorType();
		Optional<GenericWagonDoorType> doorType=doorTypeService.getDoorTypeByAbbreviation("standardBombardierDoor");
		System.out.println(doorType.get());
	}


	@Test
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
