package com.doubletuck.gym.common.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CollegeTest {

    @Test
    public void findInputIsBlank () {
        assertNull(College.find(""), "Empty string");
        assertNull(College.find("      "), "Multiple blanks in string");
    }

    @Test
    public void findInputIsNull() {
        assertNull(College.find(null));
    }

    @Test
    public void findMatchingEnumDoesNotExist() {
        assertNull(College.find("BOGUS"));
    }

    @Test
    public void findCaseInsensitiveMatching() {
        assertEquals(College.GEORGEWASHINGTON, College.find("GEORGEWASHINGTON"), "All upper case");
        assertEquals(College.GEORGEWASHINGTON, College.find("georgewashington"), "All lower case");
        assertEquals(College.GEORGEWASHINGTON, College.find("GeorgeWashington"), "Mixed case");
    }
}
