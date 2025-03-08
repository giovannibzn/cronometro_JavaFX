package br.com.giovanni.cronometro;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.security.Key;

public class Cronometro extends Application {

    private Label timeLabel = new Label("00:00:00:00");
    private int secondsElapsed = 0;
    private int millisecondsElapsed = 0;
    private Timeline timeline;

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("Cronometro");

        //Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        //Display do tempo
        timeLabel.setId("timeLabel");
        root.getChildren().add(timeLabel);

        //Layout botoes
        HBox hBox = new HBox();
        hBox.setSpacing(10);

        Button startButton = new Button("Iniciar");
        startButton.setMinSize(100, 50);
        startButton.setId("startButton");
        startButton.setOnAction(e -> startTime());

        Button pauseButton = new Button("Pausar");
        pauseButton.setMinSize(100, 50);
        pauseButton.setId("pauseButton");
        pauseButton.setOnAction(e -> pauseTimer());

        Button resetButton = new Button("Reiniciar");
        resetButton.setMinSize(100, 50);
        resetButton.setId("resetButton");
        resetButton.setOnAction(e-> resetTimer());

        hBox.getChildren().addAll(startButton, pauseButton, resetButton);

        root.getChildren().addAll(hBox);

        //Configurar cena
        Scene scene = new Scene(root, 360, 180);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //inicializar o temporizador
    private void startTime(){
        if(timeline == null || timeline.getStatus() != Animation.Status.RUNNING){
            timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> updateTimer()));
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        }
    }

    //pausar tempo
    private void pauseTimer(){
        if(timeline != null){
            timeline.pause();
        }
    }

    //zerar tempo
    private void resetTimer(){
        if(timeline != null){
            timeline.stop();
        }
        secondsElapsed = 0;
        millisecondsElapsed = 0;
        updateTimerDisplay();
    }

    //atualizar display
    private void updateTimer() {
        millisecondsElapsed +=10;

        if(millisecondsElapsed >= 1000){
            millisecondsElapsed = 0;
            secondsElapsed++;
        }

        updateTimerDisplay();
    }

    private void updateTimerDisplay(){
        int hours = secondsElapsed / 3600; // < 3600 = 0; > 3600 1; 7200 2
        int minutes = (secondsElapsed %  3600) / 60;
        int seconds = secondsElapsed % 60; // 1234:59:59
        int millis = millisecondsElapsed / 10;

        timeLabel.setText(String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, millis));
    }

    public static void main(String[] args) {
        launch();
    }
}