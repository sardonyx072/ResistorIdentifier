package com.am.resistoridentifier;

/**
 * Created by User on 5/1/2016.
 */
public enum ResistorDigitBand {

    BLACK(ResistorColor.BLACK, 0),
    BROWN(ResistorColor.BROWN, 1),
    RED(ResistorColor.RED, 2),
    ORANGE(ResistorColor.ORANGE, 3),
    YELLOW(ResistorColor.YELLOW, 4),
    GREEN(ResistorColor.GREEN, 5),
    BLUE(ResistorColor.BLUE, 6),
    VIOLET(ResistorColor.VIOLET, 7),
    GREY(ResistorColor.GREY, 8),
    WHITE(ResistorColor.WHITE, 9),
    NONE(ResistorColor.NONE, 0);

    private ResistorColor color;
    private int value;

    ResistorDigitBand(ResistorColor color, int value) {
        this.color = color;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
