package EjerciciosOtraFilaA.Ej5;

public class NumberExpression extends AbstractExpression {

    private int size;

    public NumberExpression(int size){
        this.size = size;
    }

    @Override
    public void interpreter(Context context) {
        if(context.multiplicacion){
            context.output = context.output* Integer.parseInt(context.input.substring(0, size));
            context.multiplicacion=false;
        } else{
            context.output = context.output+Integer.parseInt(context.input.substring(0, size));
        }
        context.input = context.input.substring(size);
    }
}
