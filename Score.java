import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Score{
  private int s;

  // sets score to zero initially
  public Score(){
    s = 0;
  }

  // increases score by one
  public void incScore(){
    s++;
  }

  // returns the score variable
  public int getScore(){
    return s;
  }

  // displays the score onto the window
  public void scoreDisplay(Graphics window){
    String score = "Score: " + getScore();
    window.setFont(new Font("TAHOMA", Font.BOLD, 13));
    window.setColor(Color.BLACK);
    window.drawString(score, 200,300);
    window.setColor(Color.WHITE);
  }

  // clears the score on the window and resets to zero
  public void scoreClearNotOverlap(Graphics window){
    String score = "Score: " + getScore();
    window.setColor(Color.WHITE);
    window.drawString(score, 200,300);
  }
}
