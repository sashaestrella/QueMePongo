package main;

public class PrendaBorrador {
    TipoPrenda tipo;
    Color color;
    Color colorSecundario;
    Material material;
    Trama trama;

    public Prenda prendaBorrador() {
        Prenda prenda = new Prenda(tipo, material, color, colorSecundario, trama);
        return prenda;
    }

    public void setTipo(TipoPrenda tipo) { this.tipo = tipo;}

    private void validarTipo(){
        if(tipo == null) {
            throw new RuntimeException("Primero especifique el tipo por favor.");
        }
    }

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
        this.trama = trama;
    }
}
