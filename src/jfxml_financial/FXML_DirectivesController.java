package jfxml_financial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class FXML_DirectivesController {

    @FXML
    private void handleBackButtonAction(ActionEvent event) throws IOException {
        System.out.println("Back Button Clicked");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML_homepage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();

        screen1.setScene(home_page_scene);
        screen1.show();
    }
}
