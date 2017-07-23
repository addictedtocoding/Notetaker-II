/*t is not measured in years, in e, in c, or in millenia
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *so this is what an h b is
*the authentic h expeerience. one that has caught/trppd you
*complete and utter disbelief
*/
package notetakerthesecond.ii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *would he be bringing []? she hoped so, practically chewing her fingernails in anticipation of the appointed tiime; sitara loved [] in any form, and would never refuse in any situation- even one that would cause her demise in an inordinately painful manner; "is that even a thing?"sitara, if you one day became indad, what youdo; Sitara pormptly started laughing . "with all d r, , that is not a situation I could ever coceive of  "humor me." coherence i  d l
 * @author xanatosducrion
 */
public class NotetakerII extends Application {
    
     public String installationPath = System.getProperty("user.home") + "/notetakerfiles";
     public static Stage aStage;
    
    @Override//the old [] was profound and extry/the circumst's were excpnl...........Issm. The impassioned entreaty seemed to reach his ears....not worth it...neverwrrgabtaeagain...would have been fineish
    public void start(Stage stage) throws Exception {
        //FXMLDocumentController.numberOfNotes = 1;
        
        /*Parent r2 = FXMLLoader.load(getClass().getResource("Template.fxml"));
        
        Scene templateScene = new Scene(r2);
        templateScene.addEventFilter(KeyEvent.KEY_PRESSED, event -> templateKeyPress());*/
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> keyPress());
        
        stage.setTitle("Notetaker/Save my ass pad/Comfy Notes/Lossless Notetaker/Comfy Notetaker");//it would have been * *... what did you do...throwing away everything...
        stage.setWidth(590);
        
        stage.setScene(scene);
        aStage = stage;
        stage.show();
        
        File userFolder = new File(installationPath);

          // if the directory does not exist, create it
          if (!userFolder.exists()) 
          {
               //System.out.println("creating directory: " + directoryName);
	       //boolean result = false;

            	try
             	{
                	userFolder.mkdir();
                        System.out.println("directory created");
                	
             	} 
            	catch(Exception e)
             	{
                	//handle it
                    System.out.println("an exception");
             	}        
             	
          }
          
                 
          /*try
          {
              File usersListFile = new File(installationPath + "/users.txt");
              FileWriter writer = new FileWriter(usersListFile, true);	        
              BufferedWriter bufferedwriter = new BufferedWriter(writer);
              writer.append("");
              bufferedwriter.close();
              writer.close();
          }
          catch(Exception e)
          {}*/
    
                  File userData = new File(installationPath + "/userprefs");

          // if the directory does not exist, create it
          if (!userData.exists()) 
          {    
              try
              {
                  userData.mkdir();
              }
              catch(Exception e)
              {}
          }
          
         //File backupsFolder = new File(installationPath + "/backups");
         File backupsFolder = new File(installationPath + "/recovery");

          // if the directory does not exist, create it
          if (!backupsFolder.exists()) 
          {    
              try
              {
                  backupsFolder.mkdir();
              }
              catch(Exception e)
              {}
          }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /*public Stage getPrimaryStage()
    {
    
    }*/
    
    public void keyPress()
    {
        FXMLDocumentController i = new FXMLDocumentController();
        i.helloKeyPress();
    }
    
    public void templateKeyPress()
    {
        System.out.println ("Heya");
    }//homu as a servant to madoka...running themes
}//ff with mado plg "G", and servile homu <3 (lol), dom mado and sub homu fanfic, 50-shades-of-pink ff, persephone's waltz, mado homu as master/slave ffXD





//you are a fool, throwing away your own anct s like this.
//loved him deeply, unconditionally, and boundlessly/incredibly
//and stuck fear in [] []



//the n of pce is such that you become so embroiled and rdd by it, that you do not pause to think or even remember about things like the [] []






//lol even the g k i, but public opn (the c u) still does not. It's hilarious and ridiculous, really.
//I mean p s, like, come on guys.
//don't take the [] [] as any kind of yardstick. A lot of these things are diff to rpte, but the event itself d o. And some people don't care enough/just aren't that a/s enough/aren't s-y enough, like t m/just haven't heard about the damned []
