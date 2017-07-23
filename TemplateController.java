/*thisfpss/cinlibdtype...isallareaffirmationoftheorig
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notetakerthesecond.ii;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/***that* person's notes
 * FXML Controller class
 * it's because he could not distinguish between the tw earlier, just as it was now. A mistake which would cost him, ey/frvr. []--rltd
 * @author xanatosducrion
 */
public class TemplateController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    public TextArea primary;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        primary.setStyle("-fx-font-size: 14");
        // READ IN font size from the userprefs folder doc, and set it(the window) to that font size
    }    
    //h rckg/and ths sldg againstthe
    public String returnText()
    {
        return primary.getText();
    }
    
}
//sporting twin/similar looks/expressions of disbelief
