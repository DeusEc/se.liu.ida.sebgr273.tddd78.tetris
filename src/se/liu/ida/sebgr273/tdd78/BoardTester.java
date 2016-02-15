package se.liu.ida.sebgr273.tdd78;

/**
 * Created by Sebastian on 2016-02-15.
 */
public class BoardTester {
    public static void main(String[] args) {
        Board board = new Board(50, 100);
        for(int i = 0; i < 10; i++) board.randomizeBoard();

        System.out.println(BoardToTextConverter.convertToText(board));

    }
}
