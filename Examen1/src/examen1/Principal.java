/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alexycruz1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rname = new javax.swing.JTextField();
        rcorreo = new javax.swing.JTextField();
        ruser = new javax.swing.JTextField();
        rcontra = new javax.swing.JTextField();
        registrarr = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        redad = new javax.swing.JTextField();
        jd_logeado = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sname = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        suser = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        scorreo = new javax.swing.JScrollPane();
        sscorr = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        scontra = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        sedad = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        indice = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comandoss = new javax.swing.JTextArea();
        cingresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        visualizar = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        iuser = new javax.swing.JTextField();
        icontra = new javax.swing.JPasswordField();

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel3.setText("Registrar");

        jLabel4.setText("Nombre completo");

        jLabel5.setText("Correo electronico");

        jLabel6.setText("Nombre de usuario");

        jLabel7.setText("Contraseña");

        registrarr.setText("Registrar");
        registrarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarrMouseClicked(evt);
            }
        });

        jLabel8.setText("Edad");

        javax.swing.GroupLayout jd_registrarLayout = new javax.swing.GroupLayout(jd_registrar.getContentPane());
        jd_registrar.getContentPane().setLayout(jd_registrarLayout);
        jd_registrarLayout.setHorizontalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3))
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_registrarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rcorreo))
                            .addGroup(jd_registrarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_registrarLayout.createSequentialGroup()
                                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ruser)
                                    .addComponent(rcontra)
                                    .addGroup(jd_registrarLayout.createSequentialGroup()
                                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(registrarr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(redad))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ruser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(redad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(registrarr)
                .addGap(24, 24, 24))
        );

        jScrollPane2.setViewportView(sname);

        jLabel10.setText("Nombre completo");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel11.setText("Datos del usuario");

        jLabel12.setText("Nombre de usuario");

        jScrollPane3.setViewportView(suser);

        jLabel13.setText("Correo electronico");

        scorreo.setViewportView(sscorr);

        jLabel14.setText("Contraseña");

        jScrollPane4.setViewportView(scontra);

        jLabel15.setText("Edad");

        jScrollPane5.setViewportView(sedad);

        jScrollPane6.setViewportView(indice);

        jLabel16.setText("Indice en el sistema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scorreo)
                                    .addComponent(jScrollPane4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(scorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel9.setText("Ingrese los comandos que necesita:");

        comandoss.setColumns(20);
        comandoss.setRows(5);
        jScrollPane1.setViewportView(comandoss);

        cingresar.setText("Ingresar");
        cingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cingresar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cingresar)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comandos", jPanel2);

        jScrollPane7.setViewportView(visualizar);

        jLabel17.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel17.setText("Visualizacion de elementos");

        jButton4.setText("Iniciar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", jPanel3);

        jButton3.setText("Cerrar Sesion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_logeadoLayout = new javax.swing.GroupLayout(jd_logeado.getContentPane());
        jd_logeado.getContentPane().setLayout(jd_logeadoLayout);
        jd_logeadoLayout.setHorizontalGroup(
            jd_logeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_logeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_logeadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
        );
        jd_logeadoLayout.setVerticalGroup(
            jd_logeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_logeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jButton1.setText("Iniciar Sesion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(icontra)
                            .addComponent(iuser, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(iuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(icontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String user; 
        String pass;
        try {
            if (us.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No existe usuario registrado en este momento");
            }else{
                user=iuser.getText();
                pass=icontra.getText();
                for (int i = 0; i < us.size(); i++) {
                    if (us.get(i).getUser().equals(user) && us.get(i).getPass().equals(pass)) {
                        sname.setText(us.get(i).getNombrec());
                        suser.setText(us.get(i).getUser());
                        scontra.setText(us.get(i).getPass());
                        sscorr.setText(us.get(i).getCorreo());
                        sedad.setText(Integer.toString(us.get(i).getEdad()));
                        indice.setText(Integer.toString(i));
                        jd_logeado.setModal(true);
                        jd_logeado.pack();
                        jd_logeado.setLocationRelativeTo(this);
                        jd_logeado.setVisible(true);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al ingresar algun dato, por favor vuelva a intentar");
        }
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_registrar.setModal(true);
        jd_registrar.pack();
        jd_registrar.setLocationRelativeTo(this);
        jd_registrar.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_logeado.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void registrarrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarrMouseClicked
        String name, correo, user, pass;
        int edad;
        try {
            name=rname.getText();
            correo=rcorreo.getText();
            user=ruser.getText();
            pass=rcontra.getText();
            edad=Integer.parseInt(redad.getText());
            usuario u=new usuario(name, edad, correo, user, pass);
            us.add(u);
            JOptionPane.showMessageDialog(this, "Usuario registrado con exito");
            rname.setText("");
            rcorreo.setText("");
            ruser.setText("");
            rcontra.setText("");
            redad.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, datos usuario mal ingresados");
        }
        jd_registrar.dispose();
    }//GEN-LAST:event_registrarrMouseClicked

    private void cingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cingresarMouseClicked
        // TODO add your handling code here:
        String commands;
        String []t;
        int c=0, c2=0, c3=0, xx=0;
        int ind=Integer.parseInt(indice.getText());
        try {
            commands=comandoss.getText();
            t=commands.split(" ");
            for (int i = 0; i < t.length; i++) {
                if (t[i].equals("Create")) {
                    for (int j = i; j < t.length; j++) {
                        if (t[j].equals("class")) {
                            for (int k = j; k < t.length; k++) {
                                if (t[k].equals("Cat")) {
                                    String name="Cat";
                                   // int ind=Integer.parseInt(indice.getText());
                                    us.get(ind).getClases().add(new clases(name));
                                    c++;
                                }
                            }
                        }
                    }
                }
                if (t[i].equals("Modify")) {
                    for (int j = i; j < t.length; j++) {
                        if (t[j].equals("class")) {
                            for (int k = j; k < t.length; k++) {
                                if (t[k].equals("Cat")) {
                                    for (int l = k; l < t.length; l++) {
                                        if (t[l].equals("to")) {
                                            for (int m = l; m < t.length; m++) {
                                                if (t[m].equals("Perro")) {
                                                    us.get(ind).getClases().get(c).setNombre("Perro");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (t[j].equals("Atribute")) {
                            for (int k = j; k < t.length; k++) {
                                if (t[k].equals("from")) {
                                    for (int l = k; l < t.length; l++) {
                                        if (t[l].equals("Perro")) {
                                            int nuevo=Integer.parseInt(us.get(ind).getClases().get(c).getNombre());
                                            us.get(ind).getClases().get(c).getA().get(c2).setAge(nuevo);
                                        }
                                        if (t[l].equals("Method")) {
                                            for (int m = l; m < t.length; m++) {
                                                if (t[m].equals("Addition")) {
                                                    int nuevo=Integer.parseInt(t[m+1]);
                                                    us.get(ind).getClases().get(c).getM().get(c3).x.remove(xx);
                                                    us.get(ind).getClases().get(c).getM().get(c3).x.add(nuevo);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        
                    }
                }
                if (t[i].equals("Delete")) {
                    for (int j = i; j < t.length; j++) {
                        if (t[j].equals("class")) {
                            for (int k = j; k < t.length; k++) {
                                if (t[k].equals("Perro")) {
                                    us.get(ind).getClases().remove(c);
                                    c--;
                                }
                            }
                        }
                        if (t[j].equals("Atribute")) {
                            for (int k = j; k < t.length; k++) {
                                if (t[k].equals("from")) {
                                    for (int l = k; l < t.length; l++) {
                                        if (t[l].equals("Perro")) {
                                            us.get(ind).getClases().get(c).getA().remove(c2);
                                            c2--;
                                        }
                                        if (t[l].equals("Method")) {
                                            for (int m = l; m < t.length; m++) {
                                                if (t[m].equals("Addition")) {
                                                    us.get(ind).getClases().get(c).getM().get(c3).x.remove(xx);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (t[i].equals("Add")) {
                    for (int j = i; j < t.length; j++) {
                        if (t[j].equals("Atribute")) {
                            for (int k = j; k < t.length; k++) {
                                if (t[k].equals("to")) {
                                    for (int l = k; l < t.length; l++) {
                                        if (t[l].equals("Perro")) {
                                            us.get(ind).getClases().get(c).getA().add(new atributos(t[l+1]));
                                            c2++;
                                        }
                                        if (t[l].equals("Method")) {
                                            for (int m = l; m < t.length; m++) {
                                                if (t[m].equals("Addition")) {
                                                    int nuevo=Integer.parseInt(t[m+1]);
                                                    us.get(ind).getClases().get(c).getM().get(c3).getX().add(nuevo);
                                                    xx++;
                                                }
                                            }
                                        }
                                    }
                                }
                                
                            }
                        }//faltaron algunos comandos
                        if (t[j].equals("Method")) {
                            us.get(ind).getClases().get(c).getM().add(new metodos("public void addition"));
                            c3++;
                        }
                        
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Comandos ingresados con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error en un dato");
        }
        
    }//GEN-LAST:event_cingresarMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        int ind=Integer.parseInt(indice.getText());
        visualizar.setText(us.get(ind).toString());
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cingresar;
    private javax.swing.JTextArea comandoss;
    private javax.swing.JPasswordField icontra;
    private javax.swing.JTextPane indice;
    private javax.swing.JTextField iuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_logeado;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JTextField rcontra;
    private javax.swing.JTextField rcorreo;
    private javax.swing.JTextField redad;
    private javax.swing.JButton registrarr;
    private javax.swing.JTextField rname;
    private javax.swing.JTextField ruser;
    private javax.swing.JTextPane scontra;
    private javax.swing.JScrollPane scorreo;
    private javax.swing.JTextPane sedad;
    private javax.swing.JTextPane sname;
    private javax.swing.JTextPane sscorr;
    private javax.swing.JTextPane suser;
    private javax.swing.JTextPane visualizar;
    // End of variables declaration//GEN-END:variables
ArrayList<usuario> us=new ArrayList();
}