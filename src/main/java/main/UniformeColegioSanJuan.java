package main;

public class UniformeColegioSanJuan implements CrearUniforme {
    public Uniforme uniforme(){
        Prenda prendaSuperior = new Prenda(TipoPrenda.CHOMBA, Material.ALGODON, Color.VERDE, Trama.LISA,null);
        Prenda prendaInferior = new Prenda(TipoPrenda.PANTALON, Material.ACETATO, Color.GRIS, Trama.LISA, null);
        Prenda calzado = new Prenda(TipoPrenda.ZAPATILLAS, Material.GOMA, Color.BLANCO, Trama.LISA, null);
        Uniforme uniforme = new Uniforme(prendaSuperior, prendaInferior, calzado);

        return uniforme;
    }
}
