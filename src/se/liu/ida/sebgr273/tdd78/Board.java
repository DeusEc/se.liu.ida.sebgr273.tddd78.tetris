package se.liu.ida.sebgr273.tdd78;

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
        this.fallingX = width/2 - 2;
        this.fallingY = 0;

        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                squares[row][col] = SquareType.EMPTY;
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
            for (int col = 0; col < width; col++){
                squares[row][col] = squareArray[random.nextInt(squareArray
                        .length)];
            }
        }
    }

    public void addFalling(){
        if(fallingPoly != null){
            for(int row = 0; row < fallingPoly.getPolyHeight(); row++){
                for(int col = 0; col < fallingPoly.getPolyWidth(); col++){
                    if(fallingPoly.getPoly()[row][col] != SquareType.EMPTY) {
                        squares[row + fallingY][col + fallingX] = fallingPoly
                                .getPoly()[row][col];
                    }
                }
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
