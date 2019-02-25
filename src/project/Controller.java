package project;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextInputDialog;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.control.TableView;




public class Controller
{
    @FXML
    private TableView<Schedule> schedule;




    /* Dialog box appears when user presses 'Add Employee'
     and his/her input is inserted the drop down menu and database */
    @FXML
    public void addEmployee()
    {
    TextInputDialog dialog = new TextInputDialog();
    dialog.setTitle("Add Employee");
    dialog.setHeaderText(null);
    dialog.setContentText("Name: ");
    Optional<String> input = dialog.showAndWait();
    }
    
}

