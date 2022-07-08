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
    
    // lada
    public boolean numero(){
        String telefono = String.valueOf(numTelefono);
        
        if(telefono.startsWith("81")){
            System.out.println("Es de Monterrey");
            return true;
        }
        else{
            System.out.println("No es numero de Monterrey");
            return false;
        }
    }

    public boolean datosConsumidos(int datosMax, int datosConsumidos){
        Scanner sc = new Scanner(System.in);
        boolean seguirUsando = true;
        int i=datosMax;
        int x=datosConsumidos;
        int datosRestantes = i - x;

        if(x <= i){
            System.out.println("Cuentas con " + datosRestantes + " datos (MB) disponibles.");
            System.out.println("¿Deseas usar datos extras por un costo mayor?");
            seguirUsando = sc.nextBoolean();

            return true;
        }
        else{
            System.out.println("Cuentas con " + datosRestantes + " datos (MB) disponibles.");
            System.out.println("Aun tienes datos.");
            return false;
        }

    }

    /*public float datosConsumidos(int datosMax){
        Scanner sc =
        int costoPorMB = 5;
        System.out.println("Ingresar datos que desea consumir este mes: ");



    }*/
    

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
