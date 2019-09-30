package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Snake Typing Game");
        //set favicon of application
        Image applicationIcon = new Image(getClass().getResourceAsStream("Favicon.png"));
        primaryStage.getIcons().add(applicationIcon);

        // VBox
        VBox vb = new VBox();
        vb.setId("pane");
        vb.setPadding(new Insets(10, 50, 50, 50));
        vb.setSpacing(10);
        vb.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());

        Label lbl = new Label("Welcome to the Snake Typing Game");
        lbl.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        vb.getChildren().add(lbl);

        // Buttons
        Button btn1 = new Button();
        btn1.setText("Start Game");
        vb.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("Button2");
        vb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("Button3");
        vb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Button4");
        vb.getChildren().add(btn4);

        // Adding VBox to the scene

        primaryStage.setWidth(900);
        primaryStage.setHeight(500);
        Scene scene = new Scene(vb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
