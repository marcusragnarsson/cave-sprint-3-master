package se.itu.game.cave;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.*;
public class Music {

public static void music()
 {
   InputStream in;
     try {
         in = new FileInputStream(new File("/audio/Happy_Happy_Birthday.wav"));
         AudioStream audios = new AudioStream(in);
         AudioPlayer.player.start(audios);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);

     }
 }
 }
