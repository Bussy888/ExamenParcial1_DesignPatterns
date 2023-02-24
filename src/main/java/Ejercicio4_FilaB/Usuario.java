package Ejercicio4_FilaB;

public class Usuario {
    private BuilderContrato builder;
    public Contrato getContrato(){
        return builder.getContrato();
    }

    public void setTipoContrato(BuilderContrato builder){
        this.builder = builder;
    }

    public void buildContrato(){
        this.builder.subscripcion();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
