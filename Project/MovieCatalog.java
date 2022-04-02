import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
        listView.setMaxSize(100, 200);

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(50, 5, 5, 20));
        layout.getChildren().addAll(label, listView);
        layout.setStyle("-fx-background-color: WHITE");

        // Creating the Add New button
        Button addNew = new Button();
        addNew.setText("Add New"); // Button text
        // Location of Button
        addNew.setTranslateX(780);
        addNew.setTranslateY(0);
        layout.getChildren().addAll(addNew);

        // Create Edit button
        Button Edit = new Button();
        Edit.setText("Edit"); // Button text
        // Location of Button
        Edit.setTranslateX(780);
        Edit.setTranslateY(30);
        layout.getChildren().addAll(Edit);

        // Create Search button
        Button Search = new Button();
        Search.setText("Search"); // Button text
        // Location of Button
        Search.setTranslateX(780);
        Search.setTranslateY(60);
        layout.getChildren().addAll(Search);

        // Create Delete button
        Button Delete = new Button();
        Delete.setText("Delete"); // Button text
        // Location of Button
        Delete.setTranslateX(780);
        Delete.setTranslateY(90);
        layout.getChildren().addAll(Delete);

        // Text
        Label movieInfo = new Label("Movie Information");
        layout.getChildren().addAll(movieInfo);
        movieInfo.setTranslateX(340);
        movieInfo.setTranslateY(-250);
        movieInfo.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 20));

        // Movie Title textfield & label
        Label movieTitle = new Label("Movie Title");
        TextField textField = new TextField();
        layout.getChildren().addAll(movieTitle, textField);
        movieTitle.setTranslateY(-220);
        movieTitle.setTranslateX(400);
        movieTitle.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField.setTranslateX(365);
        textField.setTranslateY(-220);
        textField.setPrefWidth(150);
        textField.setMaxWidth(150);
        layout.setSpacing(10);

        //Genre textfield & label
        Label genre = new Label("Genre");
        TextField textField2 = new TextField();
        layout.getChildren().addAll(genre, textField2);
        genre.setTranslateY(-200);
        genre.setTranslateX(300);
        genre.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField2.setTranslateX(250);
        textField2.setTranslateY(-200);
        textField2.setPrefWidth(150);
        textField2.setMaxWidth(150);
        layout.setSpacing(10);

        //Actor textfield & label
        Label actor = new Label("Actor");
        TextField textField3 = new TextField();
        layout.getChildren().addAll(actor, textField3);
        actor.setTranslateY(-195);
        actor.setTranslateX(300);
        actor.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField3.setTranslateX(250);
        textField3.setTranslateY(-200);
        textField3.setPrefWidth(150);
        textField3.setMaxWidth(150);
        layout.setSpacing(10);

        //Writer textfield & label
        Label writer = new Label("Writer");
        TextField textField4 = new TextField();
        layout.getChildren().addAll(writer, textField4);
        writer.setTranslateY(-195);
        writer.setTranslateX(300);
        writer.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField4.setTranslateX(250);
        textField4.setTranslateY(-200);
        textField4.setPrefWidth(150);
        textField4.setMaxWidth(150);
        layout.setSpacing(10);

        //Director textfield & label
        Label director = new Label("Director");
        TextField textField5 = new TextField();
        layout.getChildren().addAll(director, textField5);
        director.setTranslateX(550);
        director.setTranslateY(-325);
        director.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField5.setTranslateX(500);
        textField5.setTranslateY(-392);
        textField5.setPrefWidth(150);
        textField5.setMaxWidth(150);
        layout.setSpacing(10);

        //Year textfield & label
        Label year = new Label("Year");
        TextField textField6 = new TextField();
        layout.getChildren().addAll(year, textField6);
        year.setTranslateX(555);
        year.setTranslateY(-457);
        year.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField6.setTranslateX(500);
        textField6.setTranslateY(-392);
        textField6.setPrefWidth(150);
        textField6.setMaxWidth(150);
        layout.setSpacing(10);

        //Revenue textfield & label
        Label revenue = new Label("Revenue");
        TextField textField7 = new TextField();
        layout.getChildren().addAll(revenue, textField7);
        revenue.setTranslateX(550);
        revenue.setTranslateY(-385);
        revenue.setFont(Font.font("verdance", FontWeight.BOLD, FontPosture.REGULAR, 13));
        textField7.setTranslateX(500);
        textField7.setTranslateY(-392);
        textField7.setPrefWidth(150);
        textField7.setMaxWidth(150);
        layout.setSpacing(10);

        // Stage
        Scene scene = new Scene(layout, 895, 365);
        primaryStage.setTitle("Movie Catalog");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
