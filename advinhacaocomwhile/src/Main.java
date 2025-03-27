import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis e seus valores.
        int numero = 0;
        int adivinhacao = (int) (Math.random() * 100) + 1;


        //Loop e repeticao ate acertar o numero/adivinhar
        while (numero != adivinhacao) {
            System.out.print ("Digite seu palpite: ");
            numero = sc.nextInt();
            //Estrutura de controle para dizer se é maior, menor ou igual.
            if (numero > adivinhacao) {
                System.out.println ("Tente um numero menor!");
            }  else if (numero < adivinhacao) {
                System.out.println ("Tente um numero maior!");
            } else {
                System.out.println ("Parabens, voce acertou!");
            }
        }
        sc.close();
    }
}