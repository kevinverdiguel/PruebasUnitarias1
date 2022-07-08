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
        
        if(idCable > 50 && idCable < 70){
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
    
    public void definicion(){
        
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