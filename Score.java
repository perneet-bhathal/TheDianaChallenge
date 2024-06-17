import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Score{
  private int s;

  public Score(){
    s = 0;
  }

  public void incScore(){
    s++;
  }

  public int getScore(){
    return s;
  }

  public void scoreDisplay(Graphics window){
    String score = "Score: " + getScore();
    window.setFont(new Font("TAHOMA", Font.BOLD, 13));
    window.setColor(Color.BLACK);
    window.drawString(score, 200,300);
    window.setColor(Color.WHITE);
  }

  public void scoreClearNotOverlap(Graphics window){
    String score = "Score: " + getScore();
    //window.setFont(new Font("TAHOMA", Font.ITALIC, 20));
    window.setColor(Color.WHITE);
    window.drawString(score, 200,300);
  }

  /*public void draw(Graphics window){
    window.setColor(Color.BLACK);
    window.setFont(new Font("TAHOMA", Font.BOLD, 28));
    window.drawString("" + s, 10, 30);
  }*/
}