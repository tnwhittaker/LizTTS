/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.torrike.liztts;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author Torrike
 */
public class LizGUI extends javax.swing.JFrame {

    /**
     * Creates new form LizGUI
     */
    public LizGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainScreen = new javax.swing.JPanel();
        whitestrip = new java.awt.Panel();
        blackstrip = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ReadTextBttn = new javax.swing.JButton();
        UploadFileBttn = new javax.swing.JButton();
        ReadArticleBttn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        ReadTxtScreen = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtToRead = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        ReadDocScreen = new javax.swing.JPanel();
        panel3 = new java.awt.Panel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        FileLocationTxtField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ReadArticleScreen = new javax.swing.JPanel();
        whitestrip1 = new java.awt.Panel();
        blackstrip1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liz Text-To-Speech");
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        MainScreen.setBackground(new java.awt.Color(102, 204, 255));

        whitestrip.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout blackstripLayout = new javax.swing.GroupLayout(blackstrip);
        blackstrip.setLayout(blackstripLayout);
        blackstripLayout.setHorizontalGroup(
            blackstripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        blackstripLayout.setVerticalGroup(
            blackstripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout whitestripLayout = new javax.swing.GroupLayout(whitestrip);
        whitestrip.setLayout(whitestripLayout);
        whitestripLayout.setHorizontalGroup(
            whitestripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitestripLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(blackstrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        whitestripLayout.setVerticalGroup(
            whitestripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blackstrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setText("Liz Text To Speech");

        ReadTextBttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\Webp.net-resizeimage.png")); // NOI18N
        ReadTextBttn.setText("Read Text");
        ReadTextBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadTextBttnActionPerformed(evt);
            }
        });

        UploadFileBttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\Webp.net-resizeimage (1).png")); // NOI18N
        UploadFileBttn.setText("Upload File");
        UploadFileBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadFileBttnActionPerformed(evt);
            }
        });

        ReadArticleBttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\Webp.net-resizeimage (2).png")); // NOI18N
        ReadArticleBttn.setText("Read Article");
        ReadArticleBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadArticleBttnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\Webp.net-resizeimage (3).png")); // NOI18N

        filler2.setBackground(new java.awt.Color(0, 0, 0));
        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        filler2.setOpaque(true);

        filler4.setBackground(new java.awt.Color(0, 0, 0));
        filler4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        filler4.setOpaque(true);

        javax.swing.GroupLayout MainScreenLayout = new javax.swing.GroupLayout(MainScreen);
        MainScreen.setLayout(MainScreenLayout);
        MainScreenLayout.setHorizontalGroup(
            MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainScreenLayout.createSequentialGroup()
                .addGroup(MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainScreenLayout.createSequentialGroup()
                        .addComponent(whitestrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(ReadTextBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainScreenLayout.createSequentialGroup()
                                .addComponent(UploadFileBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReadArticleBttn))
                            .addGroup(MainScreenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        MainScreenLayout.setVerticalGroup(
            MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitestrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReadArticleBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ReadTextBttn)
                        .addComponent(UploadFileBttn))
                    .addComponent(filler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );

        getContentPane().add(MainScreen, "card2");

        ReadTxtScreen.setBackground(new java.awt.Color(102, 204, 255));

        panel2.setBackground(new java.awt.Color(0, 0, 0));
        panel2.setPreferredSize(new java.awt.Dimension(101, 383));

        jPanel4.setPreferredSize(new java.awt.Dimension(25, 383));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel3.setText("Say Something To Liz Here");

        txtToRead.setColumns(20);
        txtToRead.setRows(5);
        jScrollPane1.setViewportView(txtToRead);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\speaker.png")); // NOI18N
        jButton1.setText("Speak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        back_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\backicon.png")); // NOI18N
        back_button.setText("Back");
        back_button.setInheritsPopupMenu(true);
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadTxtScreenLayout = new javax.swing.GroupLayout(ReadTxtScreen);
        ReadTxtScreen.setLayout(ReadTxtScreenLayout);
        ReadTxtScreenLayout.setHorizontalGroup(
            ReadTxtScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadTxtScreenLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReadTxtScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ReadTxtScreenLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(back_button))
                    .addComponent(jLabel3))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        ReadTxtScreenLayout.setVerticalGroup(
            ReadTxtScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReadTxtScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ReadTxtScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(back_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ReadTxtScreen, "card3");

        ReadDocScreen.setBackground(new java.awt.Color(102, 204, 255));

        panel3.setBackground(new java.awt.Color(0, 0, 0));
        panel3.setPreferredSize(new java.awt.Dimension(101, 383));

        jPanel6.setPreferredSize(new java.awt.Dimension(25, 383));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel4.setText("Read From A Document");

        jLabel5.setText("Select File:");

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        FileLocationTxtField.setEditable(false);
        FileLocationTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileLocationTxtFieldActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\speaker.png")); // NOI18N
        jButton4.setText("Speak");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\backicon.png")); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadDocScreenLayout = new javax.swing.GroupLayout(ReadDocScreen);
        ReadDocScreen.setLayout(ReadDocScreenLayout);
        ReadDocScreenLayout.setHorizontalGroup(
            ReadDocScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadDocScreenLayout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(ReadDocScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(ReadDocScreenLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(ReadDocScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReadDocScreenLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(ReadDocScreenLayout.createSequentialGroup()
                                .addComponent(FileLocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        ReadDocScreenLayout.setVerticalGroup(
            ReadDocScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReadDocScreenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addGroup(ReadDocScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton3)
                    .addComponent(FileLocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(ReadDocScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        getContentPane().add(ReadDocScreen, "card4");

        ReadArticleScreen.setBackground(new java.awt.Color(102, 204, 255));

        whitestrip1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout blackstrip1Layout = new javax.swing.GroupLayout(blackstrip1);
        blackstrip1.setLayout(blackstrip1Layout);
        blackstrip1Layout.setHorizontalGroup(
            blackstrip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        blackstrip1Layout.setVerticalGroup(
            blackstrip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout whitestrip1Layout = new javax.swing.GroupLayout(whitestrip1);
        whitestrip1.setLayout(whitestrip1Layout);
        whitestrip1Layout.setHorizontalGroup(
            whitestrip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitestrip1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(blackstrip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        whitestrip1Layout.setVerticalGroup(
            whitestrip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blackstrip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel6.setText("Read From Newspaper");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter URL:");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\speaker.png")); // NOI18N
        jButton2.setText("Search and Speak");

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\backicon.png")); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadArticleScreenLayout = new javax.swing.GroupLayout(ReadArticleScreen);
        ReadArticleScreen.setLayout(ReadArticleScreenLayout);
        ReadArticleScreenLayout.setHorizontalGroup(
            ReadArticleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadArticleScreenLayout.createSequentialGroup()
                .addComponent(whitestrip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ReadArticleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ReadArticleScreenLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(ReadArticleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ReadArticleScreenLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ReadArticleScreenLayout.setVerticalGroup(
            ReadArticleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitestrip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReadArticleScreenLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(91, 91, 91)
                .addGroup(ReadArticleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(ReadArticleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ReadArticleScreen, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadFileBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadFileBttnActionPerformed
        MainScreen.setVisible(false);
        ReadDocScreen.setVisible(true);

    }//GEN-LAST:event_UploadFileBttnActionPerformed

    private void ReadTextBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadTextBttnActionPerformed
        // TODO add your handling code here:
        MainScreen.setVisible(false);
        ReadTxtScreen.setVisible(true);
        
    }//GEN-LAST:event_ReadTextBttnActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        ReadTxtScreen.setVisible(false);
        MainScreen.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void ReadArticleBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadArticleBttnActionPerformed
        // TODO add your handling code here:
        MainScreen.setVisible(false);
        ReadArticleScreen.setVisible(true);
    }//GEN-LAST:event_ReadArticleBttnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF","PDF"));
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("MS PowerPoint","pptx"));
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("MS Word Document","docx"));
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Files","txt"));
            chooser.setAcceptAllFileFilterUsed(false);
            int res= chooser.showOpenDialog(this);
            if (res == JFileChooser.APPROVE_OPTION){
                File f = chooser.getSelectedFile();
                FileLocationTxtField.setText(f.getAbsolutePath());
            }
        } catch (HeadlessException e) {
            System.out.println("Exception"+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void FileLocationTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileLocationTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileLocationTxtFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ReadDocScreen.setVisible(false);
        MainScreen.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ReadArticleScreen.setVisible(false);
        MainScreen.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String test = txtToRead.getText();
       LexicalAnalysis LA = new LexicalAnalysis();
       LA.performLexicalAnalysis(test);
       LizVoice lizVoice = new LizVoice();
       lizVoice.Talk(test);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String location = FileLocationTxtField.getText();
        String fileExtension = FilenameUtils.getExtension(location); 
        DocumentReader documentReader = new DocumentReader();
        LizVoice lv = new LizVoice();
        
        if("pdf".equals(fileExtension)) {
                String results = "";
                try {
                    results = documentReader.ReadPDFFile(location);
                } catch (IOException ex) {
                    Logger.getLogger(LizGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                LexicalAnalysis LA = new LexicalAnalysis();
                LA.performLexicalAnalysis(results);
                lv.Talk(results);
            }
        else if("docx".equals(fileExtension)){
            try {
                String results = documentReader.ReadWordFile(location);
                LexicalAnalysis LA = new LexicalAnalysis();
                LA.performLexicalAnalysis(results);
                lv.Talk(results);
            } catch (IOException ex) {
                Logger.getLogger(LizGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
        else if("pptx".equals(fileExtension)){
            try {
                String results = documentReader.ReadPowerPointFile(location);
                System.out.println(results);
                LexicalAnalysis LA = new LexicalAnalysis();
                LA.performLexicalAnalysis(results);
                lv.Talk(results);
            } catch (IOException ex) {
                Logger.getLogger(LizGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        else if("txt".equals(fileExtension)){
            System.out.println("com.torrike.liztts.LizGUI.jButton4ActionPerformed()");
        }

        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(LizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FileLocationTxtField;
    private javax.swing.JPanel MainScreen;
    private javax.swing.JButton ReadArticleBttn;
    private javax.swing.JPanel ReadArticleScreen;
    private javax.swing.JPanel ReadDocScreen;
    private javax.swing.JButton ReadTextBttn;
    private javax.swing.JPanel ReadTxtScreen;
    private javax.swing.JButton UploadFileBttn;
    private javax.swing.JButton back_button;
    private javax.swing.JPanel blackstrip;
    private javax.swing.JPanel blackstrip1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JTextArea txtToRead;
    private java.awt.Panel whitestrip;
    private java.awt.Panel whitestrip1;
    // End of variables declaration//GEN-END:variables
}
