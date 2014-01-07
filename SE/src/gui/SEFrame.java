/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;
import java.util.List;
import java.util.LinkedList;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.ListModel;
import org.apache.commons.io.FileUtils;
/**
 *
 * @author acer
 */
public class SEFrame extends javax.swing.JFrame {

    private File instance;
    private File solution;
    private String log;
    /**
     * Creates new form NewJFrame
     */
    public SEFrame() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        solutionDataLabel = new javax.swing.JLabel();
        instanceDataLabel = new javax.swing.JLabel();
        drawingPanelScrollPane = new javax.swing.JScrollPane();
        drawingPanel = new javax.swing.JPanel();
        instanceListScrollPane = new javax.swing.JScrollPane();
        instanceDataList = new javax.swing.JList();
        solutionListScrollPane = new javax.swing.JScrollPane();
        solutionDataList = new javax.swing.JList();
        logScrollPane = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        processButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadInstanceMenuItem = new javax.swing.JMenuItem();
        loadSolutionMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        historyMenuItem = new javax.swing.JMenuItem();
        closeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle routing");
        setPreferredSize(new java.awt.Dimension(950, 700));
        setResizable(false);

        solutionDataLabel.setText("Solution data:");

        instanceDataLabel.setText("Instance data:");

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        drawingPanelScrollPane.setViewportView(drawingPanel);

        instanceDataList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        instanceListScrollPane.setViewportView(instanceDataList);

        solutionDataList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        solutionListScrollPane.setViewportView(solutionDataList);

        logTextArea.setColumns(20);
        logTextArea.setRows(5);
        logTextArea.setText("Log:\n");
        logTextArea.setEnabled(false);
        logScrollPane.setViewportView(logTextArea);

        processButton.setText("Process!");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        loadInstanceMenuItem.setText("Load Instance");
        loadInstanceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadInstanceMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadInstanceMenuItem);

        loadSolutionMenuItem.setText("Load Solution");
        loadSolutionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSolutionMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadSolutionMenuItem);

        saveMenuItem.setText("Save visualisation");
        jMenu1.add(saveMenuItem);

        historyMenuItem.setText("History");
        jMenu1.add(historyMenuItem);

        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(closeMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(instanceDataLabel)
                    .addComponent(solutionDataLabel))
                .addGap(0, 494, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(solutionListScrollPane)
                    .addComponent(instanceListScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(drawingPanelScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logScrollPane)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drawingPanelScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logScrollPane))
                .addGap(18, 18, 18)
                .addComponent(instanceDataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instanceListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solutionDataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solutionListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
        dispose();
        setVisible(false);
    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void loadInstanceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadInstanceMenuItemActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            instance = fc.getSelectedFile();
            logTextArea.append("Opening: " + instance.getName() + ".\n");
        } else {
            logTextArea.append("Open command cancelled by user.\n");
        }
    }//GEN-LAST:event_loadInstanceMenuItemActionPerformed

    private void loadSolutionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSolutionMenuItemActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            solution = fc.getSelectedFile();
            logTextArea.append("Opening: " + solution.getName() + ".\n");
        } else {
            logTextArea.append("Open command cancelled by user.\n");
        }
    }//GEN-LAST:event_loadSolutionMenuItemActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        instanceDataList.removeAll();
        solutionDataList.removeAll();
        DefaultListModel instanceModel = new DefaultListModel();
        DefaultListModel solutionModel = new DefaultListModel();
        try {
            for(String line: FileUtils.readLines(instance)) {
                instanceModel.addElement(line);
            }
            for(String line: FileUtils.readLines(solution)) {
                solutionModel.addElement(line);
            }
            instanceDataList.setModel(instanceModel);
            solutionDataList.setModel(solutionModel);
        }
        catch (IOException e) {
            
        }
    }//GEN-LAST:event_processButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SEFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JScrollPane drawingPanelScrollPane;
    private javax.swing.JMenuItem historyMenuItem;
    private javax.swing.JLabel instanceDataLabel;
    private javax.swing.JList instanceDataList;
    private javax.swing.JScrollPane instanceListScrollPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JMenuItem loadInstanceMenuItem;
    private javax.swing.JMenuItem loadSolutionMenuItem;
    private javax.swing.JScrollPane logScrollPane;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JButton processButton;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel solutionDataLabel;
    private javax.swing.JList solutionDataList;
    private javax.swing.JScrollPane solutionListScrollPane;
    // End of variables declaration//GEN-END:variables
}