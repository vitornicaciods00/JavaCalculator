import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer x, y;
        Integer soma, sub, div, mult;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para fazer a operação: ");
        x = scanner.nextInt();
        System.out.print("Digite outro valor para fazer a operação: ");
        y = scanner.nextInt();
        soma = x + y;
        sub = x - y;
        div = x / y;
        mult = x * y;
        System.out.println("O resultado da sua Soma, é: " + soma + ".");
        System.out.println("O resultado da sua Subtração, é: " + sub + ".");
        System.out.println("O resultado da sua Divisão, é: " + div + ".");
        System.out.println("O resultado da sua Multiplicção, é: " + mult + ".");
    }
}