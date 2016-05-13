package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    TextField nameField;

    @FXML
    TextField phoneField;

    @FXML
    TextField emailField;

    @FXML
    Button addButton;

    @FXML
    Button removeButton;

    @FXML
    ListView listView;

    public void addItem() {
        if (    ! nameField.getText().isEmpty() &&
                ! phoneField.getText().isEmpty() &&
                ! emailField.getText().isEmpty() ) {
        contacts.add(new Contact(nameField.getText(), phoneField.getText(), emailField.getText()));
        }
    }

    public void removeItem() {
        Contact contact = (Contact) listView.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(contacts);
    }

}
