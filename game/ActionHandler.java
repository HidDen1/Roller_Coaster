package game;


import javax.swing.*;
import java.awt.*;

public class ActionHandler {
    /**
     * Responsible for handling what do to when anything is pressed
     */
    private JFrame frame = new JFrame("Fuck Roller Coasters");
    private JPanel menu = new JPanel(), chr = new JPanel(), bottom = new JPanel(), btm1 = new JPanel(), btm2 = new JPanel(), btm3 = new JPanel();

    public void setMenu(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(1280, 720);
        frame.setResizable(false);

        menu.setBackground(Color.red);
        chr.setBackground(Color.green);
        bottom.setBackground(Color.blue);
        btm1.setBackground(Color.yellow);
        btm2.setBackground(Color.black);
        btm3.setBackground(Color.pink);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;

        c.weighty = 0.05;
        c.gridy = 0;
        frame.add(menu, c);

        c.weighty = 0.70;
        c.gridy = 1;
        frame.add(chr, c);

        c.gridy = 2;
        bottom.setLayout(new GridBagLayout());
        c.weighty = 1;

        c.weightx = 0.2;
        bottom.add(btm1, c);
        c.weightx = 0.6;
        bottom.add(btm2, c);
        c.weightx = 0.2;
        bottom.add(btm3, c);
        c.weighty = 0.25;
        c.weightx = 1;
        frame.add(bottom, c);

        frame.setVisible(true);
    }
}
