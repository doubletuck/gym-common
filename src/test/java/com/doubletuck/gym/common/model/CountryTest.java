package com.doubletuck.gym.common.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CountryTest {

    @Test
    public void findWhenInputIsEmpty() {
        Assertions.assertNull(Country.find(""), "Empty string");
        assertNull(Country.find("     "), "Multiple empty spaces");
    }

    @Test
    public void findWhenInputIsNull() {
        assertNull(Country.find(null));
    }

    @Test
    public void findLongNameDespiteCase() {
        assertEquals(Country.CAN, Country.find("canada"), "Lower case");
        assertEquals(Country.CAN, Country.find("CANADA"), "Upper case");
        assertEquals(Country.CAN, Country.find("caNADa"), "Random case");
    }

    @Test
    public void findWhenNameOrOtherNameHasPeriods() {
        assertEquals(Country.USA, Country.find("U.n.i.t.e.d S.t.a.t.e.s of America"), "Name - Periods");
        assertEquals(Country.USA, Country.find("U.S."), "Other Name - U.S.");
    }

    @Test
    public void findOtherNameDespiteCase() {
        assertEquals(Country.GBR, Country.find("united kingdom"), "Lower case");
        assertEquals(Country.GBR, Country.find("UNITED KINGDOM"), "Upper case");
        assertEquals(Country.GBR, Country.find("unITEd KIngdoM"), "Random case");
    }

    @Test
    public void findArgentina() {
        assertEquals(Country.ARG, Country.find("ARG"), "Name");
        assertEquals(Country.ARG, Country.find("Argentina"), "Long Name");
    }

    @Test
    public void findAustralia() {
        assertEquals(Country.AUS, Country.find("AUS"), "Name");
        assertEquals(Country.AUS, Country.find("Australia"), "Long Name");
    }

    @Test
    public void findAustria() {
        assertEquals(Country.AUT, Country.find("AUT"), "Name");
        assertEquals(Country.AUT, Country.find("Austria"), "Long Name");
    }

    @Test
    public void findBermuda() {
        assertEquals(Country.BMU, Country.find("BMU"), "Name");
        assertEquals(Country.BMU, Country.find("Bermuda"), "Long Name");
    }

    @Test
    public void findBrazil() {
        assertEquals(Country.BRA, Country.find("BRA"), "Name");
        assertEquals(Country.BRA, Country.find("Brazil"), "Long Name");
    }

    @Test
    public void findCanada() {
        assertEquals(Country.CAN, Country.find("CAN"), "Name");
        assertEquals(Country.CAN, Country.find("Canada"), "Long Name");
    }

    @Test
    public void findChile() {
        assertEquals(Country.CHL, Country.find("CHL"), "Name");
        assertEquals(Country.CHL, Country.find("Chile"), "Long Name");
    }

    @Test
    public void findCHESwitzerland() {
        assertEquals(Country.CHE, Country.find("CHE"), "Name");
        assertEquals(Country.CHE, Country.find("Switzerland"), "Long Name");
    }

    @Test
    public void findColombia() {
        assertEquals(Country.COL, Country.find("COL"), "Name");
        assertEquals(Country.COL, Country.find("Colombia"), "Long Name");
    }

    @Test
    public void findCostaRica() {
        assertEquals(Country.CRI, Country.find("CRI"), "Name");
        assertEquals(Country.CRI, Country.find("Costa Rica"), "Long Name");
    }

    @Test
    public void findDenmark() {
        assertEquals(Country.DNK, Country.find("DNK"), "Name");
        assertEquals(Country.DNK, Country.find("Denmark"), "Long Name");
    }

    @Test
    public void findGermany() {
        assertEquals(Country.DEU, Country.find("DEU"), "Name");
        assertEquals(Country.DEU, Country.find("Germany"), "Long Name");
    }

    @Test
    public void findEgypt() {
        assertEquals(Country.EGY, Country.find("EGY"), "Name");
        assertEquals(Country.EGY, Country.find("Egypt"), "Long Name");
    }

    @Test
    public void findEngland() {
        assertEquals(Country.ENG, Country.find("ENG"), "Name");
        assertEquals(Country.ENG, Country.find("England"), "Long Name");
    }

    @Test
    public void findFinland() {
        assertEquals(Country.FIN, Country.find("FIN"), "Name");
        assertEquals(Country.FIN, Country.find("Finland"), "Long Name");
    }

    @Test
    public void findFrance() {
        assertEquals(Country.FRA, Country.find("FRA"), "Name");
        assertEquals(Country.FRA, Country.find("France"), "Long Name");
        assertEquals(Country.FRA, Country.find("FR"), "Other name - 2 Character Code");
    }

    @Test
    public void findGBRUnitedKingdom() {
        assertEquals(Country.GBR, Country.find("GBR"), "Name");
        assertEquals(Country.GBR, Country.find("United Kingdom of Great Britain and Northern Ireland"), "Long Name");
        assertEquals(Country.GBR, Country.find("GB"), "Other name - GB - 2 Character Code");
        assertEquals(Country.GBR, Country.find("G.B."), "Other name - G.B. - 2 Character Code (with periods)");
        assertEquals(Country.GBR, Country.find("Great Britain"), "Other name - Great Britain");
        assertEquals(Country.GBR, Country.find("UK"), "Other name - UK");
        assertEquals(Country.GBR, Country.find("U.K."), "Other name - U.K. (with periods)");
        assertEquals(Country.GBR, Country.find("United Kingdom"), "Other name - United Kingdom");
    }

    @Test
    public void findGuatemala() {
        assertEquals(Country.GTM, Country.find("GTM"), "Name");
        assertEquals(Country.GTM, Country.find("Guatemala"), "Long Name");
    }

    @Test
    public void findJamaica() {
        assertEquals(Country.JAM, Country.find("JAM"), "Name");
        assertEquals(Country.JAM, Country.find("Jamaica"), "Long Name");
    }

    @Test
    public void findHungary() {
        assertEquals(Country.HUN, Country.find("HUN"), "Name");
        assertEquals(Country.HUN, Country.find("Hungary"), "Long Name");
        assertEquals(Country.HUN, Country.find("HU"), "Other name - 2 Character Code");
    }

    @Test
    public void findIreland() {
        assertEquals(Country.IRL, Country.find("IRL"), "Name");
        assertEquals(Country.IRL, Country.find("Ireland"), "Long Name");
    }

    @Test
    public void findIsrael() {
        assertEquals(Country.ISR, Country.find("ISR"), "Name");
        assertEquals(Country.ISR, Country.find("Israel"), "Long Name");
    }

    @Test
    public void findItaly() {
        assertEquals(Country.ITA, Country.find("ITA"), "Name");
        assertEquals(Country.ITA, Country.find("Italy"), "Long Name");
        assertEquals(Country.ITA, Country.find("IT"), "Other name - 2 Character Code");
    }

    @Test
    public void findLatvia() {
        assertEquals(Country.LVA, Country.find("LVA"), "Name");
        assertEquals(Country.LVA, Country.find("Latvia"), "Long Name");
    }

    @Test
    public void findLithuania() {
        assertEquals(Country.LTU, Country.find("LTU"), "Name");
        assertEquals(Country.LTU, Country.find("Lithuania"), "Long Name");
    }

    @Test
    public void findMexico() {
        assertEquals(Country.MEX, Country.find("MEX"), "Name");
        assertEquals(Country.MEX, Country.find("Mexico"), "Long Name");
    }

    @Test
    public void findNetherlands() {
        assertEquals(Country.NLD, Country.find("NLD"), "Name");
        assertEquals(Country.NLD, Country.find("Netherlands"), "Long Name");
        assertEquals(Country.NLD, Country.find("NL"), "Other name - 2 Character Code");
        assertEquals(Country.NLD, Country.find("Holland"), "Other name - Holland");
        assertEquals(Country.NLD, Country.find("The Netherlands"), "Other name - The Netherlands");
    }

    @Test
    public void findNewZealand() {
        assertEquals(Country.NZL, Country.find("NZL"), "Name");
        assertEquals(Country.NZL, Country.find("New Zealand"), "Long Name");
        assertEquals(Country.NZL, Country.find("NZ"), "Other name - 2 Character Code");
    }

    @Test
    public void findNorway() {
        assertEquals(Country.NOR, Country.find("NOR"), "Name");
        assertEquals(Country.NOR, Country.find("Norway"), "Long Name");
    }

    @Test
    public void findPanama() {
        assertEquals(Country.PAN, Country.find("PAN"), "Name");
        assertEquals(Country.PAN, Country.find("Panama"), "Long Name");
    }

    @Test
    public void findPeru() {
        assertEquals(Country.PER, Country.find("PER"), "Name");
        assertEquals(Country.PER, Country.find("Peru"), "Long Name");
    }

    @Test
    public void findPhilippines() {
        assertEquals(Country.PHL, Country.find("PHL"), "Name");
        assertEquals(Country.PHL, Country.find("Philippines"), "Long Name");
    }

    @Test
    public void findRomania() {
        assertEquals(Country.ROU, Country.find("ROU"), "Name");
        assertEquals(Country.ROU, Country.find("Romania"), "Long Name");
        assertEquals(Country.ROU, Country.find("RO"), "Other name - 2 Character Code");
    }

    @Test
    public void findSingapore() {
        assertEquals(Country.SGP, Country.find("SGP"), "Name");
        assertEquals(Country.SGP, Country.find("Singapore"), "Long Name");
    }

    @Test
    public void findElSalvador() {
        assertEquals(Country.SLV, Country.find("SLV"), "Name");
        assertEquals(Country.SLV, Country.find("El Salvador"), "Long Name");
    }

    @Test
    public void findSlovenia() {
        assertEquals(Country.SVN, Country.find("SVN"), "Name");
        assertEquals(Country.SVN, Country.find("Slovenia"), "Long Name");
    }

    @Test
    public void findSpain() {
        assertEquals(Country.ESP, Country.find("ESP"), "Name");
        assertEquals(Country.ESP, Country.find("Spain"), "Long Name");
    }

    @Test
    public void findSweden() {
        assertEquals(Country.SWE, Country.find("SWE"), "Name");
        assertEquals(Country.SWE, Country.find("Sweden"), "Long Name");
    }

    @Test
    public void findThailand() {
        assertEquals(Country.THA, Country.find("THA"), "Name");
        assertEquals(Country.THA, Country.find("Thailand"), "Long Name");
    }

    @Test
    public void findTurkey() {
        assertEquals(Country.TUR, Country.find("TUR"), "Name");
        assertEquals(Country.TUR, Country.find("Turkey"), "Long Name");
    }

    @Test
    public void findUnitedStates() {
        assertEquals(Country.USA, Country.find("USA"), "Name");
        assertEquals(Country.USA, Country.find("United States of America"), "Long Name");
        assertEquals(Country.USA, Country.find("US"), "Other name - 2 Character Code");
        assertEquals(Country.USA, Country.find("U.S."), "Other name - (U.S.) 2 Character Code w/ periods");
    }

    @Test
    public void findVenezuela() {
        assertEquals(Country.VEN, Country.find("VEN"), "Name");
        assertEquals(Country.VEN, Country.find("Venezuela"), "Long Name");
    }
}
