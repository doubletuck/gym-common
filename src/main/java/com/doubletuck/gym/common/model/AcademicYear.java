package com.doubletuck.gym.common.model;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum AcademicYear {

    FR("Freshman", "Fr."),
    REDSHIRT_FR("Redshirt Freshman", "R-Fr.", "RS Fr.", "R-Freshman"),
    SO("Sophomore", "So."),
    REDSHIRT_SO("Redshirt Sophomore", "R-So.", "RS So.", "R-Sophomore"),
    JR("Junior", "Jr."),
    REDSHIRT_JR("Redshirt Junior", "R-Jr.", "RS Jr.", "R-Junior"),
    SR("Senior", "Sr."),
    REDSHIRT_SR("Redshirt Senior", "R-Sr.", "RS Sr.", "R-Senior"),
    FIFTH_YR("Fifth Year", "5th-Year Senior", "5th", "Fifth"),
    SIXTH_YR("Sixth Year", "6th"),
    GR("Graduate Student", "Graduate", "Gr."),
    REDSHIRT("Redshirt", "Rs.");

    private final String longName;
    private final String[] otherNames;

    AcademicYear(String longName, String... otherNames) {
        this.longName = longName;
        this.otherNames = otherNames;
    }

    /**
     * Returns the academic year enum that matches the given text.
     *
     * @param   text The academic year code or name.
     * @return  The AcademicYear enum that matches the given text or
     *          null if no matches are found.
     */
    public static AcademicYear find(String text) {
        if (text != null && !text.isBlank()) {
            text = text.trim();
            for (AcademicYear AcademicYear : values()) {
                if (AcademicYear.name().equalsIgnoreCase(text) ||
                        AcademicYear.longName.equalsIgnoreCase(text) ||
                        StringUtils.equalsAnyIgnoreCase(text, AcademicYear.otherNames)) {
                    return AcademicYear;
                }
            }
        }
        return null;
    }
}
