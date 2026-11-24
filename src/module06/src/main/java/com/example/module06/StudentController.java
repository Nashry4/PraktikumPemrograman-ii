package com.example.module06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> studentNameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        studentNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Nashry Akbar", "2510817210014"),
                new Student(2, "Abdurrazak", "2510817210013"),
                new Student(3, "Luckya Ari Getsemane", "2510817210011"),
                new Student(4, "Raffa Azisha", "2510817210012"),
                new Student(5, "Muhammad Zainil Musthofa", "2510817210015"),
                new Student(6, "Farrel Maula Muhammad", "2510817210016"),
                new Student(7, "Ahmad Muzakki Khaira", "2510817210017"),
                new Student(8,"Muhammad Hafi","2510817210018"),
                new Student(9,"Muhammad Fauzan", "2510817210019"),
                new Student(10, "Raja Iblis", "2510817210003")
        );

        studentTable.setItems(studentList);
    }
}
