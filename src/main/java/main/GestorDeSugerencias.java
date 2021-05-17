package main;

import java.util.List;
import java.util.ArrayList;

public class GestorDeSugerencias {
    private List<Sugerencia> sugerencias;

    public GestorDeSugerencias() {
        this.sugerencias = new ArrayList<Sugerencia>();
    }

    public void setSugerencia(Sugerencia sugerencia){
        this.sugerencias.add(sugerencia);
    }

    public void mostrarAtuendos(Sugerencia unaSugerencia) {
        for(int pos = 0 ; pos < unaSugerencia.getAtuendos().size(); pos++) {
            unaSugerencia.getAtuendo(pos);
        }
    }

}
