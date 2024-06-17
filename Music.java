//package com.mycompany.playmusicjavasupersimple;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Music {

  public Music(){
    try {
      File musicPath = new File("src/main/spice.wav");
      if (musicPath.exists()) {
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start();
      }

      else {
        System.out.println("The spice.wav audio does not exist");
      }
    }

    catch (Exception e) {
      
    }
  }

  /*public static void main(String[] args) {
    String path = "src/main/images/spiceeeeee.mp3";
    PlayMusic(path);
    JOptionPane.showMessageDialog(null, "Press OK to play music");
  }*/

}
