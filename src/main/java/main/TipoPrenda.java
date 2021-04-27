package main;

public enum TipoPrenda {
    CAMISA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR),
    ZAPATOS(Categoria.CALZADO),
    PANTALON_VESTIR(Categoria.PARTE_INFERIOR),
    CHOMBA(Categoria.PARTE_SUPERIOR),
    ZAPATILLAS(Categoria.CALZADO);

    private Categoria categoria;

    TipoPrenda(Categoria categoria) {
    }

    Categoria TipoPrenda(Categoria categoria) {
        return this.categoria = categoria;
    }
}
