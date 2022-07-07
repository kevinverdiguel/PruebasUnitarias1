public class Cable extends Clientes{
    int numTelefono;
    float saldoTelefono;
    
    public Cable(int idCliente, String nombre, String direccion, 
            float saldoTotal, int numeroTelefono, float saldoTelefono){
       
        super(idCliente, nombre, direccion, saldoTotal);
        this.numTelefono = numeroTelefono;
        this.saldoTelefono = saldoTelefono;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public float getSaldoTelefono() {
        return saldoTelefono;
    }

    public void setSaldoTelefono(float saldoTelefono) {
        this.saldoTelefono = saldoTelefono;
    }
    
    
}