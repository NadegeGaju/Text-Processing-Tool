package com.example.textprocessing;

import com.example.textprocessing.Modules.DataManagementModule;
import com.example.textprocessing.Modules.TextProcessingModule;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private TextProcessingModule textProcessingModule = new TextProcessingModule();
    private DataManagementModule dataManagementModule = new DataManagementModule();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Processing Tool");

        Label label = new Label("Enter text:");
        TextArea textArea = new TextArea();

        Label regexLabel = new Label("Enter regex:");
        TextField regexField = new TextField();

        Label replaceLabel = new Label("Replacement text:");
        TextField replaceField = new TextField();

        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> {
            boolean found = textProcessingModule.findPattern(textArea.getText(), regexField.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Search Result");
            alert.setHeaderText(null);
            alert.setContentText(found ? "Pattern found!" : "Pattern not found.");
            alert.showAndWait();
        });

        Button replaceButton = new Button("Replace");
        replaceButton.setOnAction(e -> {
            String result = textProcessingModule.   replacePattern(textArea.getText(), regexField.getText(), replaceField.getText());
            textArea.setText(result);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textArea, regexLabel, regexField, replaceLabel, replaceField, searchButton, replaceButton);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Additional UI components for data management
        Label dataLabel = new Label("Enter data:");
        TextField dataField = new TextField();
        Button addToListButton = new Button("Add to List");
        Button addToSetButton = new Button("Add to Set");
        Button addToMapButton = new Button("Add to Map");

        addToListButton.setOnAction(e -> {
            dataManagementModule.addToList(dataField.getText());
            dataField.clear();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}