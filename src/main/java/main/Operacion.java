package main;

public abstract class Operacion {
    private Atuendo atuendo;
    private Guardarropa guardarropa;

    public abstract void ejecutar();
    public abstract void deshacer();

    public Guardarropa getGuardarropa() {
        return this.guardarropa;
    }

    public void setGuardarropa(Guardarropa guardarropa) {
        this.guardarropa = guardarropa;
    }

    public Atuendo getAtuendo() {
        return this.atuendo;
    }

    public void setAtuendo(Atuendo atuendo) {
        this.atuendo = atuendo;
    }
}
