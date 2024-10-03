import java.awt.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * Author: Aubrie McIntyre
 * Date: 10/3/2024
 * Description: Program will open an application that will allow users to change the color of a circle by clicking the circle.
 */
public class MyApp extends Application {
    public void start(Stage primaryStage) {
        double width = 400;
        double height = 400;
        // Establish new Circle object
        Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.WHITE);
        c.setStroke(Color.BLACK);
        StackPane pane = new StackPane(c);
        primaryStage.setScene(new Scene(pane, width, height));
        // Defines action when pressing the circle
        pane.setOnMousePressed(e -> c.setFill(Color.BLACK));
        // Defines action when releasing after pressing on the circle
        pane.setOnMouseReleased(e -> c.setFill(Color.WHITE));
        primaryStage.setTitle("Click on the circle");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}