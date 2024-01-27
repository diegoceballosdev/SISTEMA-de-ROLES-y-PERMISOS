package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //NO USAR GENERATEDVALUE EN UNA TABLA QUE YA FUE CREADA CON REGISTROS...ERROR EN LOS IDs
    private int id;
    
    @Basic
    private String nombreUsuario;
    private String contrasenia;
    
    @ManyToOne
    @JoinColumn(name = "fk_idRol") 
    private Rol rolUsuario;
    /* NOMBRE DEL CAMPO DONDE SE ESTABLECE LA RELACION CON "ROL". 
    NO PUEDE SER name = "id" PUES YA POSEO UNA COLUMNA CON ESE NOMBRE EN MI CLASE USUARIO, Y FALLARIA EL MAPEO.
    ENTONCES ELIGO name = "fk_idRol" */

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contrasenia, Rol rolUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.rolUsuario = rolUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Rol rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + ", rolUsuario=" + rolUsuario + '}';
    }
    
}
