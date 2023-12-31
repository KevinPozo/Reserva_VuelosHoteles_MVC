/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.views;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import vista.Dashboard;

/**
 *
 * @author kevin
 */
public class Principal3 extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal3() {
        initComponents();
        InitStyles();
    }

    
    private void InitStyles(){
        titulo3LB.putClientProperty("FlatLaf.style", "font: 200% bold $h1.regular.font");
        titulo3LB.setForeground(Color.black);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        tituloLB = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        titulo3LB = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 73, 144));
        setMinimumSize(new java.awt.Dimension(883, 650));
        setPreferredSize(new java.awt.Dimension(883, 650));

        bg.setBackground(new java.awt.Color(0, 73, 144));
        bg.setPreferredSize(new java.awt.Dimension(800, 466));

        header.setBackground(new java.awt.Color(234, 234, 234));

        tituloLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Documents\\workspace\\patrones-de-disenio\\Hoteles_Vuelos_Grupal\\src\\main\\java\\vista\\recursos\\iconoAvion32.png")); // NOI18N
        tituloLB.setText(" Elige tu vuelo de salida");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLB, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        body.setBackground(new java.awt.Color(0, 73, 144));

        titulo3LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3LB.setText("GRACIAS POR ELEGIRNOS");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo3LB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(titulo3LB)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JPanel header;
    private javax.swing.JLabel titulo3LB;
    private javax.swing.JLabel tituloLB;
    // End of variables declaration//GEN-END:variables
}
