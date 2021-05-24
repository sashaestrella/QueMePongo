package main;

import main.Sugerencias.GestorDeSugerencias;
import main.Sugerencias.Sugerencia;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Guardarropa> guardarropas;
    private GuardarropaCompartido guardarropaCompartido;

    public Usuario(List<Guardarropa> guardarropas){
        this.guardarropas = guardarropas;
    }

    public void agregarGuardarropa(Guardarropa nuevoGuardarropa) {
        this.guardarropas.add(nuevoGuardarropa);
    }

    public void getSugerencia(Sugerencia unaSugerencia) {
        GestorDeSugerencias.getInstance().mostrarAtuendos(
                GestorDeSugerencias.getInstance().getSugerencia(unaSugerencia)
        );
    }
}
