package Ejercicio4_FilaB;

import java.util.ArrayList;
import java.util.List;

public class ContratoAmazon extends BuilderContrato{
    private List<String> lista = new ArrayList<>();
    @Override
    public void buildCosto() {
        this.contrato.setCosto("50bs");
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("aws");
    }

    @Override
    public void buildListaDeCanales() {
        lista.add("Terminal List");
        lista.add("The Boys");
        this.contrato.setListaDeCanales(lista);

    }
}
