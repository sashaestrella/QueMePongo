package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Categoria;
import main.Prenda;
import main.TipoDePrenda;
import main.Color;

import static org.junit.jupiter.api.Assertions.assertThrows;

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

}
