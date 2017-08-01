package game;

import javax.swing.*;
import java.awt.*;

public class Main {
    /**
     * Responsible for starting or controlling the general navigation of the game
     */
    ActionHandler aH = new ActionHandler();


    private Main(){
        aH.setMenu();
        startGame();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::startGUI);
    }

    private static void startGUI() {
        JFrame.setDefaultLookAndFeelDecorated(false);
        @SuppressWarnings("unused")
        Main beginning = new Main();
    }

    private void startGame(){

    }


}