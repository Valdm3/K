package org.tyaa.javafxdemo1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLController implements Initializable {
    
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TableView studentsTable;
    @FXML
    private TableColumn fisrtNameColumn;
    @FXML
    private TableColumn lasrtNameColumn;
    
    private ObservableList<Student> students;
    
    //Обпаботчик клика по кнопке
    @FXML
    private void addHandler(ActionEvent event) {
        // System.out.println(firstName.getText());
        System.out.println(students);
        System.out.println(firstName.getText());
        System.out.println(lastName.getText());
        students.add(new Student(firstName.getText(), lastName.getText()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Источник данных - наблюдабельный список
        students = FXCollections.observableArrayList();
        //Сопоставление: из каких полей объектов "Студент"
        //в какие колонки таблицы выводить данные
        fisrtNameColumn.setCellValueFactory(
                new PropertyValueFactory<Student, String>("firstName")
        );
        lasrtNameColumn.setCellValueFactory(
                new PropertyValueFactory<Student, String>("lastName")
        );
        //Подключаем список объектов "Студент" к таблице
        studentsTable.setItems(students);
    }    
}
