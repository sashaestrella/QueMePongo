package main.Uniforme;

import main.Prenda;
import main.PrendaBorrador;
import main.TipoPrenda;

public abstract class CrearUniforme {
    protected abstract Prenda prendaSuperior();
    protected abstract Prenda prendaInferior();
    protected abstract Prenda calzado();

    protected PrendaBorrador getBorrador(TipoPrenda tipo){
        return new PrendaBorrador(tipo);
    }
    public Uniforme uniforme() {
        return new Uniforme(this.prendaSuperior(), this.prendaInferior(), this.calzado());
    }

}