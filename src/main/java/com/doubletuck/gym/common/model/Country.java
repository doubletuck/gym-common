package com.doubletuck.gym.common.model;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * Country codes that are encountered across NCAA rosters. The list
 * of countries is not exhaustive. IBAN's alpha-3 character code is
 * used as the enum value.
 * https://www.iban.com/country-codes
 */
@Getter
public enum Country {

    AUS("Australia"),
    AUT("Austria"),
    BEL("Belgium"),
    BRA("Brazil"),
    CAN("Canada"),
    CHL("Chile"),
    COL("Colombia"),
    DEU("Germany"),
    ENG("England"),
    ESP("Spain"),
    FIN("Finland"),
    FRA("France", "FR"),
    GBR("United Kingdom of Great Britain and Northern Ireland", "GB", "Great Britain", "UK", "United Kingdom"),
    GTM("Guatemala"),
    HUN("Hungary", "HU"),
    ITA("Italy", "IT"),
    JAM("Jamaica"),
    LVA("Latvia"),
    LTU("Lithuania"),
    MEX("Mexico"),
    NLD("Netherlands", "NL", "Holland"),
    NZL("New Zealand", "NZ"),
    NOR("Norway"),
    PAN("Panama"),
    PER("Peru"),
    PHL("Philippines"),
    ROM("Romania", "RO"),
    SGP("Singapore"),
    SLV("El Salvador"),
    SVN("Slovenia"),
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
     * @param   text A name that identifies a Country. The name is not case
     *          sensitive and can be either the enum name, long name or one
     *          of the other names associated with the enum value. All "."
     *          are ignored. For example, "G.B." is interpreted as "GB".
     * @return  The Country enum that matches the given text. Null is
     *          returned if no matches are found.
     */
    public static Country find(String text) {
        if (text != null && !text.isEmpty()) {
            text = text.trim().replace(".","");
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
