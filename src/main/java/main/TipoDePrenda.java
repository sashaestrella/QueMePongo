package main;

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
