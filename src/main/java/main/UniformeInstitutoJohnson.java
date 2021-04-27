package main;

public class UniformeInstitutoJohnson implements CrearUniforme {
    public Uniforme uniforme(){
        Prenda prendaSuperior = new Prenda(TipoPrenda.CAMISA, Material.ALGODON, Color.BLANCO, Trama.LISA, null);
        Prenda prendaInferior = new Prenda(TipoPrenda.PANTALON_VESTIR, Material.ACETATO, Color.NEGRO, Trama.LISA, null);
        Prenda calzado = new Prenda(TipoPrenda.ZAPATOS, Material.CUERO, Color.NEGRO, Trama.LISA, null);
        Uniforme uniforme = new Uniforme(prendaSuperior, prendaInferior, calzado);

        return uniforme;
    }
}
