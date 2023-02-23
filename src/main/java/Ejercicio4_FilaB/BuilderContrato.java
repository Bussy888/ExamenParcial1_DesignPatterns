package Ejercicio4_FilaB;

public abstract  class BuilderContrato {
    protected Contrato contrato;
    public Contrato getContrato(){
        return contrato;
    }

    public void subscripcion(){
        contrato = new Contrato();
    }

    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildListaDeCanales();
}
