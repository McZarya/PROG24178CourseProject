import javax.swing.JFrame;
import javax.swing.JLabel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MovieCatalog extends Application {

    Button button;
    public static void main(String[] args) {  
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Movie Catalog");



        StackPane layout = new StackPane();


        Scene scene = new Scene(layout, 500, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
