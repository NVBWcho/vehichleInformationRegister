package com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype;


import com.nvbwcho.vehichletyperegister.vehichletype.ExtendedBoolean;
import jakarta.persistence.*;

@Entity
@Table(name="wagonbodytype")

public class GenericWagonBodyType {
    public GenericWagonBodyType(ExtendedBoolean informationDisplayInternal_D3020, ExtendedBoolean informationDisplayExternal_D3021, ExtendedBoolean loudspeakerAutomatic_D3030, ExtendedBoolean loudSpeakerManual_D3031, ExtendedBoolean areaForMobilityRestrictedAvailable_D3050, String locationOfMobilityAreaForMobilityRestricted_D3051, ExtendedBoolean toiletAvailable_D3060, ExtendedBoolean accessibleToiletAvailable_D3061, ExtendedBoolean ticketMachineAvailable_D3070, Integer widthOfWagonAtDoor_D3090, Integer minimumHeightOfFloorFromGround_D3100, Integer heightOfLowestStep_D3101, Boolean hasStairs_D3110, Integer heightOfStep_D3111, Integer numberOfSteps_D3112, Boolean foldableSteps_D3113, String bodyTypeAbbreviation) {
        this.informationDisplayInternal_D3020 = informationDisplayInternal_D3020;
        this.informationDisplayExternal_D3021 = informationDisplayExternal_D3021;
        this.loudspeakerAutomatic_D3030 = loudspeakerAutomatic_D3030;
        this.loudSpeakerManual_D3031 = loudSpeakerManual_D3031;
        this.areaForMobilityRestrictedAvailable_D3050 = areaForMobilityRestrictedAvailable_D3050;
        this.locationOfMobilityAreaForMobilityRestricted_D3051 = locationOfMobilityAreaForMobilityRestricted_D3051;
        this.toiletAvailable_D3060 = toiletAvailable_D3060;
        this.accessibleToiletAvailable_D3061 = accessibleToiletAvailable_D3061;
        this.ticketMachineAvailable_D3070 = ticketMachineAvailable_D3070;
        this.widthOfWagonAtDoor_D3090 = widthOfWagonAtDoor_D3090;
        this.minimumHeightOfFloorFromGround_D3100 = minimumHeightOfFloorFromGround_D3100;
        this.heightOfLowestStep_D3101 = heightOfLowestStep_D3101;
        this.hasStairs_D3110 = hasStairs_D3110;
        this.heightOfStep_D3111 = heightOfStep_D3111;
        this.numberOfSteps_D3112 = numberOfSteps_D3112;
        this.foldableSteps_D3113 = foldableSteps_D3113;
        this.bodyTypeAbbreviation = bodyTypeAbbreviation;
    }

    public GenericWagonBodyType() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    public Integer getHeightOfStep_D3111() {
        return heightOfStep_D3111;
    }

    public void setHeightOfStep_D3111(Integer heightOfStep_D3111) {
        this.heightOfStep_D3111 = heightOfStep_D3111;
    }

    public Integer getNumberOfSteps_D3112() {
        return numberOfSteps_D3112;
    }

    public void setNumberOfSteps_D3112(Integer numberOfSteps_D3112) {
        this.numberOfSteps_D3112 = numberOfSteps_D3112;
    }

    public Boolean getFoldableSteps_D3113() {
        return foldableSteps_D3113;
    }

    public void setFoldableSteps_D3113(Boolean foldableSteps_D3113) {
        this.foldableSteps_D3113 = foldableSteps_D3113;
    }

    @Column
    private ExtendedBoolean informationDisplayInternal_D3020;


    @Column
    private ExtendedBoolean informationDisplayExternal_D3021;


    @Column
    private ExtendedBoolean loudspeakerAutomatic_D3030;


    @Column
    private ExtendedBoolean loudSpeakerManual_D3031;

    @Column
    private ExtendedBoolean areaForMobilityRestrictedAvailable_D3050;


    @Column
    private String locationOfMobilityAreaForMobilityRestricted_D3051;


    @Column
    private ExtendedBoolean toiletAvailable_D3060;


    @Column
    private ExtendedBoolean accessibleToiletAvailable_D3061;


    @Column
    private ExtendedBoolean ticketMachineAvailable_D3070;




    @Column
    private Integer widthOfWagonAtDoor_D3090;

    @Column
    private Integer minimumHeightOfFloorFromGround_D3100;


    @Column
    private Integer heightOfLowestStep_D3101;

    @Column
    private Boolean hasStairs_D3110;

    @Column
    private Integer heightOfStep_D3111;


    @Column
    private Integer numberOfSteps_D3112;


    @Column
    private Boolean foldableSteps_D3113;

    @Column(unique = true)
    private String bodyTypeAbbreviation;

    public String getBodyTypeAbbreviation() {
        return bodyTypeAbbreviation;
    }

    public void setBodyTypeAbbreviation(String bodyTypeAbbreviation) {
        this.bodyTypeAbbreviation = bodyTypeAbbreviation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExtendedBoolean getInformationDisplayInternal_D3020() {
        return informationDisplayInternal_D3020;
    }

    public void setInformationDisplayInternal_D3020(ExtendedBoolean informationDisplayInternal_D3020) {
        this.informationDisplayInternal_D3020 = informationDisplayInternal_D3020;
    }

    public ExtendedBoolean getInformationDisplayExternal_D3021() {
        return informationDisplayExternal_D3021;
    }

    public void setInformationDisplayExternal_D3021(ExtendedBoolean informationDisplayExternal_D3021) {
        this.informationDisplayExternal_D3021 = informationDisplayExternal_D3021;
    }

    public ExtendedBoolean getLoudspeakerAutomatic_D3030() {
        return loudspeakerAutomatic_D3030;
    }

    public void setLoudspeakerAutomatic_D3030(ExtendedBoolean loudspeakerAutomatic_D3030) {
        this.loudspeakerAutomatic_D3030 = loudspeakerAutomatic_D3030;
    }

    public ExtendedBoolean getLoudSpeakerManual_D3031() {
        return loudSpeakerManual_D3031;
    }

    public void setLoudSpeakerManual_D3031(ExtendedBoolean loudSpeakerManual_D3031) {
        this.loudSpeakerManual_D3031 = loudSpeakerManual_D3031;
    }

    public ExtendedBoolean getAreaForMobilityRestrictedAvailable_D3050() {
        return areaForMobilityRestrictedAvailable_D3050;
    }

    public void setAreaForMobilityRestrictedAvailable_D3050(ExtendedBoolean areaForMobilityRestrictedAvailable_D3050) {
        this.areaForMobilityRestrictedAvailable_D3050 = areaForMobilityRestrictedAvailable_D3050;
    }

    public String getLocationOfMobilityAreaForMobilityRestricted_D3051() {
        return locationOfMobilityAreaForMobilityRestricted_D3051;
    }

    public void setLocationOfMobilityAreaForMobilityRestricted_D3051(String locationOfMobilityAreaForMobilityRestricted_D3051) {
        this.locationOfMobilityAreaForMobilityRestricted_D3051 = locationOfMobilityAreaForMobilityRestricted_D3051;
    }

    public ExtendedBoolean getToiletAvailable_D3060() {
        return toiletAvailable_D3060;
    }

    public void setToiletAvailable_D3060(ExtendedBoolean toiletAvailable_D3060) {
        this.toiletAvailable_D3060 = toiletAvailable_D3060;
    }

    public ExtendedBoolean getAccessibleToiletAvailable_D3061() {
        return accessibleToiletAvailable_D3061;
    }

    public void setAccessibleToiletAvailable_D3061(ExtendedBoolean accessibleToiletAvailable_D3061) {
        this.accessibleToiletAvailable_D3061 = accessibleToiletAvailable_D3061;
    }

    public ExtendedBoolean getTicketMachineAvailable_D3070() {
        return ticketMachineAvailable_D3070;
    }

    public void setTicketMachineAvailable_D3070(ExtendedBoolean ticketMachineAvailable_D3070) {
        this.ticketMachineAvailable_D3070 = ticketMachineAvailable_D3070;
    }

    public Integer getWidthOfWagonAtDoor_D3090() {
        return widthOfWagonAtDoor_D3090;
    }

    public void setWidthOfWagonAtDoor_D3090(Integer widthOfWagonAtDoor_D3090) {
        this.widthOfWagonAtDoor_D3090 = widthOfWagonAtDoor_D3090;
    }

    public Integer getMinimumHeightOfFloorFromGround_D3100() {
        return minimumHeightOfFloorFromGround_D3100;
    }

    public void setMinimumHeightOfFloorFromGround_D3100(Integer minimumHeightOfFloorFromGround_D3100) {
        this.minimumHeightOfFloorFromGround_D3100 = minimumHeightOfFloorFromGround_D3100;
    }

    public Integer getHeightOfLowestStep_D3101() {
        return heightOfLowestStep_D3101;
    }

    public void setHeightOfLowestStep_D3101(Integer heightOfLowestStep_D3101) {
        this.heightOfLowestStep_D3101 = heightOfLowestStep_D3101;
    }

    public Boolean getHasStairs_D3110() {
        return hasStairs_D3110;
    }

    public void setHasStairs_D3110(Boolean hasStairs_D3110) {
        this.hasStairs_D3110 = hasStairs_D3110;
    }

    @Override
    public String toString() {
        return "GenericWagonBody{" +
                "bodyTypeAbbreviation='" + bodyTypeAbbreviation + '\'' +
                '}';
    }
}
