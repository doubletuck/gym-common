package com.doubletuck.gym.common.model;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum Country {

    AUS("Australia"),
    BEL("Belgium"),
    CAN("Canada"),
    CHL("Chile"),
    DEU("Germany", "DE"),
    ENG("England"),
    ESP("Spain"),
    FIN("Finland"),
    FRA("France", "FR"),
    ITA("Italy", "IT"),
    HUN("Hungary", "HU"),
    GBR("Great Britain", "GB", "UK", "United Kingdom"),
    LVA("Latvia"),
    MEX("Mexico"),
    NLD("Netherlands", "NL"),
    NZL("New Zealand", "NZ"),
    ROM("Romania", "RO"),
    SGP("Singapore"),
    THA("Thailand"  ),
    USA("United States of America", "US"),
    VEN("Venezuela");

    private final String longName;
    private final String[] otherNames;

    Country(String longName, String... otherNames) {
        this.longName = longName;
        this.otherNames = otherNames;
    }

    /**
     * Returns the Country enum that matches the given text.
     *
     * @param   text A name that identifies a Country. The name is not
     *          case sensitive and can be either the enum name, long name
     *          or one of the other names associated with the enum value.
     * @return  The Country enum that matches the given text. Null is
     *          returned if no matches are found.
     */
    public static Country find(String text) {
        if (text != null && !text.isEmpty()) {
            text = text.trim();
            for (Country country : values()) {
                if (country.name().equalsIgnoreCase(text) ||
                        country.longName.equalsIgnoreCase(text) ||
                        StringUtils.equalsAnyIgnoreCase(text, country.otherNames)) {
                    return country;
                }
            }
        }

        return null;
    }
}
