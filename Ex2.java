import java.util.Scanner;

    public class Ex2 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        for (int i = 2; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

}