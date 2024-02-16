import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
class GUI {
    public static JFrame cowboyFrame = new JFrame();
    public static StartScreen startM = new StartScreen();
    public static Difficulty diffM = new Difficulty();
    public static Easy gameME = new Easy();

    public void run (){
        startM.addComponentsToPane(startM);
        startM.createAndShowGUI();
        diffM.addComponentsToPane(diffM);
        diffM.createAndShowGUI();
        gameME.addComponentsToPane(gameME);
        gameME.createAndShowGUI();
        
        cowboyFrame.setContentPane(startM);
        
    }
    /*
     * make startscreen a panel
     * have a frame and then add startscreen to it here
     */
    public static void main(String[] args) {
    	cowboyFrame.setVisible(true);
    	GUI sudoku = new GUI ();
    	sudoku.run();
    	
    	
    }
    


}
