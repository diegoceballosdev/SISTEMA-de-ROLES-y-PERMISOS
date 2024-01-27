package com.mycompany.login.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    private String nombreRol;
    private String descripcion;
    
    @OneToMany(mappedBy = "rolUsuario") //mappedBy para mapear que esta del lado "N" de la relacion.
    private List<Usuario> listaUsuarios;

    public Rol() {
    }

    public Rol(int id, String nombreRol, String descripcion, List<Usuario> listaUsuarios) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.listaUsuarios = listaUsuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", nombreRol=" + nombreRol + ", descripcion=" + descripcion + '}';
    }
    
}
