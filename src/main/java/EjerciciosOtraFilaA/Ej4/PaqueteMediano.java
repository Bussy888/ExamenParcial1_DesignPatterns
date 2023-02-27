package EjerciciosOtraFilaA.Ej4;

public class PaqueteMediano extends BuilderPaquete {

    @Override
    public void buildTipo() {
        paquete.setTipo("MEDIANO");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("Grandes");
    }

    @Override
    public void buildVasos() {
        paquete.setVasos("2");
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolates("1");

    }
}
