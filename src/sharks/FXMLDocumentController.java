/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharks;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;

/**
 *
 * @author Jessica
 */
public class FXMLDocumentController implements Initializable {
   
    
    
    @FXML
    private ImageView picBull;

    @FXML
    private ImageView picWhite;

    @FXML
    private ImageView picHammard;

    @FXML
    private ImageView picWhale;


    @FXML
    void onClickedBull(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Bull.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();  
         
    }

    @FXML
    void onClickedGreat(MouseEvent event) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("White.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();  
         

    }

    @FXML
    void onClickedHammard(MouseEvent event) throws IOException{
        
        
        Parent root = FXMLLoader.load(getClass().getResource("Hammerhead.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();  
         

    }
    
    public void goToScene2(MouseEvent event) throws IOException {
      
        Parent root = FXMLLoader.load(getClass().getResource("FXMLWhale.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();  
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
