package com.nvbwcho.vehichletyperegister.daos;

public class WagonTypeDoa {

    private String bodyTypeAbbreviation;

    private String doorTypeAbbreviation;

    public String getBodyTypeAbbreviation() {
        return bodyTypeAbbreviation;
    }

    public WagonTypeDoa(String bodyTypeAbbreviation, String doorTypeAbbreviation) {
        this.bodyTypeAbbreviation = bodyTypeAbbreviation;
        this.doorTypeAbbreviation = doorTypeAbbreviation;
    }

    public void setBodyTypeAbbreviation(String bodyTypeAbbreviation) {
        this.bodyTypeAbbreviation = bodyTypeAbbreviation;
    }

    public String getDoorTypeAbbreviation() {
        return doorTypeAbbreviation;
    }

    public void setDoorTypeAbbreviation(String doorTypeAbbreviation) {
        this.doorTypeAbbreviation = doorTypeAbbreviation;
    }

    @Override
    public String toString() {
        return "WagonTypeDoa{" +
                "bodyTypeAbbreviation='" + bodyTypeAbbreviation + '\'' +
                ", doorTypeAbbreviation='" + doorTypeAbbreviation + '\'' +
                '}';
    }
}
