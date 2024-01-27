package com.mycompany.login.igu;

import com.mycompany.login.logica.ControladoraLogica;
import com.mycompany.login.logica.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class PrincipalUser extends javax.swing.JFrame {

    private final ControladoraLogica controladoraLog;
    private final Usuario usuario;

    public PrincipalUser(ControladoraLogica controladoraLog, Usuario usuario) {
        this.controladoraLog = controladoraLog;
        this.usuario = usuario;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnSalir.setText("Cerrar Sesion");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRecargarTabla.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnRecargarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/recargar.png"))); // NOI18N
        btnRecargarTabla.setText("Recargar Tabla");
        btnRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarTablaActionPerformed(evt);
            }
        });

        tablaUsuarios.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 40)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/userMin.png"))); // NOI18N

        txtNombreUser.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        txtNombreUser.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRecargarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreUser)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarTablaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LoginPrincipal ventanaPrin = new LoginPrincipal();
        ventanaPrin.setVisible(true);
        ventanaPrin.setLocationRelativeTo(null);
        ventanaPrin.setResizable(false);
        ventanaPrin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txtNombreUser.setText("Usuario: " + this.usuario.getNombreUsuario());     
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel txtNombreUser;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        //DEFINIR EL MODELO DE LA TABLA:
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //DETERMINO QUE FILAS Y COLUMNAS NO SEAN EDITABLES:
            @Override
            public boolean isCellEditable(int row, int coluimn){
                return false;
            }   
        };
        
        //ASIGNO NOMBRE DE LOS ENCABEZADOS DE CADA COLUMNA:
        String[] titutlos = {"ID", "Usuario", "Rol"};
        modeloTabla.setColumnIdentifiers(titutlos);
        
        //RECUPERAR DATOS DE USUARIOS:
        List<Usuario> listaUsuarios = controladoraLog.traerListaUsuarios();
                
        if (listaUsuarios != null) {
            
            //CREAR LAS FILAS (REGISTRO DE CADA USUARIO) Y AGREGAR A LA TABLA:
            for(Usuario user : listaUsuarios){

                Object[] registro = {user.getId(), user.getNombreUsuario(), user.getRolUsuario().getNombreRol()};

                modeloTabla.addRow(registro);
            }
        }
        
        //ASIGNAR MODELO A LA TABLA DE USUARIOS:
        tablaUsuarios.setModel(modeloTabla);
        
        //PERSONALIZAR TABLA:
        tablaUsuarios.getTableHeader().setBackground(new Color(197, 221, 238));
        tablaUsuarios.setRowHeight(25);
        
    }
}
