package se.liu.ida.sebgr273.tdd78;

/**
 * Created by Sebastian on 2016-02-15.
 */
public final class BoardToTextConverter {
    public static String convertToText(Board board){
        StringBuilder builder = new StringBuilder();

        for(int col = 0; col < board.getHeight(); col++){
            for(int row = 0; row < board.getWidth(); row++){
                builder.append(getSymbol(board.getSquareType(col, row)));
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    private static String getSymbol(SquareType squareType){
        switch(squareType){
            case I:
                return("I");
            case O:
                return ("O");
            case T:
                return ("T");
            case J:
                return ("J");
            case L:
                return ("L");
            case S:
                return ("S");
            case Z:
                return ("Z");
            case EMPTY:
                return ("|");
            default:
                return (" ");
        }
    }
}
