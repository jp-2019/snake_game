package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;

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
        vb.setAlignment(Pos.CENTER);
        System.out.println(vb.getAlignment());
        vb.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());

        Label lbl = new Label("Welcome to the Snake Typing Game");
        lbl.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));
        lbl.setTextFill(Color.web("#FFF"));
        vb.getChildren().add(lbl);

        // Dropdown menu
        MenuItem item1 = new MenuItem("Level 1");
        MenuItem item2 = new MenuItem("Level 2");
        MenuItem item3 = new MenuItem("Level 3");
        MenuButton menu = new MenuButton("Difficulty Levels", null, item1, item2, item3);
        vb.getChildren().addAll(menu);

        // Buttons
        Button creditsBtn = new Button();
        creditsBtn.setText("Credits");
        vb.getChildren().add(creditsBtn);

        Button startBtn = new Button();
        startBtn.setText("Start Game");
        vb.getChildren().add(startBtn);


        /*
        Button btn3 = new Button();
        btn3.setText("Button3");
        vb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Button4");
        vb.getChildren().add(btn4);*/

        // for playing background MUSIC
        /*String musicFile = "out/production/snake_game/sample/music.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();*/


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
