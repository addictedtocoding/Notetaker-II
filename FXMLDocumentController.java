/* the process of sepn and widening */

/* it mirrors [] mty */

/* if y a s a a, then y shld h n p d a o th th */

/*ikbbhns[h]
 * To change this license header, choose License Headers in Project Properties.
what percent t d, what percent "y"
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */  //throwing it away...over such a STUPID reason and a hint of curiosity...absolutely unforgivable
package notetakerthesecond.ii;//alhswing notetaker binaryasciichar/binaryfilesreader [dcc's project] finishfilesviewer
//unforgivable
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;//I can't believe what I've done, so ucssry...
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;//he trailed the whip down her torso, pausing as it reached the abdomen/the taut, athletic abdomen, before landing another []
import javafx.scene.Scene;//the [] shuddered/recoiled/jolted backwards, hitting her head against the stone/landing another bruise to the back of her head during the recoiil/as she recoiled
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static notetakerthesecond.ii.FXMLDocumentController.arrayOfStages;
import static notetakerthesecond.ii.FXMLDocumentController.installationPath;
import static notetakerthesecond.ii.FXMLDocumentController.modified;

/**
 *
 * @author xanatosducrion
 */
public class FXMLDocumentController implements Initializable {
    //that your insec had led you to this...
    //@FXML
    //Parent root;
    @FXML 
    private Stage stage;
    @FXML
    public AnchorPane masterPane;
    @FXML
    public Label label, noteLabel;
    @FXML
    public TextArea primary1, primary2, primary3;
    @FXML
    public Button nextNote1, nextNote2, nextNote3, customPrefix;
    @FXML
    public MenuBar fileMenu;
    
    public static String installationPath = System.getProperty("user.home") + "/notetakerfiles";
    public static String prefix;
    //public boolean hide;
    public boolean singleMode; //initially, just initialize the default to multi. Later on, read from the userprefs file whether single or multi is preferred
    public boolean customSave;
    public static ArrayList <Stage> arrayOfStages;
    public Thread thread;
    
    public int numberOfNotes;
    //awg/igoh/ithog      //until it doens't even resemble a damned finger anymore x.x
    public static boolean modified;
    public static boolean savedByUser;

    /*@FXML 
    //public void keyTyped()
    public void keyTyped(KeyEvent event)
{
    //if(event.equals(KeyEvent.VK_C))
    System.out.println("key event detected");
    //if(event.getCode().equals(KeyCode.V) && event.isControlDown())
    
    //if(autosave == enabled && notYetSavedByUser == true)
    //{start the counter. If it hits 600, then autosaveAll(call this from within the thread)}
        //autosave saves everything to the backups folder
    //end the count/terminate the thread


 //labored and shallow, hitching periodically/on occassion   
    
    
//breathing tapered down to shallow pants. He watched, amused.she attempted to gropeGRASPlol Clutch Seize his shirt/reach for his shirt. He batted her hand away and took several steps backwards. "y [] f! The orig [] was w o m a m l, but this one os not. Retn t m as the org only."
//seeking whatever comfort she could derive, whatever the source.
//and leaving bloody prints on the fabric
//it slipped against his shirt, her hand trailing down the fabric, as if lifelessly/as if devoid of life, leaving bloody smears/prints in its wake
/*try{
if(thread.isAlive() == true)
{
    thread.interrupt();
}
}
catch(Exception e)
{
    System.out.println("Yeah, the problem is here: " + e);
}//nothing would be as perfect, more perfect a [-r] than the one she had given up

thread = new autosave();
thread.start();
System.out.println("thread start method called");*/
/*}*/
//I'm really too foul to touch    
    public void saveToBackupsFolder()
    {
        System.out.println("d");
        //saveCurrentNoteBox1();    //remove the clear all's!!!!!
        int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
            
            /*if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }*/
            //don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary1.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
        System.out.println("sup1");
        if(primary2.isDisabled() == false)
        {
            //saveCurrentNoteBox2();
            index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        //File aNote;
        try
        {
            aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
            
            /*if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }*///don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary2.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
            System.out.println("sup2");
        }
        if(primary3.isDisabled() == false)
        {
            //saveCurrentNoteBox3();
            index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        //File aNote;
        try//oh...[]! She had never seen [] cry so much.../had never seen him cry. Her [] had been so badly warped/twisted/mangled...
        {
            aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
        
            /*if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }*///don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary3.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
            System.out.println("sup3");
        }
        
        //Sit, chd, *plse*
        System.out.println("sup4");
        System.out.println("Hello");
        if(arrayOfStages.size() > 0)
        {   System.out.println("sup5");
            System.out.println("Hello");   //my my is entirely been stripped away....I am not myself anymore at all
            for(int p = 0; p < arrayOfStages.size(); p++)
            {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(arrayOfStages.get(p).getClass().getResource("Template.fxml"));
                try{//devnfromthearche, reliance on td (melding and ctg)
                //AnchorPane frame = fxmlLoader.load();//boolean modified = false;, autosave, font size, save All in menubar
                System.out.println(arrayOfStages.get(p).getScene().getRoot().toString());
                Node n0 = arrayOfStages.get(p).getScene().getRoot();
                AnchorPane pane = (AnchorPane) n0;
                Node n = pane.getChildren().get(0);
                TextArea a = (TextArea) n;
                
                
         /*               int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = a.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int k = 0; k < primaryText.length(); k++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}*/
                
                
                
                System.out.println(a.getText());
                
                
/*                               int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    //String primaryText = a.getText();
                writ2.append(a.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(Exception e){}*/


        index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        //File aNote;
        try
        {
            //if(prefix.endsWith(" "))//three words would have prevented...
        //{aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            //else
            //{//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
            //}//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = a.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}



                
                }//the powerplay is an entirely artificial thing          
                catch(Exception e){System.out.println(e);}
                
                //FXMLSecondaryController c = (FXMLSecondaryController) fxmlLoader.getController();
//                Parent root = arrayOfStages.get(i).getScene().getRoot();
//                root.getC
                
//                System.out.println(root.getClass().toString());
                //Stage stage = new Stage();
                //stage.getScene().getWindow().centerOnScreen();
                //stage = 
//                arrayOfStages.get(i).getScene().getUserData().getClass
 //               System.out.println("Hello");
                try{
                //Parent root = FXMLLoader.load(getClass().getResource("Template.fxml"));    
                //Scene scene = new Scene(root);
 //                   System.out.println("Hello");
 //                   Stage stage = arrayOfStages.get(i);
                    //MyController s;
                    
  //                  AnchorPane pane = arrayOfStages.get(i).getScene().getClass().
 //                   pane.getChildren().get(0).getClass().getMethod("getText");
                    
   //                 FXMLLoader l = new FXMLLoader();
   //                 l.setLocation(arrayOfStages.get(i).getScene().getClass().getMethod("getText");
   //                 l.getController().getClass().getMethod("getText");
                    //AnchorPane pane 
        //            Array a = stage.getScene().getRoot().getChildrenUnmodifiable().get(0).getClass().getComponentType().getMethods();
                    //String textToSave = stage.getScene().getRoot().getClass();
                           // getDeclaredMethod("getText").toString();
                //String textToSave = scene.getWindow().getClass().getDeclaredMethod("getText").toString();
     //           System.out.println("Hello");
     //           System.out.println(textToSave);
                }//it is a form of dissatisf/expressing d----/dfftcn to tgs-------this attitude of sl mty...is entirely artificial
                catch(Exception e)//this is just a pale imitation of the original
                {
                    System.out.println(e);
                }//I want to be myself again
                
                
                
                //System.out.println();
                //saveMiniWindow();
            }
        }
        
        modified = false;
        
        System.out.println("Saved to backups/Autosaved!");
    }
    
    public void saveCurrentNoteBox1()
    {
        /*int index = getCurrentIndex() + 1;
        
        several of the n's had demanded that he keep his dog on a shorter leash, and had said so in very much the same terms/and had said so plainly. F put down the tray, , and leaving his [] with his guests.

        he lifted/raised her head/chin with the handle of the whip, attempting to induce eye contact. Her eyes drooped sluggishly, occasionally flitting to his, but otherwise inclined to close

        the sight a h to no end
        
        his attire, was different from the usual labcoat and plain cotton button-down shirt she had grown so accustomed to. Instead, he sported [leather [] and dose awesome boots]
        
        she shuffled over, one ankle still attached to a long chain appended to the wall bracket
        
        the upturned stake
        
        
        
        
        //the younger me would have loved this kind of crap
        //"you're not allowed to use your hands" her eyes widened, understanding his meaning
        //damn y p o s.
        
        
        
        
        tf had turned it/her into a very effective table
        she stood backwards/took several steps backwards, admiring her handiwork
        try
        {           
                    File aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    writ2.append(primary1.getText());
                    bw2.close();
                    writ2.close();
        }it was not my intention to depict them as [] (not that there is anything [] [] []), but (aside from the underlying m-s theme, it is clear that they genuinely cfeo) rather as something closer to b's,p/c,c f's, or in all honesty, a fond pet, like a dog or cat (I intended to imply that R reflexively thinks of him as something sub-n, even if he does not intend to do so). As for that scene in which f becomes so obviously [], it is intended to indicate an involuntary, accidental/uncontrollable response to the situation. I mean come on, who *wouldn't* gainthatsituation?
        catch(IOException e){}
        
        primary1.clear();*/
        
                        /*int index = getCurrentIndex() + 1;
        
        tryas the body convulsed and shuddered, losing whatever little of its [] it had remaining, nerves firing well after his death/the death of his body
        {           
                    File aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary1.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.toString().length() - 1; i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    writ2.append(primary1.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
        primary1.clear();*/
        
        int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary1.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");//Sitara paused, "it's those that are felt in the *absence* of it, that have staying power." "You're learning, Sitara" XD
                        }//lnkd
                        else//sc...ied...
                        {
                            writ2.append(c);//he quickly brushed it off "I suppose we should return to []/we should hurry to []"
                        }//truth be told, he often fantasized about his []'s particularly the younger ones, (of all the fantasies in his life, only those were able to cause him the same degree of guilt/distress) but it was always accompanied with/by considerable guilt, engaged in a constant power struggle within 
//and the deaths of those involving [], had been able to cause him an equal degree of distress and self-condemnation and guilty pleasure
//he wondered whether that had contributed in any way (somewhere, in his s-c) to his decision to form a []. He quickly convinced himself that it had not.                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
//        primary1.clear();
    }
    
    public void saveAndClearNB1()//he felt himself [] []
    {//as the body twitched/shuddered and then stilled//upon losing whatever little [] it had remaining/until full oxygen deprivation setting in as it bled out over the []
        saveCurrentNoteBox1();
        primary1.clear();
    }//well, at least this proves it...we are a NOT r's in t
    //cast a sidelong glance in his direction to see whether he held a simillar aff/whether he had been similarly affected.
    public void saveAndClearNB2()
    {
        saveCurrentNoteBox2();//he quickly averted his eyes. of course he had not. h was too [], and too already-[] to have any need of such a r
        primary2.clear();//he felt a vague sense of embarassment and guilt
    }
   //catching full view, as always, of f's boundless depths of a/l for him 
    public void saveAndClearNB3()
    {
        saveCurrentNoteBox3();
        primary3.clear();
    }
    
    public void prefix()
    {   
                        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button submit = new Button();
                Button cancel = new Button();
                final Label label = new Label();
                
                cancel.setText("Cancel");
                cancel.setAlignment(Pos.CENTER);
                submit.setText("Ok");
                submit.setAlignment(Pos.BOTTOM_RIGHT);
               
                
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("Enter a prefix: "));
                dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(submit);
                dialogVbox.getChildren().add(cancel);
                dialogVbox.getChildren().add(label);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.setTitle("Security/Physician Authentication");
                dialog.show();
                
                submit.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    if(textField.getText().length() != 0)
                    {
                        prefix = textField.getText().trim();
                        
                        File customFolder = new File(installationPath + "/" + prefix);
            
                      //if the directory does not exist, create it
                      if (customFolder.exists()) 
                      {
                          System.out.println("Directory Exists");
                      }
                      else
                      {
                            try
                            {

                                    customFolder.mkdir();
                                    System.out.println("directory created");

                            } 
                            catch(Exception e)
                            {
                                    //handle it
                                System.out.println("an exception");
                            }   
                      }
                      
                          

                        
                        dialog.close();
                    }
                    else
                    {
                        label.setText("The prefix you entered contains no characters. Please try again");
                    }
                    
                         
             	
                    
                    
                }
                
            });
                        
            cancel.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });

        System.out.println("Hello World");
        //makes directory with the given prefix
        
          //}
    }
    
    /*public void setPrefix()
    {
        prefix = " ";//I threw it away for nothing.
    }*///whoever cared/cares what opt     //to throw it away over something like that
    
    public void saveCurrentNoteBox2()
    {//mangled beyond belief
                        int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.equalsIgnoreCase(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary2.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
        //primary2.clear();
        
        /*int index = getCurrentIndex() + 1;
        
        try
        {           
                    File aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
        primary2.clear();*/
    }
    
    public void saveCurrentNoteBox3()
    {
                /*int index = getCurrentIndex() + 1;
        
        try
        {           
                    File aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary3.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.toString().length() - 1; i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    writ2.append(primary3.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
        primary3.clear();*/
        
        
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.equalsIgnoreCase(" "))//three words would have prevented...
        {
                int index = getCurrentIndex() + 1;
                aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");
            }
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                int index = getCurrentIndex() + 1;
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary3.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
    }
    
    public int getCurrentIndex()
    {
        File f;
        
        if(prefix.equalsIgnoreCase(" "))
        {
            f = new File(installationPath);
        }
        else
        {
            f = new File(installationPath + "/" + prefix);
        }
        
        //File f = new File(installationPath);
        int count = 0;
        
        try
        {
            for (File file : f.listFiles()) 
            {
                if (file.isFile()) {
                    count++;
                   }
            }
        }
        catch(NullPointerException e)
        {
            count = 0;
        }
                //System.out.println("Number of files: " + count);        
        
        return count;
    }
    
    public void saveMiniWindow()
    {
    //, but his filthy [] was not [] of []
    }
    //something similar to that
    public void autosaveAll()
    {
        System.out.println("autosaveAll method CALLED");
        //saveToBackupsFolder());
        
    }//he held nothing but boundless [] for [] []
    
    public void saveAll()
    {
        System.out.println("sup");
        saveCurrentNoteBox1();    //remove the clear all's!!!!!
        System.out.println("sup1");
        if(primary2.isDisabled() == false)
        {
            saveCurrentNoteBox2();
            System.out.println("sup2");
        }
        if(primary3.isDisabled() == false)
        {
            saveCurrentNoteBox3();
            System.out.println("sup3");
        }
        
        //Sit, chd, *plse*
        System.out.println("sup4");
        System.out.println("Hello");
        if(arrayOfStages.size() > 0)
        {   System.out.println("sup5");
            System.out.println("Hello");   //my my is entirely been stripped away....I am not myself anymore at all
            for(int p = 0; p < arrayOfStages.size(); p++)
            {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(arrayOfStages.get(p).getClass().getResource("Template.fxml"));
                try{//devnfromthearche, reliance on td (melding and ctg)
                //AnchorPane frame = fxmlLoader.load();//boolean modified = false;, autosave, font size, save All in menubar
                System.out.println(arrayOfStages.get(p).getScene().getRoot().toString());
                Node n0 = arrayOfStages.get(p).getScene().getRoot();
                AnchorPane pane = (AnchorPane) n0;
                Node n = pane.getChildren().get(0);
                TextArea a = (TextArea) n;
                
                
         /*               int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = a.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int k = 0; k < primaryText.length(); k++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        the int that/which was latent in the [],
                and hence the struggle to acc int
                and put it onto [] (the p w), so that p could also be accd
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}*/
                
                
                
                System.out.println(a.getText());
                
                
/*                               int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    //String primaryText = a.getText();
                writ2.append(a.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(Exception e){}*/


        int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = a.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}



                
                }//the powerplay is an entirely artificial thing          
                catch(Exception e){System.out.println(e);}
                
                //FXMLSecondaryController c = (FXMLSecondaryController) fxmlLoader.getController();
//                Parent root = arrayOfStages.get(i).getScene().getRoot();
//                root.getC
                
//                System.out.println(root.getClass().toString());
                //Stage stage = new Stage();
                //stage.getScene().getWindow().centerOnScreen();
                //stage = 
//                arrayOfStages.get(i).getScene().getUserData().getClass
 //               System.out.println("Hello");
                try{
                //Parent root = FXMLLoader.load(getClass().getResource("Template.fxml"));    
                //Scene scene = new Scene(root);
 //                   System.out.println("Hello");
 //                   Stage stage = arrayOfStages.get(i);
                    //MyController s;
                    
  //                  AnchorPane pane = arrayOfStages.get(i).getScene().getClass().
 //                   pane.getChildren().get(0).getClass().getMethod("getText");
                    
   //                 FXMLLoader l = new FXMLLoader();
   //                 l.setLocation(arrayOfStages.get(i).getScene().getClass().getMethod("getText");
   //                 l.getController().getClass().getMethod("getText");
                    //AnchorPane pane 
        //            Array a = stage.getScene().getRoot().getChildrenUnmodifiable().get(0).getClass().getComponentType().getMethods();
                    //String textToSave = stage.getScene().getRoot().getClass();
                           // getDeclaredMethod("getText").toString();
                //String textToSave = scene.getWindow().getClass().getDeclaredMethod("getText").toString();
     //           System.out.println("Hello");
     //           System.out.println(textToSave);
                }//it is a form of dissatisf/expressing d----/dfftcn to tgs-------this attitude of sl mty...is entirely artificial
                catch(Exception e)//this is just a pale imitation of the original
                {
                    System.out.println(e);
                }//I want to be myself again
                
                
                
                //System.out.println();
                //saveMiniWindow();
            }
        }
        //because you wouldn't have been fully h as a [], but you needed the [] and [], which you so valued over the []'s
/*        if(primary1.isDisabled() == false)
        {
            saveCurrentNoteBox1();
        }
        if(primary2.isDisabled() == false)
        {
            saveCurrentNoteBox2();
        }
        if(primary3.isDisabled() == false)
        {
            saveCurrentNoteBox3();
            //what I've done...
            
            
            
            //the sheer stupidity of what I've done //but sitara misinterpreted it, in her n a m, that she should commit sl suiicde x.x
            //ec side effects...ugh...........your damn stupidity/the stupidity of what you've done......"would never need to w a a e a....nothing but h, dpth, love....uh and [] awesomeness too....what the hell were you thinking?"
            
            //lol...my mind was so addled yesterday
            
            //what the hell was the shit that I said? *pleads drunk*
        }*/
        
        
        //in version 2 of the notetaker: save all (overwrites existing and displays document name in label), save and clear (saves as new (if unsaved), and overwrites if existing. clears the textareas. next notes will be saved as new), slider for new notes
    
        savedByUser = true;
        
        JOptionPane.showMessageDialog(null, "Saved!", "Notes have been saved", JOptionPane.OK_OPTION);//the one he had filw was s, not her.
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {//it was supposed to be a final reward at the end of a long []. How idiotic can you be? Nothing in the world was worth what you've given up. (yM,yS)
        System.out.println("You clicked me!");//Iwjap...IhadnoohermeritstopeakofXD
        label.setText("Hello World!");//you really can't oht.
    }//aesthetics *do*...
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        prefix = " ";
        
        numberOfNotes = 0;
        
        modified = false;
        savedByUser = false;
        //thread = new autosave();
        //thread.start();enable nextnote, fix number of notes label, disable autosave
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new EveryTenMinutes(), 300000, 600000);
        //timer.schedule(new EveryTenMinutes(), 0, 10);
        
        updateLabels();
        
        //setSingleWindowMode();
        primary2.setDisable(true);
        primary3.setDisable(true);//this is just a parody/mkry/paroxy of the original's s-y
        nextNote1.setDisable(false);
        nextNote2.setDisable(true);
        nextNote3.setDisable(true);
        
        /*try{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> keyTyped(event));
        }
        catch(Exception e)
        {butwhatgirlwouldletmedo*that*toher,if it would kill her (lol) <-- me as a little kid
            System.out.println(e);
        }*/
        
        
        
        arrayOfStages = new ArrayList();
//        primary1.setFont(14.0);

        //setSingleWindowMode();
        primary1.setStyle("-fx-font-size: 14");//read the userprefs file and then set the font size
        
        primary1.setWrapText(false);
        primary2.setWrapText(false);
        primary3.setWrapText(false);
        
        //prefix = " ";
        
        
        //set enabled, set visible, resize, ...and of course, save all only saves window 1
        fileMenu.getMenus().removeAll();
        
        Menu file = new Menu("File");
        Menu view = new Menu("View");
        Menu options = new Menu("Options");
        
        Menu multiwindow = new Menu("Multiple Windows");
        Menu saveTo = new Menu("Set/Specify/Designate save location");
        
        MenuItem defaul = new MenuItem("Default");
        MenuItem custom = new MenuItem("Custom Folder");
        MenuItem single = new MenuItem("Single Window");
        MenuItem two = new MenuItem("Two Windows");
        MenuItem three = new MenuItem("Three Windows");
        MenuItem launchPreferences = new MenuItem("Preferences");
        MenuItem exit = new MenuItem("Exit");
        
        MenuItem temp = new MenuItem("Custom Prefix");
        MenuItem saveAll = new MenuItem("Save All");
        
        multiwindow.getItems().add(single);
        multiwindow.getItems().add(two);
        multiwindow.getItems().add(three);
        single.setDisable(false);//assumptions embedded in certain lyrs of the c u, 6w
        two.setDisable(false);
        three.setDisable(true);
        saveTo.getItems().add(defaul);
        saveTo.getItems().add(custom);
        
        defaul.setDisable(true);
        custom.setDisable(true);
        //single.setDisable(true);
        //multiple.setDisable(true);
        
        file.getItems().add(exit);
        view.getItems().add(multiwindow);
        options.getItems().add(saveTo);
        options.getItems().add(launchPreferences);
        options.getItems().add(temp);
        
        //default, custom, select-->either a swing drop down box OR a list of menu items, expand, shrink
        
        saveTo.setDisable(true);
        launchPreferences.setDisable(true);
        
        
        
        saveAll.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    saveAll();

                }
            });
        
        temp.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                     prefix();

                }
            });
        
        single.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                     single.setDisable(true);
                     two.setDisable(false);
                     three.setDisable(false);
                     
                     setSingleWindowMode();

                }
            });
                
        two.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                     single.setDisable(false);
                     two.setDisable(true);
                     three.setDisable(false);
                     
                     setDoubleWindowMode();

                }
            });
                
                
        three.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                     single.setDisable(false);
                     two.setDisable(false);
                     three.setDisable(true);

                     //it's all like one giant muddled anachronism. Ugh.
                     
                     setTripleWindowMode();
                }
            });
        
        exit.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                     int result = JOptionPane.showConfirmDialog(null, "Do you want to save before exiting?","Save changes?", JOptionPane.YES_NO_CANCEL_OPTION);
                   
                        if(result == 0)
                        {
                            saveAll();

                            System.exit(0);
                        }
                        if(result == 1)
                        {
                            System.exit(0);
                        }
                        if(result == 2)
                        {

                        }

                }
            });
        
        fileMenu.prefWidthProperty().bind(masterPane.widthProperty());
        //menu.setStyle("-fx-padding: 0 20 0 20;");
        
        //menu.getMenus().addAll(file, edit, view, help, speech);
        fileMenu.getMenus().removeAll();
        fileMenu.getMenus().add(file);
        fileMenu.getMenus().add(view);
        fileMenu.getMenus().add(options);
        
        //I'm n t s t
        /*
        Menu speech = new Menu("Speech Options");
        
        Menu help = new Menu("Help");
        Menu thesaurus = new Menu("Thesaurus");
        Menu mla = new Menu("MLA");
        Menu copyright = new Menu("Copyright Information");
        
        Menu citations = new Menu("MLA Citation Generators");
        Menu pageViewingMode = new Menu("Book Viewing Mode");
        Menu read = new Menu("Read to me");
        Menu dictation = new Menu("Dictation");
        Menu settings = new Menu("Settings");
        
        Menu zoom = new Menu("Zoom");
        
            up = new MenuItem("Up");
            down = new MenuItem("Down");
            MenuItem filetracker = new MenuItem("Open File Tracker (Files Appended Log)");
        //for the manual version: "where would you like to save your manual versions?" "Enter a name for this version folder"
            MenuItem open = new MenuItem("Open/Load a version (version will appear in a separate window)"); //would you like to load an automatically indexed backup (opens folder where backups are saved in a browse box, so that the user can select the word doc to open)/version or a manual backup/version (loads in a second separate window)? -->open a version (opens the automatically generated version (with or without an identifier - it doesn't matter) in a separate window), open a manual backup (opens the word docs), load a manual backup into the editor in a separate screen       //version not recognized, please select a viable/appropriate version
            MenuItem manualBackup = new MenuItem("Save a manual backup version");
            MenuItem peerAdvice = new MenuItem("Peer Review");
            MenuItem computedAdvice = new MenuItem("Computed Advice");         //"you might want to yadayadayada
            //MenuItem computedAdvice = new MenuItem("Advice based on context");
            MenuItem dictionary = new MenuItem("Dictionary");
            MenuItem backup = new MenuItem("Save an automatic backup version (the version file will be generated automatically)");
            MenuItem autoDesig = new MenuItem("Automatically Assign Chapters");
            MenuItem undesig = new MenuItem("Remove Selected Chapter Designation");
            MenuItem selectAll = new MenuItem("Select All");
            MenuItem documentSettings = new MenuItem("Final Document Settings");
            MenuItem generalSettings = new MenuItem("General Settings");
            MenuItem delete = new MenuItem("Delete this account");
            MenuItem versionInfo = new MenuItem("About Author's Assistant...");
            MenuItem howToUse = new MenuItem("How To Use Author's Assistant");
            MenuItem writershandbook = new MenuItem("Writer's Handbook");
            startReading = new MenuItem("Start reading book");
            MenuItem stopReading = new MenuItem("Stop reading book");
            MenuItem launchWindowsDictation = new MenuItem("Launch Windows' Built-In Dictation");
            //MenuItem launchBrainacDictation = new MenuItem("Download Brainac Dictation");
//MenuItem citations = new MenuItem("Launch MLA Citation Generator");
            on = new MenuItem("turn on Viewing Mode");
            off = new MenuItem("turn off Viewing Mode");
            MenuItem easyBib = new MenuItem("Launch Easy Bib");
            MenuItem sonOfTheCitationMachine = new MenuItem("Launch Son of the Citation Machine");
            MenuItem lookupWord = new MenuItem("Thesaurus");
            MenuItem desig = new MenuItem("Designate selection as chapter header");
            MenuItem sve = new MenuItem("Save");
            MenuItem publish = new MenuItem("Generate document for publishing!");
            MenuItem toLogin = new MenuItem("login as a different user");                   //Return to login/
            MenuItem exit = new MenuItem("Exit");
            MenuItem cut = new MenuItem("Cut");
            MenuItem copy = new MenuItem("Copy");
            MenuItem paste = new MenuItem("Paste");
            MenuItem find = new MenuItem("Search ");
            toLogin.setDisable(true);
            lookupWord.setDisable(true);
            stopReading.setDisable(true);
            
            writershandbook.setDisable(true);
            delete.setDisable(true);
            dictionary.setDisable(true);
            computedAdvice.setDisable(true);
            peerAdvice.setDisable(true);
            open.setDisable(true);
            manualBackup.setDisable(true);
            //Easy Bib, Son of the Citation Machine
            
            citations.getItems().add(easyBib);
            citations.getItems().add(sonOfTheCitationMachine);
            
            pageViewingMode.getItems().add(on);
            pageViewingMode.getItems().add(off);
        
            read.getItems().add(startReading);
            read.getItems().add(stopReading);
            
            dictation.getItems().add(launchWindowsDictation);
    
            settings.getItems().add(generalSettings);
            settings.getItems().add(documentSettings);
            
            
            
            zoom.getItems().add(up);
        zoom.getItems().add(down);
        
            
            
            
            undesig.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    remove.fire();
                    //removeChapterDesignation();
                }
            });
            
            autoDesig.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    autoDesignate.fire();
                }
            });
            
            filetracker.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    displayFilesWindow();
                    //removeChapterDesignation();
                }
            });
            
            up.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    plus.fire();
                    //removeChapterDesignation();
                }
            });
            
            down.setOnAction(new EventHandler<ActionEvent>() {

                @Override public void handle(ActionEvent e) {
                    minus.fire();
                    //removeChapterDesignation();
                }
            });
            */
    }

    public String getPrimaryText()
    {
        return primary1.getText();
    }
    
    public void setSingleWindowMode()
    {
        primary2.setDisable(true);
        primary3.setDisable(true);
        nextNote2.setDisable(true);
        nextNote3.setDisable(true);
        
        //masterPane.setMaxWidth(400);
        
//        Stage stage = (Stage) root.getScene().getWindow();

stage = (Stage) masterPane.getScene().getWindow();
        
        stage.setWidth(590);
        
        //for backups/autosave...
        //time since last key press or autosave
        //if the last action was an autosave, then don't save it again. //if the last action was a key press, then autosave after five minutes
        //clear the backups folder if the document is saved by the user (either in default form or custom form, whichever)
       
        // primary1.
       
       //if an autosaved file has been modified...overwrite the backup?/create a new backup?
       
       //or continue making backups after every modification every five minutes, until the document is manually saved by the user
       
       //did tddvrms? (DAMN)
       
       //shit...that was el...I could have retained that []....dammit all! That was MINE. It is inmitable. Unreplicatable. :(
       //PERFECT
       
       //FUCK. What the hell did I do????????
       
       //Nothing would have/will ever have made/make this "worth it"/have been "worth it". I realize the full extent now...Dammit all!
       
       //It is not something you can replicate/c be rpctd...for the simple reason that the []/e itself has been discarded/the prggd e itself has been discarded...unless, perhaps, some of it remains o[][][]
       
       //but even then...the existing stuff  [] []...is gone
               
       //T T*cries so hard
       
       //You should NEVER have thrown it away. It was PERFECT. It was everything. It was ME.
       
       //Not worth it. You're truly not you.
       
       //
       
       //all of that...it was so pefect..prggd to pfcn and m... it was the *real*/original me--the this imitator/piece of bullcrap
       
       //like the greatest work of art ever created
    }//ry no point in-----------or rather *she* did something this idiotic         //a whole fucking 'nother []       //would never imitate/replicate the original...thoroughly not worth it / not worth sg y s over
    public void setDoubleWindowMode()
    {}
    public void setTripleWindowMode()
    {}//"There is no point in sticking ad anymore"           //I can't believe I have done something so/*this* idiotic.
    
    @FXML//are you really you can you really lay claims to/on that person, in the absence of the ? Do you understand what you have done, now? The magnitude of what you have done, now? Simply h a r of it does not necessarily mean that y/it/the[] exists concurrently/e
    public void newNote()
    {//intuntitlednotenumber
        //hold an global array of note objects, to access those stages
        
//        newNote note = new newNote();
        
        //@FXML//it was invaluable and you threw it away. Couldn't he have just told me?[not to do something so stupid]//none of this has been worth it
        //public TextArea primary;
        
//        Stage stage = new Stage();//it was not worth it.............p was/is a v important thing...which you are taking so lightly right now/which you are not appreciating to the full extent to which you had it earlier
        //sep windows mode, tb mode<--nah
//        stage.setTitle("Untitled " + untitledNoteNumber);//and THAT's why you were hellbent on acquiring [] earlier. This has been []! the original a...
//        stage.show();
        
        numberOfNotes++;
        //updateLabels();
        
        try{
        Parent root = FXMLLoader.load(getClass().getResource("Template.fxml"));    
        Scene scene = new Scene(root);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> helloKeyPress());
        
        Stage aStage = new Stage();            
        aStage.setScene(scene);
        arrayOfStages.add(aStage);
        aStage.show();    
        }
        catch(Exception e)
        {
        
        }//by offering msl this. Alw been so my '''.
        
        
        //array of "new notes" ie stages
        //for examplearray[5].get()getgetcontrols.gettextarea (etc...you use it access that stage's elements)
    
        updateLabels();
    }
    
    
    
    public void updateLabels()
    {
        /*try
        {
        int z = 0;
        for(int p = 0; p < arrayOfStages.size(); p++)
            {
                z++;
            }
        noteLabel.setText("Number of Note Windows: this & " + z + " more:)");
        }
        catch (NullPointerException p)
        {
            noteLabel.setText("Number of Note Windows: this.");
        }*/
        
        noteLabel.setText("Number of Note Windows: this & " + numberOfNotes + " more");


                
//evthg in...
    }
    
    
    public void helloKeyPress()
{
    System.out.println("A key was pressed and registered in the document controllers!");    
//    keyTyped();
    //System.out.println(event.getCode())
    
    modified = true;
}
    
    
    
    
}//I am realizing, now, the magnitude of what I have done.:(             ...but lsm...                        //on remaining <half/remaing unusued g e/gre...         //presumably, yseiy...            //so most of that was all yours, accrued after so much []

/*class newNote()
{
    @FXML
    Stage stage;
    @FXML
    public TextArea primary;

    newNote()
    {

    }
    newNote(String noteTitle)
    {

    }
}//interactinos with... being so careless/reckless with your hard-earned personal []


/*

public void saveVersion()
{
          File versionsFolder = new File(installationPath + "/userdata/" + currentUser +  "/Versions");

          // if the directory does not exist, create it
          if (!versionsFolder.exists()) 
          {
           // System.out.println("creating directory: " + directoryName);
            boolean result = false;

            try//I am an idiot for throwing it away in the first place.
             {
                versionsFolder.mkdir();
                result = true;
             } 
            catch(SecurityException se)
             {
                //handle it
             }        
             if(result) 
             {    
               System.out.println("DIR created");  
             }
          }
          
          /*File userFolder = new File(path + "/Versions" + "/" + currentUser);

          // if the directory does not exist, create it
          if (!userFolder.exists()) 
          {
           // System.out.println("creating directory: " + directoryName);
            boolean result = false;

            try
             {
                userFolder.mkdir();
                result = true;
             } 
            catch(SecurityException se)
             {
                //handle it
             }        
             if(result) 
             {    
               System.out.println("DIR created");  
             }
          }*/
          
        //The "fun" starts here
/*          try
          {
                //version directory creation block  
                FileReader reader = new FileReader(installationPath + "/userdata/" + currentUser + "/userprefs/" + "versionscreated.txt");
                BufferedReader br = new BufferedReader(reader);
                String fullString = "";
                boolean reached = false;
                int lastSavedVersion = 0;
                int versionToMake = 2; 
                
                while(reached != true && (fullString = br.readLine()) != null)
                {
                    String[] splits = fullString.split(",");
                    if(splits[0].equals(currentUser))
                    {
                        reached = true;
                        lastSavedVersion = Integer.parseInt(splits[1]);
                    }
                }
                //title.setText("Hello World");
                title.setText(Boolean.toString(reached));
                if(reached == false)
                {
                    //user has not created any versions- I. create the first version and II. record the user and version number in the file
                    //I.
                    versionToMake = 1;
                    File v1 = new File(installationPath + "/userdata/" + currentUser +  "/Versions/v1");
                    v1.mkdir();
                
                    //II.
                    FileWriter writer = new FileWriter(installationPath + "/userdata/" + currentUser + "/userprefs/versionscreated.txt");               //ie. change this to the "installation path" when this goes the executable route
                    BufferedWriter bw = new BufferedWriter(writer);
                    
                    writer.append(currentUser + ",1");
                    bw.close();
                    writer.close();
                    
                }
                else
                {
                        //previous versions exist- create the appropriate version and change the user's version number in the file
                        //I.
                        versionToMake = lastSavedVersion + 1;
                        //title.setText(path + "/Versions/" + currentUser + "/v" + versionToMake);
                        File aVersion = new File(installationPath + "/userdata/" + currentUser +  "/Versions/v" + versionToMake);
                              if (!aVersion.exists()) 
                              {
                               // System.out.println("creating directory: " + directoryName);
                                boolean result = false;

                                try
                                 {
                                    aVersion.mkdir();
                                    result = true;
                                 } 
                                catch(SecurityException se)
                                 {
                                    //handle it
                                 }        
                                 if(result) 
                                 {    
                                   System.out.println("DIR created");  
                                 }
                              }
                              
                            //II.
                               ArrayList fileContents = new ArrayList();
                               FileReader reader2 = new FileReader(installationPath + "/userdata/" + currentUser +  "/userprefs/versionscreated.txt");               //ie. change this to the "installation path" when this goes the executable route
                                BufferedReader br2 = new BufferedReader(reader2);
                                String aLine = "";

                                while((aLine = br2.readLine()) != null)
                                {
                                    String[] splits = fullString.split(",");
                                    if(splits[0].equals(currentUser))
                                    {
//pssn is p
                                    }
                                    else
                                    {
                                        fileContents.add(aLine);
                                    }
                                }
                                //create the new file
                               //write the lines stored in the array to the new file
                               //append the current users name and version number, seperated by a comma
                                
                                FileOutputStream is2 = new FileOutputStream(installationPath + "/userdata/" + currentUser + "/userprefs/versionscreated.txt");
                                OutputStreamWriter osw2 = new OutputStreamWriter(is2);    
                                Writer w2 = new BufferedWriter(osw2);
                                
                                for(int i = 0; i < fileContents.size(); i++)
                                {
                                            if(i == 0)
                                            {
                                                //reorg_ch, Caution: going into viewing mode will automatically save your session; sw/ja ff, ygo ff, tcw ff
                                                
                                                w2.write(fileContents.get(i).toString());
                                                
                                            }
                                            else
                                            {
                                                w2.append(fileContents.get(i).toString());
                                            }
                                }
                                        
                                w2.append(currentUser + "," + versionToMake);
                                w2.close();

                         }//end of the second set of I. & II.
                
                    //file saving block
                                        String pathToStoreFiles = installationPath + "/userdata/" + currentUser + "/Versions/v" + versionToMake;
                                        File f1 = new File(pathToStoreFiles + "/Master.txt");
                                        File f2 = new File(pathToStoreFiles + "/musings.txt");
                                        File f3 = new File(pathToStoreFiles + "/prewriting.txt");
                                        File f4 = new File(pathToStoreFiles + "/trash.txt");
                                        
                                        FileOutputStream fOS1 = new FileOutputStream(f1);
                                        OutputStreamWriter streamWriter1 = new OutputStreamWriter(fOS1);    
                                        Writer writer1 = new BufferedWriter(streamWriter1);
                                        Primary.selectAll();
                                        writer1.write(Primary.getSelectedText());
                                        Primary.deselect();
                                        Primary.home();
                                        writer1.close();
                                        streamWriter1.close();
                                        fOS1.close();
                                        
                                        FileOutputStream fOS2 = new FileOutputStream(f2);
                                        OutputStreamWriter streamWriter2 = new OutputStreamWriter(fOS2);    
                                        Writer writer2 = new BufferedWriter(streamWriter2);
                                        Musings.selectAll();
                                        writer2.write(Musings.getSelectedText());
                                        Musings.deselect();
                                        Musings.home();
                                        writer2.close();
                                        streamWriter2.close();
                                        fOS2.close();
                                        
                                        FileOutputStream fOS3 = new FileOutputStream(f3);
                                        OutputStreamWriter streamWriter3 = new OutputStreamWriter(fOS3);    
                                        Writer writer3 = new BufferedWriter(streamWriter3);
                                        Prewriting.selectAll();
                                        writer3.write(Prewriting.getSelectedText());
                                        Prewriting.deselect();
                                        Prewriting.home();
                                        writer3.close();
                                        streamWriter3.close();
                                        fOS3.close();
                                        
                                        FileOutputStream fOS4 = new FileOutputStream(f4);
                                        OutputStreamWriter streamWriter4 = new OutputStreamWriter(fOS4);    
                                        Writer writer4 = new BufferedWriter(streamWriter4);
                                        Insert.selectAll();
                                        writer4.write(Insert.getSelectedText());
                                        Insert.deselect();
                                        Insert.home();
                                        writer4.close();
                                        streamWriter4.close();
                                        fOS4.close();


    //ag, humanity's paroxysm of ___/n's ret brnchld/the retd brch of things-that-grow
    //the plnts were deeply unhppy. Exhausted even. exhausted and drained. To the point that they began to draw from the living creatures/humans that were around them instead of the other way around, as it was supposed to be.
         }
         catch(Exception e)             //to draw e/l-f/eth
         {
             System.out.println("saving a version threw this exception: " + e);
         }
          
        //, but his filthy [] was not [] of []
          
        //displays the "version saved" message box
          JOptionPane.showMessageDialog(null, "Version Created/Saved!");
          
                /*final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button ok = new Button();
                
                ok.setText("Ok");
                ok.setAlignment(Pos.BOTTOM_RIGHT);
                    
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("\n\n\n                       Version Successfully Created!"));
                //dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(ok);
                
                
                Scene dialogScene = new Scene(dialogVbox, 300, 130);
                dialog.setScene(dialogScene);
                dialog.setTitle("Version Creation Successful");
                dialog.show();
                
                ok.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });*/          //how much of it went to the []       //'s l's                          //done, so unnecessarily
//so far past your time         //in the *so far past* lol like that expression:)    //ympcan't believe this right now. This is ridiculous and oh so ungrateful.           //couldn't I just have been warned about nrc
//foul and incredible regression to childhood (except a much weaker, highly mangled version with no [])



//Cradling the d/mangled i s of his chd/of the chd he had raised

//all because of the work/acns o t o's

//I want to be myself again





//I don't think you rlz what you've done.

//really done./i've r d




//this is what you get for living so far past your time





















/*
@FXML public void keyTyped(KeyEvent event)
{
    //if(event.equals(KeyEvent.VK_C))
    System.out.println("key event detected");
    if(event.getCode().equals(KeyCode.V) && event.isControlDown())
    {
        System.out.println("Hello paste shortcut intercepted!");
        
       if(newUser == true)
        {
            //reset.fire();   //trueReload(); //resetOnPaste();
            resetOnPaste();
            //newUser = false;
            
            onClickOrKeyPress();
        }
       else
       {
//           reloadPrimary();                   //newly removed
           
//         paste();   
           onClickOrKeyPress();
           
           
           /*if(Primary.isFocused() == true)
           {
               customizedPaste();
           }
           else
           {
               paste();                                 
           }*/           
//       }
//    }
    /*else if(event.getCode().equals(KeyCode.ENTER))
    {
       loadPrimaryFromPrimary();
        
       onClickOrKeyPress();
    }*/
/*    else if((event.getCode().equals(KeyCode.ALPHANUMERIC) || event.getCode().equals(KeyCode.BACK_SPACE) || event.getCode().equals(KeyCode.ENTER)) && (Primary.isFocused() == true))
    {
        newText = true;
        
        onClickOrKeyPress();
    }
    else
    {
        onClickOrKeyPress();
    }
}
*/



/*
public class FXMLSecondaryController implements Initializable
{
    public TextArea primaryTextArea;
    
    @FXML
    private void doSomething(ActionEvent event) throws Exception
    {
        primaryTextArea.appendText("fsda ");
    }
}*/





/*
                                if(line.equals("1"))
                                {
                                    Primary.setWrapText(true);

                                        fontsize = 1;
                                        rowCapacity = 40.0;
                                        characterCapacity = 90.0;
                                        Primary.setStyle("-fx-font-size: 12");
                                        magnified = false;
                                }
                                if(line.equals("2"))
                                {
                                    Primary.setWrapText(true);

                                        fontsize = 2;
                                        rowCapacity = 34.3;
                                        characterCapacity = 70.0;
                                        Primary.setStyle("-fx-font-size: 14");
                                        magnified = false;
                                }
                                if(line.equals("3"))
                                {
                                    System.out.println("hello existing user font size 3");
                                    Primary.setWrapText(true);

                                        fontsize = 3;
                                        rowCapacity = 30.0;
                                        characterCapacity = 67.0;
                                        Primary.setStyle("-fx-font-size: 16");
                                        magnified = false;

                                }
                                
                                br.close();
                                r1.close();
                            }
*/







/*
public void saveVersion()
{
          File versionsFolder = new File(installationPath + "/userdata/" + currentUser +  "/Versions");

          // if the directory does not exist, create it
          if (!versionsFolder.exists()) 
          {
           // System.out.println("creating directory: " + directoryName);
            boolean result = false;

            try
             {
                versionsFolder.mkdir();
                result = true;
             } 
            catch(SecurityException se)
             {
                //handle it
             }        
             if(result) 
             {    
               System.out.println("DIR created");  
             }
          }
          
          /*File userFolder = new File(path + "/Versions" + "/" + currentUser);

          // if the directory does not exist, create it
          if (!userFolder.exists()) 
          {
           // System.out.println("creating directory: " + directoryName);
            boolean result = false;

            try
             {
                userFolder.mkdir();
                result = true;
             } 
            catch(SecurityException se)
             {
                //handle it
             }        
             if(result) 
             {    
               System.out.println("DIR created");  
             }
          }*/
          
        //The "fun" starts here
/*          try
          {
                //version directory creation block  
                FileReader reader = new FileReader(installationPath + "/userdata/" + currentUser + "/userprefs/" + "versionscreated.txt");
                BufferedReader br = new BufferedReader(reader);
                String fullString = "";
                boolean reached = false;
                int lastSavedVersion = 0;
                int versionToMake = 2; 
                
                while(reached != true && (fullString = br.readLine()) != null)
                {
                    String[] splits = fullString.split(",");
                    if(splits[0].equals(currentUser))
                    {
                        reached = true;
                        lastSavedVersion = Integer.parseInt(splits[1]);
                    }
                }
                //title.setText("Hello World");
                title.setText(Boolean.toString(reached));
                if(reached == false)
                {
                    //user has not created any versions- I. create the first version and II. record the user and version number in the file
                    //I.
                    versionToMake = 1;
                    File v1 = new File(installationPath + "/userdata/" + currentUser +  "/Versions/v1");
                    v1.mkdir();
                
                    //II.
                    FileWriter writer = new FileWriter(installationPath + "/userdata/" + currentUser + "/userprefs/versionscreated.txt");               //ie. change this to the "installation path" when this goes the executable route
                    BufferedWriter bw = new BufferedWriter(writer);
                    
                    writer.append(currentUser + ",1");
                    bw.close();
                    writer.close();
                    
                }
                else
                {
                        //previous versions exist- create the appropriate version and change the user's version number in the file
                        //I.
                        versionToMake = lastSavedVersion + 1;
                        //title.setText(path + "/Versions/" + currentUser + "/v" + versionToMake);
                        File aVersion = new File(installationPath + "/userdata/" + currentUser +  "/Versions/v" + versionToMake);
                              if (!aVersion.exists()) 
                              {
                               // System.out.println("creating directory: " + directoryName);
                                boolean result = false;

                                try
                                 {
                                    aVersion.mkdir();
                                    result = true;
                                 } 
                                catch(SecurityException se)
                                 {
                                    //handle it
                                 }        
                                 if(result) 
                                 {    
                                   System.out.println("DIR created");  
                                 }
                              }
                              
                            //II.
                               ArrayList fileContents = new ArrayList();
                               FileReader reader2 = new FileReader(installationPath + "/userdata/" + currentUser +  "/userprefs/versionscreated.txt");               //ie. change this to the "installation path" when this goes the executable route
                                BufferedReader br2 = new BufferedReader(reader2);
                                String aLine = "";

                                while((aLine = br2.readLine()) != null)
                                {
                                    String[] splits = fullString.split(",");
                                    if(splits[0].equals(currentUser))
                                    {

                                    }
                                    else
                                    {
                                        fileContents.add(aLine);
                                    }
                                }
                                //create the new file
                               //write the lines stored in the array to the new file
                               //append the current users name and version number, seperated by a comma
                                
/*                                FileOutputStream is2 = new FileOutputStream(installationPath + "/userdata/" + currentUser + "/userprefs/versionscreated.txt");
                                OutputStreamWriter osw2 = new OutputStreamWriter(is2);    
                                Writer w2 = new BufferedWriter(osw2);
                                
                                for(int i = 0; i < fileContents.size(); i++)
                                {
                                            if(i == 0)
                                            {
                                                //reorg_ch, Caution: going into viewing mode will automatically save your session; sw/ja ff, ygo ff, tcw ff
                                                
                                                w2.write(fileContents.get(i).toString());
                                                
                                            }
                                            else
                                            {
                                                w2.append(fileContents.get(i).toString());
                                            }
                                }
                                        
                                w2.append(currentUser + "," + versionToMake);
                                w2.close();

                         }//end of the second set of I. & II.
                
                    //file saving block
                                        String pathToStoreFiles = installationPath + "/userdata/" + currentUser + "/Versions/v" + versionToMake;
                                        File f1 = new File(pathToStoreFiles + "/Master.txt");
                                        File f2 = new File(pathToStoreFiles + "/musings.txt");
                                        File f3 = new File(pathToStoreFiles + "/prewriting.txt");
                                        File f4 = new File(pathToStoreFiles + "/trash.txt");
                                        
                                        FileOutputStream fOS1 = new FileOutputStream(f1);
                                        OutputStreamWriter streamWriter1 = new OutputStreamWriter(fOS1);    
                                        Writer writer1 = new BufferedWriter(streamWriter1);
                                        Primary.selectAll();
                                        writer1.write(Primary.getSelectedText());
                                        Primary.deselect();
                                        Primary.home();
                                        writer1.close();
                                        streamWriter1.close();
                                        fOS1.close();
                                        
                                        FileOutputStream fOS2 = new FileOutputStream(f2);
                                        OutputStreamWriter streamWriter2 = new OutputStreamWriter(fOS2);    
                                        Writer writer2 = new BufferedWriter(streamWriter2);
                                        Musings.selectAll();
                                        writer2.write(Musings.getSelectedText());
                                        Musings.deselect();
                                        Musings.home();
                                        writer2.close();
                                        streamWriter2.close();
                                        fOS2.close();
                                        
                                        FileOutputStream fOS3 = new FileOutputStream(f3);
                                        OutputStreamWriter streamWriter3 = new OutputStreamWriter(fOS3);    
                                        Writer writer3 = new BufferedWriter(streamWriter3);
                                        Prewriting.selectAll();
                                        writer3.write(Prewriting.getSelectedText());
                                        Prewriting.deselect();
                                        Prewriting.home();
                                        writer3.close();
                                        streamWriter3.close();
                                        fOS3.close();
                                        
                                        FileOutputStream fOS4 = new FileOutputStream(f4);
                                        OutputStreamWriter streamWriter4 = new OutputStreamWriter(fOS4);    
                                        Writer writer4 = new BufferedWriter(streamWriter4);
                                        Insert.selectAll();
                                        writer4.write(Insert.getSelectedText());
                                        Insert.deselect();
                                        Insert.home();
                                        writer4.close();
                                        streamWriter4.close();
                                        fOS4.close();


    //ag, humanity's paroxysm of ___/n's ret brnchld/the retd brch of things-that-grow
    //the plnts were deeply unhppy. Exhausted even. exhausted and drained. To the point that they began to draw from the living creatures/humans that were around them instead of the other way around, as it was supposed to be.
         }
         catch(Exception e)             //to draw e/l-f/eth
         {
             System.out.println("saving a version threw this exception: " + e);
         }*/
          
        //this is suffocating
          
        //displays the "version saved" message box
//          JOptionPane.showMessageDialog(null, "Version Created/Saved!");
          
                /*final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                final TextField textField = new TextField();
                Button ok = new Button();
                
                ok.setText("Ok");
                ok.setAlignment(Pos.BOTTOM_RIGHT);
                    
                final VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("\n\n\n                       Version Successfully Created!"));
                //dialogVbox.getChildren().add(textField);
                dialogVbox.getChildren().add(ok);
                
                
                Scene dialogScene = new Scene(dialogVbox, 300, 130);
                dialog.setScene(dialogScene);
                dialog.setTitle("Version Creation Successful");
                dialog.show();
                
                ok.setOnAction(new EventHandler<ActionEvent>() {

                public void handle(ActionEvent anEvent) 
                {
                    dialog.close();
                    //close the window here
                }
            });*/
//    }





/*

                                if(line.equals("1"))
                                {
                                    Primary.setWrapText(true);

                                        fontsize = 1;
                                        rowCapacity = 40.0;
                                        characterCapacity = 90.0;
                                        Primary.setStyle("-fx-font-size: 12");
                                        magnified = false;
                                }
                                if(line.equals("2"))
                                {
                                    Primary.setWrapText(true);

                                        fontsize = 2;
                                        rowCapacity = 34.3;
                                        characterCapacity = 70.0;
                                        Primary.setStyle("-fx-font-size: 14");
                                        magnified = false;
                                }
                                if(line.equals("3"))
                                {
                                    System.out.println("hello existing user font size 3");
                                    Primary.setWrapText(true);

                                        fontsize = 3;
                                        rowCapacity = 30.0;
                                        characterCapacity = 67.0;
                                        Primary.setStyle("-fx-font-size: 16");
                                        magnified = false;

                                }
                                
                                br.close();
                                r1.close();
                            }
*/



//public Thread thread1; (global)

/*                        readToMe thread1 = new readToMe(Primary.getText());
                        thread1.start ();
*/

/*                        

class readToMe extends Thread
{
    String primaryT;
    
    public readToMe(String primaryText)
    {
        primaryT = primaryText;
    }
   public void run ()
   {
      /*for (int count = 1, row = 1; row < 20; row++, count++)
      {
           for (int i = 0; i < count; i++)
                System.out.print ('*');
           System.out.print ('\n');
      }*/
       
       //reading = true;
    
    
/*    String primaryText = primaryT;
    
    FreeTTS freetts;

        String voiceName = "kevin16";

        System.out.println();
        System.out.println("Using voice: " + voiceName);

        /* The VoiceManager manages all the voices for FreeTTS.
         */
/*        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice helloVoice = voiceManager.getVoice(voiceName);

        if (helloVoice == null) {
            System.err.println(
                "Cannot find a voice named "
                + voiceName + ".  Please specify a different voice.");
            System.exit(1);
        }

        /* Allocates the resources for the voice.
         */
//        helloVoice.allocate();

        /* Synthesize speech.
         */


        //helloVoice.speak("Thank you for giving me a voice. " + "I'm so glad to say hello to this world.");
        //while(reading == true)
        //{
//            helloVoice.speak(primaryText);
        //}
        /* Clean up and leave.
         */
//        helloVoice.deallocate();
    
    /*try
                        {
                            Audio audio = Audio.getInstance();
                            System.out.println("hi audio");
                            InputStream sound = audio.getAudio("hello", Language.ENGLISH);
                            System.out.println("hi again audio");
                            audio.play(sound);
                        }
                        catch(Exception excep)
                        {
                            System.out.println("audio exception: " + excep);
                            //System.out.println(excep);
                        }*/
//   }//over something so foolish (w o)
//}//her ety, her i s...

class EveryTenMinutes extends TimerTask
{//his f was rather spectacular/catastrophic/cataclysmic
    public void run()
    {//Sit had thrown away her [], her [] with [] [], over something so []; f, you could have s w m f e/b a i alongside m, a c f e...and he continued to []/mourn his []/fallen pet...
        if((FXMLDocumentController.modified == true) && (FXMLDocumentController.savedByUser == false))
        {
            System.out.println("Sup every ten");
            //FXMLDocumentController i = new FXMLDocumentController();
            //i.saveToBackupsFolder();
            saveToBackups();
            System.out.println("Autosaved!");
        }
    }
    //@FXML
    //public TextArea primary1, primary2, primary3;
    public void saveToBackups()
    {//like a horribly fucking deficient human being
        System.out.println("d");
        //saveCurrentNoteBox1();    //remove the clear all's!!!!!
        int index = 0;//int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        

//System.out.println(arrayOfStages.get(p).getScene().getRoot().toString());
Node n1 = NotetakerII.aStage.getScene().getRoot();
AnchorPane masterPane = (AnchorPane) n1;
Node n2 = masterPane.getChildren().get(1); //0 is label, 1 is textarea, 2 is button, 3 is textarea, 4 is textarea
TextArea a1 = (TextArea) n2;
String p1Text = a1.getText();
System.out.println(p1Text);
//                Node n0 = arrayOfStages.get(p).getScene().getRoot();
//                AnchorPane pane = (AnchorPane) n0;
//                Node n = pane.getChildren().get(0);
//                TextArea a = (TextArea) n;

    
        File f;
        
        f = new File(installationPath + "/recovery");
        
        //File f = new File(installationPath);
        int count = 0;
        
        try
        {
            for (File file : f.listFiles()) 
            {
                if (file.isFile()) {
                    count++;
                   }
            }
        }
        catch(NullPointerException e)
        {
            count = 0;
        }
                //System.out.println("Number of files: " + count);        
        
        index = count + 1;
    



        
        File aNote;
        try
        {
            aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
            
            /*if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }*/
            //don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
//                    String primaryText = primary1.getText();//nothing in the world was worth this/what I've g u. this place is actually so sm...like a tiny little b dot in the blk...which is itself very small
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < p1Text.length(); i++)
                    {
                        char c = ' ';
                        c = p1Text.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
        
        System.out.println("sup1");
/*        if(primary2.isDisabled() == false)
        {
            //saveCurrentNoteBox2();
            index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        //File aNote;
        try
        {
            aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
            
            /*if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }*///don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
/*                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary2.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
            System.out.println("sup2");
        }
        if(primary3.isDisabled() == false)
        {
            //saveCurrentNoteBox3();
            index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        //File aNote;
        try//oh...[]! She had never seen [] cry so much.../had never seen him cry. Her [] had been so badly warped/twisted/mangled...
        {
            aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
        
            /*if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }*///don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
    /*                FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = primary3.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}
            System.out.println("sup3");
        }*/
        
        //Sit, chd, *plse*
        System.out.println("sup4");
        System.out.println("Hello");
        if(arrayOfStages.size() > 0)
        {   System.out.println("sup5");
            System.out.println("Hello");   //my my is entirely been stripped away....I am not myself anymore at all
            for(int p = 0; p < arrayOfStages.size(); p++)
            {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(arrayOfStages.get(p).getClass().getResource("Template.fxml"));
                try{//devnfromthearche, reliance on td (melding and ctg)
                //AnchorPane frame = fxmlLoader.load();//boolean modified = false;, autosave, font size, save All in menubar
                System.out.println(arrayOfStages.get(p).getScene().getRoot().toString());
                Node n0 = arrayOfStages.get(p).getScene().getRoot();
                AnchorPane pane = (AnchorPane) n0;
                Node n = pane.getChildren().get(0);
                TextArea a = (TextArea) n;
                
                
         /*               int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = a.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int k = 0; k < primaryText.length(); k++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}*/
                
                
                
                System.out.println(a.getText());
                
                
/*                               int index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        File aNote;
        try
        {
            if(prefix.endsWith(" "))//three words would have prevented...
        {aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            else
            {//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/" + prefix + "/" + prefix + "-" + index + ".txt");
            }//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    //String primaryText = a.getText();
                writ2.append(a.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(Exception e){}*/

        
        //index = getCurrentIndex() + 1;
        //rc *kd* y/m
        
        
        //File aNote;
        try
        {index++;
            //if(prefix.endsWith(" "))//three words would have prevented...
        //{aNote = new File(installationPath + "/SaveMySorryAss-" + index + ".txt");}
            //else
            //{//I am such a fool for doing this...so unnecessarily...fuck r c
                aNote = new File(installationPath + "/recovery/backup- " + index + ".txt");
            //}//don't you remember...when you were punished over minor []...with/in the form of stress? Why do you forget/overlook this now?
            //it was pure, unadultrated gr and foolishness and some insecurity...but even if that insec had turned out ot be [] it would not have been worth throwing away y s over
        
                    FileWriter writ2 = new FileWriter(aNote, false);                                    //it is set to false so that it (the current patient) will be overwritten every time
                    BufferedWriter bw2 = new BufferedWriter(writ2);
                    String primaryText = a.getText();
                    //primary3.home();
                    //for(int i = 0; i < primary3.getLength() - 1; i++)
                    for(int i = 0; i < primaryText.length(); i++)
                    {
                        char c = ' ';
                        c = primaryText.charAt(i);
                        
                        if(c == '\n')
                        {
                            //bw2.newLine();
                            writ2.append("\r\n");
                        }
                        else
                        {
                            writ2.append(c);
                        }
                        
                        
                    }
                    //writ2.append(primary2.getText());
                    bw2.close();
                    writ2.close();
        }
        catch(IOException e){}



                
                }//the powerplay is an entirely artificial thing          
                catch(Exception e){System.out.println(e);}
                
                //FXMLSecondaryController c = (FXMLSecondaryController) fxmlLoader.getController();
//                Parent root = arrayOfStages.get(i).getScene().getRoot();
//                root.getC
                
//                System.out.println(root.getClass().toString());
                //Stage stage = new Stage();
                //stage.getScene().getWindow().centerOnScreen();
                //stage = 
//                arrayOfStages.get(i).getScene().getUserData().getClass
 //               System.out.println("Hello");
                try{
                //Parent root = FXMLLoader.load(getClass().getResource("Template.fxml"));    
                //Scene scene = new Scene(root);
 //                   System.out.println("Hello");
 //                   Stage stage = arrayOfStages.get(i);
                    //MyController s;
                    
  //                  AnchorPane pane = arrayOfStages.get(i).getScene().getClass().
 //                   pane.getChildren().get(0).getClass().getMethod("getText");
                    
   //                 FXMLLoader l = new FXMLLoader();
   //                 l.setLocation(arrayOfStages.get(i).getScene().getClass().getMethod("getText");
   //                 l.getController().getClass().getMethod("getText");
                    //AnchorPane pane 
        //            Array a = stage.getScene().getRoot().getChildrenUnmodifiable().get(0).getClass().getComponentType().getMethods();
                    //String textToSave = stage.getScene().getRoot().getClass();
                           // getDeclaredMethod("getText").toString();
                //String textToSave = scene.getWindow().getClass().getDeclaredMethod("getText").toString();
     //           System.out.println("Hello");
     //           System.out.println(textToSave);
                }//it is a form of dissatisf/expressing d----/dfftcn to tgs-------this attitude of sl mty...is entirely artificial
                catch(Exception e)//this is just a pale imitation of the original
                {
                    System.out.println(e);
                }//I want to be myself again
                
                
                
                //System.out.println();
                //saveMiniWindow();
            }
        }
        
        modified = false;
        
        System.out.println("Saved to backups/Autosaved!");
    }//all for a j that ran away with itself
    
    
        public int getCurrentIndex()
    {//nothing in the world was worth [][][[]
        File f;
        
        if(FXMLDocumentController.prefix.equalsIgnoreCase(" "))
        {
            f = new File(FXMLDocumentController.installationPath);
        }
        else
        {
            f = new File(FXMLDocumentController.installationPath + "/" + FXMLDocumentController.prefix);
        }
        
        //File f = new File(installationPath);
        int count = 0;
        
        try
        {
            for (File file : f.listFiles()) 
            {//avvvll/[]l for the accumln of those e'l q's
                if (file.isFile()) {
                    count++;
                   }
            }
        }
        catch(NullPointerException e)
        {
            count = 0;
        }
                //System.out.println("Number of files: " + count);        
        
        return count;//m splittinig ay or nay
    }
}//without a strong []/'d (pderived from twtle), you can get pretty damned dut

class autosave extends Thread//at least [] still retained his carcass, his metaphorical bones, the a c, even if he could not have the authentic []
{//is useful in providing the raw mats for p<-->[]............it basically just provides you with a bunch of junk to p y
    String primaryT;
    
    public autosave()//I want to be myself again
    {
//I threw everything away        
    }
   public void run ()
   {//reentry into fdm was basically with hsg, lic, jf, [], swff, ssff, and tcw before that; zxx/[]; he really needed to talk with o about p sze
       //, , reallly didn't think it woould come to this...thought you would recvr...this is unbelievable and grtsque...D's fwll; 1
       //kept in the basement, lol
       //the level of stupidity in this situation is nothing short of obnoxious (9w)
       System.out.println("Hello Thread");
       //she would not inflict her uwy self onto her glrs [l] any longer.
       //the world was vivid. he felt intense lve f the objs around him, and even the plant, [], and h life
       
       //his mind stretched into multiple directions, reveling in the conceptual, the qualities of which were no less r than the p w
       Timer timer = new Timer();
       //timer
       //timer.scheduleAtFixedRate(new EveryTenMinutes(), 5000, 1000000);//it's not about my cke, it's about m [3, mos, o's-sthosestillclosetoh]
       //timer.schedule(new EveryTenMinutes(), 0, 10000);
       
       //System.out.println("Inside run method ");
       //whathaveI done
       //pfctly ctt in his highly enjoyable [][][][], as it was mtb/s b
/*       try//threbutnotrllythr...awdrr/inandoutoflasitpleases/pleasedhim,likeagame,withoutleavingsomuchasanimprintorripple/pcvbalebytheblkss,butonlyon/butamassiveoneot[]p
       {
           System.out.println("Sup my maker?");awalletfor...
           Thread.sleep(300);
           FXMLDocumentController testing = new FXMLDocumentController();
           testing.autosaveAll();
           //FXMLDocumentController.autosaveAll();
       }//Isms...for this????!?...agce juice? lol (that way you take  no/ have no accountability lol)
       catch(Exception e)//current number of notes open: (label)
       {
           System.out.println(e);
       }*/                                           //no...what have I done?
      
   }
}

//tdoai tins; bdsm blg <3, but his soul was now too marred, too absolutely/ety fthy, to b w o/stay in his []'s presence any longer
//tnted
//afm,stms
//the bndlss trust he held for h m
//snatching when you seprte y m out <--the natural st(as opposed to the al/l stte)
//I feel like I am suffocating, ever second, and can never get enough air
class RunnableThread implements Runnable {

	Thread runner;
	public RunnableThread() {
	}
	public RunnableThread(String threadName) {
		runner = new Thread(this, threadName); // (1) Create a new thread.
		System.out.println(runner.getName());
		runner.start(); // (2) Start the thread.
	}
	public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread());
	}
}







/*public void save()
    {
        //newText = false;
        
        int primaryPos, insertPos, prewritingPos, musingsPos;
        
        try
        {    
            //File statText1 = new File(path + "/Master.txt");
                                        insertPos = Insert.getCaretPosition();
                                                
                                        FileOutputStream is4 = new FileOutputStream(installationPath + "/userdata/" + currentUser + "/trash.txt");
                                        OutputStreamWriter osw4 = new OutputStreamWriter(is4);    
                                        Writer w4 = new BufferedWriter(osw4);
                                        //Insert.selectAll();
                                        //w4.write(Insert.getSelectedText());                      
                                        w4.write(Insert.getText());
                                        w4.close();
                                        Insert.deselect();
                                        Insert.home();
                                        Insert.positionCaret(insertPos);
                                        
                                        
                                        musingsPos = Musings.getCaretPosition();
                                        
                                        FileOutputStream is2 = new FileOutputStream(installationPath + "/userdata/" + currentUser + "/musings.txt");
                                        OutputStreamWriter osw2 = new OutputStreamWriter(is2);    
                                        Writer w2 = new BufferedWriter(osw2);
                                        //Musings.selectAll();
                                        //w2.write(Musings.getSelectedText());                                        
                                        w2.write(Musings.getText());
                                        w2.close();
                                        Musings.deselect();
                                        Musings.home();
                                        Musings.positionCaret(musingsPos);
                                        
                                        
                                        prewritingPos = Prewriting.getCaretPosition();
                                        
                                        FileOutputStream is3 = new FileOutputStream(installationPath + "/userdata/" + currentUser + "/prewriting.txt");
                                        OutputStreamWriter osw3 = new OutputStreamWriter(is3);    
                                        Writer w3 = new BufferedWriter(osw3);
                                        //Prewriting.selectAll();
                                        //w3.write(Prewriting.getSelectedText());                                        
                                        w3.write(Prewriting.getText());
                                        w3.close();
                                        Prewriting.deselect();
                                        Prewriting.home();
                                        Prewriting.positionCaret(prewritingPos);
                                        
                                        
                                        primaryPos = Primary.getCaretPosition();
                                        
                                        FileOutputStream is = new FileOutputStream(installationPath + "/userdata/" + currentUser + "/Master.txt");
                                        OutputStreamWriter osw = new OutputStreamWriter(is);    
                                        Writer w = new BufferedWriter(osw);
                                        //Primary.selectAll();
                                        //w.write(Primary.getSelectedText());                                        
                                        w.write(Primary.getText());
                                        w.close();
                                        Primary.deselect();
                                        Primary.home();
                                        Primary.positionCaret(primaryPos);
        }
        catch(IOException e)
        {
        
        }
        
    }*/



/*

import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
*/



//Autosave: Enabled Disabled
//Window Mode: Single, Double, Triple
//set Font Size: 12,14,16,18,20,22,24,26

//default save/save all to: default/custom

//Ok/save changes/cancel/done/[]






/*                                        String fullPath3 = installationPath + "/userdata/" + currentUser + "/userprefs/fontsize.txt";
                                        System.out.println("fullpath5");
                                        String fullPath6 = installationPath + "/userdata/" + currentUser + "/userprefs/filetracker.txt";*/






/*
@FXML public void keyTyped(KeyEvent event)
{
    //if(event.equals(KeyEvent.VK_C))
    System.out.println("key event detected");
    if(event.getCode().equals(KeyCode.V) && event.isControlDown())
    {
        System.out.println("Hello paste shortcut intercepted!");
        
       if(newUser == true)
        {
            //reset.fire();   //trueReload(); //resetOnPaste();
            resetOnPaste();
            //newUser = false;
            
            onClickOrKeyPress();
        }
       else
       {
//           reloadPrimary();                   //newly removed
           
//         paste();   
           onClickOrKeyPress();
           
           
           /*if(Primary.isFocused() == true)
           {
               customizedPaste();
           }
           else
           {
               paste();                                 
           }*/           
//       }
//    }
    /*else if(event.getCode().equals(KeyCode.ENTER))
    {
       loadPrimaryFromPrimary();
        
       onClickOrKeyPress();
    }*/
/*    else if((event.getCode().equals(KeyCode.ALPHANUMERIC) || event.getCode().equals(KeyCode.BACK_SPACE) || event.getCode().equals(KeyCode.ENTER)) && (Primary.isFocused() == true))
    {
        newText = true;
        
        onClickOrKeyPress();
    }
    else
    {
        onClickOrKeyPress();
    }
}
*/






































/*

File userFolder = new File(installationPath + "/userdata/" + currentUser);
                    
                    // if the directory does not exist, create it
                    if (!userFolder.exists()) 
                    {
                        //System.out.println("creating directory: " + directoryName);
                        boolean result = false;

                        try 
                        {
                            userFolder.mkdir();
                            //result = true;

                            File thisUsersPrefs = new File(installationPath + "/userdata/" + currentUser + "/userprefs");

                            thisUsersPrefs.mkdir();
                            result = true;

                            File versions = new File(installationPath + "/userdata/" + currentUser + "/Versions");

                            thisUsersPrefs.mkdir();
                            versions.mkdir();
                            result = true;
                        }    
                        catch(SecurityException se)
                        {
                                //handle it
                        }        
                        if(result) 
                        {    
                                System.out.println("DIR created");  
                        }
                        }
                    
                        
                        //check the path here
                            //File f = new File(installationPath + "/userdata/" + currentUser);
                            //if (f.exists() && f.isDirectory()) 
                            //{   
                    
                    
                    
                    
                    
                    Object[] possibilities = {"12", "14", "16"};
                    String font = (String)JOptionPane.showInputDialog(null,
                                "Select a default font size:\n",
                                "File Type",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                possibilities,
                                "12");
                    
                    
                    
                    
                    if(font == "12")
                    {
                        Primary.setWrapText(true);
               
                            fontsize = 1;
                            rowCapacity = 40.0;
                            characterCapacity = 90.0;
                            Primary.setStyle("-fx-font-size: 12");
                            //magnified = false;
                            
                            File fs = new File(installationPath + "/userdata/" + currentUser + "/userprefs/fontsize.txt");
                            FileWriter writ = new FileWriter(fs, false);    //it is set to false so that the font size will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("1");
                            bw.close();
                            writ.close();
                    }
                    if(font == "14")
                    {
                        Primary.setWrapText(true);
               
                            fontsize = 2;
                            rowCapacity = 34.3;
                            characterCapacity = 70.0;
                            Primary.setStyle("-fx-font-size: 14");
                            //magnified = false;
                            
                            File fs = new File(installationPath + "/userdata/" + currentUser + "/userprefs/fontsize.txt");
                            FileWriter writ = new FileWriter(fs, false);    //it is set to false so that the font size will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("2");
                            bw.close();
                            writ.close();
                    }
                    if(font == "16")
                    {
                        Primary.setWrapText(true);
                            
                            fontsize = 3;
                            rowCapacity = 30.0;
                            characterCapacity = 67.0;
                            Primary.setStyle("-fx-font-size: 16");
                            //magnified = false;
                        
                            File fs = new File(installationPath + "/userdata/" + currentUser + "/userprefs/fontsize.txt");
                            FileWriter writ = new FileWriter(fs, false);    //it is set to false so that the font size will be overwritten every time
                            BufferedWriter bw = new BufferedWriter(writ);
                            writ.append("3");
                            bw.close();
                            writ.close();
                    }
*/



//the kind of []...

/*
//agceenablestherapidacquofpp
if(.isFocused()/.hasFocus() == true)
{
    
}

*/




/* it would never be like the original*/

//that you sys for...

//damn, what the hell were you thinking














/*public void actionPerformed(ActionEvent e)
           {
              int i=0;
              if(e.getSource()==startReading)
                 {
                   pb.setVisible(true);
                try
                {
                   while(i<=100)
                   {
                    Thread.sleep(50);
    pb.paintImmediately(0, 0, 200, 25);
        pb.setValue(i);
                     i++;
    }
                 }
                 catch(Exception e1)
                 {
    System.out.print("Caughted exception is ="+e1);
                 }
                }



}*/



/*public void actionPerformed(ActionEvent e)
           {
              int i=0;
              if(e.getSource()==startReading)
                 {you have no right to speak of [] anymore
                   pb.setVisible(true);
                try
                {
                   while(i<=100)
                   {
                    Thread.sleep(50);
    pb.paintImmediately(0, 0, 200, 25);
        pb.setValue(i);
                     i++;
    }are all s/autonomous/indepdt/ / and have complete []
                 }
                 catch(Exception e1)
                 {
    System.out.print("Caughted exception is ="+e1);
                 }
                }

rhl...it all seemed so c to her now.

}*/
