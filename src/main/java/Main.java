
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldo;
        int paquete;
        int servicio;
        Long telefono;

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

                Internet s2 = new Internet(1,"Juan","San Pedro",0,1,saldo);
                System.out.println("Precio con iva: "+s2.sumaConIva());

                break;
            case 2:
                System.out.println("Ingrese el paquete: ");
                paquete = sc.nextInt();

                Internet s3 = new Internet(1,"Juan","San Pedro",0,paquete,500.2f);
                System.out.println("Paquete "+s3.paquetes());
                break;
            case 3: System.out.println("hola");
                break;
            case 4:
                System.out.print("Ingrese el telefono (inicie con +): ");
                telefono = sc.nextLong();

                Telefono s1 = new Telefono(1,"Juan","San pedro",0, telefono, 0);

                s1.numero();
                break;
            case 5:
                Telefono s4 = new Telefono(1,"Juan","San pedro",0, 81515451, 0);
                s4.datosConsumidos(5000,4000);
                break;
            case 6:
                System.out.println("Ingrese el numero de canales que tiene su paquete (50-60-70)");
                paquete = sc.nextInt();
                Cable s5 = new Cable(1,"Juan","San Pedro",0,paquete,0);

                int canalesHD;
                System.out.println("Ingresar el numero de canales que deseas en HD: ");
                canalesHD = sc.nextInt();
                s5.definicion(canalesHD);
        }

        //Crear un cliente
        Telefono s1 = new Telefono(1,"Juan","San pedro",0, 154545405, 0);
        Cable s3 = new Cable(1,"Juan","San pedro",0,1,200.3f);




        // System.out.println(Servicio1.getIdCliente());
    }
}