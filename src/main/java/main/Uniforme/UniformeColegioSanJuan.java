package main.Uniforme;

import main.Material;
import main.Prenda;
import main.PrendaBorrador;
import main.TipoPrenda;

import java.awt.*;

public class UniformeColegioSanJuan extends CrearUniforme {
    @Override
    protected Prenda prendaSuperior(){
        PrendaBorrador borrador = this.getBorrador(TipoPrenda.CHOMBA);
        borrador.setMaterial(Material.ALGODON);
        borrador.setColor(Color.GREEN);
        return borrador.prenda();
    }

    @Override
    protected Prenda prendaInferior(){
        PrendaBorrador borrador = this.getBorrador(TipoPrenda.PANTALON);
        borrador.setMaterial(Material.ACETATO);
        borrador.setColor(Color.GRAY);
        return borrador.prenda();
    }

    @Override
    protected Prenda calzado(){
        PrendaBorrador borrador = this.getBorrador(TipoPrenda.ZAPATILLAS);
        borrador.setMaterial(Material.GOMA);
        borrador.setColor(Color.WHITE);
        return borrador.prenda();
    }
}
