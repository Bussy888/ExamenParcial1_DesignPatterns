package Ejercicio5_FilaB;

public class NumberExpression extends AbstractExpression {
    public NumberExpression(int numero){
        this.numero = numero;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + (context.sign* Integer.parseInt(context.input.substring(0,this.numero)));
        context.input=context.input.substring(this.numero);
    }
}
