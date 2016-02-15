package se.liu.ida.sebgr273.tdd78;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Sebastian on 2016-01-27.
 */
public class Board {
    private SquareType[][] squares;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int width, height;
    private Poly falling;

    public Board(int height, int width) {
        this.width = width;
        this.height = height;
        this.squares = new SquareType[height][width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                squares[i][j] = SquareType.EMPTY;
            }
        }
    }

    public void randomizeBoard(){
        SquareType[] squareArray = SquareType.values();
        Random random = new Random();
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                squares[i][j] = squareArray[random.nextInt(squareArray.length)];
            }
        }

    }

    public SquareType getSquareType(int x, int y){
        return squares[x][y];
    }
}
