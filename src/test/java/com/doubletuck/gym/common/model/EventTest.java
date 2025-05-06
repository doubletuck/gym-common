package com.doubletuck.gym.common.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EventTest {
    @Test
    public void findWhenInputIsEmpty() {
        assertNull(Event.find(""), "Empty string");
        assertNull(Event.find("     "), "Multiple empty spaces");
    }

    @Test
    public void findWhenInputIsNull() {
        assertNull(Event.find(null));
    }

    @Test
    public void findLongNameDespiteCase() {
        assertEquals(Event.VT, Event.find("vault"), "Lower case");
        assertEquals(Event.VT, Event.find("VAULT"), "Upper case");
        assertEquals(Event.VT, Event.find("vAuLt"), "Random case");
    }

    @Test
    public void findOtherNameDespiteCase() {
        assertEquals(Event.UB, Event.find("bars"), "Lower case");
        assertEquals(Event.UB, Event.find("BARS"), "Upper case");
        assertEquals(Event.UB, Event.find("bArS"), "Random case");
    }

    @Test
    public void findWhenNotMatching() {
        assertNull(Event.find("BOGUS"));
    }

    @Test
    public void findAllAround() {
        assertEquals(Event.AA, Event.find("AA"), "Name");
        assertEquals(Event.AA, Event.find("All-Around"), "Long name");
        assertEquals(Event.AA, Event.find("All Around"), "Other names");
    }

    @Test
    public void findVault() {
        assertEquals(Event.VT, Event.find("VT"), "Name");
        assertEquals(Event.VT, Event.find("Vault"), "Long name");
        assertEquals(Event.VT, Event.find("V"), "Other names");
    }

    @Test
    public void findUnevenBars() {
        assertEquals(Event.UB, Event.find("UB"), "Name");
        assertEquals(Event.UB, Event.find("Uneven Bars"), "Long name");
        assertEquals(Event.UB, Event.find("Bars"), "Other names");
    }

    @Test
    public void findBalanceBeam() {
        assertEquals(Event.BB, Event.find("BB"), "Name");
        assertEquals(Event.BB, Event.find("Balance Beam"), "Long name");
        assertEquals(Event.BB, Event.find("Beam"), "Other names");
    }

    @Test
    public void findFloorExercise() {
        assertEquals(Event.FX, Event.find("FX"), "Name");
        assertEquals(Event.FX, Event.find("Floor Exercise"), "Long name");
        assertEquals(Event.FX, Event.find("Floor"), "Other names");
    }
}
