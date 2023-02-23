package Ejercicio4_FilaB;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private String costo;
    private  String empresa;
    private List<String> listaDeCanales = new ArrayList<>();

    public String getCosto() {
        return costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public List<String> getListaDeCanales() {
        return listaDeCanales;
    }

    public Contrato setCosto(String costo){
        this.costo = costo;
        return this;
    }
    public Contrato setEmpresa(String empresa){
        this.empresa = empresa;
        return this;
    }
    public Contrato setListaDeCanales(List<String> listaDeCanales){
        this.listaDeCanales = listaDeCanales;
        return this;
    }

    public void showInfo(){

        System.out.println("Costo: "+costo);
        System.out.println("Empresa: "+empresa);
        System.out.println("Lista de Canales"+listaDeCanales);
    }
}
