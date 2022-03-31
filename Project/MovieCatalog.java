import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class MovieCatalog extends Application {
    
    @Override
    public void start(Stage primaryStage) {

          //Movie List label
          Label label = new Label("List of Movies:");
          Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
          label.setFont(font);

          //ListBox for movies
          ObservableList<String> movies = FXCollections.observableArrayList("The Shawshank Redemption", "The Godfather", "Forrest Gump", "Fight Club", "Pulp Fiction", "Star Wars: Episode V", "WALL-E", "Spider-Man: No Way Home", "Toy Story", "Up");
          ListView<String> listView = new ListView<String>(movies);
          listView.setMaxSize(200, 160);

          //Layout
          VBox layout = new VBox(10);
          layout.setPadding(new Insets(50, 5, 5, 20));
          layout.getChildren().addAll(label, listView);
          layout.setStyle("-fx-background-color: WHITE");

          //Creating the Add New button
          Button addNew = new Button();
          addNew.setText("Add New"); //Button text
          //Location of Button
          addNew.setTranslateX(480);
          addNew.setTranslateY(-185);
          layout.getChildren().addAll(addNew);

        //Stage
        Scene scene = new Scene(layout, 595, 300);
        primaryStage.setTitle("Movie Catalog");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {  
        launch(args);
    }
}
