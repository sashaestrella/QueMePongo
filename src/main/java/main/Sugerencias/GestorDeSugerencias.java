package main.Sugerencias;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class GestorDeSugerencias {
    private List<Sugerencia> sugerencias;

    private static GestorDeSugerencias INSTANCE = new GestorDeSugerencias();

    public static GestorDeSugerencias getInstance() {
        return INSTANCE;
    }

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

    public Sugerencia getSugerencia(Sugerencia unaSugerencia) {
        return this.sugerencias.stream().
                filter(sugerencia -> sugerencia.equals(unaSugerencia)).collect(Collectors.toList()).get(0);
    }

}
