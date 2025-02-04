package com.nvbwcho.vehichletyperegister.daos;

import com.nvbwcho.vehichletyperegister.vehichletype.ExtendedBoolean;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import jakarta.persistence.Column;

import java.util.Optional;

public class BodyTypeDao {

    private Optional<ExtendedBoolean> informationDisplayInternal_D3020;

    private Optional<ExtendedBoolean> informationDisplayExternal_D3021;



    private Optional<ExtendedBoolean> loudspeakerAutomatic_D3030;



    private Optional<ExtendedBoolean> loudSpeakerManual_D3031;


    private Optional<ExtendedBoolean> areaForMobilityRestrictedAvailable_D3050;



    private Optional<String> locationOfMobilityAreaForMobilityRestricted_D3051;



    private Optional<ExtendedBoolean> toiletAvailable_D3060;



    private Optional<ExtendedBoolean> accessibleToiletAvailable_D3061;



    private Optional<ExtendedBoolean> ticketMachineAvailable_D3070;





    private Optional<Integer> widthOfWagonAtDoor_D3090;


    private Optional<Integer> minimumHeightOfFloorFromGround_D3100;



    private Optional<Integer> heightOfLowestStep_D3101;


    private Optional<Boolean> hasStairs_D3110;


    private Optional<Integer> heightOfStep_D3111;



    private Optional<Integer> numberOfSteps_D3112;



    private Optional<Boolean> foldableSteps_D3113;


    private String bodyTypeAbbreviation;


    public Optional<ExtendedBoolean> getInformationDisplayInternal_D3020() {
        return informationDisplayInternal_D3020;


    }

    public void setInformationDisplayInternal_D3020(Optional<ExtendedBoolean> informationDisplayInternal_D3020) {
        this.informationDisplayInternal_D3020 = informationDisplayInternal_D3020;
    }

    public Optional<ExtendedBoolean> getInformationDisplayExternal_D3021() {
        return informationDisplayExternal_D3021;
    }

    public void setInformationDisplayExternal_D3021(Optional<ExtendedBoolean> informationDisplayExternal_D3021) {
        this.informationDisplayExternal_D3021 = informationDisplayExternal_D3021;
    }

    public Optional<ExtendedBoolean> getLoudspeakerAutomatic_D3030() {
        return loudspeakerAutomatic_D3030;
    }

    public void setLoudspeakerAutomatic_D3030(Optional<ExtendedBoolean> loudspeakerAutomatic_D3030) {
        this.loudspeakerAutomatic_D3030 = loudspeakerAutomatic_D3030;
    }

    public Optional<ExtendedBoolean> getLoudSpeakerManual_D3031() {
        return loudSpeakerManual_D3031;
    }

    public void setLoudSpeakerManual_D3031(Optional<ExtendedBoolean> loudSpeakerManual_D3031) {
        this.loudSpeakerManual_D3031 = loudSpeakerManual_D3031;
    }

    public Optional<ExtendedBoolean> getAreaForMobilityRestrictedAvailable_D3050() {
        return areaForMobilityRestrictedAvailable_D3050;
    }

    public void setAreaForMobilityRestrictedAvailable_D3050(Optional<ExtendedBoolean> areaForMobilityRestrictedAvailable_D3050) {
        this.areaForMobilityRestrictedAvailable_D3050 = areaForMobilityRestrictedAvailable_D3050;
    }

    public Optional<String> getLocationOfMobilityAreaForMobilityRestricted_D3051() {
        return locationOfMobilityAreaForMobilityRestricted_D3051;
    }

    public void setLocationOfMobilityAreaForMobilityRestricted_D3051(Optional<String> locationOfMobilityAreaForMobilityRestricted_D3051) {
        this.locationOfMobilityAreaForMobilityRestricted_D3051 = locationOfMobilityAreaForMobilityRestricted_D3051;
    }

    public Optional<ExtendedBoolean> getToiletAvailable_D3060() {
        return toiletAvailable_D3060;
    }

    public void setToiletAvailable_D3060(Optional<ExtendedBoolean> toiletAvailable_D3060) {
        this.toiletAvailable_D3060 = toiletAvailable_D3060;
    }

    public Optional<ExtendedBoolean> getAccessibleToiletAvailable_D3061() {
        return accessibleToiletAvailable_D3061;
    }

    public void setAccessibleToiletAvailable_D3061(Optional<ExtendedBoolean> accessibleToiletAvailable_D3061) {
        this.accessibleToiletAvailable_D3061 = accessibleToiletAvailable_D3061;
    }

    public Optional<ExtendedBoolean> getTicketMachineAvailable_D3070() {
        return ticketMachineAvailable_D3070;
    }

    public void setTicketMachineAvailable_D3070(Optional<ExtendedBoolean> ticketMachineAvailable_D3070) {
        this.ticketMachineAvailable_D3070 = ticketMachineAvailable_D3070;
    }

    public Optional<Integer> getWidthOfWagonAtDoor_D3090() {
        return widthOfWagonAtDoor_D3090;
    }

    public void setWidthOfWagonAtDoor_D3090(Optional<Integer> widthOfWagonAtDoor_D3090) {
        this.widthOfWagonAtDoor_D3090 = widthOfWagonAtDoor_D3090;
    }

    public Optional<Integer> getMinimumHeightOfFloorFromGround_D3100() {
        return minimumHeightOfFloorFromGround_D3100;
    }

    public void setMinimumHeightOfFloorFromGround_D3100(Optional<Integer> minimumHeightOfFloorFromGround_D3100) {
        this.minimumHeightOfFloorFromGround_D3100 = minimumHeightOfFloorFromGround_D3100;
    }

    public Optional<Integer> getHeightOfLowestStep_D3101() {
        return heightOfLowestStep_D3101;
    }

    public void setHeightOfLowestStep_D3101(Optional<Integer> heightOfLowestStep_D3101) {
        this.heightOfLowestStep_D3101 = heightOfLowestStep_D3101;
    }

    public Optional<Boolean> getHasStairs_D3110() {
        return hasStairs_D3110;
    }

    public void setHasStairs_D3110(Optional<Boolean> hasStairs_D3110) {
        this.hasStairs_D3110 = hasStairs_D3110;
    }

    public Optional<Integer> getHeightOfStep_D3111() {
        return heightOfStep_D3111;
    }

    public void setHeightOfStep_D3111(Optional<Integer> heightOfStep_D3111) {
        this.heightOfStep_D3111 = heightOfStep_D3111;
    }

    public Optional<Integer> getNumberOfSteps_D3112() {
        return numberOfSteps_D3112;
    }

    public void setNumberOfSteps_D3112(Optional<Integer> numberOfSteps_D3112) {
        this.numberOfSteps_D3112 = numberOfSteps_D3112;
    }

    public Optional<Boolean> getFoldableSteps_D3113() {
        return foldableSteps_D3113;
    }

    public void setFoldableSteps_D3113(Optional<Boolean> foldableSteps_D3113) {
        this.foldableSteps_D3113 = foldableSteps_D3113;
    }

    public String getBodyTypeAbbreviation() {
        return bodyTypeAbbreviation;
    }

    public void setBodyTypeAbbreviation(String bodyTypeAbbreviation) {
        this.bodyTypeAbbreviation = bodyTypeAbbreviation;
    }

    public BodyTypeDao(Optional<ExtendedBoolean> informationDisplayInternal_D3020, Optional<ExtendedBoolean> informationDisplayExternal_D3021, Optional<ExtendedBoolean> loudspeakerAutomatic_D3030, Optional<ExtendedBoolean> loudSpeakerManual_D3031, Optional<ExtendedBoolean> areaForMobilityRestrictedAvailable_D3050, Optional<String> locationOfMobilityAreaForMobilityRestricted_D3051, Optional<ExtendedBoolean> toiletAvailable_D3060, Optional<ExtendedBoolean> accessibleToiletAvailable_D3061, Optional<ExtendedBoolean> ticketMachineAvailable_D3070, Optional<Integer> widthOfWagonAtDoor_D3090, Optional<Integer> minimumHeightOfFloorFromGround_D3100, Optional<Integer> heightOfLowestStep_D3101, Optional<Boolean> hasStairs_D3110, Optional<Integer> heightOfStep_D3111, Optional<Integer> numberOfSteps_D3112, Optional<Boolean> foldableSteps_D3113, String bodyTypeAbbreviation) {
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

    @Override
    public String toString() {
        return "BodyTypeDao{" +
                "informationDisplayInternal_D3020=" + informationDisplayInternal_D3020 +
                ", informationDisplayExternal_D3021=" + informationDisplayExternal_D3021 +
                ", loudspeakerAutomatic_D3030=" + loudspeakerAutomatic_D3030 +
                ", loudSpeakerManual_D3031=" + loudSpeakerManual_D3031 +
                ", areaForMobilityRestrictedAvailable_D3050=" + areaForMobilityRestrictedAvailable_D3050 +
                ", locationOfMobilityAreaForMobilityRestricted_D3051=" + locationOfMobilityAreaForMobilityRestricted_D3051 +
                ", toiletAvailable_D3060=" + toiletAvailable_D3060 +
                ", accessibleToiletAvailable_D3061=" + accessibleToiletAvailable_D3061 +
                ", ticketMachineAvailable_D3070=" + ticketMachineAvailable_D3070 +
                ", widthOfWagonAtDoor_D3090=" + widthOfWagonAtDoor_D3090 +
                ", minimumHeightOfFloorFromGround_D3100=" + minimumHeightOfFloorFromGround_D3100 +
                ", heightOfLowestStep_D3101=" + heightOfLowestStep_D3101 +
                ", hasStairs_D3110=" + hasStairs_D3110 +
                ", heightOfStep_D3111=" + heightOfStep_D3111 +
                ", numberOfSteps_D3112=" + numberOfSteps_D3112 +
                ", foldableSteps_D3113=" + foldableSteps_D3113 +
                ", bodyTypeAbbreviation='" + bodyTypeAbbreviation + '\'' +
                '}';
    }
}
