package main;

public class PrendaBorrador {
    TipoPrenda tipo;
    Color color;
    Color colorSecundario;
    Material material;
    Trama trama;

    public Trama getTrama(){
        return this.trama;
    }

    public Prenda prendaBorrador() {
        Prenda prenda = new Prenda(tipo, material, color, colorSecundario, trama);
        return prenda;
    }

    private void validarTipo(){
        if(tipo == null) {
            throw new RuntimeException("Primero especifique el tipo por favor.");
        }
    }

    public void setTipo(TipoPrenda tipo) { this.tipo = tipo;}

    public void setColor(Color color) {
        validarTipo();
        this.color = color;
    }

    public void setColorSecundario(Color colorSecundario) {
        validarTipo();
        this.colorSecundario = colorSecundario;
    }

    public void setMaterial(Material material) {
        validarTipo();
        this.material = material;
    }

    public void setTrama(Trama trama) {
        validarTipo();
        if(trama == null){
            this.trama = Trama.LISA;
        }else{
            this.trama = trama;
        }
    }
}
