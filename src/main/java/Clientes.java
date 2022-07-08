import java.util.Scanner;

public class Clientes {
    int idCliente;
    String nombre;
    String direccion;
    float saldoTotal;

    public Clientes(int id, String nombre, String direccion, float saldo){
        idCliente = id;
        this.nombre = nombre;
        this.direccion = direccion;
        saldoTotal = saldo;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
