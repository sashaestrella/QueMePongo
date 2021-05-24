package test;

import main.*;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrendaBorradorTest {
    @Test
    public void laTramaDeEstaPrendaEsLisa() {
        assertEquals(prenda().getTrama().toString(), "LISA");
    }

    private PrendaBorrador prenda() {
        PrendaBorrador prenda = new PrendaBorrador(TipoPrenda.CAMISA);
        prenda.setMaterial(Material.ALGODON);
        prenda.setColor(Color.BLACK);
        prenda.setTrama(null);
        return prenda;
    }
}
