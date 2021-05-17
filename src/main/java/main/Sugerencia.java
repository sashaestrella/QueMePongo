package main;
import java.util.ArrayList;
import java.util.List;

public class Sugerencia {
    private List<Uniforme> atuendos;
    private Double temperatura;

    public Sugerencia(List<Uniforme> atuendos , Double temperatura){
        this.atuendos = atuendos;
        this.temperatura = temperatura;
    }

    public Sugerencia(Uniforme atuendo , Double temperatura){
        this.atuendos = new ArrayList<Uniforme>();
        this.atuendos.add(atuendo);
        this.temperatura = temperatura;
    }

    public List<Uniforme> getAtuendos() {
        return this.atuendos;
    }

    public Uniforme getAtuendo(int pos) {
        return this.atuendos.get(pos);
    }

}
