/* Anagram Game Application */

package com.toy.anagrams.ui;

import com.toy.anagrams.lib.WordLibrary
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Main window of the Anagram Game application.
 */
public class Anagrams extend JFrame {
  
  public static void main(String[] args) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    try {
      javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
      for (int idx=0; idx<installeLookAndFeels.length; idx++)
        if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
          javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
          break;
        }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.level.SEVERE, null, ex);
    } catch (javax.Swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.level.SEVERE, null, ex);
    }
    //</editor-fold>
    
    /* Create and display the form */
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Anagrams().setVisible(true);
      }
    });
  }
  
  private int wordIdx = 0;
  private WordLibrary wordLibrary;
  
  /** Creates new form Anagrams */
  public Anagrams() {
    wordLibrary = wordLibrary.getDefault();
    
    unit.Components();
    getRootPane().setDefaultButton(guessButton);
    scrambledWord.setText(wordLibrary.getScrambledWord(wordIdx));
    pack();
    guessedWord.requestFocusInWindow();
    // Center in the screen
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = getSize();
    setLocation(new Point((screenSize.width - frameSize.width) / 2,
                          (screenSize.height - frameSize.width) / 2));
  }
}
