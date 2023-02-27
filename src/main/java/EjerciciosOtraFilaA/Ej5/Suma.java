package EjerciciosOtraFilaA.Ej5;

public class Suma extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        context.input = context.input.substring(1);
    }
}
