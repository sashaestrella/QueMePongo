package main;

enum Mangas {
    CORTAS,
    LARGAS
}

enum Marca {
    CONVERSE,
    NIKE,
    ADIDAS
}

public class TipoDePrenda {
    String tipoDePrenda;
    Categoria categoria;

    public TipoDePrenda(String tipoDePrenda, Categoria categoria) {
        this.tipoDePrenda = tipoDePrenda;
        this.categoria = categoria;
    }

    public boolean categoria(Categoria categoria) {
        return this.categoria == categoria;
    }
}

class Camisa extends TipoDePrenda {
    Mangas mangas;

    public Camisa(String tipoDePrenda, Mangas mangas, Categoria categoria) {
        super(tipoDePrenda, categoria);
        this.mangas = mangas;
    }
}

class Zapatillas extends TipoDePrenda {
    Marca marca;

    public Zapatillas(String tipoDePrenda, Marca marca, Categoria categoria) {
        super(tipoDePrenda, categoria);
        this.marca = marca;
    }
}

class Pantalon extends  TipoDePrenda {
    String quienRegalo;

    public Pantalon(String tipoDePrenda, String regaloDe, Categoria categoria) {
        super(tipoDePrenda, categoria);
        this.quienRegalo = regaloDe;
    }
}

