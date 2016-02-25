package se.liu.ida.sebgr273.tdd78;

/**
 * Created by Sebastian on 2016-02-15.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public final class BoardTester {

    private static int height = 10;
    private static int width = 20;

    public static void main(String[] args) {
        Board board = new Board(height, width);
        //for(int i = 0; i < 10; i++) board.randomizeBoard();
        Board boardCopy = board;
        board.addFalling();
        TetrisFrame frame = new TetrisFrame(board);

        final Action doOneStep = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boardCopy.randomizeBoard();
            }
        };

        final Timer clockTimer = new Timer(500, doOneStep);
        clockTimer.setCoalesce(true);
        clockTimer.start();
    }


}
