import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;


public class DianaChallenge extends JFrame{
  //size of the JFrame in output window
  private static final int WIDTH = 1000;
  private static final int HEIGHT = 1000;

  public DianaChallenge(){
    setSize(WIDTH,HEIGHT);
    add(new Game());

    setResizable(false);
    pack();

    setTitle("The Diana Challange");
    setLocationRelativeTo(null);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args){
    // starts the game
    DianaChallenge test = new DianaChallenge();
  }
}
