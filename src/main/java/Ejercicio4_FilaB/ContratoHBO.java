package Ejercicio4_FilaB;

import java.util.ArrayList;
import java.util.List;

public class ContratoHBO extends BuilderContrato{
    private List<String> lista = new ArrayList<>();
    @Override
    public void buildCosto() {
        this.contrato.setCosto("100bs");
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("hbo");
    }

    @Override
    public void buildListaDeCanales() {
        lista.add("The last of us");
        lista.add("The office");
        this.contrato.setListaDeCanales(lista);

    }
}
