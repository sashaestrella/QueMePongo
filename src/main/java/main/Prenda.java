package main;

import org.apache.maven.surefire.shade.org.apache.commons.lang3.Validate;

public class Prenda {
    TipoPrenda tipo;
    Categoria categoria;
    Material material;
    Color color;
    Color colorSecundario;
    Trama trama;

    //constructor
    public Prenda(TipoPrenda tipo, Material material, Color color, Trama trama, Categoria categoria) {
        Validate.notNull(tipo,"El campo 'tipo' no puede ir vacio");
        Validate.notNull(material,"El campo 'material' no puede ir vacio");
        Validate.notNull(color,"El campo 'color' no puede ir vacio");

        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color = color;
        if(trama == null){
            this.trama = Trama.LISA;
        }else{
            this.trama = trama;
        }
    }

    //constructor con color secundario
    public Prenda(TipoPrenda tipo, Material material, Color color, Color colorSecundario, Trama trama, Categoria categoria) throws Exception{
        this(tipo, material, color, trama, categoria);
        this.colorSecundario = colorSecundario;
    }

    public TipoPrenda getPrenda(){ return this.tipo; }
    public Categoria getCategoria(){ return this.categoria; }
    public Trama getTrama() { return this.trama;}
   /* public String getMaterial(){ return this.material; }
    public String getColor(){ return this.color; }*/

}