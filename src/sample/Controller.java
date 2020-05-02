package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Label userNameLable;

    @FXML
    private Label passwordLable;

    @FXML
    private Button loginButton;

    @FXML
    private Scene parent;

    @FXML
    private TableView<?> playersTable;

    @FXML
    private Label serchLable;

    @FXML
    private ComboBox<?> dropDownTor;
    @FXML
    private BorderPane MainPage;

    @FXML
    private VBox toolPanle;

    @FXML
    private Label spaceLable;

    @FXML
    private Button schedule;

    @FXML
    private Button teams;

    @FXML
    private Button tournmants;

    @FXML
    private Button players;

    @FXML
    private Button login;

    @FXML
    void loginEvent(ActionEvent event) throws IOException {
        load("log in.fxml");

    }

    @FXML
    void playersEvent(ActionEvent event) {
        load("userPlayers.fxml");
    }

    @FXML
    void scheduleEvent(ActionEvent event) {
        load("userSchechul.fxml");
    }

    @FXML
    void teamsEvent(ActionEvent event) {

        load("userTeams.fxml");
    }

    @FXML
    void torEvent(ActionEvent event) {

       load("userTor.fxml");

    }

    void load(String s){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(s));
        Parent root;
        try {
            root =  loader.load();
        } catch (IOException ioe) {

            System.out.print("Error");
            return;
        }
        MainPage.setCenter(root);
    }

}
