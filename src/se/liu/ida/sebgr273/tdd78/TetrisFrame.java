package se.liu.ida.sebgr273.tdd78;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class TetrisFrame extends JFrame{
    private final int fontSize;
    private Board board;
    private JTextArea textArea;

    public TetrisFrame(Board board) {
        super("Tetris");
        this.board = board;
        this.textArea = new JTextArea(board.getHeight(), board.getWidth());
        textArea.setText(BoardToTextConverter.convertToText(board));

        this.setLayout(new BorderLayout());
        fontSize = 20;
        textArea.setFont(new Font("Monospaced", Font.PLAIN, fontSize));
        this.add(textArea, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);

        final Action doOneStep = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.randomizeBoard();
                textArea.setText(BoardToTextConverter.convertToText(board));
            }
        };

        final Timer clockTimer = new Timer(500, doOneStep);
        clockTimer.setCoalesce(true);
        clockTimer.start();


    }
}
