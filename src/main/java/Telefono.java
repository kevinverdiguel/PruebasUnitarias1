import java.util.Scanner;

public class Telefono {
    long numTelefono;
    float saldoTelefono;

    public Telefono(long num, float saldo){
        numTelefono = num;
        saldoTelefono = saldo;
    }


    public void modificarNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nuevo numero: \n");
        numTelefono = sc.nextLong();
        System.out.println("Nuevo telefono: " + numTelefono);
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
