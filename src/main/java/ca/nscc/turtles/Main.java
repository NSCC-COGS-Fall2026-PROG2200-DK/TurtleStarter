package ca.nscc.turtles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 *
 * @author David Kristiansen (W0242502)
 * @filename Main.java
 * @since 12:28 PM 2026-11-12
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        GamePane root = new GamePane();

        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Turtles");
        stage.setScene(scene);
        stage.show();

        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}