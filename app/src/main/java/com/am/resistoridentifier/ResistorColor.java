package com.am.resistoridentifier;

import android.graphics.Color;

/**
 * Created by mitchell on 3/20/2016.
 */
public enum ResistorColor {
    BLACK(Color.rgb(0,0,0)),
    BROWN(Color.rgb(50,25,0)),
    RED(Color.rgb(100,0,0)),
    ORANGE(Color.rgb(100,50,0)),
    YELLOW(Color.rgb(100,100,0)),
    GREEN(Color.rgb(0,100,0)),
    BLUE(Color.rgb(0,0,100)),
    VIOLET(Color.rgb(100,0,100)),
    GREY(Color.rgb(50,50,50)),
    WHITE(Color.rgb(100,100,100)),
    GOLD(Color.rgb(218,165,32)),
    SILVER(Color.rgb(75,75,75)),
    NONE(Color.rgb(100,0,75));

    private int color;

    private ResistorColor (int color) {
        this.color = color;
    }

    public int getColor () {
        return this.color;
    }
}
