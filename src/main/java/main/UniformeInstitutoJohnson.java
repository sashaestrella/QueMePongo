package main;

public class UniformeInstitutoJohnson implements CrearUniforme {
    public Uniforme uniforme(){
        Prenda prendaSuperior = new Prenda(TipoPrenda.CAMISA, Material.ALGODON, Color.BLANCO, null);
        Prenda prendaInferior = new Prenda(TipoPrenda.PANTALON_VESTIR, Material.ACETATO, Color.NEGRO, null);
        Prenda calzado = new Prenda(TipoPrenda.ZAPATOS, Material.CUERO, Color.NEGRO, null);
        Uniforme uniforme = new Uniforme(prendaSuperior, prendaInferior, calzado);

        return uniforme;
    }
}
