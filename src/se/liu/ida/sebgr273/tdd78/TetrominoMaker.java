package se.liu.ida.sebgr273.tdd78;

import java.util.Random;
import java.awt.Point;

/**
 * Created by Sebastian on 2016-02-15.
 */
public class TetrominoMaker{
    private Random rand = new Random();
    private SquareType[] squareArray = SquareType.values();
    private SquareType[][] shape;

    public int getNumberOfTypes(){
        return SquareType.values().length;
    }

    public Poly getPoly(int n){
        Coordinates coordinates = new Coordinates();
        if(n > getNumberOfTypes() || n<0){
            throw new IllegalArgumentException("Invalid index: " + n);
        }
        int randNum = rand.nextInt(n);
        coordinates.generateCoordList(squareArray[randNum]);
        shape = generateShape(squareArray[randNum]);
        fillShape(coordinates, squareArray[randNum]);
        return new Poly(shape, shape.length, shape[0].length);
    }

    private SquareType[][] generateShape(SquareType square){
        switch (square){
            case I:
                return new SquareType[4][4];
            case J:
            case L:
            case S:
            case Z:
            case T:
                return new SquareType[3][3];
            case O:
                return new SquareType[2][2];
            case EMPTY:
                return new SquareType[1][1];
            default:
                return new SquareType[0][0];
        }
    }

    private void emptyFillShape(){
        for(int i = 0; i < shape.length; i++){
            for(int j = 0; j < shape[i].length; j++){
                shape[i][j] = SquareType.EMPTY;
            }
        }
    }

    private void fillShape(Coordinates coordinates, SquareType square){
        emptyFillShape();
        for (Point point : coordinates) {
            shape[point.x][point.y] = square;
        }
    }
}
