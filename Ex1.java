import java.util.Scanner;
    public class Ex1{

        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Números digitados: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}