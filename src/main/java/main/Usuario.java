package main;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public static List<Atuendo> atuendos = new ArrayList<>();
    public static List<Prenda> prendas = new ArrayList<>();

    public Usuario(List<Prenda> prendas){
        this.prendas = prendas;
    }
    public Usuario(List<Prenda> prendas, List<Atuendo> atuendos){
        this.prendas = prendas;
        this.atuendos = atuendos;
    }

    public static void agregarAtuendo(Atuendo atuendo) throws Exception{
        if(!atuendos.contains(atuendo)){
            atuendos.add(atuendo);
        }else{
            throw new Exception("Ya posee dicho atuendo.");
        }
    }
}
