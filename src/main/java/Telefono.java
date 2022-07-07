import java.util.Scanner;

public class Telefono extends Clientes{
    long numTelefono;
    float saldoTelefono;

    
    public Telefono(int idCliente, String nombre, String direccion, 
            float saldoTotal, long numTelefono, float saldoTelefono){
        
        super(idCliente, nombre, direccion, saldoTotal);
        this.numTelefono = numTelefono;
        this.saldoTelefono = saldoTelefono;
    }
    

    public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public float getSaldoTelefono() {
        return saldoTelefono;
    }

    public void setSaldoTelefono(float saldoTelefono) {
        this.saldoTelefono = saldoTelefono;
    }
}
