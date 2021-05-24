package main.Sugerencias;

import main.Atuendo;

import java.util.ArrayList;
import java.util.List;

public class Sugerencia {
    private List<Atuendo> atuendos;
    private short temperatura;

    public Sugerencia(List<Atuendo> atuendos , short temperatura){
        this.atuendos = atuendos;
        this.temperatura = temperatura;
    }

    public Sugerencia(Atuendo atuendo , short temperatura){
        this.atuendos = new ArrayList<Atuendo>();
        this.atuendos.add(atuendo);
        this.temperatura = temperatura;
    }

    public List<Atuendo> getAtuendos() {
        return this.atuendos;
    }

    public Atuendo getAtuendo(int pos) {
        return this.atuendos.get(pos);
    }

    public void setAtuendo(Atuendo atuendo){
        this.atuendos.set(0,atuendo);
    }
}
