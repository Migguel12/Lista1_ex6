import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float n1;
        System.out.printf("Informe o raio do círculo: ");
        n1 = ler.nextFloat();
        System.out.println("A aréa total do círculo é: " + (3.14*(n1*n1)));
    }
}
