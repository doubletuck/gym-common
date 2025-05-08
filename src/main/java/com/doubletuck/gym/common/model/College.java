package com.doubletuck.gym.common.model;

import org.apache.commons.lang3.StringUtils;

public enum College {

    AIRFORCE,
    ALABAMA,
    ALASKA,
    ARIZONA,
    ARIZONASTATE,
    ARKANSAS,
    AUBURN,
    BALLSTATE,
    BOISESTATE,
    BOWLINGGREENSTATE,
    BRIDGEPORT,
    BRIGHAMYOUNG,
    BROCKPORT,
    BROWN,
    CENTENARY,
    CENTRALMICHIGAN,
    CLEMSON,
    CORNELL,
    DENVER,
    EASTERNMICHIGAN,
    FISK,
    FLORIDA,
    GEORGEWASHINGTON,
    GEORGIA,
    GREENVILLE,
    GUSTAVUSADOLPHUS,
    HAMLINE,
    ILLINOIS,
    ILLINOISSTATE,
    IOWA,
    IOWASTATE,
    ITHACA,
    KENTSTATE,
    KENTUCKY,
    LIU,
    LSU,
    MICHIGAN,
    MICHIGANSTATE,
    MINNESOTA,
    MISSOURI,
    NCSTATE,
    NEBRASKA,
    NEWHAMPSHIRE,
    NORTHERNILLINOIS,
    OHIOSTATE,
    OKLAHOMA,
    OREGONSTATE,
    PENNSTATE,
    PITTSBURGH,
    RHODEISLAND,
    RUTGERS,
    SACRAMENTOSTATE,
    SANJOSESTATE,
    SIMPSON,
    SOUTHEASTMISSOURI,
    SOUTHERNCONN,
    SOUTHERNUTAH,
    SPRINGFIELD,
    STANFORD,
    SUNYCORTLAND,
    TEMPLE,
    TEXASWOMANS,
    TOWSON,
    UCBERKELEY,
    UCDAVIS,
    UCLA,
    UMDCOLLEGEPARK,
    UNCCHAPELHILL,
    UPENN,
    URSINUS,
    UTAH,
    UTAHSTATE,
    UTICA,
    UWEAUCLAIRE,
    UWLACROSSE,
    UWOSHKOSH,
    UWSTOUT,
    UWWHITEWATER,
    WASHINGTON,
    WESTCHESTER,
    WESTERNMICHIGAN,
    WESTVIRGINIA,
    WILBERFORCE,
    WILLIAMMARY,
    WINONASTATE,
    YALE;

    /**
     * Finds the enum that whose name is equivalent to the given text
     * value irrespective of casing.
     *
     * @param   text The string name of the enum constant.
     * @return  The enum that has a name that matches the given text
     *          input regardlenss of casing. Returns null if no matches
     *          are found.
     */
    public static College find(String text) {

        if (text != null && !text.isBlank()) {
            text = text.trim();
            for (College college : College.values()) {
                if (college.name().equalsIgnoreCase(text)) {
                    return college;
                }
            }
        }

        return null;
    }
}
