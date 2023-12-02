package com.example.bookthebus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {


    public void start(Stage stage) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        Scene  scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
         stage.show();

    }

    public static void main(String[] args) {
        launch();
    }



}