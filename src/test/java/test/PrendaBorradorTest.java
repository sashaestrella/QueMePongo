package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrendaBorradorTest {
    @Test
    public void laTramaDeEstaPrendaEsLisa() {
        assertEquals(prenda().getTrama().toString(), "LISA");
    }

    @Test
    public void estaPrendaNoSeteaPrimeroElTipo() {
        assertThrows(Exception.class, ()->{
            PrendaBorrador unaPrenda = prendaMalSeteada();
        });
    }

    private PrendaBorrador prenda() {
        PrendaBorrador prenda = new PrendaBorrador();
        prenda.setTipo(TipoPrenda.CAMISA);
        prenda.setMaterial(Material.ALGODON);
        prenda.setColor(Color.NEGRO);
        prenda.setTrama(null);
        return prenda;
    }

    private PrendaBorrador prendaMalSeteada() {
        PrendaBorrador prenda = new PrendaBorrador();
        prenda.setMaterial(Material.ALGODON);
        prenda.setColor(Color.NEGRO);
        prenda.setTipo(TipoPrenda.CAMISA);
        prenda.setTrama(null);
        return prenda;
    }
}
