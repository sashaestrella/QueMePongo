package main;

public class Atuendo {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;
    Prenda accesorio;
    private Guardarropa guardarropaAsociado;
    private boolean rechazado;

    public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
        this.accesorio = accesorio;
        this.rechazado = false;
    }

    public Prenda getPrendaSuperior() {
        return this.prendaSuperior;
    }

    public void setGuardarropa(Guardarropa guardarropa) {
        this.guardarropaAsociado = guardarropa;
    }

    public Guardarropa getGuardarropaAsociado() {
        return this.guardarropaAsociado;
    }

    public void aceptarAtuendo() {
        this.rechazado = false;
    }

    public void rechazarAtuendo() {
        this.rechazado = true;
    }

    public boolean estaRechazado() {
        return this.rechazado;
    }
}
