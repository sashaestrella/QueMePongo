package main;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologico {
    private short ultimaRespuesta;
    private LocalDateTime proximaExpiracion;
    private AccuWeatherAPI api;
    private Duration periodoDeValidez;
    private String ciudad;

    public ServicioMeteorologico(AccuWeatherAPI api, Duration periodoDeValidez, String direccion) {
        this.api = api;
        this.periodoDeValidez = periodoDeValidez;
        this.ciudad = direccion;
    }

    public short obtenerCondicionesClimaticas() {
        if (this.expiro()) {
            this.ultimaRespuesta = consultarApi(this.ciudad);
            this.proximaExpiracion = LocalDateTime.now().plus(this.periodoDeValidez);
        }
        return this.ultimaRespuesta;
    }

    private boolean expiro() {
        return proximaExpiracion.isAfter(LocalDateTime.now());
    }

    private short consultarApi(String direccion) {
        HashMap<String, Object> temperatura = (HashMap<String, Object>) this.api.getWeather(direccion).get(0).get("Temperature");
        String temperaturaValor = temperatura.get("Value").toString();
        return temperaturaEnCelsius(Short.parseShort(temperaturaValor));
    }

    private short temperaturaEnCelsius(short temperatura) {
        return (short) ((temperatura - 32) / 1.8);
    }
}




