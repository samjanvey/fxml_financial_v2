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

public class FXML_TransactionsController implements Initializable {

     @FXML
    private void handleBackButtonAction(ActionEvent event) throws IOException {
         System.out.println("Back Button Clicked");
         Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML_homepage.fxml"));
         Scene home_page_scene = new Scene(home_page_parent);
         Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();

         screen1.setScene(home_page_scene);
         screen1.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
