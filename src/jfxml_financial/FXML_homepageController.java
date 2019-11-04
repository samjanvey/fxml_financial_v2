/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_financial;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sjanv
 */
public class FXML_homepageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void handleGoButton(ActionEvent event) throws IOException  {
        // Load new FXML Scene when button is clicked
        Parent budget_page_parent = FXMLLoader.load(getClass().getResource("FXML_Budget.fxml"));
        Scene budget_page_scene = new Scene(budget_page_parent);
        Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        screen1.setScene(budget_page_scene);
        screen1.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
