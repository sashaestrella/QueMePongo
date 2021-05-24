package test;

import main.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuardarropaTest {
    static Guardarropa guardarropa = new Guardarropa();
    static List<Prenda> prendas = new ArrayList<Prenda>();
    static Prenda prenda1;
    static Prenda prenda2;
    static Prenda prenda3;
    static Prenda prenda4;

    @BeforeAll
    public static void init() {
        prenda1 = new Prenda(TipoPrenda.CAMISA,Material.ALGODON,Color.WHITE,Trama.LISA);
        prenda2 = new Prenda(TipoPrenda.CAMISA,Material.ALGODON,Color.RED,Trama.RAYADA);
        prenda3 = new Prenda(TipoPrenda.ZAPATILLAS,Material.GOMA,Color.WHITE,Trama.LUNARES);
        prenda4 = new Prenda(TipoPrenda.REMERA,Material.ALGODON,Color.BLACK,Trama.LISA);

        prendas.add(prenda1);
        prendas.add(prenda2);
        prendas.add(prenda3);
        prendas.add(prenda4);

        guardarropa.agregarPrendas(prendas);
    }

    @Test
    public void elGuardarropasTiene2Camisas() {
        assertEquals(guardarropa.filtrarPorTipoDePrenda(TipoPrenda.CAMISA).size(), 2);
    }
}
