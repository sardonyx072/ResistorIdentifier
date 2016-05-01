package com.am.resistoridentifier;

/**
 * Created by User on 5/1/2016.
 */
public enum ResistorMultiplierBand {

    BLACK(ResistorColor.BLACK, 1),
    BROWN(ResistorColor.BROWN, 10),
    RED(ResistorColor.RED, 100),
    ORANGE(ResistorColor.ORANGE, 1000),
    YELLOW(ResistorColor.YELLOW, 10000),
    GREEN(ResistorColor.GREEN, 100000),
    BLUE(ResistorColor.BLUE, 1000000),
    VIOLET(ResistorColor.VIOLET,10000000),
    GOLD(ResistorColor.GOLD, .1),
    SILVER(ResistorColor.SILVER, .01);
    //NONE(ResistorColor.NONE, 0);

    private ResistorColor color;
    private double value;

    ResistorMultiplierBand(ResistorColor color, double value) {
        this.color = color;
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

}
