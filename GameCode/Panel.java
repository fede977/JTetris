package GameCode;

import java.awt.*;
import javax.swing.*;


public class Panel{
    

    private static void createFrame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setSize(new Dimension(180,140));
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createFrame();
            }

        });
    }
}