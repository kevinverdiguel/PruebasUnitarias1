
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldo;
        int paquete;
        int servicio;
        Long telefono;
        
        Internet serv = new Internet(1,"Juan","San Pedro",0,1,100f);
        Internet serv2 = new Internet(1,"Juan","San Pedro",0,0,500f);
        Telefono serv3 = new Telefono(1,"Juan","San pedro",0, 0, 800.5f);
        Telefono serv4 = new Telefono(1,"Juan","San pedro",0, 81515451, 400.5f);
        Cable serv5 = new Cable(1,"Juan","San Pedro",0,0,200f);
        Cable serv6 = new Cable(1,"Juan","San Pedro",200,50,40f);

        System.out.print("Selecciona un servicio\n"
                + "1. Saldo con iva en internet\n"
                + "2. Paquete de internet\n"
                + "3. Cable\n"
                + "4. Telefono \n"
                + "5. Ver datos disponibles\n"
                + "6. Agregar canales HD de TV:");
        servicio = sc.nextInt();

        switch(servicio){
            case 1:
                System.out.print("Ingrese el saldo en internet: ");
                saldo = sc.nextFloat();

                System.out.println("Precio con iva: "+serv.sumaConIva());
                serv.setSaldoInternet(saldo);
                
                break;
            case 2:
                System.out.println("Ingrese el paquete: ");
                paquete = sc.nextInt();

                serv2.setIdInternet(paquete);
                System.out.println("Paquete "+serv2.paquetes());
                
                break;
            case 3: System.out.println("Precio con el numero de canales: "+serv6.canales());
                break;
            case 4:
                System.out.print("Ingrese el telefono (inicie con +): ");
                telefono = sc.nextLong();
                
                serv3.setNumTelefono(telefono);
                serv3.numero();

                break;
            case 5:
                serv4.datosConsumidos(5000,4000);

                break;
            case 6:
                System.out.println("Ingrese el numero de canales que tiene su paquete (50-60-70)");
                paquete = sc.nextInt();
                serv5.setIdCable(paquete);

                int canalesHD;
                System.out.println("Ingresar el numero de canales que deseas en HD: ");
                canalesHD = sc.nextInt();
                serv5.definicion(canalesHD);
                
                break;
        }
        
        serv.setSaldoTotal(serv.getSaldoInternet());
        serv2.setSaldoTotal(serv2.getSaldoInternet());
        serv3.setSaldoTotal(serv3.getSaldoTelefono());
        serv4.setSaldoTotal(serv4.getSaldoTelefono());
        serv5.setSaldoTotal(serv5.getSaldoCable());
        
        System.out.println("El saldo total es: "+serv.getSaldoTotal());
        

        // System.out.println(Servicio1.getIdCliente());
    }
}