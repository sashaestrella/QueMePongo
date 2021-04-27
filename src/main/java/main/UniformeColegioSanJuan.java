package main;

public class UniformeColegioSanJuan implements CrearUniforme {
    public Uniforme uniforme(){
        Prenda prendaSuperior = new Prenda(TipoPrenda.CHOMBA, Material.PIQUE, Color.VERDE, null);
        Prenda prendaInferior = new Prenda(TipoPrenda.PANTALON, Material.ACETATO, Color.GRIS, null);
        Prenda calzado = new Prenda(TipoPrenda.ZAPATILLAS, Material.GOMA, Color.BLANCO, null);
        Uniforme uniforme = new Uniforme(prendaSuperior, prendaInferior, calzado);

        return uniforme;
    }
}
