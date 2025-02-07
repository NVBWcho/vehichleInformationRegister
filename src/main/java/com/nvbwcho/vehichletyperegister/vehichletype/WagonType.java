package com.nvbwcho.vehichletyperegister.vehichletype;

import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import jakarta.persistence.*;

@Entity
@Table(name="wagontype")
public  class WagonType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @ManyToOne
    @JoinColumn(name="wagonbodytype_id")
    private GenericWagonBodyType genericWagonBodyType;


    @ManyToOne
    @JoinColumn(name="wagondoortype_id")
    private GenericWagonDoorType genericWagonDoorType;

    @Column(unique = true)

    private String vehichleTyeAbbreviation;

    public WagonType(GenericWagonBodyType genericWagonBodyType, GenericWagonDoorType genericWagonDoorType) {
        this.genericWagonBodyType = genericWagonBodyType;
        this.genericWagonDoorType = genericWagonDoorType;

    }

    public WagonType() {

    }

    public WagonType(GenericWagonBodyType genericWagonBodyType, GenericWagonDoorType genericWagonDoorType, String vehichleTyeAbbreviation) {
        this.genericWagonBodyType = genericWagonBodyType;
        this.genericWagonDoorType = genericWagonDoorType;
        this.vehichleTyeAbbreviation=vehichleTyeAbbreviation;
    }


    @Override
    public String toString() {
        return "VehichleType:"+this.genericWagonBodyType.getBodyTypeAbbreviation()+":"+this.genericWagonDoorType.getDoorTypeAbbreviation();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GenericWagonBodyType getGenericWagonBodyType() {
        return genericWagonBodyType;
    }

    public void setGenericWagonBodyType(GenericWagonBodyType genericWagonBodyType) {
        this.genericWagonBodyType = genericWagonBodyType;
    }

    public GenericWagonDoorType getGenericWagonDoorType() {
        return genericWagonDoorType;
    }

    public void setGenericWagonDoorType(GenericWagonDoorType genericWagonDoorType) {
        this.genericWagonDoorType = genericWagonDoorType;
    }

    public String getVehichleTyeAbbreviation() {
        return vehichleTyeAbbreviation;
    }

    public void setVehichleTyeAbbreviation(String vehichleTyeAbbreviation) {
        this.vehichleTyeAbbreviation = vehichleTyeAbbreviation;
    }



}
