import java.util.Scanner;

public class Cable extends Clientes{
    int idCable;
    float saldoCable;
    
    public Cable(int idCliente, String nombre, String direccion, 
            float saldoTotal, int idCable, float saldoCable){
       
        super(idCliente, nombre, direccion, saldoTotal);
        this.idCable = idCable;
        this.saldoCable = saldoCable;
    }
    
    public int canales(){
        
        if(idCable >= 50 && idCable <= 70){
            if(idCable == 50){
                return idCable*10;
            }
            if(idCable == 60){
                return idCable*10;
            }
            if(idCable == 70){
                return idCable*10;
            }
        }
        
        return 0;
    }
    
    public float definicion(int CanalesHD){
        Scanner sc = new Scanner(System.in);
        int costoPorCanalHD = 15;
        int canalesHD = CanalesHD;

        if(idCable >= canalesHD){
            int costoPorHD = canalesHD * costoPorCanalHD;
            System.out.println("El costo por tener canales HD es de: $" + costoPorHD);
            saldoCable += costoPorHD;
            return saldoCable;
        }
        else if(idCable < canalesHD){
            System.out.println("Cantidad de canales deseados muy alta. Intente nuevamente.");
        }
        return 0;
    }

    /*
    public float agregarDeudaCable(){
        float saldoADeber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que el usuario debe :\n$");
        saldoADeber = sc.nextFloat();
        if(saldoADeber <=0){
            System.out.println("Introduzca una cantidad mayor a 0");
            return 0;
        }
        else{
            System.out.println("Cantidad de $" + saldoADeber + " a pagar.");
            return saldoADeber;
        }
    }
    */

    public int getIdCable() {
        return idCable;
    }

    public void setIdCable(int idCable) {
        this.idCable = idCable;
    }

    public float getSaldoCable() {
        return saldoCable;
    }

    public void setSaldoCable(float saldoCable) {
        this.saldoCable = saldoCable;
    }
}