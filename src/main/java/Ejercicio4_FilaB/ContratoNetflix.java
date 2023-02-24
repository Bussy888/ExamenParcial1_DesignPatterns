package Ejercicio4_FilaB;

import java.util.ArrayList;
import java.util.List;

public class ContratoNetflix extends BuilderContrato{
    private List<String> lista = new ArrayList<>();
    @Override
    public void buildCosto() {
        this.contrato.setCosto("150bs");
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("netflix");
    }

    @Override
    public void buildListaDeCanales() {
        lista.add("AfterLife");
        lista.add("The walking dead");
        this.contrato.setListaDeCanales(lista);

    }
}
