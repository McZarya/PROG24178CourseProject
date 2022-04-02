import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemo extends Application {
    protected Text text = new Text(50, 50, "JavaFX Programming");

    protected BorderPane getPane() {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left",
                new ImageView("image/left.gif"));
        Button btRight = new Button("Right",
                new ImageView("image/right.gif"));
        Button btUp = new Button("Up", 
                new ImageView("image/up.gif"));
        Button btDown = new Button("Down", 
                new ImageView("image/down.gif"));
        paneForButtons.getChildren().addAll(btLeft, btRight, btUp, btDown);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        btUp.setOnAction(e -> text.setY(text.getY() - 10));
        btDown.setOnAction(e -> text.setY(text.getY() + 10));

        return pane;
    } // end of definition of method getPane()

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 450, 200);
        primaryStage.setTitle("ButtonDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
