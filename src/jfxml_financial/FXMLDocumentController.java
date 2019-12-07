
package jfxml_financial;

import Model.Model;
import Model.SerializedDataCollection;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    @FXML TextField userField;
    @FXML PasswordField passwordField;
    @FXML Label badLogin;

    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        System.out.println(userField.getText()+":"+passwordField.getText());
        
        if(userField.getText().equals("admin") && passwordField.getText().equals("password")) {
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML_homepage.fxml"));
            Scene home_page_scene = new Scene(home_page_parent);
            Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();

            screen1.setScene(home_page_scene);
            screen1.show();
 
        }
//        if (!sdc.getUserList().compareCreds(userField.getText(), passwordField.getText())) {
//            badLogin.setText("Incorrect Login");
//            badLogin.setVisible(true);
//        } 
            else {

            badLogin.setText("Incorrect Login");
            badLogin.setVisible(true);
        }
//            Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML_homepage.fxml"));
//            Scene home_page_scene = new Scene(home_page_parent);
//            Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//            screen1.setScene(home_page_scene);
//            screen1.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
    
