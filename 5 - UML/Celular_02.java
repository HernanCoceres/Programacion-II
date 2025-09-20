/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML;

/**
 *
 * @author Herna
 */
public class Celular_02 {
    // Clase Bateria
public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
}

// Clase Usuario
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Referencia a Celular

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}

// Clase Celular
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // relacion de agregacion
    private Usuario usuario; // rel asociacion

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setCelular(this); // relacion bidireccional
        }
    }
}
}
