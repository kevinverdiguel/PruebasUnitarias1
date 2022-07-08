import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefonoTest {

    @Test
    public void numero() {
        long telefono = 815451211;
        Telefono s1 = new Telefono(1,"Juan", "San Pedro", 0,telefono,0);
        boolean expectedResult = true;
        boolean actualResult = s1.numero();
        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void datosConsumidos() {
        Telefono s1 = new Telefono(1,"Juan", "San Pedro", 0,81515121,0);
        int datosMax = 5000;
        int datosUsados = 4500;
        boolean expectedResult = true;
        boolean actualResult = s1.datosConsumidos(datosMax,datosUsados);
        assertEquals(expectedResult,actualResult);
    }
}