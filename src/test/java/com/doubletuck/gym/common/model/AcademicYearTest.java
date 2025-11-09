package com.doubletuck.gym.common.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AcademicYearTest {

    @Test
    public void findWhenInputIsEmpty() {
        assertNull(AcademicYear.find(""), "Empty string");
        assertNull(AcademicYear.find("   "), "Multiple empty spaces");
    }

    @Test
    public void findWhenInputIsNull() {
        assertNull(AcademicYear.find(null));
    }

    @Test
    public void findLongNameDespiteCase() {
        assertEquals(AcademicYear.GR, AcademicYear.find("graduate student"), "Lower case");
        assertEquals(AcademicYear.GR, AcademicYear.find("GRADUATE STUDENT"), "Upper case");
        assertEquals(AcademicYear.GR, AcademicYear.find("graDUaTe STudenT"), "Mixed case");
    }

    @Test
    public void findOtherNameDespiteCase() {
        assertEquals(AcademicYear.GR, AcademicYear.find("graduate"), "Other name - Graduate - Lower case");
        assertEquals(AcademicYear.GR, AcademicYear.find("GRADUATE"), "Other name - Graduate - Upper case");
        assertEquals(AcademicYear.GR, AcademicYear.find("graDUaTe"), "Other name - Graduate - Mixed case");
        assertEquals(AcademicYear.GR, AcademicYear.find("gr."), "Other name - Gr - Lower case");
        assertEquals(AcademicYear.GR, AcademicYear.find("GR."), "Other name - Gr - Upper case");
        assertEquals(AcademicYear.GR, AcademicYear.find("gR."), "Other name - Gr - Mixed case");
    }

    @Test
    public void findFreshman() {
        assertEquals(AcademicYear.FR, AcademicYear.find("FR"), "By Name");
        assertEquals(AcademicYear.FR, AcademicYear.find("Freshman"), "By Long Name");
        assertEquals(AcademicYear.FR, AcademicYear.find("Fr."), "By Other Name - Fr.");
        assertEquals(AcademicYear.FR, AcademicYear.find("Fy."), "By Other Name - Fy.");
    }

    @Test
    public void findRedshirtFreshman() {
        assertEquals(AcademicYear.REDSHIRT_FR, AcademicYear.find("REDSHIRT_FR"), "By Name");
        assertEquals(AcademicYear.REDSHIRT_FR, AcademicYear.find("Redshirt Freshman"), "By Long Name");
        assertEquals(AcademicYear.REDSHIRT_FR, AcademicYear.find("R-Fr."), "By Other Name - R-Fr.");
        assertEquals(AcademicYear.REDSHIRT_FR, AcademicYear.find("RS Fr."), "By Other Name - RS Fr.");
        assertEquals(AcademicYear.REDSHIRT_FR, AcademicYear.find("R-Freshman"), "By Other Name - R-Freshman");
        assertEquals(AcademicYear.REDSHIRT_FR, AcademicYear.find("RS-Freshman"), "By Other Name - RS-Freshman");
    }

    @Test
    public void findSophomore() {
        assertEquals(AcademicYear.SO, AcademicYear.find("SO"), "By Name");
        assertEquals(AcademicYear.SO, AcademicYear.find("Sophomore"), "By Long Name");
        assertEquals(AcademicYear.SO, AcademicYear.find("So."), "By Other Name");
    }

    @Test
    public void findRedshirtSophomore() {
        assertEquals(AcademicYear.REDSHIRT_SO, AcademicYear.find("REDSHIRT_SO"), "By Name");
        assertEquals(AcademicYear.REDSHIRT_SO, AcademicYear.find("Redshirt Sophomore"), "By Long Name");
        assertEquals(AcademicYear.REDSHIRT_SO, AcademicYear.find("R-So."), "By Other Name - R-So.");
        assertEquals(AcademicYear.REDSHIRT_SO, AcademicYear.find("RS So."), "By Other Name - RS So.");
        assertEquals(AcademicYear.REDSHIRT_SO, AcademicYear.find("R-Sophomore"), "By Other Name - R-Sophomore");
        assertEquals(AcademicYear.REDSHIRT_SO, AcademicYear.find("RS-Sophomore"), "By Other Name - RS-Sophomore");
    }

    @Test
    public void findJunior() {
        assertEquals(AcademicYear.JR, AcademicYear.find("JR"), "By Name");
        assertEquals(AcademicYear.JR, AcademicYear.find("Junior"), "By Long Name");
        assertEquals(AcademicYear.JR, AcademicYear.find("Jr."), "By Other Name");
    }

    @Test
    public void findRedshirtJunior() {
        assertEquals(AcademicYear.REDSHIRT_JR, AcademicYear.find("REDSHIRT_JR"), "By Name");
        assertEquals(AcademicYear.REDSHIRT_JR, AcademicYear.find("Redshirt Junior"), "By Long Name");
        assertEquals(AcademicYear.REDSHIRT_JR, AcademicYear.find("R-Jr."), "By Other Name - R-Jr.");
        assertEquals(AcademicYear.REDSHIRT_JR, AcademicYear.find("RS Jr."), "By Other Name - RS Jr.");
        assertEquals(AcademicYear.REDSHIRT_JR, AcademicYear.find("R-Junior"), "By Other Name - R-Junior");
        assertEquals(AcademicYear.REDSHIRT_JR, AcademicYear.find("RS-Junior"), "By Other Name - RS-Junior");
    }

    @Test
    public void findSenior() {
        assertEquals(AcademicYear.SR, AcademicYear.find("SR"), "By Name");
        assertEquals(AcademicYear.SR, AcademicYear.find("Senior"), "By Long Name");
        assertEquals(AcademicYear.SR, AcademicYear.find("Sr."), "By Other Name");
    }

    @Test
    public void findRedshirtSenior() {
        assertEquals(AcademicYear.REDSHIRT_SR, AcademicYear.find("REDSHIRT_SR"), "By Name");
        assertEquals(AcademicYear.REDSHIRT_SR, AcademicYear.find("Redshirt Senior"), "By Long Name");
        assertEquals(AcademicYear.REDSHIRT_SR, AcademicYear.find("R-Sr."), "By Other Name - R-Sr.");
        assertEquals(AcademicYear.REDSHIRT_SR, AcademicYear.find("RS Sr."), "By Other Name - RS Sr.");
        assertEquals(AcademicYear.REDSHIRT_SR, AcademicYear.find("R-Senior"), "By Other Name - R-Senior");
        assertEquals(AcademicYear.REDSHIRT_SR, AcademicYear.find("RS-Senior"), "By Other Name - RS-Senior");
    }

    @Test
    public void findFifthYear() {
        assertEquals(AcademicYear.FIFTH_YR, AcademicYear.find("FIFTH_YR"), "By Name");
        assertEquals(AcademicYear.FIFTH_YR, AcademicYear.find("Fifth Year"), "By Long Name");
        assertEquals(AcademicYear.FIFTH_YR, AcademicYear.find("5th-Year Senior"), "By Other Name - 5th-Year Senior");
        assertEquals(AcademicYear.FIFTH_YR, AcademicYear.find("5th"), "By Other Name - 5th");
        assertEquals(AcademicYear.FIFTH_YR, AcademicYear.find("Fifth"), "By Other Name - Fifth");
    }

    @Test
    public void findSixthYear() {
        assertEquals(AcademicYear.SIXTH_YR, AcademicYear.find("SIXTH_YR"), "By Name");
        assertEquals(AcademicYear.SIXTH_YR, AcademicYear.find("Sixth Year"), "By Long Name");
        assertEquals(AcademicYear.SIXTH_YR, AcademicYear.find("6th"), "By Other Name - 6th");
    }

    @Test
    public void findGraduateStudent() {
        assertEquals(AcademicYear.GR, AcademicYear.find("GR"), "By Name");
        assertEquals(AcademicYear.GR, AcademicYear.find("Graduate Student"), "By Long Name");
        assertEquals(AcademicYear.GR, AcademicYear.find("Graduate"), "By Other Name - Graduate");
        assertEquals(AcademicYear.GR, AcademicYear.find("Gr."), "By Other Name - Gr.");
        assertEquals(AcademicYear.GR, AcademicYear.find("Grad."), "By Other Name - Grad.");
    }

    @Test
    public void findRedshirt() {
        assertEquals(AcademicYear.REDSHIRT, AcademicYear.find("REDSHIRT"), "By Name");
        assertEquals(AcademicYear.REDSHIRT, AcademicYear.find("Redshirt"), "By Long Name");
        assertEquals(AcademicYear.REDSHIRT, AcademicYear.find("Rs."), "By Other Name - Rs.");
        assertEquals(AcademicYear.REDSHIRT, AcademicYear.find("Medical Redshirt"), "By Other Name - Medical Redshirt");
    }

    @Test
    public void findWhenNotMatching() {
        assertNull(AcademicYear.find("BOGUS"));
    }
}
