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

public class FXML_homepageController implements Initializable {

    Integer radioButtonSelection;

    @FXML
    private void handleGoButton(ActionEvent event) throws IOException {
        // Load new FXML Scene when button is clicked
        if (radioButtonSelection == 1) {
            Parent budget_page_parent = FXMLLoader.load(getClass().getResource("FXML_Budget.fxml"));
            Scene budget_page_scene = new Scene(budget_page_parent);
            Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();

            screen1.setScene(budget_page_scene);
            screen1.show();
        }
        else if (radioButtonSelection == 2){
            Parent graphs_page_parent = FXMLLoader.load(getClass().getResource("FXML_Graphs.fxml"));
            Scene graphs_page_scene = new Scene(graphs_page_parent);
            Stage screen1 = (Stage) ((Node) event.getSource()).getScene().getWindow();

            screen1.setScene(graphs_page_scene);
            screen1.show();
        }
        else if (radioButtonSelection == 3) {
            Parent transactionsPageParent = FXMLLoader.load(getClass().getResource("FXML_Transactions.fxml"));
            Scene TransactionsPageScene = new Scene((transactionsPageParent));
            Stage TransactionsStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            TransactionsStage.setScene(TransactionsPageScene);
            TransactionsStage.show();
        }
    }

    @FXML
    private void handleSeeAllTransactionsButton(ActionEvent event) throws IOException {
        Parent transactionsPageParent = FXMLLoader.load(getClass().getResource("FXML_Transactions.fxml"));
        Scene TransactionsPageScene = new Scene((transactionsPageParent));
        Stage TransactionsStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        TransactionsStage.setScene(TransactionsPageScene);
        TransactionsStage.show();
    }

    @FXML
    private void handleBudgetsRadioButton(ActionEvent event) throws IOException {
        radioButtonSelection = 1;
    }

    @FXML
    private void handleStatsGraphsButton(ActionEvent event) throws IOException {
        radioButtonSelection = 2;
    }

    @FXML
    private void handleTransactionsButton(ActionEvent event) throws IOException {
        radioButtonSelection = 3;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
