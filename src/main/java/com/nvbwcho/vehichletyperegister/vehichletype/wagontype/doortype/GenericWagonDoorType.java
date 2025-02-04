package com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype;


import jakarta.persistence.*;
import jakarta.websocket.ClientEndpoint;

@Entity
@Table(name = "wagondoortype")
public class GenericWagonDoorType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @Column
    private TypeOfDoorOpening openingType_D3040;

    @Column
    private Integer widthOfDoor_D3041;


    @Column(unique = true)
    private String doorTypeAbbreviation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfDoorOpening getOpeningType_D3040() {
        return openingType_D3040;
    }

    public void setOpeningType_D3040(TypeOfDoorOpening openingType_D3040) {
        this.openingType_D3040 = openingType_D3040;
    }

    public Integer getWidthOfDoor_D3041() {
        return widthOfDoor_D3041;
    }

    public void setWidthOfDoor_D3041(Integer widthOfDoor_D3041) {
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
        return "GenericWagonDoorType{" +
                "doorTypeAbbreviation='" + doorTypeAbbreviation + " doorwidth='" + widthOfDoor_D3041+ " dooropening='" + openingType_D3040+ '\'' +
                '}';
    }


    public GenericWagonDoorType() {
    }


    public GenericWagonDoorType(TypeOfDoorOpening openingType_D3040, Integer widthOfDoor_D3041, String doorTypeAbbreviation) {
        this.openingType_D3040 = openingType_D3040;
        this.widthOfDoor_D3041 = widthOfDoor_D3041;
        this.doorTypeAbbreviation = doorTypeAbbreviation;
    }
}
