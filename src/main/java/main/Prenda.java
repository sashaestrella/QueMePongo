package main;

import org.apache.commons.lang3.Validate;

public class Prenda {
    TipoDePrenda tipo;
    Categoria categoria;
    String material;
    Color color;
    Color colorSecundario;

    //constructor
    public Prenda(TipoDePrenda tipo, Categoria categoria, String material, Color color) throws Exception{
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color = color;

        if(!tipo.categoria(categoria)) {
            throw new Exception("El tipo NO coincide con la categoría.");
        }

        Validate.notNull(categoria,"El campo 'categoria' no puede ir vacio");
        Validate.notNull(tipo,"El campo 'tipo' no puede ir vacio");
        Validate.notNull(material,"El campo 'material' no puede ir vacio");
        Validate.notNull(color,"El campo 'color' no puede ir vacio");
    }

    //constructor con color secundario
    public Prenda(TipoDePrenda tipo, Categoria categoria, String material, Color color, Color colorSecundario) throws Exception{
        this(tipo, categoria, material, color);
        this.colorSecundario = colorSecundario;

        if(!tipo.categoria(categoria)) {
            throw new Exception("El tipo NO coincide con la categoría.");
        }

        Validate.notNull(categoria,"El campo 'categoria' no puede ir vacio");
        Validate.notNull(tipo,"El campo 'tipo' no puede ir vacio");
        Validate.notNull(material,"El campo 'material' no puede ir vacio");
        Validate.notNull(color,"El campo 'color' no puede ir vacio");
    }

    public TipoDePrenda getPrenda(){ return this.tipo; }
    public Categoria getCategoria(){ return this.categoria; }
   /* public String getMaterial(){ return this.material; }
    public String getColor(){ return this.color; }*/

}