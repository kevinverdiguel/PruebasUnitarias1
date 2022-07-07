public class Main {

    public static void main(String[] args) {
        //Crear un cliente
        Clientes Juan = new Clientes(1,"Juan","Temixco",0);
        System.out.println(Juan.getIdCliente());
        Juan.modificarDatos();
    }



}
