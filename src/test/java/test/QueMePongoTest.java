package test;

import main.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class PrendaTest {
    @Test
    public void laTramaDeEstaCamisaEsLisaPorDefecto() {
        assertEquals(camisa().getTrama().toString(), "LISA");
    }

    @Test
    public void laTramaDeEstePantalonQuieroQueSeaRayado() {
        assertEquals(pantalon().getTrama().toString(), "RAYADA");
    }

    @Test
    public void elTipoDeLaPrendaNoPuedeIrNulo() {
        assertThrows(Exception.class, (Executable) new Prenda(null,Material.ALGODON,Color.GRIS,Trama.LISA,Categoria.PARTE_SUPERIOR));
    }

    private Prenda camisa() {
        Prenda camisa = new Prenda(TipoPrenda.CAMISA,Material.ALGODON,Color.BLANCO,null,Categoria.PARTE_SUPERIOR);
        return camisa;
    }

    private Prenda pantalon() {
        Prenda pantalon = new Prenda(TipoPrenda.PANTALON,Material.ALGODON,Color.BLANCO,Trama.RAYADA,Categoria.PARTE_SUPERIOR);
        return pantalon;
    }
}
/*
public class QueMePongoTest {
    Prenda unaPrenda;
    static Categoria parteSuperior;
    static Categoria parteInferior;
    static TipoDePrenda remera;
    static TipoDePrenda jean;
    static Color rojo;
    static Color naranja;

    @BeforeAll
    public static void init() {
        parteSuperior = Categoria.PARTE_SUPERIOR;
        parteInferior = Categoria.PARTE_INFERIOR;
        remera = new TipoDePrenda("Remera", Categoria.PARTE_SUPERIOR);
        jean = new TipoDePrenda("Jean", Categoria.PARTE_INFERIOR);
        rojo = Color.ROJO;
        naranja = Color.NARANJA;
    }

    @Test
    public void prendaSinTipo() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(null, parteSuperior,"Algodón" , rojo);
        });
    }

    @Test
    public void prendaSinCategoria() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(remera, null,"Algodón" , rojo);
        });
    }

    @Test
    public void prendaSinMaterial() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(remera, parteSuperior,null , rojo);
        });
    }

    @Test
    public void prendaSinColor() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(null, parteSuperior,"Algodón" , null);
        });
    }

    @Test
    public void prendaQueNoCondiceSuTipoConCategoria() throws Exception{
        assertThrows(Exception.class, ()->{
            unaPrenda = new Prenda(jean,parteSuperior,"Algodón" , null);
        });
    }

    @Test
    public void prendaConColorSecundario() throws Exception{
        unaPrenda = new Prenda(jean,parteInferior, "Jean", rojo, naranja);
    }

    @Test
    public void prendaConColorSecundarioSinTipo() throws Exception{
        unaPrenda = new Prenda(null,parteInferior, "Jean", rojo, naranja);
    }
}*/
