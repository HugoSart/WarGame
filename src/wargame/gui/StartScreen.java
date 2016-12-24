/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.gui;

import wargame.util.image.ImageURL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import wargame.WarGame;
import wargame.util.Resources;
import wargame.util.Utilities;

/** @author hugovs */
public class StartScreen extends javax.swing.JFrame {

    private static StartScreen instance = null;
    
    private StartScreen() {
        initComponents();
        initMyComponents();
        
     
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(dim);
        
    }

    private void initMyComponents() {
       
    }
    
    public static StartScreen newInstance(boolean visible) {
        if (instance == null)
            instance = new StartScreen();
        instance.setVisible(visible);
        return instance;
    }
    
    public static StartScreen getInstance() {
        return instance;
    }
    
    /** Do not modify this code!!! **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        btNewGame = new wargame.widgets.WButton();
        btLoadGame = new wargame.widgets.WButton();
        btExit = new wargame.widgets.WButton();
        btSettings = new wargame.widgets.WButton();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("War");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        lbTitle.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 200)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(204, 204, 204));
        lbTitle.setText("War");
        jPanel2.add(lbTitle);
        lbTitle.setBounds(30, 20, 590, 140);

        btNewGame.setBackground(new java.awt.Color(204, 204, 204));
        btNewGame.setBorder(null);
        btNewGame.setForeground(new java.awt.Color(204, 204, 204));
        btNewGame.setText("NEW GAME");
        btNewGame.setColorMouseOver(new java.awt.Color(102, 153, 255));
        btNewGame.setColorMouseOverPost(java.awt.Color.lightGray);
        btNewGame.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 36)); // NOI18N
        btNewGame.setMouseClickMediaName("menu_mouse_over.wav/");
        btNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewGameActionPerformed(evt);
            }
        });
        jPanel2.add(btNewGame);
        btNewGame.setBounds(170, 220, 260, 30);

        btLoadGame.setBackground(new java.awt.Color(255, 255, 255));
        btLoadGame.setBorder(null);
        btLoadGame.setForeground(new java.awt.Color(204, 204, 204));
        btLoadGame.setText("LOAD GAME");
        btLoadGame.setColorMouseOver(new java.awt.Color(102, 153, 255));
        btLoadGame.setColorMouseOverPost(java.awt.Color.lightGray);
        btLoadGame.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 36)); // NOI18N
        btLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoadGameActionPerformed(evt);
            }
        });
        jPanel2.add(btLoadGame);
        btLoadGame.setBounds(150, 290, 300, 30);

        btExit.setBackground(new java.awt.Color(255, 255, 255));
        btExit.setBorder(null);
        btExit.setForeground(new java.awt.Color(204, 204, 204));
        btExit.setText("EXIT");
        btExit.setColorMouseOver(new java.awt.Color(255, 102, 102));
        btExit.setColorMouseOverPost(java.awt.Color.lightGray);
        btExit.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 36)); // NOI18N
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel2.add(btExit);
        btExit.setBounds(230, 430, 140, 30);

        btSettings.setBackground(new java.awt.Color(255, 255, 255));
        btSettings.setBorder(null);
        btSettings.setForeground(new java.awt.Color(204, 204, 204));
        btSettings.setText("SETTINGS");
        btSettings.setColorMouseOver(new java.awt.Color(102, 153, 255));
        btSettings.setColorMouseOverPost(java.awt.Color.lightGray);
        btSettings.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 36)); // NOI18N
        btSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSettingsActionPerformed(evt);
            }
        });
        jPanel2.add(btSettings);
        btSettings.setBounds(180, 360, 240, 30);

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu_background.jpg"))); // NOI18N
        jPanel2.add(lbBackground);
        lbBackground.setBounds(-610, 0, 2620, 1230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoadGameActionPerformed
        closeAllFrames();
    }//GEN-LAST:event_btLoadGameActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSettingsActionPerformed
        closeAllFrames();
        SettingsScreen.newInstance(true);
    }//GEN-LAST:event_btSettingsActionPerformed

    private void btNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewGameActionPerformed
        closeAllFrames();
        NewGameScreen.newInstance(true);
    }//GEN-LAST:event_btNewGameActionPerformed

    private void closeAllFrames() {
        if (NewGameScreen.getInstance()  != null) NewGameScreen.getInstance().dispose();
        if (SettingsScreen.getInstance() != null) SettingsScreen.getInstance().dispose();
        //if (LoadGameScreen.getInstance() != null) LoadGameScreen.getInstance().dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private wargame.widgets.WButton btExit;
    private wargame.widgets.WButton btLoadGame;
    private wargame.widgets.WButton btNewGame;
    private wargame.widgets.WButton btSettings;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
