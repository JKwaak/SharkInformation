/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharks;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jessica
 */
public class BullController implements Initializable {

     private MediaPlayer mediaPlayer;
    private Media media;
      @FXML
    private MediaView videoBull;

    @FXML
    private ImageView imageBull;
    
    @FXML
    private TextArea textBull;
    
    @FXML
    private Button playButton;

    @FXML
    private Button pauseButton;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               String path = new File("src/bullMedia/BullSharks.mp4").getAbsolutePath();
          media = new Media(new File(path).toURI().toString());
          mediaPlayer = new MediaPlayer(media);
          videoBull.setMediaPlayer(mediaPlayer);
          textBull.setEditable(false);
          textBull.setMouseTransparent(true);
          textBull.setFocusTraversable(true);
    }    
    
    public void goToScene1(ActionEvent event) throws IOException {
        
   Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
         stage.show();  
    }
    
    
     public void play(ActionEvent event)
    {
       mediaPlayer.play();
    }
      
      public void pause(ActionEvent event)
      {
           mediaPlayer.pause();
      }
}
