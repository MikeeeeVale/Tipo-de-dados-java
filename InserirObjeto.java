import java.util.Scanner;

public class InserirObjeto {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Informe o valor da base: ");
        base = input.nextInt();

        System.out.println("Informe o valor da altura: ");
        altura = input.nextInt();

        area = base * altura;

        System.out.printf("A area de um ratângulo de base é = " + base);
        System.out.printf("\n e de altura é = " + altura);
        System.out.printf("\n e a area é = " + area + "\n");
    }
}
