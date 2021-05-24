package main.Sugerencias;

import main.Operacion;

public class RechazarSugerencia extends Operacion {
    @Override
    public void ejecutar() {
        this.getGuardarropa().agregarAListaDeRechazados(this.getAtuendo());
        this.getAtuendo().rechazarAtuendo();
    }

    @Override
    public void deshacer() {
        this.getGuardarropa().eliminarAtuendoRechazado(this.getAtuendo());
    }
}
