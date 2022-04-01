import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MovieCatalog extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Movie List label
        Label label = new Label("List of Movies:");
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        label.setFont(font);

        // ListBox for movies
        ObservableList<String> movies = FXCollections.observableArrayList("The Shawshank Redemption", "The Godfather",
                "Forrest Gump", "Fight Club", "Pulp Fiction", "Star Wars: Episode V", "WALL-E",
                "Spider-Man: No Way Home", "Toy Story", "Up");
        ListView<String> listView = new ListView<String>(movies);
        listView.setMaxSize(160, 300);

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(50, 0, 0, 20));
        layout.getChildren().addAll(label, listView);
        layout.setStyle("-fx-background-color: WHITE");

        // Creating the Add New button
        Button addNew = new Button();
        addNew.setText("Add New"); // Button text
        // Location of Button
        addNew.setTranslateX(480);
        addNew.setTranslateY(-60);
        layout.getChildren().addAll(addNew);

        // Create Edit button
        Button Edit = new Button();
        Edit.setText("Edit"); // Button text
        // Location of Button
        Edit.setTranslateX(480);
        Edit.setTranslateY(-40);
        layout.getChildren().addAll(Edit);

        // Create Search button
        Button Search = new Button();
        Search.setText("Search"); // Button text
        // Location of Button
        Search.setTranslateX(480);
        Search.setTranslateY(-20);
        layout.getChildren().addAll(Search);

        // Create Delete button
        Button Delete = new Button();
        Delete.setText("Delete"); // Button text
        // Location of Button
        Delete.setTranslateX(480);
        Delete.setTranslateY(0);
        layout.getChildren().addAll(Delete);

        // Text
        Label movieInfo = new Label("Movie Information");
        layout.getChildren().addAll(movieInfo);
        movieInfo.setTranslateX(190);
        movieInfo.setTranslateY(-250);
        movieInfo.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 20));

        // Genre
        Label genre = new Label("Genre");
        TextField textField = new TextField();
        layout.getChildren().addAll(genre, textField);
        textField.setTranslateX(180);
        textField.setTranslateY(-200);
        textField.setPrefWidth(150);
        textField.setMaxWidth(150);
        layout.setSpacing(10);

        // Stage
        Scene scene = new Scene(layout, 595, 565);
        primaryStage.setTitle("Movie Catalog");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
