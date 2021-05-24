package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
    private List<Prenda> prendas;
    private List<Atuendo> atuendosAceptados;
    private List<Atuendo> atuendosRechazados;

    public Guardarropa() {
        this.prendas = new ArrayList<Prenda>();
        this.atuendosAceptados = new ArrayList<Atuendo>();
        this.atuendosRechazados = new ArrayList<Atuendo>();
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public List<Atuendo> getAtuendosAceptados() {
        return this.atuendosAceptados;
    }

    public List<Atuendo> getAtuendosRechazados(){
        return this.atuendosRechazados;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public void agregarPrenda(Prenda nuevaPrenda) {
        this.prendas.add(nuevaPrenda);
    }

    public void agregarPrendas(List<Prenda> prendas) {
        this.prendas.addAll(prendas);
    }

    public List<Prenda> filtrarPorTipoDePrenda(TipoPrenda tipo) {
        return this.getPrendas().stream().filter(prenda -> prenda.esDeTipoPrenda(tipo)).collect(Collectors.toList());
    }

    public void agregarAListaDeAceptados(Atuendo atuendo) {
        sacarDeRechazado(atuendo);
        this.atuendosAceptados.add(atuendo);
    }

    public void agregarAListaDeRechazados(Atuendo atuendo) {
        sacarDeAceptado(atuendo);
        this.atuendosRechazados.add(atuendo);
    }

    public void sacarDeAceptado(Atuendo atuendo){
        if(this.getAtuendosAceptados().stream().anyMatch(atuendoAceptado -> atuendoAceptado.equals(atuendo))){
            eliminarAtuendoAceptado(this.getAtuendosAceptados().stream().filter(atuendoAceptado -> atuendoAceptado.equals(atuendo)).collect(Collectors.toList()).get(0));
        }
    }

    public void sacarDeRechazado(Atuendo atuendo){
        if(this.getAtuendosRechazados().stream().anyMatch(atuendoRechazado -> atuendoRechazado.equals(atuendo))){
            eliminarAtuendoRechazado(this.getAtuendosRechazados().stream().filter(atuendoRechazado -> atuendoRechazado.equals(atuendo)).collect(Collectors.toList()).get(0));
        }
    }

    public void eliminarAtuendoAceptado(Atuendo atuendo) {
        this.atuendosAceptados.remove(atuendo);
    }

    public void eliminarAtuendoRechazado(Atuendo atuendo) {
        this.atuendosRechazados.remove(atuendo);
    }

}
