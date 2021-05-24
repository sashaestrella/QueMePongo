package main;

import java.util.ArrayList;
import java.util.List;

public class GuardarropaCompartido {
    private List<Usuario> usuario;
    private Guardarropa guardarropa;

    public GuardarropaCompartido(List<Usuario> usuario, Guardarropa guardarropa) {
        this.usuario = new ArrayList<Usuario>();
        this.usuario = usuario;
        this.guardarropa = guardarropa;
    }

    public Guardarropa getGuardarropa() {
        return guardarropa;
    }

    public void setGuardarropa(Guardarropa guardarropa) {
        this.guardarropa = guardarropa;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
