package Main;// YT Tutorial Link --- https://www.youtube.com/watch?v=K9qMm3JbOH0
//comment

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setLocationRelativeTo(null);
        obj.setTitle("Brick Break out");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);

    }
   
}