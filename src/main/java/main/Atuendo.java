package main;

import java.util.List;

public class Atuendo {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;
    List<Prenda> accesorios;

    public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, List<Prenda> accesorios){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
        this.accesorios = accesorios;
    }
}
