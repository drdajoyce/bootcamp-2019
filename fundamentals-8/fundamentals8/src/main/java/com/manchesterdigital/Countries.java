package com.manchesterdigital;

public enum Countries {

    GERMANY("Germany", "de"),
    SPAIN("Spain", "es"); //group enums with a comma, then finish entire list with a ;

    private String name;
    private String isoCode;

    Countries(String name, String isoCode) {
        this.name = name;
        this.isoCode = isoCode;
    } //constructor that can only be done at the default level.

    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }
}
