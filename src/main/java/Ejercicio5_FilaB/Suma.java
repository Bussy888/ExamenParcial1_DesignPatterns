package Ejercicio5_FilaB;

public class Suma extends AbstractExpression {
    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("+")){
            context.sign=1;
            context.input=context.input.substring(1);
        }
    }
}
