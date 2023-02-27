package EjerciciosOtraFilaA.Ej4;

public abstract class BuilderPaquete {
    protected Paquete paquete;

    public Paquete getPaquete(){
        return paquete;
    }

    public void createPaquete(){
        paquete = new Paquete();
    }
    public abstract void buildTipo();
    public abstract void buildPipocas();
    public abstract void buildVasos();
    public abstract void buildChocolate();
}
