/*******************************************************************************
 * Copyright (c) 2015 Whizzo Software, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.whizzosoftware.smartobjects;

/**
 * An enumeration for standard units of measure. These are taken from UCUM (unitsofmeasure.org)
 * as per the SmartObject guidelines.
 *
 * @author Dan Noguerol
 */
public enum UCUMCode {
    AllergenUnit("[AU]"),
    Ampere("A"),
    Angstrom("Ao"),
    AstronomicalUnit("AU"),
    Atto("a"),
    Bar("bar"),
    Barn("b"),
    Baud("Bd"),
    Becquerel("Bq"),
    Bel("B"),
    Biot("Bi"),
    Bit("bit"),
    BoardFoot("[bf_i]"),
    BoltzmannConstant("[k]"),
    BRAcre("[acr_br]"),
    BRBushel("[bu_br]"),
    BRFluidOunce("[foz_br]"),
    BRGallon("[gal_br]"),
    BRGill("[gil_br]"),
    BRKnot("[kn_br]"),
    BRMile("[mi_br]"),
    BRPeck("[pk_br]"),
    BRPint("[pt_br]"),
    BRQuart("[qt_br]"),
    BRNauticalMile("[nmi_br]"),
    BRYard("[yd_br]"),
    Btu("[Btu]"),
    Byte("By"),
    Calorie("cal"),
    Candela("cd"),
    Centi("c"),
    Circle("circ"),
    Cord("[cr_i]"),
    Coulomb("C"),
    CubicFoot("[cft_i]"),
    CubicInch("[cin_i]"),
    CubicYard("[cyd_i]"),
    Curie("Ci"),
    Day("d"),
    Deci("d"),
    Degree("deg"),
    DegreeCelsius("Cel"),
    DegreeFahrenheit("[degF]"),
    DegreeRankine("[degR]"),
    Deka("da"),
    Denier("[den]"),
    Diopter("[diop]"),
    Drop("[drp]"),
    Electrovolt("eV"),
    Equivalents("eq"),
    EhrlichUnit("[EU]"),
    Exa("E"),
    Farad("F"),
    Fathom("[fth_i]"),
    Femto("f"),
    Furlong("[fur_us]"),
    Foot("[ft_i]"),
    Gauss("G"),
    Giga("G"),
    Gigabit("Gi"),
    Gilbert("Gb"),
    Gram("g"),
    GramForce("gf"),
    GramPercent("g%"),
    Gray("Gy"),
    Hecto("h"),
    Henry("H"),
    Hertz("Hz"),
    HighPowerField("[HPF]"),
    Horsepower("[HP]"),
    HounsfieldUnit("[hnsf'U]"),
    Hour("h"),
    Inch("[in_i]"),
    InchOfMercuryColumn("m[Hg]"),
    InchOfWaterColumn("[in_i'H2O]"),
    Joule("J"),
    Katal("kat"),
    Kayser("Ky"),
    Kelvin("K"),
    Kilo("k"),
    Kilobit("Ki"),
    Knot("[kn_i]"),
    Lambert("Lmb"),
    LightYear("[ly]"),
    Liter("l"),
    LowPowerField("[LPF]"),
    Lumen("lm"),
    Lux("lx"),
    Maxwell("Mx"),
    Mega("M"),
    Megabit("Mi"),
    Mesh("[mesh_i]"),
    MetabolicEquivalent("[MET]"),
    Meter("m"),
    MetersOfMercuryColumn("m[Hg]"),
    MHO("mho"),
    Micro("u"),
    Milli("m"),
    Minute("min"),
    Mole("mol"),
    Month("mo"),
    Nano("n"),
    NauticalMile("[nmi_i]"),
    Neper("Np"),
    Newton("N"),
    Oersted("Oe"),
    Ohm("Ohm"),
    Osmole("osm"),
    Pace("[pc_br]"),
    Parsec("pc"),
    PartsPerBillion("ppb"),
    PartsPerMillion("ppm"),
    PartsPerThousand("ppth"),
    PartsPerTrillion("pptr"),
    Pascal("Pa"),
    Percent("%"),
    PercentOfSlope("%[slope]"),
    PeripheralVascularResistance("[PRU]"),
    Peta("P"),
    Phot("ph"),
    Pico("p"),
    pH("[pH]"),
    PlanckConstant("[h]"),
    Poise("P"),
    PoundForce("[lbf_av]"),
    PoundPerSquareInch("[psi]"),
    PrismDiopter("[p'diop]"),
    ProteinNitrogenUnit("[PNU]"),
    Radian("rad"),
    Rod("[rd_us]"),
    Roentgen("R"),
    Second("s"),
    Siemans("S"),
    Sievert("Sv"),
    Smoot("[smoot]"),
    Spere("sph"),
    SquareFoot("[sft_i]"),
    SquareInch("[sin_i]"),
    SquareMile("[smi_us]"),
    SquareYard("[syd_i]"),
    StandardAtmosphere("atm"),
    StatuteMile("[mi_i]"),
    Steradian("sr"),
    Stokes("St"),
    SvedbergUnit("[S]"),
    Tera("T"),
    Terabit("Ti"),
    Tesla("T"),
    Tonne("t"),
    UnifiedAtomicMassUnit("u"),
    Unit("U"),
    USAcre("[acr_us]"),
    USBarrel("[bbl_us]"),
    USCup("[cup_us]"),
    USFluidOunce("[foz_us]"),
    USFoot("[ft_us]"),
    USGallon("[gal_us]"),
    USInch("[in_us]"),
    USMile("[mi_us]"),
    USPint("[pt_us]"),
    USQuart("[qt_us]"),
    USTablespoon("[tbs_us]"),
    USTeaspoon("[tsp_us]"),
    USYard("[yd_us]"),
    VelocityOfLight("[c]"),
    Volt("V"),
    Watt("W"),
    Weber("Wb"),
    WoodUnit("[wood'U]"),
    Yard("[yd_i]"),
    Year("a"),
    Yocto("y"),
    Yotta("Y"),
    Zepto("z"),
    Zeta("Z");

    private final String name;

    UCUMCode(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }

    static public UCUMCode fromString(String s) {
        if (s != null) {
            for (UCUMCode b : UCUMCode.values()) {
                if (s.equalsIgnoreCase(b.name)) {
                    return b;
                }
            }
        }
        return null;
    }
}
