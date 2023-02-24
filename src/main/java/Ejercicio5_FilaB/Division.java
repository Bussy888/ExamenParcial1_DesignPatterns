package Ejercicio5_FilaB;

public class Division extends AbstractExpression {
    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("/")){
            context.sign=-5;
            context.input=context.input.substring(1);
        }
    }
}
