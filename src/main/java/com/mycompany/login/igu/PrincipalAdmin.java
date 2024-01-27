package com.mycompany.login.igu;

import com.mycompany.login.logica.ControladoraLogica;
import com.mycompany.login.logica.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {
    
    private final ControladoraLogica controladoraLog;
    private final Usuario usuarioEnSesion;

    public PrincipalAdmin(ControladoraLogica controladoraLog, Usuario usuarioEnSesion) {
        this.controladoraLog = controladoraLog;
        this.usuarioEnSesion = usuarioEnSesion;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 40)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

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

        btnEditar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/userEdit.png"))); // NOI18N
        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/userDelete.png"))); // NOI18N
        btnBorrar.setText("Borrar Usuario");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
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

        btnCerrarSesion.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/userAdd.png"))); // NOI18N
        btnCrear.setText("Crear Usuario");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecargarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreUser))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txtNombreUser.setText("Usuario: " + this.usuarioEnSesion.getNombreUsuario());  
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        
        LoginPrincipal ventanaPrin = new LoginPrincipal();
        ventanaPrin.setVisible(true);
        ventanaPrin.setLocationRelativeTo(null);
        ventanaPrin.setResizable(false);
        ventanaPrin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();    
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        CreateUser ventanaCrearUsuario = new CreateUser(controladoraLog, usuarioEnSesion);
        ventanaCrearUsuario.setVisible(true);
        ventanaCrearUsuario.setLocationRelativeTo(null);
        ventanaCrearUsuario.setResizable(false);
        ventanaCrearUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        //CONTROLAR QUE LA TABLA NO ESTE VACIA
        if(tablaUsuarios.getRowCount() > 0){
            
            //CONTROLA QUE HAYA UNA FILA SELECCIONADA
            if (tablaUsuarios.getSelectedRow() != -1) {
                
                //OBTENER ID PARA ELIMINAR
                int idUsuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
                
                //LLAMAR AL METODO ELIMINAR
                controladoraLog.eliminarUsuario(idUsuario);
                
                //MENSAJE
                mostrarMensaje("Usuario eliminado exitosamente", "Info", "Borrado de Usuario");
                
                //SE ACTUALIZA LA TABLA
                cargarTabla();
                
            } 
            else {
                mostrarMensaje("No se selecciono ningun Usuario", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("Tabla vacia: Nada para eliminar", "Error", "Error al eliminar");
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        
        cargarTabla();
        
    }//GEN-LAST:event_btnRecargarTablaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //CONTROLAR QUE LA TABLA NO ESTE VACIA
        if(tablaUsuarios.getRowCount() > 0){
            
            //CONTROLA QUE HAYA UNA FILA SELECCIONADA
            if (tablaUsuarios.getSelectedRow() != -1) {
                
                //OBTENER ID PARA ELIMINAR
                int idUsuarioAEditar = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
                
                //SE ABRE LA VENTANA DE EDICION
                EditUser ventanaEditar = new EditUser(controladoraLog, usuarioEnSesion, idUsuarioAEditar);
                ventanaEditar.setVisible(true);
                ventanaEditar.setLocationRelativeTo(null);
                ventanaEditar.setResizable(false);
                ventanaEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                //SE CIERRA LA VENTANA ACTUAL
                this.dispose();
                
            } 
            else {
                mostrarMensaje("No se selecciono ningun Usuario", "Error", "Error al editar");
            }
        }
        else{
            mostrarMensaje("Tabla vacia: Nada para eliminar", "Error", "Error al editar");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRecargarTabla;
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
    
    private void mostrarMensaje(String msj, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(msj);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
}
