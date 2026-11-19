package ca.nscc.turtles;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Player extends Rectangle {

    private double speed = 4;

    public Player() {
        super(40, 40, Color.DODGERBLUE);
        setTranslateX(100);
        setTranslateY(100);
    }

    public double getSpeed() {
        return speed;
    }
}
