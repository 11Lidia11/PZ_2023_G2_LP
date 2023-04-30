package controllers;

import com.example.system.Main;
import com.example.system.StageChanger;
import database.QExecutor;
import database_classes.TasksTable;
import database_classes.UsersTable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Objects;

public class ManagerController {

    @FXML
    private Button myTasksButton;
    @FXML
    private Button tasksButton;
    @FXML
    private Button employeeButton;
    @FXML
    private Button raportButton;
    @FXML
    private Button settingsButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button addTaskButton;
    @FXML
    private GridPane gridTasks;
    @FXML
    private GridPane gridEmployee;
    @FXML
    private GridPane gridRaport;
    @FXML
    private GridPane gridSettings;
    @FXML
    private GridPane gridMyTasks;
    @FXML
    private Label textLabel;
    @FXML
    private Label welcomeLabel;
    @FXML
    private TableColumn<?, ?> myTaskDescription;
    @FXML
    private TableColumn<?, ?> myTaskEdit;
    @FXML
    private TableColumn<?, ?> myTaskID;
    @FXML
    private TableColumn<?, ?> myTaskPlannedDate;
    @FXML
    private TableColumn<?, ?> myTaskStatus;
    @FXML
    private TableColumn<?, ?> myTaskTitle;
    @FXML
    private TableColumn<?, ?> taskDescription;
    @FXML
    private TableColumn<?, ?> taskEdit;
    @FXML
    private TableColumn<?, ?> taskEmployee;
    @FXML
    private TableColumn<?, ?> taskID;
    @FXML
    private TableColumn<?, ?> taskPlannedDate;
    @FXML
    private TableColumn<?, ?> taskStatus;
    @FXML
    private TableColumn<?, ?> taskTitle;
    private TableView<TasksTable> tableView = new TableView<>();

    public void buttonsHandlerPane(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        StageChanger stageChanger = new StageChanger();
        Object source = event.getSource();


        if (source == myTasksButton) {
            gridMyTasks.toFront();
            textLabel.setText("Moje zadania");
        } else if (source == tasksButton) {
            gridTasks.toFront();
            textLabel.setText("Zadania");
        } else if (source == employeeButton) {
            gridEmployee.toFront();
            textLabel.setText("Pracownicy");
        } else if (source == raportButton) {
            gridRaport.toFront();
            textLabel.setText("Generowanie raportów");
        } else if (source == settingsButton) {
            gridSettings.toFront();
            textLabel.setText("Ustawienia");
        } else if (source == logoutButton) {
            stageChanger.changeSize(915, 630);
            stageChanger.changeScene("/main.fxml");
        }else if (source == addTaskButton) {
            stage = new Stage();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/addTask.fxml")));
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(addTaskButton.getScene().getWindow());
            stage.showAndWait();
        }

    }
}
