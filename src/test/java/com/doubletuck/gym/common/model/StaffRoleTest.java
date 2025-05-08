package com.doubletuck.gym.common.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StaffRoleTest {

    @Test
    public void findInputIsBlank () {
        assertNull(StaffRole.find(""), "Empty string");
        assertNull(StaffRole.find("      "), "Multiple blanks in string");
    }

    @Test
    public void findInputIsNull() {
        assertNull(StaffRole.find(null));
    }

    @Test
    public void findMatchingEnumDoesNotExist() {
        assertNull(StaffRole.find("BOGUS"));
    }

    @Test
    public void findCaseInsensitiveMatching() {
        assertEquals(StaffRole.HEAD_COACH, StaffRole.find("HEAD_COACH"), "All upper case");
        assertEquals(StaffRole.HEAD_COACH, StaffRole.find("head_coach"), "All lower case");
        assertEquals(StaffRole.HEAD_COACH, StaffRole.find("Head_Coach"), "Mixed case");
    }

    @Test
    public void findWithSpacesInsteadOfUnderscores() {
        assertEquals(StaffRole.HEAD_COACH, StaffRole.find("HEAD COACH"), "With spaces instead of underscores");
    }
}
