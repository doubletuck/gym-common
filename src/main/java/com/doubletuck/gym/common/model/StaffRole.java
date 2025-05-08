package com.doubletuck.gym.common.model;

import lombok.Getter;

@Getter
public enum StaffRole {

    HEAD_COACH("Head Coach"),
    ACTING_HEAD_COACH("Acting Head Coach"),
    ASSOC_HEAD_COACH("Associate Head Coach"),
    ASST_HEAD_COACH("Assistant Head Coach"),
    FIRST_ASST_COACH("First Assistant Coach"),
    ASST_COACH("Assistant Coach"),
    ACTING_ASST_COACH("Acting Assistant Coach"),
    INTERIM_ASST_COACH("Interim Assistant Coach"),
    GRADUATE_ASST_COACH("Graduate Student Assistant Coach"),
    GRADUATE_COACH("Graduate Student Coach"),
    STUDENT_ASST_COACH("Student Assistant Coach"),
    STUDENT_COACH("Student Coach"),
    UNDERGRAD_ASST_COACH("Undergraduate Student Assistant Coach"),
    UNDERGRAD_COACH("Undergraduate Student Coach"),
    VOLUNTEER_ASST_COACH("Volunteer Assistant Coach"),
    VOLUNTEER_COACH("Volunteer Coach");

    private final String longName;

    StaffRole(String longName) {
        this.longName = longName;
    }

    /**
     * Finds the enum that whose name is equivalent to the given text
     * value irrespective of casing. In addition, a blank space is
     * interpreted as an underscore. There, "ASST COACH" is equivalent
     * to "ASST_COACH".
     *
     * @param   text The string name of the enum constant.
     * @return  The enum that has a name that matches the given text
     *          input regardless of casing. Returns null if no matches
     *          are found.
     */
    public static StaffRole find(String text) {

        if (text != null && !text.isBlank()) {
            text = text.trim().replace(" ", "_");
            for (StaffRole role : StaffRole.values()) {
                if (role.name().equalsIgnoreCase(text)) {
                    return role;
                }
            }
        }

        return null;
    }
}
