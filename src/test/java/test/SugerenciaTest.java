package test;

import main.*;
import main.Sugerencias.Sugerencia;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SugerenciaTest {
    static Sugerencia sugerencia;
    static List<Atuendo> atuendos;
    static Atuendo atuendo1;
    static Atuendo atuendo2;

    @BeforeAll
    public static void init() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATILLAS,Material.GOMA,Color.WHITE,Trama.LUNARES);
        Prenda prenda2 = new Prenda(TipoPrenda.REMERA,Material.ALGODON,Color.BLACK,Trama.LISA);
        Prenda prenda3 = new Prenda(TipoPrenda.PANTALON,Material.ALGODON,Color.BLACK,Trama.LISA);
        Prenda prenda4 = new Prenda(TipoPrenda.ACCESORIO,Material.PLASTICO,Color.PINK,Trama.LISA);

        Prenda prenda5 = new Prenda(TipoPrenda.ZAPATILLAS,Material.GOMA,Color.BLACK,Trama.LISA);
        Prenda prenda6 = new Prenda(TipoPrenda.REMERA,Material.ALGODON,Color.BLACK,Trama.LISA);
        Prenda prenda7 = new Prenda(TipoPrenda.PANTALON_VESTIR,Material.ALGODON,Color.BLACK,Trama.LISA);
        Prenda prenda8 = new Prenda(TipoPrenda.ACCESORIO,Material.PLASTICO,Color.RED,Trama.LISA);

        atuendo1 = new Atuendo(prenda2, prenda3, prenda1, prenda4);
        atuendo2 = new Atuendo(prenda6, prenda7, prenda1, prenda8);

        atuendos = new ArrayList<Atuendo>();
        atuendos.add(atuendo1);
        atuendos.add(atuendo2);
        sugerencia = new Sugerencia(atuendos, (short) 20);
    }

    @Test
    public void elTipoDeLaPrendaSuperiorDelSegundoAtuendoDeLaSugerenciaEsRemera() {
        assertEquals(sugerencia.getAtuendo(1).getPrendaSuperior().getTipo().toString(), "REMERA");
    }
}
