package com.nvbwcho.vehichletyperegister.daos;

import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.TypeOfDoorOpening;
import jakarta.persistence.Column;

import java.util.Optional;

public class DoorTypeDao {

    private Optional<TypeOfDoorOpening> openingType_D3040;


    private Optional<Integer> widthOfDoor_D3041;



    private String doorTypeAbbreviation;

    public Optional<TypeOfDoorOpening> getOpeningType_D3040() {
        return openingType_D3040;
    }

    public void setOpeningType_D3040(Optional<TypeOfDoorOpening> openingType_D3040) {
        this.openingType_D3040 = openingType_D3040;
    }

    public Optional<Integer> getWidthOfDoor_D3041() {
        return widthOfDoor_D3041;
    }

    public void setWidthOfDoor_D3041(Optional<Integer> widthOfDoor_D3041) {
        this.widthOfDoor_D3041 = widthOfDoor_D3041;
    }

    public String getDoorTypeAbbreviation() {
        return doorTypeAbbreviation;
    }

    public void setDoorTypeAbbreviation(String doorTypeAbbreviation) {
        this.doorTypeAbbreviation = doorTypeAbbreviation;
    }

    @Override
    public String toString() {
        return "DoorTypeDao{" +
                "openingType_D3040=" + openingType_D3040 +
                ", widthOfDoor_D3041=" + widthOfDoor_D3041 +
                ", doorTypeAbbreviation='" + doorTypeAbbreviation + '\'' +
                '}';
    }
}
