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
    private Poly fallingPoly = null;
    private int fallingX, fallingY;

    public Board(int height, int width) {
        this.width = width;
        this.height = height;
        this.squares = new SquareType[height][width];
        this.fallingPoly = spawnPoly();
        this.fallingX = width/2 - 1;
        this.fallingY = 1;

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                squares[i][j] = SquareType.EMPTY;
            }
        }
    }

    public Poly getFallingPoly() {
        return fallingPoly;
    }

    public int getFallingX() {
        return fallingX;
    }

    public int getFallingY() {
        return fallingY;
    }

    public void randomizeBoard(){
        SquareType[] squareArray = SquareType.values();
        Random random = new Random();
        for(int row = 0; row < height; row++){
            for (int column = 0; column < width; column++){
                squares[row][column] = squareArray[random.nextInt(squareArray.length)];
            }
        }
    }

    private Poly spawnPoly(){
        TetrominoMaker tetrominoMaker = new TetrominoMaker();
        return tetrominoMaker.getPoly(tetrominoMaker.getNumberOfTypes());
    }

    public SquareType getSquareType(int x, int y){
        return squares[x][y];
    }
}
