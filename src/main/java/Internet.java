import com.sun.corba.se.impl.orb.ParserTable;

import java.util.Scanner;

public class Internet extends Clientes{
    int idInternet;
    float saldoInternet;

    public Internet(int idCliente, String nombre, String direccion,
                    float saldoTotal, int id, float saldo) {
        super(idCliente, nombre, direccion, saldoTotal);
        idInternet = id;
        saldoInternet = saldo;
    }

    public float pagarSaldoInternet(){
        float saldoAPagar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted debe $" + saldoInternet);
        System.out.println("Ingresar cantidad de saldo a pagar de Internet");
        saldoAPagar = sc.nextFloat();
        if(saldoAPagar <=0){
            System.out.println("Introduzca una cantidad mayor a 0");
            return 0;
        }
        else{
            System.out.println("Cantidad de $" + saldoAPagar + " pagado.");
            return saldoAPagar;
        }
    }

    public int getIdInternet() {
        return idInternet;
    }

    public void setIdInternet(int idInternet) {
        this.idInternet = idInternet;
    }

    public float getSaldoInternet() {
        return saldoInternet;
    }

    public void setSaldoInternet(float saldoInternet) {
        this.saldoInternet = saldoInternet;
    }
}
