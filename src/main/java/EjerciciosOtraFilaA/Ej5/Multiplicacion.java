package EjerciciosOtraFilaA.Ej5;

public class Multiplicacion extends AbstractExpression {
    @Override
    public void interpreter(Context context) {
        context.multiplicacion=true;
        context.input = context.input.substring(1);
    }
}
