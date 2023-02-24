package Ejercicio5_FilaB;

public class Client {
    public static void main(String[] args) {
        String in = "10 / 2 + 5 + 5 + 5";
        Evaluator evaluator = new Evaluator(in);
        System.out.println("Resultado: " + evaluator.resolver());
    }
}
