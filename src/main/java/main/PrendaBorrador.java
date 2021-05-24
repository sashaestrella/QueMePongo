package main;

import org.apache.commons.lang3.Validate;
import java.awt.*;

public class PrendaBorrador {
    TipoPrenda tipo;
    Color color;
    Color colorSecundario;
    Material material;
    Trama trama;

    public Trama getTrama(){
        return this.trama;
    }

    public PrendaBorrador(TipoPrenda tipo) {
        Validate.notNull(tipo,"El tipo no puede ser null");
        this.tipo = tipo;
        this.trama = Trama.LISA;
    }

    public Prenda prenda() {
        Validate.notNull(trama, "La trama no puede ser null");
        Validate.notNull(material,"El material no puede ser null");
        Validate.notNull(color,"El color primario no puede ser null");
        return new Prenda(tipo, material, color, colorSecundario, trama);
    }

    public void setTipo(TipoPrenda tipo) { this.tipo = tipo;}

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setTrama(Trama trama) {
        if(trama == null){
            this.trama = Trama.LISA;
        }else{
            this.trama = trama;
        }
    }
}
