package main;

enum Mangas {
    CORTAS,
    LARGAS
}

public class Camisa extends TipoDePrenda {
    Mangas mangas;

    public Camisa(String tipoDePrenda, Mangas mangas, Categoria categoria) {
        super(tipoDePrenda, categoria);
        this.mangas = mangas;
    }
}
