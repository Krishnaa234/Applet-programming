package snakegame;

import javax.swing.*; //java extended package
public class SnakeGame extends JFrame{

    SnakeGame() {
        super("Snake Game"); //frame heading. First statement in constructor
        add(new Board());
        pack(); //to reset changes on frame like setVisible. Refresh the frame
        
        setLocationRelativeTo(null); //to open from screen center
        setResizable(false);
    }
    
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
    
}
