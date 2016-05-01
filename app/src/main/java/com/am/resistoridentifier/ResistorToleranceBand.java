package com.am.resistoridentifier;

/**
 * Created by User on 5/1/2016.
 */
public enum ResistorToleranceBand {

    BROWN(ResistorColor.BROWN, 1),
    RED(ResistorColor.RED, 2),
    GREEN(ResistorColor.GREEN, .5),
    BLUE(ResistorColor.BLUE, .25),
    VIOLET(ResistorColor.VIOLET, .1),
    GREY(ResistorColor.GREY, .05),
    GOLD(ResistorColor.GOLD, 5),
    SILVER(ResistorColor.SILVER, 10);

    private ResistorColor color;
    private double value;

    ResistorToleranceBand(ResistorColor color, double value) {
        this.color = color;
        this.value = value;
    }

}
