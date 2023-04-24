import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int qtdProvas;
    double media, soma;

    System.out.print("Digite a quantidade de provas: ");
    qtdProvas = input.nextInt();
    double notas[] = new double[qtdProvas];

    for (int i = 0; i < qtdProvas; i++) {
        System.out.print("Digite a nota da " + (i+1) + " º Prova: ");
        notas[i] = input.nextDouble();
    }
    
    soma= 0;
    for (int i = 0; i < qtdProvas; i++) {
        soma+= notas[i];
    }

    media = soma / qtdProvas;
    System.out.println("A média do aluno é: " + media);
}
    
}
