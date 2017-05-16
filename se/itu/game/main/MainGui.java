package se.itu.game.main;

import se.itu.game.gui.MainFrame;
import se.itu.game.cave.Music;

public class MainGui {

  public static void main(String[] args) {
    Music.music();
    MainFrame mainFrame = new MainFrame();
    mainFrame.run();
  }

}
