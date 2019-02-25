package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Main extends Application
{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("project.fxml"));
        stage.setTitle("Employee Scheduler");
        stage.setScene(new Scene(pane, 1000, 475));
        stage.show();
    }

    

}
