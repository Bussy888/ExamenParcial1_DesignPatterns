package EjerciciosOtraFilaA.Ej4;

public class PaqueteNormal extends BuilderPaquete {

    @Override
    public void buildTipo() {
        paquete.setTipo("NORMAL");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("Envase normal");
    }

    @Override
    public void buildVasos() {
        paquete.setVasos("1");
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolates("No cuenta con chocolates");

    }
}
