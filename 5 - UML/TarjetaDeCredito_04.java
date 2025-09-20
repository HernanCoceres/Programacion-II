/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML;

/**
 *
 * @author Herna
 */
public class TarjetaDeCredito_04 {
    // Clase Cliente
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Ref a TarjetaDeCredito

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
}

// Clase Banco
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
}

// Clase TarjetaDeCredito
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // asociacion
    private Banco banco; // agregacion

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        if (cliente != null) {
            cliente.setTarjeta(this); // relacion bidireccional
        }
    }
}
}
