package EjerciciosOtraFilaA.Ej5;


import java.util.ArrayList;
import java.util.List;

public class Evaluator extends AbstractExpression  {
    private List<AbstractExpression> ecuacion = new ArrayList<>();
    private Context context;

    public Evaluator(String input){
        context = new Context(input.replace(" ", ""));
        for (String charInput :input.split(" ")){
            switch (charInput){
                case "*":
                    ecuacion.add(new Multiplicacion());
                    break;

                case "+":
                    ecuacion.add(new Suma());
                    break;

                default:
                    ecuacion.add(new NumberExpression(charInput.length()));
                    break;
            }
        }
    }

    public double resolver(){
        for(AbstractExpression operacionMatematicas:ecuacion){
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {


    }
}
