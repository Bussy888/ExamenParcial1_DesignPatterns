package Ejercicio4_FilaB;

import java.util.ArrayList;
import java.util.List;

public class ContratoAmazon extends BuilderContrato{
    private List<String> lista = new ArrayList<>();
    @Override
    public void buildCosto() {

    }

    @Override
    public void buildEmpresa() {

    }

    @Override
    public void buildListaDeCanales() {
        lista.add("Terminal List");
        lista.add("The Boys");
        this.contrato.setListaDeCanales(lista);

    }
}
