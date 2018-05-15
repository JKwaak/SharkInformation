
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author Jessica
 */
public class FXMLDocumentControllerWhale implements Initializable {
    
    private MediaPlayer mediaPlayer;
    private Media media;
  
   @FXML
    private Button play;

    @FXML
    private Button pause;
    
    @FXML
    private ImageView whaleShark2;

    @FXML
    private Label whaleSharkInfo;

    @FXML
    private MediaView whaleSharkMovie;

    @FXML
    private Button back;
    
    
    @FXML
    private TextArea textWhale;
    
     
    
    
    
    public void goToScene1(ActionEvent event) throws IOException {
        
   Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
         stage.show();  
    }
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          String path = new File("src/WhaleMedia/WhaleShark.mp4").getAbsolutePath();
          media = new Media(new File(path).toURI().toString());
          mediaPlayer = new MediaPlayer(media);
          whaleSharkMovie.setMediaPlayer(mediaPlayer);
          textWhale.setEditable(false);
          textWhale.setMouseTransparent(true);
          textWhale.setFocusTraversable(true);
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
