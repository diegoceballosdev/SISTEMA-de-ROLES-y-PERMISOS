package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();
        
    // ---------------------------- VALIDATE ----------------------------

    public Usuario validarUsuario(String nombreUsuario, String contrasenia) {
        
        Usuario usuValido = null;

        List<Usuario> listaUsuarios = controladoraPers.traerListaUsuarios();

        for (Usuario user : listaUsuarios) {

            if (user.getNombreUsuario().equals(nombreUsuario) && user.getContrasenia().equals(contrasenia)) {
                usuValido = user;
                return usuValido;
            }
        }

        return usuValido;
    }
    
    // ---------------------------- CREATE ----------------------------

    public void crearUsuario(String nombreUsuario, String contrasenia, String rolRcibido) {
        
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreUsuario(nombreUsuario);
        nuevoUsuario.setContrasenia(contrasenia);
        
        Rol rolEncontrado = this.traerRol(rolRcibido);
        
        if (rolEncontrado != null) {
            nuevoUsuario.setRolUsuario(rolEncontrado); 
        }
        
        //CUANDO LA BD SE MANIPULA DE FORMA MANUAL AL MENOS UNA VEZ, NO SE RECOMIENDA UN ID AUTOMATICO. POR ESO:
        //BUSCAR ULTIMO ID EN LA TABLA USUSARIO, PARA CREAR EL SIGUIENTE.
        int id = this.buscarUltimoId();
        nuevoUsuario.setId(id + 1);
        
        controladoraPers.crearUsuario(nuevoUsuario);  
    }
    
    // ----------------------------- READ -----------------------------
    
    public List<Usuario> traerListaUsuarios() {
        return controladoraPers.traerListaUsuarios();
    }

    public List<Rol> traerListaRoles() {
        return controladoraPers.traerListaRoles();
    }

    private Rol traerRol(String rolRcibido) {
        
        List<Rol> listaRoles = this.traerListaRoles();

        for (Rol rol : listaRoles) {

            if (rol.getNombreRol().equals(rolRcibido)) {
                return rol;
            }
        }    
        
        return null;        
    }

    private int buscarUltimoId() {
       
        List<Usuario> listaUsuarios = this.traerListaUsuarios();
        
        Usuario user = listaUsuarios.get(listaUsuarios.size() - 1);
        //EL size() SE USA PARA OBTNER EL ID DEL ULTIMO USUARIO, QUE NO TIENE NADA QUE VER CON LA CANTIDAD DE USUARIOS EN LA LISTA/BD
        //EL ID SE OBTIENE DEL ULTIMO USUARIO DE LA LISTA, QUE ESTA EN LA POSICION (size() - 1)
        //ENTONCES POR MAS QUE ELIMINE USUSARIOS, EL ID RETORNADO SIEMPRE SERA EL CORRECTO.
        
        return user.getId();   
    }

    public Usuario traerUsuario(int idUsuarioAEditar) {
        
        return controladoraPers.traerUsuario(idUsuarioAEditar);
    }
 
    // ----------------------------- UPDATE -----------------------------
    
    public void editarUsuario(Usuario usuarioAEditar, String nombreUsuario, String contrasenia, String rolRcibido) {
        
        usuarioAEditar.setNombreUsuario(nombreUsuario);
        usuarioAEditar.setContrasenia(contrasenia);
        
        Rol rolEncontrado = this.traerRol(rolRcibido);
        
        if (rolEncontrado != null) {
            usuarioAEditar.setRolUsuario(rolEncontrado); 
        }
        
        controladoraPers.editarUsuario(usuarioAEditar);
    }        
    
    // ----------------------------- DELETE -----------------------------
    
    public void eliminarUsuario(int idUsuario) {
        
        controladoraPers.eliminarUsuario(idUsuario);
        
    }

}

