package se.liu.ida.sebgr273.tdd78;

/**
 * Created by Sebastian on 2016-02-15.
 */
public class Poly {
    private SquareType[][] poly;
    private int polyHeight;
    private int polyWidth;

    public Poly(SquareType[][] square, int height, int width){
        this.poly = square;
        this.polyHeight = height;
        this.polyWidth = width;
    }

    public SquareType[][] getPoly() {
        return poly;
    }

    public int getPolyHeight() {
        return polyHeight;
    }

    public int getPolyWidth() {
        return polyWidth;
    }
}
