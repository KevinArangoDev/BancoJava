package app;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nombreBanco;

    private List<Cliente> listaClientes = new ArrayList<Cliente>();

    public Banco(String nombreBanco) {
        super();
        this.nombreBanco = nombreBanco;
    }

    public Banco() {
        super();
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "[Nombre=" + nombreBanco + "]";
    }

}