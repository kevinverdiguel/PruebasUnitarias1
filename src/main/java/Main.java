public class Main {

    public static void main(String[] args) {
        //Crear un cliente
        Clientes Servicio1 = new Telefono(1,"Juan","San pedro",0, 154545405, 0);
        Clientes Servicio2 = new Internet(1,"Juan","San Pedro",0,1,0);
        System.out.println(Servicio1.getIdCliente());
    }



}
