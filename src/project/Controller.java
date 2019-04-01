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
//    @FXML
  //  private TableView<Schedule> schedule;




    /* Dialog box appears when user presses 'Add Employee'
     and the employee's name is inserted in the schedule and database
    */
    @FXML
    public void addEmployee()
    {
        TextInputDialog dialogBox = new TextInputDialog();
        dialogBox.setTitle("Add Employee");
        dialogBox.setHeaderText(null);
        dialogBox.setContentText("Name: ");
        Optional<String> input = dialogBox.showAndWait();
    }

    /* Dialog box appears when user presses 'Delete Employee'
    and the employee's name is removed from the schedule and database
    */
    @FXML
    public void deleteEmployee()
    {
        TextInputDialog dialogBox = new TextInputDialog();
        dialogBox.setTitle("Delete Employee");
        dialogBox.setHeaderText(null);
        dialogBox.setContentText("Name: ");
        Optional<String> input = dialogBox.showAndWait();
    }

    /* Dialog box appears when user presses 'Add Duty'
    and the employee's duty is added to the schedule and database
    */
    @FXML
    public void addDuty()
    {
        TextInputDialog dialogBox = new TextInputDialog();
        dialogBox.setTitle("Add Employee's Duty");
        dialogBox.setHeaderText(null);
        dialogBox.setContentText("Duty: ");
        Optional<String> input = dialogBox.showAndWait();
    }

    /* Dialog box appears when user presses 'Delete Duty'
    and the employee's duty is removed from the schedule and database
    */
    @FXML
    public void deleteDuty()
    {
        TextInputDialog dialogBox = new TextInputDialog();
        dialogBox.setTitle("Delete Employee's Duty");
        dialogBox.setHeaderText(null);
        dialogBox.setContentText("Duty: ");
        Optional<String> input = dialogBox.showAndWait();
    }



}

