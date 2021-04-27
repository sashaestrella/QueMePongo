package main;

import java.util.ArrayList;
import java.util.List;

public enum Color {
    AZUL("Azul"),
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    NARANJA("Naranja"),
    GRIS("Gris"),
    BLANCO("Blanco"),
    NEGRO("Negro");

    private String nombreColor;

    Color(String nombre) {
        nombreColor = nombre;
    }

    static List<Color> coloresPrimarios(){
        List<Color> colores = new ArrayList<>();
        colores.add(AZUL);
        colores.add(ROJO);
        colores.add(AMARILLO);
        return colores;
    }
}
