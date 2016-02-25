package se.liu.ida.sebgr273.tdd78;

import java.util.*;
import java.awt.Point;

/**
 * Created by Sebastian on 2016-02-15.
 */
public class Coordinates implements Iterable<Point>{
    private ArrayList<Point> coordList;

    public Coordinates(){
        this.coordList = new ArrayList<>();
    }

    public Iterator<Point> iterator(){
        return coordList.iterator();
    }

    public List<Point> generateCoordList(SquareType square){
        switch (square){
            case I:
                for(int i = 0; i < 4; i++) coordList.add(new Point(1, i));
                return coordList;
            case O:
                coordList.add(new Point(0, 0));
                coordList.add(new Point(1, 0));
                coordList.add(new Point(0, 1));
                coordList.add(new Point(1, 1));
                return coordList;
            case T:
                coordList.add(new Point(0, 1));
                for(int i = 0; i < 3; i++) coordList.add(new Point(1, i));
                return coordList;
            case J:
                coordList.add(new Point(0, 0));
                for(int i = 0; i < 3; i++) coordList.add(new Point(1, i));
                return coordList;
            case L:
                coordList.add(new Point(0, 2));
                for(int i = 0; i < 3; i++) coordList.add(new Point(1, i));
                return coordList;
            case S:
                coordList.add(new Point(1, 0));
                coordList.add(new Point(2, 0));
                coordList.add(new Point(0, 1));
                coordList.add(new Point(1, 1));
                return coordList;
            case Z:
                coordList.add(new Point(0, 0));
                coordList.add(new Point(0, 1));
                coordList.add(new Point(1, 1));
                coordList.add(new Point(1, 2));
                return coordList;
            default:
                return coordList;
        }
    }
}
