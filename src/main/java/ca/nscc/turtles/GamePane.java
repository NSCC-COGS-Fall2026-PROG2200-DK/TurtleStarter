package ca.nscc.turtles;

import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

import java.util.HashSet;
import java.util.Set;

public class GamePane extends Pane {

    private final Player player = new Player();

    private final Set<KeyCode> keysPressed = new HashSet<>();

    public GamePane() {

        setPrefSize(800, 600);

        getChildren().add(player);

        setOnKeyPressed(e -> keysPressed.add(e.getCode()));
        setOnKeyReleased(e -> keysPressed.remove(e.getCode()));

        AnimationTimer timer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                update();
            }
        };

        timer.start();
    }

    private void update() {

        double speed = player.getSpeed();

        if (keysPressed.contains(KeyCode.W))
            player.setTranslateY(player.getTranslateY() - speed);

        if (keysPressed.contains(KeyCode.S))
            player.setTranslateY(player.getTranslateY() + speed);

        if (keysPressed.contains(KeyCode.A))
            player.setTranslateX(player.getTranslateX() - speed);

        if (keysPressed.contains(KeyCode.D))
            player.setTranslateX(player.getTranslateX() + speed);
    }
}