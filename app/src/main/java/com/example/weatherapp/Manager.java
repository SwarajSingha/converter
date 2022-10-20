package com.example.weatherapp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manager {


    //Length unit
    public static final int MICROMETER = 100;
    public static final int MILLIMETER = 101;
    public static final int CENTIMETER = 102;
    public static final int DECIMETER = 103;
    public static final int METER = 104;
    public static final int INCH = 105;
    public static final int FEET = 106;
    public static final int YARD = 107;
    public static final int MILE = 108;
    public static final int KILOMETER = 109;
    public static final int NANOMETER = 110;

    //length
    public static Unit micrometer = new Unit(MICROMETER, "Micrometer", 0.000001, 1000000.0);
    public static Unit millimeter = new Unit(MILLIMETER, "Millimeter", 0.001, 1000.0);
    public static Unit centimeter = new Unit(CENTIMETER, "Centimeter", 0.01, 100.0);
    public static Unit kilometer = new Unit(KILOMETER, "Kilometer", 1000, 0.001);
    public static Unit meter = new Unit(METER, "Meter", 1.0, 1.0);
    public static Unit inch = new Unit(INCH, "Inch", 0.0254, 39.3700787401574803);
    public static Unit feet = new Unit(FEET, "Feet", 0.3048, 3.28083989501312336);
    public static Unit yard = new Unit(YARD, "Yard", 0.9144, 1.09361329833770779);
    public static Unit mile = new Unit(MILE, "Mile", 1609.344, 0.00062137119223733397);
    public static Unit decimeter = new Unit(DECIMETER, "Decimeter", 0.1, 10);
    public static Unit nanometer = new Unit(NANOMETER, "Nanometer", 0.000000001, 1000000000.0);



    public static List<Unit> getLengthUnits() {
        List<Unit> lengthUnits = new ArrayList<>();

        lengthUnits.add(centimeter);
        lengthUnits.add(kilometer);
        lengthUnits.add(meter);
        lengthUnits.add(micrometer);
        lengthUnits.add(millimeter);
        lengthUnits.add(micrometer);
        lengthUnits.add(millimeter);
        lengthUnits.add(mile);
        lengthUnits.add(nanometer);
        lengthUnits.add(yard);

        return lengthUnits;
    }
    //Mass unit
    public static final int KILOGRAM = 136;
    public static final int POUND = 137;
    public static final int GRAM = 138;
    public static final int MILLIGRAM = 139;
    public static final int OUNCE = 140;
    public static final int GRAIN = 141;
    public static final int STONE = 142;
    public static final int METRIC_TON = 143;
    public static final int SHORT_TON = 144;
    public static final int LONG_TON = 145;

   //Mass
    public static Unit kilogram = new Unit(KILOGRAM, "Kilogram", 1.0, 1.0);
    public static Unit pound = new Unit(POUND, "Pound", 0.45359237, 2.20462262184877581);
    public static Unit gram = new Unit(GRAM, "Gram", 0.001, 1000.0);
    public static Unit milligram = new Unit(MILLIGRAM, "Milligram", 0.000001, 1000000.0);
    public static Unit ounch = new Unit(OUNCE, "Ounch", 0.028349523125, 35.27396194958041291568);
    public static Unit grain = new Unit(GRAIN, "Grain", 0.00006479891, 15432.35835294143065061);
    public static Unit stone = new Unit(STONE, "Stone", 6.35029318, 0.15747304441777);
    public static Unit metric_ton = new Unit(METRIC_TON, "Metric ton", 1000.0, 0.001);
    public static Unit short_ton = new Unit(SHORT_TON, "Short ton", 907.18474, 0.0011023113109243879);
    public static Unit long_ton = new Unit(LONG_TON, "Long ton", 1016.0469088, 0.0009842065276110606282276);

    public static List<Unit> getWeightUnits() {
        List<Unit> units = new ArrayList<>();
        units.add(kilogram);
        units.add(pound);
        units.add(gram);
        units.add(milligram);
        units.add(ounch);
        units.add(grain);
        units.add(stone);
        units.add(metric_ton);
        units.add(short_ton);
        units.add(long_ton);
        return units;
    }
    //Volume unit
    public static final int CUBIC_CENTIMETER = 123;
    public static final int CUBIC_FOOT = 124;
    public static final int CUBIC_INCH = 125;
    public static final int CUBIC_YARD = 126;
    public static final int LITRE = 129;
    public static final int MILLILITRE = 130;
    public static final int CUBIC_M = 131;
    public static final int GALLON = 132;


//    public static Unit centi_litre = new Unit(CENTI_LITRE, "Centi litre", 0.000001, 1000000);

    public static Unit cubic_centimeter = new Unit(CUBIC_CENTIMETER, "Cubic centimeter", 0.000001, 1000000);
    public static Unit cubic_foot = new Unit(CUBIC_FOOT, "Cubic foot", 0.028317, 35.314667);
    public static Unit cubic_inch = new Unit(CUBIC_INCH, "Cubic inch", 0.0000163871, 61023.744095);
    public static Unit cubic_yard = new Unit(CUBIC_YARD, "Cubic yard", 0.764554858, 1.3079506193);
    public static Unit litre = new Unit(LITRE, "Litre", 0.001, 1000);
    public static Unit milli_litre = new Unit(MILLILITRE, "Milli litre", 0.000001, 1000000);
    public static Unit cubic_meter = new Unit(CUBIC_M, "Cubic meter", 1, 1);
    public static Unit gallon = new Unit(GALLON, "Gallon", 0.00378541, 264.17217686);


    public static List<Unit> getVolumeUnits() {
        List<Unit> units = new ArrayList<Unit>();
        units.add(cubic_centimeter);
        units.add(cubic_foot);
        units.add(cubic_inch);
        units.add(cubic_yard);
        units.add(litre);
        units.add(milli_litre);
        units.add(cubic_meter);
        units.add(gallon);
        return units;
    }
    //Area unit
    public static final int SQUARE_MILLIMETER = 111;
    public static final int SQUARE_CENTIMETER = 112;
    public static final int SQUARE_DECIMETER = 113;
    public static final int SQUARE_METER = 114;
    public static final int SQUARE_INCH = 115;
    public static final int SQUARE_FEET = 116;
    public static final int SQUARE_YARD = 117;
    public static final int ACRE = 118;
    public static final int SQUARE_KILOMETER = 119;
    public static final int GUNTA = 120;
    public static final int BIGHA = 121;


    public static Unit square_millimeter = new Unit(SQUARE_MILLIMETER, "Square millimeter", 0.000001, 1000000);
    public static Unit square_centimeter = new Unit(SQUARE_CENTIMETER, "Square centimeter", 0.0001, 10000);
    public static Unit square_decimeter = new Unit(SQUARE_DECIMETER, "Square decimeter", 0.01, 100);
    public static Unit square_meter = new Unit(SQUARE_METER, "Square meter", 1.0, 1.0);
    public static Unit square_inch = new Unit(SQUARE_INCH, "Square inch", 0.00064516, 1550.0031);
    public static Unit square_feet = new Unit(SQUARE_FEET, "Square feet", 0.092903, 10.76391);
    public static Unit square_yard = new Unit(SQUARE_YARD, "Square yard", 0.836127, 1.19599);
    public static Unit acre = new Unit(ACRE, "Acre", 4046.86, 0.0002471052);
    public static Unit square_kilometer = new Unit(SQUARE_KILOMETER, "Square kilometer", 1000000.0, 0.000001);
    public static Unit gunta = new Unit(GUNTA, "Gunta", 101.17952516, 0.00988342254442);

    public static List<Unit> getAreaUnits() {
        List<Unit> areaUnits = new ArrayList<>();
        areaUnits.add(square_millimeter);
        areaUnits.add(square_centimeter);
        areaUnits.add(square_decimeter);
        areaUnits.add(square_meter);
        areaUnits.add(square_inch);
        areaUnits.add(square_feet);
        areaUnits.add(square_yard);
        areaUnits.add(acre);
        areaUnits.add(square_kilometer);
        areaUnits.add(gunta);
        return areaUnits;
    }
    //Storage unit
    public static final int BIT = 155;
    public static final int BYTE = 156;
    public static final int KILOBIT = 157;
    public static final int KILOBYTE = 158;
    public static final int MEGABIT = 159;
    public static final int MEGABYTE = 160;
    public static final int GIGABIT = 161;
    public static final int GIGABYTE = 162;
    public static final int TERABIT = 163;
    public static final int TERABYTE = 164;


    public static Unit bit = new Unit(BIT, "Bit", 0.00000011920928955078, 8388608.0);
    public static Unit byte_ = new Unit(BYTE, "Byte", 0.00000095367431640625, 1048576.0);
    public static Unit kilobit = new Unit(KILOBIT, "Kilobit", 0.0001220703125, 8192.0);
    public static Unit kilobyte = new Unit(KILOBYTE, "Kilobyte", 0.0009765625, 1024.0);
    public static Unit megabit = new Unit(MEGABIT, "Megabit", 0.125, 8.0);
    public static Unit megabyte = new Unit(MEGABYTE, "Megabyte", 1.0, 1.0);
    public static Unit gigabit = new Unit(GIGABIT, "Gigabit", 128.0, 0.0078125);
    public static Unit gigabyte = new Unit(GIGABYTE, "Gigabyte", 1024.0, 0.0009765625);
    public static Unit terabit = new Unit(TERABIT, "Terabit", 131072.0, 0.00000762939453125);
    public static Unit terabyte = new Unit(TERABYTE, "terabyte", 1048576.0, 0.00000095367431640625);


    public static List<Unit> getStorageUnits() {
        List<Unit> units = new ArrayList<>();
        units.add(bit);
        units.add(byte_);
        units.add(kilobit);
        units.add(kilobyte);
        units.add(megabit);
        units.add(megabyte);
        units.add(gigabit);
        units.add(gigabyte);
        units.add(terabit);
        units.add(terabyte);
        return units;
    }
    //Speed unit
    public static final int KM_HR = 165;
    public static final int MPH = 166;
    public static final int M_S = 167;
    public static final int FPS = 168;
    public static final int KNOT = 169;

    public static Unit km_hr = new Unit(KM_HR, "Kilometre/hour", 0.27777777777778, 3.6);
    public static Unit mph = new Unit(MPH, "Mile/hour", 0.44704, 2.2369362920544);
    public static Unit ms = new Unit(M_S, "Metre/second", 1.0, 1.0);
    public static Unit fps = new Unit(FPS, "Foot/second", 0.3048, 3.2808398950131);
    public static Unit knot = new Unit(KNOT, "Knot", 0.51444444444444, 1.9438444924406);


    public static List<Unit> getSpeedUnits() {

        List<Unit> units = new ArrayList<Unit>();
        units.add(km_hr);
        units.add(mph);
        units.add(ms);
        units.add(fps);
        units.add(knot);
        return units;
    }
    //Time unit
    public static final int YEAR = 170;
    public static final int MONTH = 171;
    public static final int DAY = 172;
    public static final int HOUR = 173;
    public static final int WEEK = 174;
    public static final int MINUTE = 175;
    public static final int SECOND = 176;
    public static final int MILLISECOND = 177;
    public static final int NANOSECOND = 178;

    public static Unit year = new Unit(YEAR, "year", 31536000.0, 0.0000000317097919837645865);
    public static Unit month = new Unit(MONTH, "month", 2628000.0, 0.0000003805175);
    public static Unit week = new Unit(WEEK, "week", 604800.0, 0.00000165343915343915344);
    public static Unit day = new Unit(DAY, "day", 86400.0, 0.0000115740740740740741);
    public static Unit hour = new Unit(HOUR, "hour", 3600.0, 0.000277777777777777778);
    public static Unit minute = new Unit(MINUTE, "minute", 60.0, 0.0166666666666666667);
    public static Unit second = new Unit(SECOND, "second", 1.0, 1.0);
    public static Unit millisecond = new Unit(MILLISECOND, "millisecond", 0.001, 1000.0);
    public static Unit nanosecond = new Unit(NANOSECOND, "nanosecond", 0.000000001, 1000000000.0);

    public static List<Unit> getTimeConversions() {
        //Base unit - seconds
        List<Unit> units = new ArrayList<Unit>();
        units.add(year);
        units.add(month);
        units.add(week);
        units.add(day);
        units.add(hour);
        units.add(minute);
        units.add(second);
        units.add(millisecond);
        units.add(nanosecond);
        return units;
    }
    //Pressure
    public static final int MEGAPASCAL = 179;
    public static final int KILOPASCAL = 180;
    public static final int PASCAL = 181;
    public static final int BAR = 182;
    public static final int PSI = 183;
    public static final int PSF = 184;
    public static final int ATMOSPHERE = 185;
    public static final int TECHNICAL_ATMOSPHERE = 186;
    public static final int MMHG = 187;
    public static final int TORR = 188;

    //Base unit - Pa
    public static Unit mega_pascal = new Unit(MEGAPASCAL, "Megapascal", 1000000.0, 0.000001);
    public static Unit kilo_pascal = new Unit(KILOPASCAL, "Kilopascal", 1000.0, 0.001);
    public static Unit pascal = new Unit(PASCAL, "Pascal", 1.0, 1.0);
    public static Unit bar = new Unit(BAR, "Bar", 100000.0, 0.00001);
    public static Unit psi = new Unit(PSI, "PSI", 6894.757293168361, 0.000145037737730209222);
    public static Unit psf = new Unit(PSF, "PSF", 47.880258980335840277777777778, 0.020885434233150127968);
    public static Unit atmosphere = new Unit(ATMOSPHERE, "Atmosphere", 101325.0, 0.0000098692326671601283);
    public static Unit technical_atmosphere = new Unit(TECHNICAL_ATMOSPHERE, "Technical Atm", 98066.5, 0.0000101971621297792824257);
    public static Unit mmgh = new Unit(MMHG, "mm Hg", 133.322387415, 0.007500615758456563339513);
    public static Unit torr = new Unit(TORR, "Torr", 133.3223684210526315789, 0.00750061682704169751);

    public static List<Unit> getPressureUnits() {
        List<Unit> units = new ArrayList<>();
        units.add(mega_pascal);
        units.add(kilo_pascal);
        units.add(pascal);
        units.add(bar);
        units.add(psi);
        units.add(psf);
        units.add(atmosphere);
        units.add(technical_atmosphere);
        units.add(mmgh);
        units.add(torr);
        return units;
    }
    //Temperature unit
    public static final int CELSIUS = 146;
    public static final int FAHRENHEIT = 147;
    public static final int KELVIN = 148;
    public static final int RANKINE = 149;


    public static Unit celsius = new Unit(CELSIUS, "Celsius");
    public static Unit fahrenheit = new Unit(FAHRENHEIT, "Fahrenheit");
    public static Unit kelvin = new Unit(KELVIN, "Kelvin");
    public static Unit rankine = new Unit(RANKINE, "Rankine");


    public static List<Unit> getTemperatureUnits() {
        List<Unit> units = new ArrayList<>();
        units.add(celsius);
        units.add(fahrenheit);
        units.add(kelvin);
        units.add(rankine);

        return units;
    }

}
