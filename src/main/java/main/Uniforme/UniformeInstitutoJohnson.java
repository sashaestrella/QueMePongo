package main.Uniforme;

import main.Material;
import main.Prenda;
import main.PrendaBorrador;
import main.TipoPrenda;

import java.awt.*;

public class UniformeInstitutoJohnson extends CrearUniforme {
    @Override
    protected Prenda prendaSuperior(){
        PrendaBorrador borrador = this.getBorrador(TipoPrenda.CAMISA);
        borrador.setMaterial(Material.ALGODON);
        borrador.setColor(Color.WHITE);
        return borrador.prenda();
    }

    @Override
    protected Prenda prendaInferior(){
        PrendaBorrador borrador = this.getBorrador(TipoPrenda.PANTALON_VESTIR);
        borrador.setMaterial(Material.ACETATO);
        borrador.setColor(Color.BLACK);
        return borrador.prenda();
    }

    @Override
    protected Prenda calzado(){
        PrendaBorrador borrador = this.getBorrador(TipoPrenda.ZAPATOS);
        borrador.setMaterial(Material.CUERO);
        borrador.setColor(Color.BLACK);
        return borrador.prenda();
    }
}
