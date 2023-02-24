package Ejercicio5_FilaB;

import java.util.ArrayList;
import java.util.List;

public class Evaluator extends AbstractExpression{
    private Context context;
    private List<AbstractExpression> lista = new ArrayList<>();
    @Override
    public void interpreter(Context context) {


    }
    public Evaluator (String ecuacion){
        context= new Context(ecuacion.replace(" ",""));
        for(String in:ecuacion.split(" ")){
            switch (in){
                case "+":
                    lista.add(new Suma());
                    break;
                case "/":
                    lista.add(new Division());
                    break;
                default:
                    lista.add(new NumberExpression(in.length()));
                    break;
            }
        }
    }
    public int resolver(){
        for (AbstractExpression abstractExpression : lista){
            abstractExpression.interpreter(context);
        }
        return (int) context.output;
    }
}
