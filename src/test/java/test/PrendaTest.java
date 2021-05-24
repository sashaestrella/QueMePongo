package test;

import main.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrendaTest {
    Prenda unaPrenda;
    static Categoria parteSuperior;
    static Categoria parteInferior;
    static TipoPrenda remera;
    static TipoPrenda jean;
    static Color rojo;
    static Color naranja;

    @BeforeAll
    public static void init() {
        parteSuperior = Categoria.PARTE_SUPERIOR;
        parteInferior = Categoria.PARTE_INFERIOR;
        remera = TipoPrenda.REMERA;
        jean = TipoPrenda.PANTALON;
        rojo = Color.RED;
        naranja = Color.ORANGE;
    }

    @Test
    public void prendaSinTipo() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(null, Material.ALGODON,Color.WHITE,Trama.LISA);
        });
    }

    @Test
    public void prendaSinMaterial() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(TipoPrenda.REMERA,null,Color.RED,Trama.RAYADA);
        });
    }

    @Test
    public void prendaSinColor() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(TipoPrenda.REMERA,Material.ALGODON,null,Trama.RAYADA);
        });
    }

    @Test
    public void prendaConColorSecundario() throws Exception{
        unaPrenda = new Prenda(TipoPrenda.REMERA,Material.ALGODON, Color.ORANGE,Color.RED,Trama.CUADROS);
    }

    @Test
    public void laTramaDeEstaCamisaEsLisaPorDefecto() {
        assertEquals(camisa().getTrama().toString(), "LISA");
    }

    @Test
    public void laTramaDeEstePantalonQuieroQueSeaRayado() {
        assertEquals(pantalon().getTrama().toString(), "RAYADA");
    }


    private Prenda camisa() {
        Prenda camisa = new Prenda(TipoPrenda.CAMISA,Material.ALGODON,Color.WHITE,null);
        return camisa;
    }

    private Prenda pantalon() {
        Prenda pantalon = new Prenda(TipoPrenda.PANTALON,Material.ALGODON,Color.WHITE,Trama.RAYADA);
        return pantalon;
    }
}
