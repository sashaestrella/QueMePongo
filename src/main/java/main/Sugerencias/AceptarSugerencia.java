package main.Sugerencias;

import main.Operacion;

public class AceptarSugerencia extends Operacion {
    @Override
    public void ejecutar() {
        this.getGuardarropa().agregarAListaDeAceptados(getAtuendo());
        this.getAtuendo().aceptarAtuendo();
    }

    @Override
    public void deshacer() {
        this.getGuardarropa().eliminarAtuendoAceptado(this.getAtuendo());
    }
}
