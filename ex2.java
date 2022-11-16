import java.util.Scanner;
class ex2{
public static void main(String[] args) {
   /*Implemente um programa em Java que a partir de um número informado pelo
usuário, calcule seu dobro e apresente ao usuário. */

Scanner ler = new Scanner(System.in);
int valor = 0;
int dobro = 0;

    System.out.println("A partir de um número informado, este programa calcula o dobro e o apresenta.");
    System.out.println("Digite o valor:");
       valor = ler.nextInt();
       dobro = valor * 2;
    System.out.println("O dobro de "+valor+ " é " +dobro);
  }
}