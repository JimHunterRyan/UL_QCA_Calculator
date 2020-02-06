package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       Parent root;
        root = load(getClass().getResource("Main.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("QCA Calculator");


        //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
