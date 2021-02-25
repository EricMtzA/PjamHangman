
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Timer;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class PJam_ColorGame extends javax.swing.JFrame {
    //Array of colors and strings for text
    private final Color [] colorArr = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.MAGENTA};
    private final String [] colorTxtArr = {"Red", "Blue", "Green", "Yellow", "Purple"};
    private Color buttonColor;
    private String currentText;
    private final int [] randomXLocations = {90, 180, 270, 360, 450};
    private final int xSize = randomXLocations.length;
    private final int [] randomYLocations = {135, 160, 180, 200, 220, 240, 260, 280};
    private final int ySize = randomYLocations.length;
    ArrayList<Integer> chosenXLocations = new ArrayList<>();
    public int highscore = 0;
    private int roundsRemaining = 5;
    /**
     * Creates new form PJam_ColorGame
     */
    public PJam_ColorGame() {
        initComponents();
        //Basic window formatting
        setLayout(null);
        setTitle("Color Game");
        setPreferredSize(new Dimension(600, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        //Label is given random color and random string
        buttonColor = colorArr[(int) (Math.random() * 5)];
        currentText = colorTxtArr[(int) (Math.random() * 5)];
        colorText.setForeground(buttonColor);
        colorText.setText(currentText);
        
        //Set highscore and rounds remaining label to base values
        highscoreLabel.setText("Highscore = " + highscore);
        roundsLabel.setText("Rounds Remaining: " + roundsRemaining);
        
        //Set up buttons to be at random locations
        //BLUE BUTTON location
        int blueLocationX = randomXLocations[(int) (Math.random() * xSize)];
        int blueLocationY = randomYLocations[(int) (Math.random() * ySize)];
        System.out.println("Blue X = " + blueLocationX + ", Blue Y = " + blueLocationY);
        chosenXLocations.add(blueLocationX);
        
        buttonBlue.setLocation(blueLocationX, blueLocationY);
        boolean added = false;
        //RED BUTTON location
        int redLocationX = randomXLocations[(int) (Math.random() * xSize)];
        
        //used to prevent overlap of other buttons
        while(!added) {
            if (chosenXLocations.contains(redLocationX)) {
                redLocationX = randomXLocations[(int) (Math.random() * xSize)];
            }
            else {
                chosenXLocations.add(redLocationX);
                added = true;
            }
        }
        
        int redLocationY = randomYLocations[(int) (Math.random() * ySize)];
        System.out.println("Red X = " + redLocationX + ", Red Y = " + redLocationY);
        
        buttonRed.setLocation(redLocationX, redLocationY);
        
        //YELLOW BUTTON location
        added = false;
        int yellowLocationX = randomXLocations[(int) (Math.random() * xSize)];
        //used to prevent overlap of other buttons        
        while(!added) {
            if (chosenXLocations.contains(yellowLocationX)) {
                yellowLocationX = randomXLocations[(int) (Math.random() * xSize)];
            }
            else {
                chosenXLocations.add(yellowLocationX);
                added = true;
            }
        }
        int yellowLocationY = randomYLocations[(int) (Math.random() * ySize)];
        System.out.println("Yellow X = " + yellowLocationX + ", Yellow Y = " + yellowLocationY);
        
        buttonYellow.setLocation(yellowLocationX, yellowLocationY);
        
                
        //GREEN BUTTON location
        added = false;
        int greenLocationX = randomXLocations[(int) (Math.random() * xSize)];
        //used to prevent overlap of other buttons
        while(!added) {
            if (chosenXLocations.contains(greenLocationX)) {
                greenLocationX = randomXLocations[(int) (Math.random() * xSize)];
            }
            else {
                chosenXLocations.add(greenLocationX);
                added = true;
            }
        }
        int greenLocationY = randomYLocations[(int) (Math.random() * ySize)];
        System.out.println("Green X = " + greenLocationX + ", Green Y = " + greenLocationY);
        
        buttonGreen.setLocation(greenLocationX, greenLocationY);
        
        //PURPLE BUTTON location
        added = false;
        int purpleLocationX = randomXLocations[(int) (Math.random() * xSize)];
        //used to prevent overlap of other buttons
        while(!added) {
            if (chosenXLocations.contains(purpleLocationX)) {
                purpleLocationX = randomXLocations[(int) (Math.random() * xSize)];
            }
            else {
                chosenXLocations.add(purpleLocationX);
                added = true;
            }
        }
        int purpleLocationY = randomYLocations[(int) (Math.random() * ySize)];
        System.out.println("Purple X = " + purpleLocationX + ", Purple Y = " + purpleLocationY);
        
        buttonPurple.setLocation(purpleLocationX, purpleLocationY);
        //add to frame
        this.pack();
        startClock();
    }
    
    //Set the text color and content to another random color and text based on global arrays
    public void resetButtonAndText() {
        currentText = colorTxtArr[(int) (Math.random() * 5)];
        buttonColor = colorArr[(int) (Math.random() * 5)];
        colorText.setForeground(buttonColor);
        colorText.setText(currentText);
    }
    
    //When game ends, call this method
    
    public void endGame() {
        dispose();
        System.out.println("Thank you for playing");
        System.exit(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorText = new java.awt.Label();
        clockLabel = new java.awt.Label();
        buttonRed = new javax.swing.JButton();
        buttonGreen = new javax.swing.JButton();
        buttonYellow = new javax.swing.JButton();
        buttonBlue = new javax.swing.JButton();
        buttonPurple = new javax.swing.JButton();
        highscoreLabel = new java.awt.Label();
        roundsLabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorText.setAlignment(java.awt.Label.CENTER);
        colorText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colorText.setText("label for color text");

        clockLabel.setAlignment(java.awt.Label.RIGHT);
        clockLabel.setText("clock Label");

        buttonRed.setBackground(new java.awt.Color(255, 0, 0));
        buttonRed.setForeground(new java.awt.Color(255, 0, 0));
        buttonRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRedMouseExited(evt);
            }
        });
        buttonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRedActionPerformed(evt);
            }
        });

        buttonGreen.setBackground(new java.awt.Color(0, 255, 0));
        buttonGreen.setForeground(new java.awt.Color(0, 255, 0));
        buttonGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGreenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGreenMouseExited(evt);
            }
        });
        buttonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGreenActionPerformed(evt);
            }
        });

        buttonYellow.setBackground(new java.awt.Color(255, 255, 0));
        buttonYellow.setForeground(new java.awt.Color(255, 255, 0));
        buttonYellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonYellowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonYellowMouseExited(evt);
            }
        });
        buttonYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYellowActionPerformed(evt);
            }
        });

        buttonBlue.setBackground(java.awt.Color.blue);
        buttonBlue.setForeground(java.awt.Color.blue);
        buttonBlue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonBlueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonBlueMouseExited(evt);
            }
        });
        buttonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBlueActionPerformed(evt);
            }
        });

        buttonPurple.setBackground(java.awt.Color.magenta);
        buttonPurple.setForeground(java.awt.Color.magenta);
        buttonPurple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPurpleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPurpleMouseExited(evt);
            }
        });
        buttonPurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurpleActionPerformed(evt);
            }
        });

        highscoreLabel.setAlignment(java.awt.Label.CENTER);
        highscoreLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        highscoreLabel.setText("high score label");

        roundsLabel.setAlignment(java.awt.Label.CENTER);
        roundsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        roundsLabel.setText("rounds remaining");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRed, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(highscoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(buttonPurple, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(roundsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(clockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(colorText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(highscoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(colorText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPurple, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //When button is pressed
    private void buttonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRedActionPerformed
        if (currentText.equals("Red")) {
            highscore += 100;
        }
        highscoreLabel.setText("Highscore = " + highscore);
        roundsRemaining -= 1;
        roundsLabel.setText("Rounds Remaining: " + roundsRemaining);
        if (roundsRemaining < 1)
            endGame();
        resetButtonAndText();
        repaint();
    }//GEN-LAST:event_buttonRedActionPerformed

    private void buttonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGreenActionPerformed
        if (currentText.equals("Green")) {
            highscore += 100;
        }
        highscoreLabel.setText("Highscore = " + highscore);
        roundsRemaining -= 1;
        roundsLabel.setText("Rounds Remaining: " + roundsRemaining);
        if (roundsRemaining < 1)
            endGame();
        resetButtonAndText();
        repaint();
    }//GEN-LAST:event_buttonGreenActionPerformed

    private void buttonYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYellowActionPerformed
        if (currentText.equals("Yellow")) {
            highscore += 100;
        }
        highscoreLabel.setText("Highscore = " + highscore);
        roundsRemaining -= 1;
        roundsLabel.setText("Rounds Remaining: " + roundsRemaining);
        if (roundsRemaining < 1)
            endGame();
        resetButtonAndText();
        repaint();
    }//GEN-LAST:event_buttonYellowActionPerformed

    private void buttonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBlueActionPerformed
        if (currentText.equals("Blue")) {
            highscore += 100;
        }
        highscoreLabel.setText("Highscore = " + highscore);
        roundsRemaining -= 1;
        roundsLabel.setText("Rounds Remaining: " + roundsRemaining);
        if (roundsRemaining < 1)
            endGame();
        resetButtonAndText();
        repaint();
    }//GEN-LAST:event_buttonBlueActionPerformed

    private void buttonPurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurpleActionPerformed
        if (currentText.equals("Purple")) {
            highscore += 100;
        }
        highscoreLabel.setText("Highscore = " + highscore);
        roundsRemaining -= 1;
        roundsLabel.setText("Rounds Remaining: " + roundsRemaining);
        if (roundsRemaining < 1)
            endGame();
        resetButtonAndText();
        repaint();
    }//GEN-LAST:event_buttonPurpleActionPerformed

    
    
    //When each button is hovered, change to lighter color to represent "highlight"
    private void buttonRedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRedMouseEntered
        buttonRed.setBackground(new Color(255, 100, 100));
        repaint();
    }//GEN-LAST:event_buttonRedMouseEntered

    private void buttonRedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRedMouseExited
        buttonRed.setBackground(Color.RED);
        repaint();
    }//GEN-LAST:event_buttonRedMouseExited

    private void buttonYellowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonYellowMouseEntered
        buttonYellow.setBackground(new Color(255, 255, 200));
        repaint();
    }//GEN-LAST:event_buttonYellowMouseEntered

    private void buttonYellowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonYellowMouseExited
        buttonYellow.setBackground(Color.YELLOW);
        repaint();
    }//GEN-LAST:event_buttonYellowMouseExited

    private void buttonGreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGreenMouseEntered
        buttonGreen.setBackground(new Color(100, 255, 100));
        repaint();
    }//GEN-LAST:event_buttonGreenMouseEntered

    private void buttonGreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGreenMouseExited
        buttonGreen.setBackground(Color.GREEN);
        repaint();
    }//GEN-LAST:event_buttonGreenMouseExited

    private void buttonBlueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBlueMouseEntered
        buttonBlue.setBackground(new Color(150, 150, 255));
        repaint();
    }//GEN-LAST:event_buttonBlueMouseEntered

    private void buttonBlueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBlueMouseExited
        buttonBlue.setBackground(Color.BLUE);
        repaint();
    }//GEN-LAST:event_buttonBlueMouseExited

    private void buttonPurpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPurpleMouseEntered
        buttonPurple.setBackground(new Color(255, 100, 255));
        repaint();
    }//GEN-LAST:event_buttonPurpleMouseEntered

    private void buttonPurpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPurpleMouseExited
        buttonPurple.setBackground(Color.MAGENTA);
        repaint();
    }//GEN-LAST:event_buttonPurpleMouseExited

    //time and date method
    public void startClock() {
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String dateTime = new Date().toString();
                
                clockLabel.setText(dateTime);
                
            }
        });
        timer.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PJam_ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PJam_ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PJam_ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PJam_ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PJam_ColorGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBlue;
    private javax.swing.JButton buttonGreen;
    private javax.swing.JButton buttonPurple;
    private javax.swing.JButton buttonRed;
    private javax.swing.JButton buttonYellow;
    private java.awt.Label clockLabel;
    private java.awt.Label colorText;
    private java.awt.Label highscoreLabel;
    private java.awt.Label roundsLabel;
    // End of variables declaration//GEN-END:variables
}
