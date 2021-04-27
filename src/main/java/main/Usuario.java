package main;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public List<Prenda> prendas;

    public Usuario(List<Prenda> prendas){
        this.prendas = prendas;
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }
}
