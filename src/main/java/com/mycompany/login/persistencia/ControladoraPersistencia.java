package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    UsuarioJpaController userJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
    // ---------------------------- CREATE ----------------------------   

    public void crearUsuario(Usuario nuevoUsuario) {
        
        userJpa.create(nuevoUsuario);
    }

    // ----------------------------- READ -----------------------------
    
    public List<Usuario> traerListaUsuarios() {

        return userJpa.findUsuarioEntities();
        
    }

    public List<Rol> traerListaRoles() {
        
        return rolJpa.findRolEntities();
    }

    public Usuario traerUsuario(int idUsuarioAEditar) {
        
        return userJpa.findUsuario(idUsuarioAEditar);               
    }

    // ---------------------------- UPDATE ----------------------------  
    
    public void editarUsuario(Usuario usuarioAEditar) {
        
        try {
            userJpa.edit(usuarioAEditar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ----------------------------- DELETE -----------------------------
    
    public void eliminarUsuario(int idUsuario) {
        
        try {
            userJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
