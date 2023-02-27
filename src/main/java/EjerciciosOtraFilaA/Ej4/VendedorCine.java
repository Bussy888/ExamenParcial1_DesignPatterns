package EjerciciosOtraFilaA.Ej4;

public class VendedorCine {
    private BuilderPaquete builder;
    public Paquete getPaquete(){
        return builder.getPaquete();
    }

    public void setTipoPaquete(BuilderPaquete builder){this.builder = builder;}

    public void buildProduct(){
        this.builder.createPaquete();
        this.builder.buildChocolate();
        this.builder.buildPipocas();
        this.builder.buildVasos();
        this.builder.buildTipo();
    }
}
