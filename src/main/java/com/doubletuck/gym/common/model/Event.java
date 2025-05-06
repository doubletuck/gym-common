package com.doubletuck.gym.common.model;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum Event {

    AA("All-Around", "All Around"),
    VT("Vault", "V"),
    UB("Uneven Bars", "Bars"),
    BB("Balance Beam", "Beam"),
    FX("Floor Exercise", "Floor");

    private final String longName;
    private final String[] otherNames;

    Event(String longName, String... otherNames) {
        this.longName = longName;
        this.otherNames = otherNames;
    }

    /**
     * Returns the Event enum that matches the given text.
     *
     * @param   text Case insensitive text that matches the value name,
     *          long name or other names associated with the enum value.
     * @return  The Event enum that matches the given text or null if
     *          no matches are found.
     */
    public static Event find(String text) {
        if (text != null && !text.isEmpty()) {
            text = text.trim();
            for (Event Event : values()) {
                if (Event.name().equalsIgnoreCase(text) ||
                        Event.longName.equalsIgnoreCase(text) ||
                        StringUtils.equalsAnyIgnoreCase(text, Event.otherNames)) {
                    return Event;
                }
            }
        }
        return null;
    }
}
