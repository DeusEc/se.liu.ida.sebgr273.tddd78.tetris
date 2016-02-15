package se.liu.ida.sebgr273.tdd78;

/**
 * Created by Sebastian on 2016-02-15.
 */
public class BoardToTextConverter {
    public static String convertToText(Board board){
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < board.getHeight(); i++){
            for(int j = 0; j < board.getWidth(); j++){
                switch (board.getSquareType(i, j)){
                    case I:
                        builder.append(" I ");
                        break;
                    case O:
                        builder.append(" O ");
                        break;
                    case T:
                        builder.append(" T ");
                        break;
                    case J:
                        builder.append(" J ");
                        break;
                    case L:
                        builder.append(" L ");
                        break;
                    case S:
                        builder.append(" S ");
                        break;
                    case Z:
                        builder.append(" Z ");
                        break;
                    default:
                        builder.append("   ");
                        break;
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
